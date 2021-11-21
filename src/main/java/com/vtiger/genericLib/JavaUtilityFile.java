package com.vtiger.genericLib;

import java.util.Random;

import com.github.javafaker.Faker;


public class JavaUtilityFile {

	public Faker fake=new Faker();
	public String FakeFullName()
	{
		 return fake.name().fullName();
		 
	}
	public String FakeBusinessName()
	{
		return fake.company().name();
	}
	public String FakePhoneNo()
	{
		return fake.phoneNumber().phoneNumber();
	}
	public String FakeProductName()
	{
		return fake.commerce().productName();
	}
	public String FakeAddress()
	{
		return fake.address().fullAddress();
	}
	public String FakeQty()
	{
		return fake.number().digits(2);
	}
	public  int generateRandomNumber()
	{
		Random r=new Random();
		int number=r.nextInt(1000);
		return number;
	}

}
