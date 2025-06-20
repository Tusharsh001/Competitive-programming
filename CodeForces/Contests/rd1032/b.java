import java.util.*;
import static  java.lang.Math.min;
import static java.lang.Math.max;
public class b {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
        
            boolean ans=false;
           HashSet<Character> set=new HashSet<>();
           if(s.charAt(0)==s.charAt(1)){
            ans=true;
           }
            for(int i=1;i<n && ans==false;i++){
                if(set.contains(s.charAt(i))){
                    ans=true;
                    break;
                }
                set.add(s.charAt(i));
            }
            for(int i=1;i<n-1 && ans==false;i++){
                if(s.charAt(i)==s.charAt(0)){
                  ans =true;
                  break;
                }
                
            }
            if(ans){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
     }
}
