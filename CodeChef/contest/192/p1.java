import java.util.*;
class p1
{
	public static void main (String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[]a =new int[n];
		    boolean allequal=true;;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        if(i>0){
		            if(a[i]!=a[i-1]){
		                allequal=false;
		            }
		        }
		    }
		    if(allequal){
		        System.out.println(0);
		        continue;
		    }
		    int ans=0;
		    int ones=0;
		    int replace1=0;
		    int replace2=0;
		    int count=0;
		    for(int i=0;i<n;i++){
		         if(a[i]==1){
		             count++;
		             ones++;
		         }
		         else{
		             replace2++;
		         }
		         if(count==2){
		             replace1++;
		             count=0;
		         }
		    }
		    if(ones%2!=0){
		        System.out.println(replace2);
		    }
		    else{
		       ans=Math.min(replace1,replace2);
		    System.out.println(ans); 
		    }
		    
		}

	}
}


// this is a easy problem and the idea that i came up with was 
// we make the whole array of only 1 or only 2 then it will always statisfy the condition so to do that 
//we need  to find the number of operation that we need to prefome on the array in both the case i.e in case of 1 1-->2 
// or 2--> 1 1 and we can compare these operation and give the minimum
