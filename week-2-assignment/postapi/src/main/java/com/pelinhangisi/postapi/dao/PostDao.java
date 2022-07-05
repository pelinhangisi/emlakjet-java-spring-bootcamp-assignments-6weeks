package com.pelinhangisi.postapi.dao;

import com.pelinhangisi.postapi.Entity.Post;
import com.pelinhangisi.postapi.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostDao extends JpaRepository<Post, Integer> {

    List<Post> findPostsByAuthor(String author);
    List<Post> findPostsByCategory(Category category);
    List<Post> findFirst3ByOrderByCreatedAtDesc();
}
