package com.learning.microservice.account.ui.acc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/status/check")
	public String getStatus() {
		return  "Account MictoService Up and Running on Port:" + env.getProperty("local.server.port");
	}

}
