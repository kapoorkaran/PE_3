package com.stackroute.pe3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RemVowTest {
public static RemVow r;
	
	
	@BeforeClass
	public static void setup() 
	{
			r = new RemVow();
		
	}
	@AfterClass
	public static void teardown() 
	{
		r = null;
	
	}
	@Test
	public void test1()
	{
		String[] str = {"India", "United states", "Germany" , "Egypt"," czechoslovakia"};
		String[] str1 = {"Ind", "Untd stts", "Grmny" , "Egypt"," czchslvk"};
		ArrayList<String> elements = new ArrayList<String>(Arrays.asList(str1));
		assertEquals(elements,r.removevow(str));
	}
	@Test
	public void test2()
	{
		String[] str = {"India", "United states", "paris" , "egypt"," czechoslovakia"};
		String[] str1 = {"India", "ie states", "pari" , "Egypt"," czchslvk"};
		ArrayList<String> elements = new ArrayList<String>(Arrays.asList(str1));
		assertNotEquals(elements,r.removevow(str));
	}
	

}