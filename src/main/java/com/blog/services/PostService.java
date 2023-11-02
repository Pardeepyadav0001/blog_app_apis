package com.blog.services;

import java.util.List;

import com.blog.entities.Post;
import com.blog.payload.PostDto;

public interface PostService {

	// create
	public Post createPost(PostDto postDto);

	// update
	Post updatePost(PostDto postDto, Integer postId);

	// delete
	void deletePost(Integer postId);
	
	// get all posts 
	List<Post>getAllPosts();
	
	// get single post 
	
	Post getPostById(Integer postId);
	
	// get all post by category 
	
	List<Post>getpostsBycategory(Integer categoryId);
	
	// get all post by user 
	List<Post> getAllPostsByUser(Integer userId);
	
	// search posts 
	List<Post>searchPosts(String keyword);
	
	

}
