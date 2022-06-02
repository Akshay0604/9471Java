package com.manytomanyrelationship.controller;

import com.manytomanyrelationship.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UsersController {
@Autowired
private UsersService usersService;
@RequestMapping("/getUsers")
public ResponseEntity<Object> getAllUsers() {
return usersService.getAllUsers();
}
}