package com.pelinhangisi.postapi.Entity;

import com.pelinhangisi.postapi.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "post_id")
    private int id;

    @Column(name = "author")
    private String Author;

    @Column(name="title")
    private String title;

    @Column(name="text")
    private String text;


    @Enumerated(EnumType.STRING)
    private Category category;

    @Column( name = "updated_by")
    private String updatedBy;

    @Column( name = "creadted_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_by")
    private String createdBy;
}
