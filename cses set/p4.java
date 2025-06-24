import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       long[] a=new long[n];
       long ans=0;
      
       for(int i=0;i<n;i++){
          a[i]=sc.nextLong();
          if(i>0){
            if(a[i-1]>a[i]){
                ans+=(a[i-1]-a[i]);
                a[i]=a[i-1];
            }
          }

       }
       System.out.println(ans);
    }
    
}
// it is greedy based problem in this we will increase the number upto the number which is the max upto previous index
// i am just checking the last max in the array using the trick max prefix in which calculate the max in the array upto 
// that index only in this fashion we can calculate the 
