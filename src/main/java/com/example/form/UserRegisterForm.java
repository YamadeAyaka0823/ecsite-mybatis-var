package com.example.form;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class UserRegisterForm {
	
	/** 氏名 */
	@NotBlank(message="氏名を入力してください")
	private String name;
	/** メールアドレス */
	@NotBlank(message="メールアドレスを入力してください")
	private String email;
	/** 郵便番号 */
	@NotBlank(message="郵便番号を入力してください")
	private String zipcode;
	/** 住所 */
	@NotBlank(message="住所を入力してください")
	private String address;
	/** 電話番号 */
	@NotBlank(message="電話番号を入力してください")
	private String telephone;
	/** パスワード */
	@NotBlank(message="パスワードを入力してください")
	private String password;
	/** 確認用パスワード */
	@NotBlank(message="確認用パスワードを入力してください")
	private String confirmPassword;

}
