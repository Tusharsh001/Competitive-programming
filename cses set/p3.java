import java.util.*;

/* 
 writer:- Non_newtonian
*/
 
public class p3{

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
  
 
     /*
 
      This is the main funtion here
 
      */
  
    public static void main(String[] args) {
        
        
          String s=sc.next();
          long count=1;
          long  ans=1;
          for(int i=1;i<s.length();i++){
            
           if(s.charAt(i-1)==s.charAt(i)){
            count++;
            ans=Math.max(ans,count);
           }
           else{
            ans=Math.max(ans,count);
            count=1;
           }
    
          }
          System.out.println(ans);
          
        }
       
      }
