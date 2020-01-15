package com.nrdc.pyh2.modules.posts.controller;

import com.nrdc.pyh2.modules.posts.model.Posts;
import com.nrdc.pyh2.modules.posts.service.PostsService;
import com.nrdc.pyh2.modules.users.model.Users;
import com.nrdc.pyh2.modules.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {

    private PostsService postsService;

    @Autowired
    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Posts> getPosts() {
        return postsService.findAllPosts();
    }

    @RequestMapping(value = {"/",""}, method = RequestMethod.POST)
    public Posts registerPost(@RequestBody Posts posts) {
        return postsService.registerPost(posts);
    }


}
