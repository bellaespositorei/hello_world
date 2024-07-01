package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show-bsm")

public class BsmController {
	@GetMapping
	public String showBsm() {
		return """
				Mentalidades: de crescimento, responsabilidade pessoal, orientação ao futuro, persistência;
				
				Competências comportamentais: Comunicação, Proatividade, Orientação ao Detalhe, Trabalho em equipe.
				""";
	}
}