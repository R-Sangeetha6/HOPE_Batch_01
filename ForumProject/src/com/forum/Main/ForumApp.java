package com.forum.Main;

import com.forum.Model.*;
import com.forum.Service.ForumService;
import com.forum.Feature.LikeService;

public class ForumApp {

    public static void main(String[] args){

        ForumService forum = new ForumService();

        User user = new User(1,"Alice");

        Post post = new Post(101,"Java OOPs",
                "Discussing OOP concepts",user);
        User user2=new User(201,"BOb");
        Comment c1=new Comment(201,"Nice topic!",user2);
        LikeService like=new LikeService();
        like.likePost(post);
        post.addComment(c1);
        post.display();
        forum.createPost(post);

        forum.displayPosts();
    }
}


