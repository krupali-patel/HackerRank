import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            String temp= "hackerrank";
         int  j=0;
            for(int i=0;i<s.length();i++)
                {
                if(j<temp.length())
                    {
                if(temp.charAt(j)==s.charAt(i) )
                    {
                 j++;   
                }
            }
                else
                    break;
            }
            if(j==temp.length())
                System.out.println("YES");
            else
                  System.out.println("NO");
        }
    }
}
