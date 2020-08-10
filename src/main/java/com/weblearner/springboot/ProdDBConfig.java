package com.weblearner.springboot;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDBConfig implements DBConfig{

	@Override
	public String dbName() {
		return "Prod_DB_Name";
	}

}
