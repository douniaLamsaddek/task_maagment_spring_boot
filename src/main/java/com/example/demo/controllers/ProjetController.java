package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projets")
public class ProjetController {
	
	@GetMapping
	public String getProjet() {
		return "get";
	}
	
	
	@PostMapping
	public String createProjet() {
		return "post";
	}
	
	@PutMapping
	public String updateProjet() {
		return "put";
	}
	
	@DeleteMapping
	public String deleteProjet() {
		return "delet";
	}


}
