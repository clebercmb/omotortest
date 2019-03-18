package omotor.main.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import omotor.main.model.User;
import omotor.main.repository.UserRepository;

@Configuration  
public class Instantiation implements CommandLineRunner{

	@Autowired 
	private UserRepository userRepository;  //// Injection database repository  	
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		User cleber = new User(null, "Cleber Miranda Barbosa", "cleber@gmail.com", "(11)98341-9065", "M");	
		User camila = new User(null, "Camila Miranda Barbosa", "camila@gmail.com", "(11)94642-9065", "F");
		User domingas = new User(null, "Domingas Pim Roncoleta", "domingas@gmail.com", "(11)98341-9065", "F");
		
		userRepository.saveAll(Arrays.asList(cleber, camila, domingas));
		
	}
	
}
