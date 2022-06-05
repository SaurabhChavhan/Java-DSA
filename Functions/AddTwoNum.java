import java.util.*;
public class AddTwoNum{
    public static int printSum(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        int sum = printSum(a, b);
        System.out.println("The Sum of Two number is: "+sum);     


    }
}