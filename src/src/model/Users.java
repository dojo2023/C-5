package model;
import java.io.Serializable;

public class Users implements Serializable {
	private String user_id;	// ID
	private String user_pw;	// PW

	public Users(String user_id, String user_pw) {
		this.user_id = user_id;
		this.user_pw = user_pw;
	}

	public Users() {
		this.user_id = "";
		this.user_pw = "";
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
}
