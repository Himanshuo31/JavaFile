/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AppendForOR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-- >0)
		{
		    int n=scan.nextInt();
		    int y=scan.nextInt();
		    
		    int a[]=new int[n];
		    for(int i=0;i<t;i++)
		    {
		        a[i]=scan.nextInt();
		    }
		    int result=0;
		    for(int e:a)
		    {
		        result |= e;
		    }
		    
		    int x=(y ^ result);
		    
		    if((result | x)==y)
		    {
		        System.out.println(x);
		    }
		    else
		    {
		        System.out.println(-1);
		    }
		    }
	}
}
