package com.codeElevate.blogServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeElevate.blogServer.entity.Post;
import com.codeElevate.blogServer.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	@Autowired
	private PostService postService;
	
	@PostMapping("/save")
	public ResponseEntity<?> createPost(@RequestBody Post post)
	{
		try {
			Post createPost=postService.savePost(post);
			return ResponseEntity.status(HttpStatus.CREATED).body(createPost);
			
		}catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
}
