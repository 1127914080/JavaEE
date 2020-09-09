package com.lh;

import java.util.Date;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lh.pojo.User;

public class AppTest {

	@Test
	public void testJackson() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		String josn=objectMapper.writeValueAsString(new User(1, "欢欢", new Date()));
		System.out.println(josn);
	}
	
}
