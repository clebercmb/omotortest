package omotor.main.ui;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.client.RestTemplate;


import omotor.main.dto.UserDTO;
import omotor.main.dto.UserList;



@Controller
@RequestMapping(value="/#")
public class UsuariosController {

	private RestTemplate restTemplate = new RestTemplate();

	@GetMapping("/user")
    public List<UserDTO> listaUsuarios() {
	
		UserList response = restTemplate.getForObject(
				  "http://localhost:8080/api/user",
				  UserList.class);
		List<UserDTO> employees = response.getUsers();		
		
       return employees;
    }	
	

}


