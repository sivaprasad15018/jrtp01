package com.codeElevate.blogServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeElevate.blogServer.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
