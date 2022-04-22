package com.codeup.springblog;

import javax.persistence.*;

@Entity
@Table(name="posts")
public class Post {

//   The class should have private properties and getters and setters for a title and body.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false,length = 100)
    private String title;

    @Column(nullable = false, length = 255)
    private String body;


    public Post(){}

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}


