package com.microService1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microService1.dto.UserDetails;
import com.microService1.service.Service;

@RestController
public class Controller {
	@Autowired
	Service service;
	
	public String getName(@RequestBody UserDetails userDetails) {
		return	service.getName(userDetails);
		
	}

}
