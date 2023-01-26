package com.rafaelsantos.task.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rafaelsantos.task.model.Task;

@Controller
public class TaskController {
	
	List<Task> tasks = new ArrayList<>();
	
	@GetMapping("/create")
	public String home() {
		return "create";
	}
	
	@GetMapping("/list")
	public String list() {
		return "list";
	}
	
	@PostMapping("/create")
	public String create(Task task) {
		Long id = tasks.size() + 1L;
		tasks.add(new Task(id,task.getName(),task.getDate()));
		
		return "redirect:/list";
	}
}
