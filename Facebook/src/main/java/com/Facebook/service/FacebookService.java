package com.Facebook.service;

import com.Facebook.dao.FacebookDAOInterface;
import com.Facebook.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {
	private FacebookDAOInterface fad;
	@Override
	public String createprofile(FacebookUser fu) {
		fad.save(fu);
		return "profile created";
	}

}
