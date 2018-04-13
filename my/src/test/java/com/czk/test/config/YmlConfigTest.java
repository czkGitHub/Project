package com.czk.test.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.czk.Application;
import com.czk.config.YmlConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class YmlConfigTest {

	@Autowired
	private YmlConfig ymlConfig;
	
	@Test
	public void test1() {
		System.out.println(ymlConfig.toString());
	}
	
}
