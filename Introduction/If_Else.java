    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    // If n is odd, print Weird
    //If n is even and in the inclusive range of 2 to 5, print Not Weird
    //If n is even and in the inclusive range of 6 to 20, print Weird
    //If n is even and greater than 20, print Not Weird


    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            
            // if n is odd
            if(n%2==1){
              ans = "Weird";
            }
            else{
               if (n >= 2 && n <= 5){
                   ans = "Not Weird";
               }
                if (n >= 6 && n <= 20){
                    ans = "Weird";
                }
                if (n > 20){
                    ans = "Not Weird";
                }
            }
            System.out.println(ans);
            
        }
    }
