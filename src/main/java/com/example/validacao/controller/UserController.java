package com.example.validacao.controller;

import com.example.validacao.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping
	public ResponseEntity<UserDTO> saveUser(@RequestBody @Valid UserDTO userDTO){

		return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
	}
}
