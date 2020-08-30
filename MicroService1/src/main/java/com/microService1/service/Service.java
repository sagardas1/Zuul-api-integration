package com.microService1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.microService1.dto.UserDetails;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	RestTemplate getRestTemplate;

	public String getName(UserDetails userDetails) {
		// TODO Auto-generated method stub
	String g=(String)getRestTemplate.postForObject("http://MicroService2/m2/user", UserDetails.class, String.class);
	return g;
	}

}


