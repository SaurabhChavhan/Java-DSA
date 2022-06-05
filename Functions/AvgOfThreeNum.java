import java.util.*;
public class AvgOfThreeNum {
    public static void printAvg(int a, int b, int c){
        System.out.println((a+b+c)/2);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        printAvg(a, b, c);

    }
    
}
