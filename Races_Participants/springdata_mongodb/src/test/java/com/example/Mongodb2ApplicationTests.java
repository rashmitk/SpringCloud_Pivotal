package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rashmit.spring.cloud.mongodb.Mongodb2Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Mongodb2Application.class)
public class Mongodb2ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
