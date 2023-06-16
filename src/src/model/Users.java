package model;
import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
	private int user_auto_id;//auto_id
	private String user_id;	// ID
	private String user_pw;	// パスワード
	private String user_mail;//メアド
	private Date user_date;//減量ボタン押下時刻


	public Users(int user_auto_id,String user_id, String user_pw,
			String user_mail, Date user_date) {
		this.user_auto_id = user_auto_id;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_mail = user_mail;
		this.user_date = user_date;
	}

	//ログイン
	public Users(String user_id, String user_pw) {
		this.user_id = user_id;
		this.user_pw = user_pw;
	}
	//新規登録
	public Users(int user_auto_id,String user_id, String user_pw,
			String user_mail) {
		this.user_auto_id = user_auto_id;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_mail = user_mail;
	}
	//パスワード再設定
	public Users(String user_id, String user_pw,
			String user_mail) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_mail = user_mail;
	}

	public Users() {
		this.user_auto_id = 0;
		this.user_id = "";
		this.user_pw = "";
		this.user_mail = "";
		this.user_date = null;
	}
	public int getUser_auto_id() {
		return user_auto_id;
	}

	public void setUser_auto_id(int user_auto_id) {
		this.user_auto_id = user_auto_id;
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
	public String getUser_mail() {
		return user_mail;
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public Date getUser_date() {
		return user_date;
	}

	public void setUser_date(Date user_date) {
		this.user_date = user_date;
	}
}
