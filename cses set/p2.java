
import java.util.*;

/* 
 writer:- Non_newtonian
*/
public class p2{

    public static void main(String[] args) {
    
          int n=sc.nextInt();
        int[] a=new int[n-1];
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
            set.add(a[i]);
        }
          for(int i=1;i<=n;i++){
        if(!set.contains(i)){
            System.out.println(i);
            break;
        }
          }
          
        }
       
      }
