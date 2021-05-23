package com.cennet.jenkin.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.info("Test Case Executing");
		assertEquals(true,true);
	}
	private void assertEquals(boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}

}
