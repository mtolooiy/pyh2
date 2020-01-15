package com.nrdc.pyh2.modules.posts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nrdc.pyh2.modules.posts.model.Posts;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
