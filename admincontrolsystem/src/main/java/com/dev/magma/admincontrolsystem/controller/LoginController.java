package com.dev.magma.admincontrolsystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.magma.admincontrolsystem.model.AuthenticationRequest;

@RestController
public class LoginController {
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> authenticateLogin(@RequestBody AuthenticationRequest authenticationRequest){
		System.out.println(authenticationRequest.toString());
		return ResponseEntity.ok(authenticationRequest.toString());
	}
}
