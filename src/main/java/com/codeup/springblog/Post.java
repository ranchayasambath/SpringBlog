package com.codeup.springblog;

public class Post {

//   The class should have private properties and getters and setters for a title and body.

    private String title;
    private String body;

    public Post(){}

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
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