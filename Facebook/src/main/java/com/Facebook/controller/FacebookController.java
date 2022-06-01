package com.Facebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Facebook.entity.FacebookUser;
import com.Facebook.service.FacebookServiceInterface;

@RestController
public class FacebookController {
	@Autowired
	private FacebookServiceInterface fic;
	public String createprofile(FacebookUser fu) {
		return fic.createprofile(fu);
		
	}
	

}
