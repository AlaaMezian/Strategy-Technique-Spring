package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.LanguageService;

@RestController
public class TranslateController {

	@Autowired
	LanguageService lanService;

	@GetMapping(value = "/api/v1/test")
	public ResponseEntity<String> testing(HttpServletRequest request) {
		return ResponseEntity.ok(lanService.greet());
	}

}
