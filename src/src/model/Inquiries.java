package model;
import java.io.Serializable;

public class Inquiries implements Serializable {
	  private String inquiry_id;
	  private String user_id;
	  private String inquiry_subject;
	  private String inquiry_content;
	  private String inquiry_status;
	  private String inquiry_date;

public Inquiries(String inquiry_id, String user_id, String inquiry_subject, String inquiry_content,
			String inquiry_status, String inquiry_date) {
		super();
		this.inquiry_id = inquiry_id;
		this.user_id = user_id;
		this.inquiry_subject = inquiry_subject;
		this.inquiry_content = inquiry_content;
		this.inquiry_status = inquiry_status;
		this.inquiry_date = inquiry_date;
	}
public Inquiries() {
	super();
	this.inquiry_id = "";
	this.user_id = "";
	this.inquiry_subject = "";
	this.inquiry_content = "";
	this.inquiry_status = "";
	this.inquiry_date = "";
    }

public String getInquiry_id() {
	return inquiry_id;
}
public void setInquiry_id(String inquiry_id) {
	this.inquiry_id = inquiry_id;
}
public String getUser_id() {
	return user_id;
}
public void setUser_id(String user_id) {
	this.user_id = user_id;
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
public String getInquiry_status() {
	return inquiry_status;
}
public void setInquiry_status(String inquiry_status) {
	this.inquiry_status = inquiry_status;
}
public String getInquiry_date() {
	return inquiry_date;
}
public void setInquiry_date(String inquiry_date) {
	this.inquiry_date = inquiry_date;
}

}
