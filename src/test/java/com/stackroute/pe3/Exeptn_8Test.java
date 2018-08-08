package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Exeptn_8Test {

	private static Exeptn_8 obj8;
	static 	int [] arr;
	static int size;
	static int empty[];
	@BeforeClass
	public static void setup() {
	obj8 = new Exeptn_8();
	arr =  new int [] {45,34,65,87,23,56,12};
	size=6;
	 empty=null;
}

	@AfterClass
	public static void teardown() {
	obj8=null;
	}

	@Test
	public void testSizeNegative(){
		String pass =obj8.sizeNegative(-8);
		assertEquals("null",pass);
	}
	
	@Test
	public void testNullExep() {
		String varNull=obj8.nullExep(empty, size);
		assertNotEquals("null",varNull);		
	}

	@Test
	public void testOutOfBound() {
		String fail=obj8.outOfBound(arr,size);
		assertNotEquals("13",fail);		
	}

}
