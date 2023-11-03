package com.blog.services.impl;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entities.Category;
import com.blog.entities.Post;
import com.blog.entities.User;
import com.blog.exceptions.ResourseNotFoundException;
import com.blog.payload.PostDto;
import com.blog.repositories.CategoryRepo;
import com.blog.repositories.PostRepo;
import com.blog.repositories.UserRepo;
import com.blog.services.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
    @Autowired
	private UserRepo userRepo;
	
	
	@Autowired
	private CategoryRepo categoryrepo;
	
	@Override
	public PostDto createPost(PostDto postDto, Integer userId, Integer categoryId) {
	 
		
		
		Category category = this.categoryrepo.findById(categoryId).orElseThrow(()-> new ResourseNotFoundException("Category","category Id",categoryId));
		
		User user = this.userRepo.findById(categoryId).orElseThrow(()-> new ResourseNotFoundException("User","user Id",userId));
		
		Post post = this.modelMapper.map(postDto, Post.class);
		post.setImageName("default.png"); // set deafalut image 
		post.setAddedDate(new Date());
		post.setUser(user);
		post.setCategory(category);
		
		Post newPost =this.postRepo.save(post);
		return this.modelMapper.map(newPost, PostDto.class);
	}



	@Override
	public PostDto updatePost(PostDto postDto, Integer postId) {
		return null;
	}

	@Override
	public void deletePost(Integer postId) {
		
	}

	@Override
	public List<Post> getAllPosts() {
		return null;
	}

	@Override
	public Post getPostById(Integer postId) {
		return null;
	}

	@Override
	public List<Post> getpostsBycategory(Integer categoryId) {
		return null;
	}

	@Override
	public List<Post> getAllPostsByUser(Integer userId) {
		return null;
	}

	@Override
	public List<Post> searchPosts(String keyword) {
		return null;
	}





}
