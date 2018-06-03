package com.scm.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.scm.SCMMain;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SCMMain.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class ApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void get() throws Exception {
		// 传值，但要在url上配置相应的参数
		Map<String, String> multiValueMap = new HashMap<>();
		multiValueMap.put("pageNum", "1");
		multiValueMap.put("pageSize", "100");
		String result = testRestTemplate.getForObject("/company/listCompany?pageNum={pageNum}&pageSize={pageSize}", String.class, multiValueMap);
//		Assert.assertEquals(result,"company/list");
	}

}
