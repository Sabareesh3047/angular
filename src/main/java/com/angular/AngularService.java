package com.angular;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

 

@Service
public class AngularService {
	@Autowired
	AngularDao ad;
	public String postEmps(List<Angular> w) throws AgeException {
		
		for(Angular a : w) {
			if(a.getAge() < 18) {
				throw new AgeException("no data");
			}
		}
		
		return ad.postEmps(w);

	}
	public List<Angular> getBage() {
		return ad.getBage();
	}
	 
	

}
