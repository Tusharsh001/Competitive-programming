import java.util.*;
import java.lang.*;
import java.io.*;

class p4
{
	public static void main (String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    if(n==3){
		        System.out.println("1 2 3");
		    }
		    else{
		        int[] a=new int[n+1];
		    a[1]=n;
		    a[n]=n-1;
		    a[2]=n-2;
		    a[n-1]=n-3;
		     int val=n-4;
		     for(int i=3;i<n-1;i++) a[i]=val--;
		     for(int i=1;i<=n;i++){
		         System.out.print(a[i] + " ");
		     }
		    }
		   System.out.println();
		}

	}
}
