package com.nrdc.pyh2.modules.posts.service;

import com.nrdc.pyh2.modules.posts.model.Posts;
import com.nrdc.pyh2.modules.posts.repository.PostsRepository;
import com.nrdc.pyh2.modules.users.model.Users;
import com.nrdc.pyh2.modules.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    private PostsRepository postsRepository;

    @Autowired
    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    public Posts registerPost(Posts posts) {
        return this.postsRepository.save(posts);
    }

    public List<Posts> findAllPosts() {
        return this.postsRepository.findAll();
    }


}
