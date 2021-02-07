package com.example.domain;

import lombok.Data;

@Data
public class User {
	/** ユーザーID */
	private Integer id;
	/** 氏名 */
	private String name;
	/** メールアドレス */
	private String email;
	/** パスワード */
	private String password;
	/** 郵便番号 */
	private String zipcode;
	/** 住所 */
	private String address;
	/** 電話番号 */
	private String telephone;

}
