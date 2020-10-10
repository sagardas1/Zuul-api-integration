package com.microService2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microService2.dto.UserDetails;
import com.microService2.service.Service1;

@RestController
@RequestMapping("/m2")
public class Controller {
	@Autowired
	Service1 service1;

	@PostMapping(value = "/user", headers = "Accept=application/json")
	public UserDetails getName(@RequestBody UserDetails userDetails) {
		System.out.println("in m2");
		return userDetails;
		

	}

	@GetMapping("/test")
	public String test() {
		return "m2";
	}

}
