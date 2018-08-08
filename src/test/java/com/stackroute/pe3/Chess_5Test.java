package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Chess_5Test {
	private static Chess_5 ch;
	 private static String[][] expected	= {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	           								{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
	           								{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	           								{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
	           								{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	           								{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
	           								{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	           								{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
	 private static String[][] expectedNot	= {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","WW|","BB|","WW|","BB|"," |","BB|","WW|"},
				{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","BB|","BB|","WW|","WW|","WW|","BB|","WW|"},
				{"WW|","BB|","WW|"," |","WW|","BB|","WW|","BB|"},
				{"BB|","BB|","BB|","WW|","BB|","WW|","BB|","WW|"},
				{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
	 private static int lenExpected= expected.length;
	private static String[][] stTest=ch.pattern();
	 private static int lenstTest = stTest.length;
	@BeforeClass
	public static void setup() {
			ch= new Chess_5();
			 		 }

	@AfterClass
	public static void teardown() {
	ch=null;
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testChess(){
		assertEquals(expected,stTest);
			}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testNotChess() {
		assertEquals(expectedNot, stTest);
	}
	
	@Test
	public void testLength() {
		assertEquals(lenExpected, lenstTest);
	}
	
}


