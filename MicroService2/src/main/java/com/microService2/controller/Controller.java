package com.microService2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microService2.dto.UserDetails;
import com.microService2.service.Service;

@RestController
//@RequestMapping("/m2")
public class Controller {
	@Autowired
	Service service;
	
	@PostMapping(value="/user", headers = "Accept=application/json")
	public UserDetails getName(@RequestBody UserDetails userDetails) {
		return userDetails;
		
	
	}
	@GetMapping("/test")
	public String test() {
		return "m2";
	}

}
