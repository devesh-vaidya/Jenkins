package com.pkg1;

public class MyDate 
{
	private int day;
	private int month;
	private int year;
	
	public MyDate()
	{
		day = 16;
		month = 11;
		year = 2020 ;
	}
	public MyDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	int getDay()
	{
		return day;
	}
	
	void setDay(int day)
	{
		this.day = day;
	}
	
	int getMonth()
	{
		return month;
	}
	
	void setMonth(int month)
	{
		this.month = month;
	}
	
	int getYear()
	{
		return year;
	}
	
	void setYear(int year)
	{
		this.year = year ;
	}
	
	void display()
	{
		System.out.println("Day = " + day + " Month = " + month + " Year = " + year );
	}
	
	@Override
	public String toString() {
		return " [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public static void main(String[] args)
	{
		
		
		MyDate d2 = new MyDate(17,11,2020);
		d2.display();
		
		
		
	}

}
