package org.generation.lucasbentes.blogpessoal.controller;

import java.util.List;

import org.generation.lucasbentes.blogpessoal.model.Postagem;
import org.generation.lucasbentes.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// O controller e responsavel pela comunicacao da nossa api com o cliente(Pstaman, angula...)

@RestController // Informa que essa class e um controller
@RequestMapping("/postagens")  // INforma qual uri essa class sera acessada
@CrossOrigin("*")  // Faz com que o frontend consiga consumir nossa api. O * informa que a nossa api pode ser acessada de qualquer origin
public class PostagemController {
	
	@Autowired  // Faz com que o spring acesse a interface do controle
	private PostagemRepository repository;
	
	
	//Metodos
	
	@GetMapping // Informa que se a requisicao do usuario for um get ai vai acionar esse metodo
	public ResponseEntity<List<Postagem>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}

}
