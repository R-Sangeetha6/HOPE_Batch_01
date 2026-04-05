package com.forum.Feature;

import com.forum.Model.Post;

public class LikeService {

    public void likePost(Post post){
        post.addLike();
    }
}


