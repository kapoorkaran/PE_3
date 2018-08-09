package com.stackroute.pe3;
import java.util.*;
import java.time.*;
import java.text.*;
public class CurrentDate {
        public ArrayList<String> mon( ) 
        {
        	ArrayList<String> str=new ArrayList<String>();
        	
            Date d=new Date();
            Date d1=new Date(d.getTime()-2*(24*3600*1000));
            String pattern="E dd/MM/yyyy";
            
            SimpleDateFormat f=new SimpleDateFormat(pattern);
            String s1=f.format(d1);
            Date d2=new Date(d.getTime()+4*(24*3600*1000));
            String s2=f.format(d2);
            str.add(s1);
            str.add(s2);
            return str;
        }
}