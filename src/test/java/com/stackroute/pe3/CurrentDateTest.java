package com.stackroute.pe3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CurrentDateTest {
public static CurrentDate c;
	
	
	@BeforeClass
	public static void setup() 
	{
			c = new CurrentDate();
		
	}
	@AfterClass
	public static void teardown() 
	{
		c = null;
	
	}



	@Test
	public void test1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tue 07/08/2018");
		list.add("Mon 13/08/2018");
		ArrayList<String> list1 = new ArrayList<String>(c.mon());
		assertEquals(list,list1);
	}
	@Test
	public void test2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("mon 08/08/2018");
		list.add("sun 12/08/2018");
		ArrayList<String> list1 = new ArrayList<String>(c.mon());
		assertNotEquals(list,list1);
	}
	

}