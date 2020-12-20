package br.com.eduardo.workshopmongo.domain.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eduardo.workshopmongo.domain.User;
import br.com.eduardo.workshopmongo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	/*
	 * public ResponseEntity<User> salvar (User user) { User obj = repo.save(user);
	 * return ResponseEntity.status(HttpStatus.CREATED).body(obj); }
	 */
}
