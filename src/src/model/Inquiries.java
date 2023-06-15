package model;
import java.io.Serializable;
import java.util.Date;

public class Inquiries implements Serializable {
	  private int inquiry_id;
	  private String user_id;
	  private String user_mail;
	  private String inquiry_subject;
	  private String inquiry_content;
	  private int inquiry_status;
	  private Date inquiry_date;

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
