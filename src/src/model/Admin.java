package model;
import java.io.Serializable;

public class Admin implements Serializable {
	private String DOJO;	// ID
	private String pass;	// PW

	public Admin(String DOJO, String pass) {
		this.DOJO = DOJO;
		this.pass = pass;
	}

	public Admin() {
		this.DOJO = "DOJO";
		this.pass = "pass";
	}

	public String getId() {
		return DOJO;
	}

	public void setId(String DOJO) {
		this.pass = DOJO;
	}

	public String getPw() {
		return pass;
	}

	public void setPw(String pass) {
		this.pass = pass;
	}

	public boolean isLoginOK(Admin admin) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}


}
