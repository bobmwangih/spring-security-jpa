package com.bob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String home () {
		return ("<h3>Home</h3>");
	}
	
	@GetMapping("/user")
	public String user () {
		return ("<h3>user</h3>");
	}
	
	@GetMapping("/admin")
	public String admin () {
		return ("<h3>Admin</h3>");
	}
}
