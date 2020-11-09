package com.microService1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microService1.dto.UserDetails;
import com.microService1.service.Service1;

@RestController
@RequestMapping("/m1")
public class Controller1 {

	@Autowired
	Service1 service1;

	@PostMapping(value = "/getName", headers = "Accept=application/json")
	public String getName(@RequestBody UserDetails userDetails) {
		return service1.getName(userDetails);

		
		
	}

	@GetMapping("/test")
	public String test() {

		
		return "m1";
	}

}
