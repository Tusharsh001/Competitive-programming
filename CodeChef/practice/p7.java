import java.util.*;
import java.lang.*;
import java.io.*;

class p7
{
    public static class pair<F extends Comparable<F>, S> implements Comparable<pair<F, S>>{
   private  F f;
   private  S s;

   public pair(F f, S s){
        this.f=f;
        this.s=s;
   }
   
   public F getf(){
    return f;
   }
   public S gets(){
    return s;
   }
   public static <F extends Comparable<F>, S> pair<F, S> of(F f, S s) {
    return new pair<>(f, s);
}

   @Override
   public int compareTo(p7.pair<F, S> o) {
    // TODO Auto-generated method stub
    return this.f.compareTo(o.f);
   }
   @Override
   public String toString() {
       return "(" + f + ", " + s+ ")";
   }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    List <pair<Integer,Integer>> zTOn =new ArrayList<>();
		    List <pair<Integer,Integer>> nTO2n=new ArrayList<>();
		    int n=sc.nextInt();
		    for(int i=0;i<n;i++){
		        int num=sc.nextInt();
		        zTOn.add(pair.of(num,i));
		    }
		    for(int i=n;i<(2*n);i++){
		        int num=sc.nextInt();
		        nTO2n.add(pair.of(num,i));
		    }
		    Collections.sort(zTOn);
		    Collections.sort(nTO2n);
		    long ans=0;
		    int zi=n-1;
		    int ni=0;
		    while((zi>-1) && (zTOn.get(zi).getf()>=nTO2n.get(ni).getf())){
		       ans+= nTO2n.get(ni).gets()-zTOn.get(zi).gets();
		       ni++;
		       zi--;
		    }
		    System.out.println(ans);
		}
		

	}
}
// ----------------------------------------pair class >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//  In this question i used a costum class which i creted to maintain the pair of value along with it's index 
// i have added the sorting function in it and implemented using arrayList to provide dynamic size to it 
//----------->>>>> approach .....>>>>>>-------------------------------------------------------------------------------------
//The approach that is used brute force i jsut compared the max in the first half to min value in the second half 
// for this i firt secparated the first half and then second half and then sorted them 
// and keep on swaping till the min value of the second half is greater then the max value in the first half
// and keep on calculating the number of operations required to move value form one index to another simply by 
// finding the differece between the original(before sorting ) indexes
// we repaeat this operation till we get the value that is in which the value of the max in first half is less then the
// value of the min in  second half 
// and at last retun the calculated operation 
