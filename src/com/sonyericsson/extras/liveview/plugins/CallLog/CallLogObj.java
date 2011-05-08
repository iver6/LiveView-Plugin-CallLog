package com.sonyericsson.extras.liveview.plugins.CallLog;

public class CallLogObj {
	private String PhoneNunber;
	private String Name;
	private int Type;
	private String Date;
	public void setPhoneNunber(String phoneNunber) {
		PhoneNunber = phoneNunber;
	}
	public String getPhoneNunber() {
		return PhoneNunber;
	}
	public void setName(String name) {
		if(name != null)
			Name = name;
		else
			Name = "";
	}
	public String getName() {
		return Name;
	}
	public void setType(int type) {
		Type = type;
	}
	public int getType() {
		return Type;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getDate() {
		return Date;
	}
	
	
}
