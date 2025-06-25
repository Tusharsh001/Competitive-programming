import java.util.*;
import java.lang.*;
import java.io.*;

class p3
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
		// your code goes here
	
		int t=sc.nextInt();
		while(t-->0){
		    int a1=sc.nextInt();
		    int a2=sc.nextInt();
		    int c1=sc.nextInt();
		    int c2=sc.nextInt();
		    int k=sc.nextInt();
		    int d1=Math.abs(a1-c1);
		    int d2=Math.abs(a2-c2);
		    int total=d1+d2;
		    if(k<total){
		        System.out.println("NO");
		    }
		    else if(k==total){
		        System.out.println("YES");
		    }
		    else{
		        if((k-total)%2==0){
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		}

	}
}
// this is very simple problem but i comminet one mistake that is not using the buffer input and output you should 
// definedtly use it 
// my initial idea was to calculate the total distance between the startin point and the targeted point then we have 
// in order to do so i aba(a1-->starting point on x axis - c1-->ending point on x axis )
// same for the y cordinate also then addind the distant we get the minimum number of steps that we need to take to reah the 
// target and if this distance is greater then the given we can't reach out target and if equal we can definetly 
// then if there are the steps exceed the minimum limit then we check if the extra steps are even or not because 
// we can always move back and forth to cancel out extra steps and reach the target in exactly k steps 
