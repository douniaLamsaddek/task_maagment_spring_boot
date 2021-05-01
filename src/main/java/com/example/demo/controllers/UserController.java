package com.example.demo.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.requests.UesrRequest;
import com.example.demo.services.UserService;
import com.example.demo.sherd.dto.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping
	public String getUser() {
		return "get";
	}
	
	
	@PostMapping
	public void createUser(@RequestBody UesrRequest userRequest) {
		
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequest, userDto);
		userService.createUser(userDto);
		
	}
	
	@PutMapping
	public String updateUser() {
		return "put";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delet";
	}

}
