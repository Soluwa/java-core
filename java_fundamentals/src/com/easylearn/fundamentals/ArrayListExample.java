package com.easylearn.fundamentals;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	ArrayList<Person> person = new ArrayList<>();
	
	Person p1 = new Person("Jack Katalan",24,"Swedish","United State of America");
	Person p2 = new Person("Hellen Mitchell",35,"British","Saudi Arabia");
	Person p3 = new Person("Usman Ali",29,"Nigerian","Englan");
	Person p4 = new Person("Ayesha Kata",54,"Indian","Germany");
	Person p5 = new Person("Joshua Driscoll",22,"Russian","New Zealand");
	Person p6 = new Person("Rose Wilshire",43,"Polish","South African");
	Person p7 = new Person("Emily Dunes",82,"Brazilian","Brazil");
	
	public void loadArrayList() 
	{
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		person.add(p5);
		person.add(p6);
		person.add(p7);
	}
	
	public void getAllNames() 
	{
		loadArrayList();
		Iterator<Person> it = person.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next().getName());
		}
	}
	
	public void getAllNationalities() 
	{
		loadArrayList();
		Iterator<Person> it = person.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next().getNationality());
		}
	}
}
