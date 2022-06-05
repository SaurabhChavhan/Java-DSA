import java.util.*;
public class MulTwoNum {
    public static int printMul(int num1, int num2){
        int mul = num1*num2;
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1: ");
        int a = sc.nextInt();
        System.out.println("Number 2: ");
        int b = sc.nextInt();
        int mul = printMul(a, b);
        System.out.println("Answer: "+ mul);


    }
    
}
