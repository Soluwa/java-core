package com.easylearn.fundamentals;

import java.util.Date;

public class Person {
	
	private String name;
	private String nationality;
	private Date dateOfBirth;
	private int age;
	private String countryOfResidence;
	
	public Person(String _name,int _age,String _nationality,String _countryOfResidence) 
	{
		this.age = _age;
		this.name = _name;
		//this.dateOfBirth = _dateOfBirth;
		this.countryOfResidence = _countryOfResidence;
		this.nationality = _nationality;
	}
	
	public String getName() {
		return name;
	}
	public String getNationality() {
		return nationality;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public String getCountryOfResidence() {
		return countryOfResidence;
	}
}
