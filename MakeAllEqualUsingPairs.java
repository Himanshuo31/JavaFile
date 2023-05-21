/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-- >0)
		{
		    int n=scan.nextInt();
		    int a[]=new int[n];
		    for(int k=0;k<n;k++)
		    {
		        a[k]=scan.nextInt();
		    }
		    int count=0;
		    boolean flag=true;
		    for(int j=0;j<n-1;j++)
		    {
		        if(a[j]!=a[j+1])
		        {
		            count++;
		            flag=false;
		        }
		        else
		        {
		            flag=true;
		        }
		    }
		    
		   
		    if(flag)
		    {
		        System.out.println(0);
		    }
		    else
		    {
		        System.out.println(count);
		    }
		}
	}
}
