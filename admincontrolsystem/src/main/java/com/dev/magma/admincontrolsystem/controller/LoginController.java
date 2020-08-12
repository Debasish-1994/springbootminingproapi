package com.dev.magma.admincontrolsystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.magma.admincontrolsystem.model.AuthenticateResponse;
import com.dev.magma.admincontrolsystem.model.AuthenticationRequest;

@RestController
public class LoginController {
	AuthenticateResponse authenticateResponse;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> authenticateLogin(@RequestBody AuthenticationRequest authenticationRequest) {
		System.out.println(authenticationRequest.toString());
		authenticateResponse = new AuthenticateResponse(true, "userAuthenticated", "Debasish0057", "somejwttoken");

		return ResponseEntity.ok(authenticateResponse);
	}
}
