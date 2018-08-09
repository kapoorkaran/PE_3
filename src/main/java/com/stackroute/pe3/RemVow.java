package com.stackroute.pe3;

import java.util.ArrayList;

public class RemVow {
	public ArrayList<String> removevow(String a[])
	{  int len= a.length;
	System.out.println("length"+len);
	ArrayList<String>  plus = new ArrayList();
		for(int i=0;i<len;i++)
		{	a[i]=a[i].replaceAll("a|e|i|o|u", "");
			
			}
		for (String plus2 : a) {
            plus.add(plus2);
        }
		
		return plus;
	}

}