package model;
import java.io.Serializable;
import java.util.Date;

public class Inquiries implements Serializable {
	  private int inquiry_id;	//お問い合わせID（オートインクリメント）
	  private String user_id;	//ユーザーID
	  private String user_mail;	//ユーザーのメールアドレス
	  private String inquiry_subject;	//お問い合わせ件名
	  private String inquiry_content;	//お問い合わせ本文
	  private int inquiry_status;	//対応ステータス
	  private Date inquiry_date;	//お問い合わせの日付

  // 全部
  public Inquiries(int inquiry_id, String user_id, String user_mail, String inquiry_subject, String inquiry_content,
			int inquiry_status, Date inquiry_date) {
		super();
		this.inquiry_id = inquiry_id;
		this.user_mail = user_mail;
		this.user_id = user_id;
		this.inquiry_subject = inquiry_subject;
		this.inquiry_content = inquiry_content;
		this.inquiry_status = inquiry_status;
		this.inquiry_date = inquiry_date;
	}

  // 登録
  public Inquiries(String user_id,String inquiry_subject, String inquiry_content) {
		this.user_id = user_id;
		this.inquiry_subject = inquiry_subject;
		this.inquiry_content = inquiry_content;
  }

  // 対応ステータスの更新
  public Inquiries(int inquiry_id,int inquiry_status) {
	    this.inquiry_id = inquiry_id;
		this.inquiry_status = inquiry_status;
  }

  // 初期値を設定する
  public Inquiries() {
	super();
	this.inquiry_id = 0;
	this.user_mail = "";
	this.user_id = "";
	this.inquiry_subject = "";
	this.inquiry_content = "";
	this.inquiry_status = 0;
	this.inquiry_date = null;
    }

  // ゲッターとセッター
  public int getInquiry_id() {
	return inquiry_id;
  }
  public void setInquiry_id(int inquiry_id) {
	this.inquiry_id = inquiry_id;
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

public String getInquiry_subject() {
	return inquiry_subject;
}
public void setInquiry_subject(String inquiry_subject) {
	this.inquiry_subject = inquiry_subject;
}
public String getInquiry_content() {
	return inquiry_content;
}
public void setInquiry_content(String inquiry_content) {
	this.inquiry_content = inquiry_content;
}
public int getInquiry_status() {
	return inquiry_status;
}
public void setInquiry_status(int inquiry_status) {
	this.inquiry_status = inquiry_status;
}
public Date getInquiry_date() {
	return inquiry_date;
}
public void setInquiry_date(Date inquiry_date) {
	this.inquiry_date = inquiry_date;
}

}
