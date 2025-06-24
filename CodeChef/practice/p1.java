import java.util.*;
class Code
{
	public static void main (String[] args) 
	{
       Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0){
             int n=sc.nextInt();
             int m=sc.nextInt();
             int max=0;
             int ind=-1;
             int[][]a=new int[n][m];
             for(int i=0;i<n;i++){
                int count=0;
                  for(int j=0;j<m;j++){
                      a[i][j]=sc.nextInt();
                      if(a[i][j]==1){
                          count++;
                      }
                  }
                  if(count>max){
                      max=count;
                      ind=i;
                  }
             }
             System.out.println(ind);
         }
         
	}
}
// it is brute force solution with time complexity:-O(n*m)
// this is very simple question  in this we just need to update the our index i mean the ans only when it is greater then our
// previous out and in the last return the answer 
