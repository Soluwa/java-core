package com.easylearn.fundamentals;

import java.util.Calendar;
import java.util.Date;

public class AddsTwoNumbers {
	
	public int addNumbers(int num1, int num2) {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		var thisWeek = cal.getWeeksInWeekYear();
		return thisWeek;
	}
	
	public String handleString() {
		String text = "All is fair \"in love\" and war";
		//return text.substring(text.indexOf("All is"));
		return text.substring(text.indexOf("r")+1);
	}
	

}
