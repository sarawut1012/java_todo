package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	private List<Todo> todos = new ArrayList<>();

	public TodoController() {
		todos.add(new Todo(1, "Dog"));
		todos.add(new Todo(2, "Cat"));
		todos.add(new Todo(3, "Star"));

	}

	@GetMapping("/todo")
	public List<Todo> getTodo() {
		return todos;
	}
	
   //todo/XXX    
	@GetMapping("/todo/{id}")
	public Todo getTodoById(@PathVariable long id) {
		return todos.stream().filter(retult -> retult.getId() == id).findFirst().orElseGet(() -> null);
	}
	
    //todo/search?name=XXX    
	@GetMapping("/todo/search")
	public Todo getTodoByName(@RequestParam String name) {
		return todos.stream().filter(retult -> retult.getName().equals(name)).findFirst().orElseGet(() -> null);
	}
	

	
	
}
