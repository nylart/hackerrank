// Problem: https://www.hackerrank.com/rest/contests/master/challenges/java-loops/download_pdf?language=English
// Program: For each query, print the corresponding series on a new line. 
//          Each series must be printed in order as a single line of n space-separated integers.

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner cin=new Scanner(System.in);
		int T=cin.nextInt();
		for(;T>0;T--){
			int a=cin.nextInt(),b=cin.nextInt(),n=cin.nextInt();
			for(int i=0;i<n;i++){
				System.out.print(a+b*((2<<i)-1));
				System.out.print(i<n-1?" ":"\n");
			}
		}
    }
}
