package com.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

// @Setter // comment out beacuse not working properly

// @Getter

public class UserDto {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@NotEmpty
	@Size(min=4,message ="name not less than four charater")
	private String name;
	@Email(message ="your email address is not valid ")
	private String email;
	@NotEmpty
	@Size(min=3,max=10 ,message = "password must be between the 3 to 10 charter")
	private String password;
	@NotNull
	private String about;

}
