import java.util.*;
import java.lang.*;
import java.io.*;

class p5
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    int n=sc.nextInt();
	    int[] arrival=new int[n];
	    int[] depart=new int[n];
	    for(int i=0;i<n;i++){
	        arrival[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        depart[i]=sc.nextInt();
	    }
	    Arrays.sort(arrival);
	    Arrays.sort(depart);
	    int stay=0;
	    int ans=0;
	    int di=0;
	    int ai=0;
	    for(int i=1;i<=10000;i++){
	        if(di<n &&depart[di]==i){
	            while( di<n && depart[di]==i ){
	                stay--;
	                di++;
	            }
	        }
	        if(ai<n &&arrival[ai]==i){
	            while(ai<n &&arrival[ai]==i){
	                stay++;
	                ai++;
	            }
	            
	        }
	        ans=Math.max(ans,stay);
	    }
	    System.out.println(ans);
	}

	}
}

// ---------used the brute force approch in it 
// first sorted the arrival time and departed time 
//then i trated over all over the constrants limit 
// checking the arrival time and departed time 
// someone has to arrive then increas the stay(variable to keep the account of person present in hotel at that time )
// ----.STAY INCREMENT -- might be a possibilty of many guest to arrive at the same time so used while to count till the value changes
// someone has to depart then decrease the stay by the number of guest that has to depart and we have using while loop 
// and checking the max value of stay at every point 
// 
// 
