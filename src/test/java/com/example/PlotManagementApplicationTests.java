package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fissionlabs.PlotManagementApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PlotManagementApplication.class)
@WebAppConfiguration
public class PlotManagementApplicationTests {

	@Test
	public void contextLoads() {
	}

}
