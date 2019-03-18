package omotor.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import omotor.main.dto.UserDTO;
import omotor.main.model.User;
import omotor.main.repository.UserRepository;
import omotor.main.services.exception.ObjectNotFoundException;



@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
	
	public User insert(User user) {
		return repo.save(user);
	}
	
	public User userFromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getNome(), objDto.getEmail(), objDto.getTelefone(), objDto.getSexo());
	}
	
	public void delete(Long id) {
		findById(id);
		repo.deleteById(id);
	}

	public User update(User obj) {
		System.out.println("UserService>>>>>>> obj.id=" + obj.getId());
		User newObj = findById(obj.getId());
		updateData(newObj, obj);
		
		return repo.save(newObj);
	}

	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getNome());
		newObj.setEmail(obj.getEmail());		
	}

}