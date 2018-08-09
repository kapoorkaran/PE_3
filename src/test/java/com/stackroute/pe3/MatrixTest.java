package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixTest {
public static Matrix sm;
	
	
	@BeforeClass
	public static void setup() 
	{
			sm = new Matrix();
		
	}
	@AfterClass
	public static void teardown() 
	{
		sm = null;
	
	}


	@Test
	public void test1() {
		int m[][]= {{1,4},{2,5},{3,6}};
		int n[][]= {{7,7},{6,8},{5,5}};
		int l[][]=new int[3][2];
		l=sm.mat(3,2,m,n);
		int result[][]= {{8,11},{8,13},{8,11}};
		assertArrayEquals(result,l);
		}
	@Test
	public void test2() {
		int a[][]= {{1,2},{1,2},{1,2}};
		int b[][]= {{3,4},{3,4},{3,4}};
		int c[][]=new int[3][2];
		c=sm.mat(3,2,a,b);
		int res[][]= {{4,6},{3,4},{2,11}};
		assertNotEquals(res,c);
	}
	

}