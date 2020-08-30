package com.microService2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.microService2.dto.UserDetails;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	RestTemplate getRestTemplate;

	public UserDetails getName(UserDetails userDetails) {
		System.out.println("microservice 22222");
		System.out.println(new Gson().toJson(userDetails));
		return userDetails;
	}

}


