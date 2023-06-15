package model;
import java.io.Serializable;

public class Frequency implements Serializable{
	private int frequency_id;
	private String frequency_name;
	private int frequency_purchase;
	private int frequency_days;




	public Frequency(
		int frequency_id,
		String frequency_name,
		int frequency_purchase,
		int frequency_days

) {
		super();
		this.frequency_id = frequency_id;
		this.frequency_name = frequency_name;
		this.frequency_purchase = frequency_purchase;
		this.frequency_days = frequency_days;
	}

	public Frequency() {
		super();
		this.frequency_id = 0;
		this.frequency_name = "";
		this.frequency_purchase = 0;
		this.frequency_days = 0;
	}

	public int getFrequency_id() {
		return frequency_id;
	}

	public void setFrequency_id(int frequency_id) {
		this.frequency_id = frequency_id;
	}

	public String getFrequency_name() {
		return frequency_name;
	}

	public void setFrequency_name(String frequency_name) {
		this.frequency_name = frequency_name;
	}

	public int getFrequency_purchase() {
		return frequency_purchase;
	}

	public void setFrequency_purchase(int frequency_purchase) {
		this.frequency_purchase = frequency_purchase;
	}

	public int getFrequency_days() {
		return frequency_days;
	}

	public void setFrequency_days(int frequency_days) {
		this.frequency_days = frequency_days;
	}







}
