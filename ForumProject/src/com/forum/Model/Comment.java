package com.forum.Model;
public class Comment {
    private int id;
    private String text;
    private User author;

    public Comment(int id,String text,User author){
        this.id=id;
        this.text=text;
        this.author=author;
    }

    public String getText(){
        return text;
    }
}