package com.stackroute.pe3;


import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConsecTest {
	private static Consec con;
	@BeforeClass
	public static void setup() {
	con = new Consec();	
}

	@AfterClass
	public static void teardown() {
	con=null;
	}

	@Test
	public void testConsecutiveLen(){
		boolean pass=con.consecCheck("1,2,3,4,5,6,7");
		assertEquals(true,pass);
	}
	
	@Test
	public void TestConsecutive() {
		boolean fail=con.consecCheck("1,2,3,4,5,6,7");
		assertNotEquals(false,fail);		
	}
	
}


