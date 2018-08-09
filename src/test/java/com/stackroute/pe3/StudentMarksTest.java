package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class StudentMarksTest {
	public static StudentMarks sm;
	
	
	@BeforeClass
	public static void setup() 
	{
			sm = new StudentMarks();
		
	}
	@AfterClass
	public static void teardown() 
	{
		sm = null;
	
	}

	@Test
	public void test1() {
        int result[]= {23,56,90,85,46};
		String res=sm.grade(result);
		assertEquals("The grade is between 0 and 100",res);
	}
	@Test
	public void test2() {
        int result1[]= {23,56,149,130,46};
		String res=sm.grade(result1);
		assertEquals("error",res);
	}
	
}
