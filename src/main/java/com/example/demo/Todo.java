package com.example.demo;

public class Todo {
	
    private long id;
    private String name;
    
	public Todo() {
		// TODO Auto-generated constructor stub
	}
	
	public Todo(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


    
	
}
