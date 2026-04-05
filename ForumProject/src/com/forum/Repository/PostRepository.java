 package com.forum.Repository;

import java.util.*;
import com.forum.Model.Post;

public class PostRepository {

    private List<Post> posts=new ArrayList<>();

    public void save(Post post){
        posts.add(post);
    }

    public List<Post> findAll(){
        return posts;
    }
}


