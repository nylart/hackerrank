// Problem: https://www.hackerrank.com/rest/contests/master/challenges/java-static-initializer-block/download_pdf?language=English
// Program: If both values are greater than zero, then the main method must output the area of the parallelogram. 
//          Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        
        if(B > 0 && H > 0) flag = true;
        else System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
