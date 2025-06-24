import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long  sum=0;
        for(int i=0;i<n-1;i++){
            int num=sc.nextInt();
              sum+=num;
        }
         long total=(long)n*(n+1)/2;
           System.out.println(total-sum);
    }
    
}
// this very simple problem in this problem we calculate the sum of the number upto n terms and the 
// along with the sum of the given  number and then subtaract these two giving out the correct answer
