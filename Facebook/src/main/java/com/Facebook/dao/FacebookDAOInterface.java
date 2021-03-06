package com.Facebook.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Facebook.entity.FacebookUser;
@Repository
public interface FacebookDAOInterface extends JpaRepository<FacebookUser, String> {

}
