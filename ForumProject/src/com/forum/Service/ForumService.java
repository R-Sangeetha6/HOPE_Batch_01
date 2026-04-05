
	package com.forum.Service;

import com.forum.Repository.PostRepository;
import com.forum.Model.Post;

public class ForumService {

    private PostRepository repo = new PostRepository();

    public void createPost(Post post){
        repo.save(post);
    }

    public void displayPosts(){
        for(Post p : repo.findAll()){
            p.display();
        }
    }
}