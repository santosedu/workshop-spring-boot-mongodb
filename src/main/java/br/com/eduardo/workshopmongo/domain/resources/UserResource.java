package br.com.eduardo.workshopmongo.domain.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eduardo.workshopmongo.domain.User;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User aloni = new User("1", "Aloni da Silva Ribeiro dos Santos", "alonisantos@hotmail.com");
		User eduarda = new User("2", "Eduarda Ribeiro dos Santos", "dudaalonidu@gmail.com");
		User eloah = new User("3", "Eloah Ribeiro dos Santos", "lala_santos@gmail.com");
		List<User> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(aloni, eduarda, eloah));
		return ResponseEntity.ok().body(lista);
	}
}
