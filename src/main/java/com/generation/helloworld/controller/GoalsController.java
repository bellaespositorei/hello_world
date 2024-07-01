package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my-goals")
public class GoalsController {
	
	@GetMapping
	public String myGoals() {
		return "1 - Estudar mais POO, 2 - Estudar mais SQL, 3 - Estudar ao menos 1 hora extra por dia";
	}
}