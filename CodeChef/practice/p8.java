import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // FastReader class for efficient input
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

	public static void main (String[] args) throws java.lang.Exception
	{
	 PrintWriter out=new PrintWriter(System.out);
		int t=sc.nextInt();
		while(t-->0){
		    long D=sc.nextLong();
		    long d=sc.nextLong();
		    long p=sc.nextLong();
		    long q=sc.nextLong();
		    long rate=D/d;
		    long ans=0;
		  
		
		  long sub=(long)rate*(rate-1)/2;
		  ans=(long)rate*p*d;
		   ans+=(long)sub*q*d;
		   
		    long left=D%d;
		    if(left!=0)  ans+=(p+(rate*q))*left;
		   
		   out.println(ans);
		   out.flush();
		   
		}

	}
}
// this is a math problem in this you just have to observe the operation and form a formula 
// on the above i have just used the fast input and output 
