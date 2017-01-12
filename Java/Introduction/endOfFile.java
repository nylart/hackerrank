// Problem: https://www.hackerrank.com/rest/contests/master/challenges/java-end-of-file/download_pdf?language=English
// Program: For each line, print the line number, followed by a single space, and then the line content received as input.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String statement = "";
        int counter = 0;
        while(scan.hasNextLine()){
            statement = scan.nextLine();
            counter++;
            System.out.println(counter + " " + statement);
        }
    }
}
