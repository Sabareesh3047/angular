package com.angular;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/angular")
public class AngularController {

	@Autowired
	AngularService as;

	static Logger log = Logger.getLogger(AngularController.class);

	@PostMapping(value = "/PostDirec")
	public String postEmps(@RequestBody List<Angular> w) throws AgeException {

		return as.postEmps(w);

	}

	@GetMapping(value = "/GetBelow")
	public List<Angular> getBage() {
		PropertyConfigurator.configure("log4j.properties");
		log.info(as.getBage());
		return as.getBage();

	}

}
