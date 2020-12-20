package br.com.eduardo.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eduardo.workshopmongo.domain.User;
import br.com.eduardo.workshopmongo.dto.UserDTO;
import br.com.eduardo.workshopmongo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> lista = service.findAll();
		List<UserDTO> listaDto = lista.stream().map(x ->  new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listaDto);
	}
}
