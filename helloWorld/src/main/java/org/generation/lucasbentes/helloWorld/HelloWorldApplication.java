package org.generation.lucasbentes.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		
		BSM bsms = new BSM();
		Lista lista = new Lista();
		
		System.out.println("\nHello World!");  // Primeiro endpoint
		
		bsms.bsm(); // Segundo endpoint
		
		lista.objetivos(); // Terceiro endpoint
		
	}

}
