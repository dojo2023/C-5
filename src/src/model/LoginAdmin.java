package model;
import java.io.Serializable;

public class LoginAdmin implements Serializable {
	private String id; //ログイン時のID

	public LoginAdmin() {
		this(null);
	}

	public LoginAdmin(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setUserId(String id) {
		this.id = id;
	}
}
