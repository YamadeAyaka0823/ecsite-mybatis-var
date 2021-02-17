package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.form.UserRegisterForm;
import com.example.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public UserRegisterForm setUpForm() {
		return new UserRegisterForm();
	}
	
	/**
	 * ログイン初期画面.
	 * @return
	 */
	@RequestMapping("/toLogin")
	public String toLogin(Model model,@RequestParam(required = false) String error) {
		if (error != null) {
			model.addAttribute("errorMessage", "メールアドレスまたはパスワードが不正です。");
		}
		return "login";
	}
	
	/**
	 * ユーザー新規登録初期画面.
	 * @return
	 */
	@RequestMapping("/register")
	public String register() {
		return "register_user";
	}
	
	/**
	 * ユーザーを新規登録する.
	 * @param form
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(@Validated UserRegisterForm form, BindingResult result, Model model) {
		//どこかしら値が空だった場合、ユーザー新規登録画面へ返す.
		if(result.hasErrors()) {
			return register();
		}
		//パスワードと確認用パスワードが一致しなかった場合、ユーザー新規登録画面へ返す.
		if(!form.getPassword().equals(form.getConfirmPassword())) {
			model.addAttribute("error", "確認用パスワードが一致しません");
			return register();
		}
		userService.insert(form);
		return "redirect:/user/";
	}

}
