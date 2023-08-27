package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.User;
import com.demo.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userRepo.save(user);
	}	
	@GetMapping("/{id}") 
	 public User readUser(@PathVariable Long id) {
		return userRepo.findById(id).orElse(null);
		
	
	}
	@PutMapping("/{id}")
	public User updateUser(@PathVariable Long id,@RequestBody User updatedUser ) {
		updatedUser.setId(id);
		
		return userRepo.save(updatedUser);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userRepo.deleteById(id);
	}
   
	@GetMapping("/highest-phy") 
	 public Long findIdWithHighestPhy() {
		return userRepo.findTopByOrderByPhyDesc().getId();
}
	
	@GetMapping("/highest-total-score") 
	 public Long findIdWithHighestTotalScore() {
		return userRepo.findTopByOrderByTotalScoreDesc().getId();
}
	@GetMapping("/sorted-asc") 
	 public List<User> findAllSortedByTotalScoreAsc() {
		return userRepo.findAllByOrderByTotalScoreAsc();
}
	
	@GetMapping("/sorted-desc") 
	 public List<User> findAllSortedByTotalScoreDesc() {
		return userRepo.findAllByOrderByTotalScoreDesc();
}
	
	
	
}
