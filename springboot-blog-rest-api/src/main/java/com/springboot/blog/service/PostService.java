package com.springboot.blog.service;

import com.springboot.blog.entity.Post;
import com.springboot.blog.payload.PostResponse;
import com.springboot.blog.payload.Postdto;

import java.util.List;

public interface PostService {
    Postdto createPost(Postdto postdto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    Postdto getPostById(long id);

    Postdto updatePost(Postdto postdto, long id);

    void deletePostById(long id);
}
