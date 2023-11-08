package com.blog.services;

import java.util.List;

import com.blog.entities.Post;
import com.blog.payload.PostDto;
import com.blog.payload.PostResponse;

public interface PostService {

	// create
	public PostDto createPost(PostDto postDto , Integer userId, Integer categoryId);

	// update
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete
	void deletePost(Integer postId);
	
	// get all posts 
	PostResponse getAllPosts(Integer pageNumber ,Integer pageSize);
	
	// get single post 
	
	PostDto getPostById(Integer postId);
	
	// get all post by category 
	
	List<PostDto>getpostsBycategory(Integer categoryId);
	
	// get all post by user 
	List<PostDto> getAllPostsByUser(Integer userId);
	
	// search posts 
	List<Post>searchPosts(String keyword);
	
	

}
