package com.microService1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.microService1.dto.BulkUserDetails;
import com.microService1.dto.UserDetails;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	RestTemplate getRestTemplate;

	public UserDetails getName(UserDetails userDetails) {
		// TODO Auto-generated method stub
		BulkUserDetails g=(BulkUserDetails)getRestTemplate.postForObject("http://MicroService2/m2/user", UserDetails.class, BulkUserDetails.class);
		return g.getBulk().get(0);
	
	}

}


