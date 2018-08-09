package com.stackroute.pe3;

public class Matrix 
{
	 int a,b;
	 int l[][],m[][],n[][];
	 public int[][] mat(int a,int b,int l[][],int m[][])
	 {int[][] sum = new int[a][b];
     for(int i = 0; i < a; i++) {
         for (int j = 0; j < b; j++) {
             sum[i][j] = l[i][j] + m[i][j];
         }
     }

		 return sum;
	 }
}