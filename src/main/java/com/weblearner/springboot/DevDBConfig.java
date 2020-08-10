package com.weblearner.springboot;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDBConfig implements DBConfig{

	@Override
	public String dbName() {		
		return "Dev_DB_Name";
	}

}
