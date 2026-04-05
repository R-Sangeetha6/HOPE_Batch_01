package com.forum.Model;



import java.util.*;

public class Post {

    private int id;
    private String title;
    private String content;
    private User author;

    private List<Comment> comments=new ArrayList<>();
    private int likes;

    public Post(int id,String title,String content,User author){
        this.id=id;
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public String getTitle(){
        return title;
    }

    public void addComment(Comment c){
        comments.add(c);
    }

    public void addLike(){
        likes++;
    }

    public void display(){

        System.out.println("\nPost: "+title);
        System.out.println("Author: "+author.getUsername());
        System.out.println(content);
        System.out.println("Likes: "+likes);

        for(Comment c:comments){
            System.out.println("Comment: "+c.getText());
        }
    }
}