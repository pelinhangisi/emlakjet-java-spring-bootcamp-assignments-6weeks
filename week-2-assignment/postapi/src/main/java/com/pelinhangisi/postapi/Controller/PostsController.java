package com.pelinhangisi.postapi.Controller;

import com.pelinhangisi.postapi.Entity.Post;
import com.pelinhangisi.postapi.dao.PostDao;
import com.pelinhangisi.postapi.enums.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostsController {
    private PostDao postDao;

    @Autowired
    public PostsController(PostDao postDao){
        this.postDao = postDao;
    }


    @GetMapping("/getbyid")
    public Optional<Post> getPost(@RequestParam int id){
        return this.postDao.findById(id);
    }

    @PostMapping("/add")
    Post createPost(@RequestBody Post post){
        return this.postDao.save(post);
    }

    @PutMapping("/update")
    Optional<Post> updatePost(@RequestBody Post post, @RequestParam int id, String user){
        return postDao.findById(id).map(p -> {
            p.setAuthor(post.getAuthor());
            p.setCategory(post.getCategory());
            p.setUpdatedAt(LocalDateTime.now());
            p.setUpdatedBy(user);
            p.setText(post.getText());
            p.setTitle(post.getTitle());
            return postDao.save(p);
        });
    }

    @GetMapping("/author")
    public List<Post> findPostByAuthor(@RequestParam String author){
        return this.postDao.findPostsByAuthor(author);
    }

    @GetMapping("/category")
    public List<Post> findPostsByCategory(@RequestParam Category category){
        return this.postDao.findPostsByCategory(category);
    }

    @GetMapping("/findtop3")
    public List<Post> findFirst3ByOrderByCreatedAtDesc(){
        return this.postDao.findFirst3ByOrderByCreatedAtDesc();
    }


}


