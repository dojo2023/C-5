package model;
import java.io.Serializable;
import java.util.Date;

public class History implements Serializable {

	private int history_id;
	private int item_id;
	private Date history_date;




	public  History (
		int history_id,
		int item_id,
		Date history_date

) {
		super();
		this.history_id = history_id;
		this.item_id = item_id;
		this.history_date = history_date;


}
	public History() {
		super();
		this.history_id = 0;
		this.item_id = 0;
		this.history_date = null;
	}
	public int getHistory_id() {
		return history_id;
	}
	public void setHistory_id(int history_id) {
		this.history_id = history_id;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public Date getHistory_date() {
		return history_date;
	}
	public void setHistory_date(Date history_date) {
		this.history_date = history_date;
	}



}








