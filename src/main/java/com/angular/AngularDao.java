package com.angular;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class AngularDao {
	@Autowired
	AngularRepository ar;

	public String postEmps( List<Angular> w) {
		ar.saveAll(w);
		return "SUCCESSFULLY";

	}

	public List<Angular> getBage() {
		return ar.findAll();

	}

}
