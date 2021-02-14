package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.User;
import com.example.form.UserRegisterForm;
import com.example.mapper.UserMapper;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * ユーザーを新規登録する.
	 * @param form
	 */
	public void insert(UserRegisterForm form) {
		User user = new User();
		user.setName(form.getName());
		user.setEmail(form.getEmail());
		user.setAddress(form.getAddress());
		user.setPassword(form.getPassword());
		user.setTelephone(form.getTelephone());
		user.setZipcode(form.getZipcode());
		userMapper.insert(user);
	}

}
