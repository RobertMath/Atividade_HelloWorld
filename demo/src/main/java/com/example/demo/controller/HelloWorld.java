package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoints") 
public class HelloWorld {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Atividade 1 - Dar FeedBack os Colegas de Turma.<br>"
				+ "Atividade 2 - Se inscrever em Vagas.<br>"
				+ "Atividade 3 - Criar Planejamento Smart.";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Minha lista de Objetivos: <br>"
				+ "Primeiro: Melhorar minhas habilidades lógicas.<br>"
				+ "Segundo : Entender melhor os conceitos de MVC.<br>"
				+ "Terceiro: Me tornar um programador completo.";
	}
	
	
}
