package com.demo.test.stub;

import java.util.Arrays;
import java.util.List;

import com.demo.service.ToDoService;

public class ToDoServiceStub implements ToDoService {

	public List<String> getTodos(String user) {

		return Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use Hibernate ", " Use Spring MVC ");
	}
}