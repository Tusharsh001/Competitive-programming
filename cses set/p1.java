import java.util.ArrayList;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        System.out.print(n + " ");
        while(n>1){
            if(n%2==0){
              n/=2;
              System.out.print(n + " ");
            }
            else{
                n=(n*3)+1;
                System.out.print(n + " ");
            }
        }
    }
    
}
//               <---------  trick ----->
// this question is as simple as it seem but it has trick and that 
// that instead of the int we have to use long data type beacuse some number might excceds the int limit and give a wrong 
//output  but using long solve this problem and just follow the instruction given in the question 
