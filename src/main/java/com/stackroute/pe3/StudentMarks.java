package com.stackroute.pe3;



public class StudentMarks
{
         int numofStudents;
         int[] stuGrade= {};
         
         public String grade(int stuGrade[]) 
         {	
             for (int i=0;i<stuGrade.length;i++)
             {
            	 try {
            	 
            	 if(stuGrade[i]<0||stuGrade[i]>100)
            		 throw new Exception("error");
             }
             catch(Exception e) 
             {return e.getMessage();
             }
             }
        	 return ("The grade is between 0 and 100");
         }
}


