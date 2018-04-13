package com.czk.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czk.config.YmlConfig;

@RestController
public class Test {

	@Autowired
	private YmlConfig ymlConfig;
	
	@RequestMapping("/test")
	public String test() {
		return ymlConfig.toString();
	}
}
