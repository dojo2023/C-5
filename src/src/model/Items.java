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


}