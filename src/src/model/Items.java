package model;
import java.io.Serializable;


public class  Items implements Serializable {
	private int item_id;
	private String user_id;
	private String item_name;
	private String item_url;
	private  int item_price;
	private int item_category;
	private int frequency_purchase;
	private int item_switch;
	private Double item_meter;



	public  Items (
		int item_id,
		String user_id,
		String item_name,
		String item_url,
		int item_price,
		int item_category,
		int frequency_purchase,
		int item_switch,
		Double item_meter
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
		this.item_id = 0;
		this.user_id = "";
		this.item_name = "";
		this.item_url = "";
		this.item_price = 0;
		this.item_category = 1;
		this.frequency_purchase = 3;
		this.item_switch = 0;
		this.item_meter = 100.0;

	}



	public int getItem_id() {
		return item_id;
	}


	public void setItem_id(int item_id) {
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


	public int getItem_price() {
		return item_price;
	}


	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}


	public int getItem_category() {
		return item_category;
	}


	public void setItem_category(int item_category) {
		this.item_category = item_category;
	}


	public int getFrequency_purchase() {
		return frequency_purchase;
	}


	public void setFrequency_purchase(int frequency_purchase) {
		this.frequency_purchase = frequency_purchase;
	}


	public int getItem_switch() {
		return item_switch;
	}


	public void setItem_switch(int item_switch) {
		this.item_switch = item_switch;
	}


	public double getItem_meter() {
		return item_meter;
	}


	public void setItem_meter(double item_meter) {
		this.item_meter = item_meter;
	}



}