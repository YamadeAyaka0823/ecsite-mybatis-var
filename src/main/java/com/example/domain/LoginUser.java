package com.example.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * 管理者のログイン情報を格納するエンティティ.
 * 
 * @author igamasayuki
 *
 */
public class LoginUser  extends User{

	private static final long serialVersionUID = 1L;
	/** 管理者情報 */
	private final com.example.domain.User user;
	
	/**
	 * 通常の管理者情報に加え、認可用ロールを設定する。
	 * 
	 * @param administrator 管理者情報
	 * @param authorityList 権限情報が入ったリスト
	 */
	public LoginUser(com.example.domain.User user, Collection<GrantedAuthority> authorityList) {
		super(user.getEmail(), user.getPassword(), authorityList);
		this.user = user;
	}

	/**
	 * 管理者情報を返します.
	 * 
	 * @return 管理者情報
	 */
	public com.example.domain.User getUser() {
		return user;
	}
	
}
