import java.util.*;
import java.lang.*;
import java.io.*;

class p9
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    long[]a =new long[n];
		    long sum=0;
		  
		    long max=Long.MIN_VALUE;
		    long min=Long.MAX_VALUE;
		    for(int i=0;i<n;i++){
		        a[i]=Math.abs(sc.nextLong());
		        if(i%2==0){ 
		            sum+=a[i];
		            if(min>a[i]){
		                min=a[i];
		            }
		        }
		        else {
		            sum-=a[i];
		            if(a[i]>max){
		                max=a[i];
		            }
		        }
		    }
		    long diff = 2 * (max- min);
            System.out.println(Math.max(sum, sum + diff));
		}

	}
}
