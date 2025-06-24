import java.util.*;

public class Main {
    
    //Write sumOfOccurrences function here
    public static int sumOfOccurrences(String str1,String  str2){
        int sum=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str2.length();i++){
            if(set.contains(str2.charAt(i))){
                continue;
            }
            set.add(str2.charAt(i));
            int count=0;
            for(int j=0;j<str1.length();j++){
                if(str2.charAt(i)==str1.charAt(j)){
                    count++;
                }
            }
            sum+=count;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        scanner.nextLine(); 

        while (t-- > 0) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(sumOfOccurrences(str1, str2)); 
        }

        scanner.close();
    }
}
// it is brute force solution time complexity:-(n*m)
// in this i just first ensure that the string i am in the str2 is unique and just calculated the number of times that 
// character appear in the string str1 and adding that to sum 
