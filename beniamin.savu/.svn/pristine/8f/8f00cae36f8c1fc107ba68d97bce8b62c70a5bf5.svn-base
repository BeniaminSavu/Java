package com.iquest.week5;

import java.util.Calendar;
import java.util.Date;

public class CustomDate {
	private Day day;
	private Month month;
	private int year;

	CustomDate(Date date) {
		day = getDayFromDate(date);
		month = getMonthFromDate(date);
		year = getYearFromDate(date);
	}

	private int getYearFromDate(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.YEAR);
	}

	private Month getMonthFromDate(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int monthOfYear = c.get(Calendar.MONTH);
		return Month.values()[monthOfYear];
	}

	private Day getDayFromDate(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return Day.values()[dayOfWeek - 1];	
	}

	public String getDay() {
		return day.toString();
	}

	public String getMonth() {
		return month.toString();
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return day + " " + month + " " + year;
	}


}
