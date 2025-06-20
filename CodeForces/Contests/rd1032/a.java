import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
/* 
 writer:- Non_newtonian
*/

public class a{

 
    public static void main(String[] args) {

       long t=sc.nextLong();
       while(t-->0){
      int n=sc.nextInt();
      int s=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();

      }
      int f=a[0];
      int l=a[n-1];
      int ans=0;
      if(s>=l)  ans=s-f;
      else{
        if(s>f){
        int mini=min(s-f,l-s);
        int maxi=max(s-f,l-s);
        ans=(2*mini)+maxi;
        }
        else ans=l-s;
      }
      System.out.println(ans);
       }
        }
     
          
        }
       
    

    
    

