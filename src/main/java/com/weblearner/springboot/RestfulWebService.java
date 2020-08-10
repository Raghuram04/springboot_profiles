package com.weblearner.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulWebService {

	@Value("${env.message}")
	private String env;

	@Autowired
	private DBConfig dbConfig;

	@RequestMapping("profile")
	public String profile() {
		return "Env Message ---> " + env;
	}

	@RequestMapping("beanprofile")
	public String beanProfile() {
		return dbConfig.dbName();
	}

}
