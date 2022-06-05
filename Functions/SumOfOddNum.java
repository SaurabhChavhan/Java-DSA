import java.util.*;
public class SumOfOddNum {

    public static void sumOfOddNum(int a){
        int sum = 0;
        for(int i =1; i<=a; i=i+1){            
            if(i%2==1){
                sum = sum + i;
                
            }            
        }
        System.out.println("Answer: "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int a = sc.nextInt();
        sumOfOddNum(a);

    }
    
}
