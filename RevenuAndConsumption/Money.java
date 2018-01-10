package RevenuAndConsumption;

import java.util.Calendar;

public class Money {
	
	private String name;
	private Calendar date;
	private boolean periodic = false;
	private double count;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Calendar getDate() {
		date = Calendar.getInstance();
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}
    
	public Money(){
		
	}
	
	
}
