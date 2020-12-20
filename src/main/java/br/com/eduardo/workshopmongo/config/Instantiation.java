package br.com.eduardo.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.eduardo.workshopmongo.domain.User;
import br.com.eduardo.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		
		User aloni = new User(null, "Aloni da Silva Ribeiro dos Santos", "alonisantos@hotmail.com");
		User eduarda = new User(null, "Eduarda Ribeiro dos Santos", "dudaalonidu@gmail.com");
		User eloah = new User(null, "Eloah Ribeiro dos Santos", "lala_santos@gmail.com");
		User eduardo = new User(null, "Eduardo Alves dos Santos", "eduardo@gmail.com");
		User adelino = new User(null, "Adelino José Ribeiro", "adelino@gmail.com");
		User aureni = new User(null, "Aureni da Silva Ribeiro", "aureni@gmail.com");
		
		
		repo.saveAll(Arrays.asList(aloni, eduarda, eloah,eduardo, adelino, aureni));
		
	}

}
