package com.microService1.dto;

import java.util.List;

public class BulkUserDetails {
	private List<UserDetails> bulk;

	public List<UserDetails> getBulk() {
		return bulk;
	}

	public void setBulk(List<UserDetails> bulk) {
		this.bulk = bulk;
	}

}
