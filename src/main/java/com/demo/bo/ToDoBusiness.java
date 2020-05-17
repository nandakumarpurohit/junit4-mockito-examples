package com.demo.bo;

import java.util.ArrayList;
import java.util.List;

import com.demo.service.ToDoService;

public class ToDoBusiness {

	public ToDoService doService;

	public ToDoBusiness(ToDoService doService) {
		this.doService = doService;
	}

	public List<String> getTodosforSpring(String user) {

		List<String> retrievedtodos = new ArrayList<String>();
		List<String> todos = doService.getTodos(user);

		for (String todo : todos) {
			if (todo.contains("Spring")) {
				retrievedtodos.add(todo);
			}
		}
		return retrievedtodos;
	}

	public List<String> getTodosforHibernate(String user) {

		List<String> hibernatelist = new ArrayList<String>();
		List<String> Combinedlist = doService.getTodos(user);

		for (String todo : Combinedlist) {
			if (todo.contains("Hibernate")) {
				hibernatelist.add(todo);
			}
		}

		return hibernatelist;
	}
}
