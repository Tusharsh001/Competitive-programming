import java.util.*;

 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
 
 
/* 
 writer:- Non_newtonian
*/
 
public class p5{

 
    /*
     fast input reader 
     */
   static class FastReader {
      
        // BufferedReader to read input
        BufferedReader b;
      
        // StringTokenizer to tokenize input
        StringTokenizer s; 
 
        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader
              (new InputStreamReader(System.in));
        }
 
        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace(); 
                }
            }
            return s.nextToken();
        }
 
        // Method to read the next token as an integer
        int nextInt() { 
            return Integer.parseInt(next()); 
        }
 
        // Method to read the next token as a long
        long nextLong() { 
            return Long.parseLong(next()); 
        }
 
        // Method to read the next token as a double
        double nextDouble() { 
            return Double.parseDouble(next()); 
        }
 
        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            return str;
        }
    }
        // Create a FastReader instance for input
 
    public static FastReader sc = new FastReader();
 
    // A fast output 
   public static  PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
      
    /*
     power a^b
 
     */
     public static int power(int a,int b,int mod){
      if(b==0){
        return 1;
      }
      if(b%2==0){
       int t= power(a,b/2,mod);
       return (t*t)%mod;
      }
      else{
        int t=power(a,b/2,mod);
        return (t*t %mod) * a%mod;
      }
     }
 
     public static long power(long a,long b,long mod){
      if(b==0){
        return 1;
      }
      if(b%2==0){
        long t=(power(a,b/2,mod));
        return (1L*t*t)%mod;
      }
      else {
  
          long t=power(a,b/2,mod);
          return (1L*t*t)%mod *a%mod;
      }
     }
 
 
 
     /*
 
      This is the main funtion here
 
      */
  
    public static void main(String[] args) {  
       int n=sc.nextInt();
       if(n==1){
        System.out.println(n);
       }
       else{
        if(n<4){
          System.out.println("NO SOLUTION");
        }
        else if(n==4){
          System.out.println("3 1 4 2 ");
        }
        else{
          int rev=n/2-1;
          int st=1;
          boolean tog=true;
           for(long i=1;i<=n;i++){
             if(tog){
              out.print(st+ " ");
              st++;
             }
             else{
              out.print((n-rev)+ " ");
              rev--;
             }
             tog=!tog;
          }
          out.flush();
        }
       }
          
        }
       
      }
    
    
// it's an adhoc problem in which if we look carefully we can observe the with n <4 it is not possible to print the number 
// in following the required pattern and with 4 i have just printed it 
// for n>4 i have take the one digit from start and one from the end placing them next to each other 
// however this might not the best way to implement it 
