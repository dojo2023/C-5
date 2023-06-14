package model;
import java.io.Serializable;


public class  Items implements Serializable {
	private String item_id;
	private String user_id;
	private String item_name;
	private String item_url;
	private String item_price;
	private String item_category;
	private String frequency_purchase;
	private String item_switch;
	private String item_meter;



	public  Items (
		String item_id,
		String user_id,
		String item_name,
		String item_url,
		String item_price,
		String item_category,
		String frequency_purchase,
		String item_switch,
		String item_meter
) {
		super();
		this.item_id = item_id;
		this.user_id = user_id;
		this.item_name = item_name;
		this.item_url = item_url;
		this.item_price = item_price;
		this.item_category = item_category;
		this.frequency_purchase = frequency_purchase;
		this.item_switch = item_switch;
		this.item_meter = item_meter;

	}

	public Items() {
		super();
		this.item_id = "";
		this.user_id = "";
		this.item_name = "";
		this.item_url = "";
		this.item_price = "";
		this.item_category = "";
		this.frequency_purchase = "";
		this.item_switch = "";
		this.item_meter = "";

	}



	public String getItem_id() {
		return item_id;
	}


	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public String getItem_url() {
		return item_url;
	}


	public void setItem_url(String item_url) {
		this.item_url = item_url;
	}


	public String getItem_price() {
		return item_price;
	}


	public void setItem_price(String item_price) {
		this.item_price = item_price;
	}


	public String getItem_category() {
		return item_category;
	}


	public void setItem_category(String item_category) {
		this.item_category = item_category;
	}


	public String getFrequency_purchase() {
		return frequency_purchase;
	}


	public void setFrequency_purchase(String frequency_purchase) {
		this.frequency_purchase = frequency_purchase;
	}


	public String getItem_switch() {
		return item_switch;
	}


	public void setItem_switch(String item_switch) {
		this.item_switch = item_switch;
	}


	public String getItem_meter() {
		return item_meter;
	}


	public void setItem_meter(String item_meter) {
		this.item_meter = item_meter;
	}



}