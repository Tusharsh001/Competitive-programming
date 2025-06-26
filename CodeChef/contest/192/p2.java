import java.util.*;
class p2
{
	public static void main (String[] args) 
	{
		
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    int min=a[0];
		    int count=0;
		    for(int i=1;i<n;i++){
		        min=Math.min(min,a[i]>=count? a[i]+1:count+1);
		        count++;
		    }
		    System.out.println(min);
		}

	}
}
// the solution is used is very brute force 
// the is to find the time required in each queue and compare it will all ans find the minimum among all of them 
//finding the time required -->
// for this we have used the idea that we am moving along the index in the loop and counting the second that i previouly used 
// before reaching the perticular queue if the people are present in that perticula queue after you reach there then 
// you need a time a[i]+1 and if reach an empty queue then you have count the time you used to reach at that queue and 
// +1 for you to checkout 
// this idea give us the time required in each queue
