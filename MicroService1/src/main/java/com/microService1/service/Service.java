package com.microService1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.microService1.dto.UserDetails;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	RestTemplate getRestTemplate;

	public UserDetails getName(UserDetails userDetails) {
		// TODO Auto-generated method stub
		
		System.out.println("m1 service");
		UserDetails g=(UserDetails)getRestTemplate.postForObject("http://localhost:8080/producer/user", UserDetails.class, UserDetails.class);
		return g;
	
	}

}


