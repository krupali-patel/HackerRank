import java.io.*;
import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
            int t=s.nextInt();
            for(int j=0;j<t;j++)
                {
		int n = s.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
		compute(a);
	}
        }
	
	static void compute(int a[])
	{
		double sum=0.0d;
		int count =0;
		int n= a.length;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
			if(a[i]<=a[j])
			{
				count++;
			}
            }
				sum+= (double)(n+1)/(count+1);
		
		}
		System.out.printf("%.2f\n",sum);
	}
}