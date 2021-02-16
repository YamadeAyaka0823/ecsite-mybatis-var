package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.User;

@Mapper
public interface UserMapper {
	
	/**
	 * ユーザーをインサートする.
	 * @param user
	 */
	void insert(User user);
	
	/**
	 * ユーザーをメールアドレスで1件検索する.
	 * @param email
	 * @return
	 */
	User findByMailAddress(String email);

}
