package com.microService1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microService1.dto.UserDetails;

@Service
public class Service1 {
	
	@LoadBalanced
	@Autowired
	RestTemplate getRestTemplate;

	public String getName(UserDetails userDetails) {
		int i=1;
		System.out.println("m1 service");
		if(i==0) {
			return null;
		}
		String g= (String)getRestTemplate.getForObject("http://localhost:8080/test/m2/test", String.class);
		System.out.println("hgdsvfhgshfvsghavgshav");
		return g;
	
	}

}


