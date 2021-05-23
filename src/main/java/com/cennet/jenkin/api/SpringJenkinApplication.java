package com.cennet.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinApplication.class);

	public void init(String msg) {
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		logger.info("Application Started");
		SpringApplication.run(SpringJenkinApplication.class, args);
	}

}
