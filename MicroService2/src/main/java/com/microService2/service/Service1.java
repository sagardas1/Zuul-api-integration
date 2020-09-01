package com.microService2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.microService2.dto.UserDetails;

@Service
public class Service1 {
	
	@Autowired
	RestTemplate getRestTemplate;

	public UserDetails getName(UserDetails userDetails) {
		System.out.println(new Gson().toJson(userDetails));
		return userDetails;
	}

}


