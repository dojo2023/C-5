package model;

import java.io.Serializable;

public class LoginUsers implements Serializable {
	private String user_id;	// ログイン時のID
	private String user_mail;//メアド
	private String user_pw;//メアド

	public LoginUsers() {
		this.user_id = "";
		this.user_mail = "";
		this.user_pw = "";
	}

	public LoginUsers(String user_id ,String user_mail ,String user_pw) {
		this.user_id = user_id;
		this.user_mail = user_mail;
		this.user_pw = user_pw;
	}


	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_mail() {
		return user_mail;
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
}
