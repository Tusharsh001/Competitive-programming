import java.util.*;
import java.lang.*;
import java.io.*;

class p6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int[] a=new int[n];
		     long motuScore=0;
		     long tomuScore=0;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        if(i%2==0){
		            motuScore+=a[i];
		        }
		        else{
		            tomuScore+=a[i];
		        }
		    }
		    if(tomuScore>motuScore){
		       System.out.println("YES");
		       continue;
		    }

      // here i am creating two new array in which i am keeping the scorces of both the players 
		    long[] mval=new long[n%2==0? n/2: n/2+1];
		  
		    long[] tval=new long[n-mval.length];
		    int mi=0;
		    int ti=0;
		    for(int i=0;i<n;i++){
		        if(i%2==0){
		            mval[mi]=a[i];
		            mi++;
		        }
		        else{
		            tval[ti]=a[i];
		            ti++;
		        }
		    }
      // the idea of the sorting is that all the low scores of tomu should be swaped with the higher scores of the motu 
		    Arrays.sort(mval);
		    Arrays.sort(tval);
		    ti=0;
		    mi=mval.length-1;
      // here we are sawping the scores of the tomu and motu till k operations 
      // we take the high score of the motu and swap with the low of the tomu
		    while((ti<tval.length) && k>0 && tval[ti]<mval[mi]){
		        tomuScore+=mval[mi];
		        tomuScore-=tval[ti];
		        motuScore+=tval[ti];
		         motuScore-=mval[mi];
		         ti++;
		         mi--;
		         k--;
		    }
      // and finally we check is it possible or not
		    if(tomuScore> motuScore){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
