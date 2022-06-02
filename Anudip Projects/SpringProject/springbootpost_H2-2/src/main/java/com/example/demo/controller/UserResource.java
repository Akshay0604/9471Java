package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.services.UserDaoService;

@RestController  
public class UserResource   
{  
@Autowired  
private UserDaoService service;  
@GetMapping("/users")  
public List<User> retriveAllUsers()  
{  
return service.findAll();  
}  
@GetMapping("/users/{id}")  
public User retriveUser(@PathVariable int id)  
{  
return service.findOne(id);  
}
@PostMapping("/users")  
public void createUser(@RequestBody User user)  
{  
User sevedUser=service.save(user);    
} 
@DeleteMapping("/users/{id}")  
	public void deleteUser(@PathVariable int id) throws ClassNotFoundException  
	{  
	User user= service.deleteById(id);  
	if(user==null)  
		//runtime exception  
	throw new ClassNotFoundException("id: "+ id);  
}
}

