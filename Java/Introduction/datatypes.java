// Problem: https://www.hackerrank.com/rest/contests/master/challenges/java-datatypes/download_pdf?language=English
// Program: Outputs what datatypes a number fits into or if it can't be fit anywhere.

import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();                                                     // # of test cases
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<= 32767)System.out.println("* short");
                if(x == (int)x)System.out.println("* int");
                if(x == (long)x)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
