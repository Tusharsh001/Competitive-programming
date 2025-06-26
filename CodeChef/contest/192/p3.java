import java.util.*;

class p3
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
		    int[] ps=new int[n];
		    int lastoccur=-1;
		    ps[0]=a[0]%3;
		    for(int i=1;i<n;i++){
		        ps[i]=(ps[i-1]+a[i])%3;
		        if(ps[i]==0){
		            lastoccur=i;
		        }
		    }
		    if(lastoccur==-1){
		        System.out.println("YES");
		        continue;
		    }
		    int[] values=new int[3];
		    boolean ans=false;
		    Arrays.fill(values,0);
		    for(int i=0;i<n;i++){
		        if(i>lastoccur){
		            if(values[ps[i]]==0){
		                ans=true;
		            }
		        }
		        
		        values[ps[i]]++;
		    }
		    if(ans) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
