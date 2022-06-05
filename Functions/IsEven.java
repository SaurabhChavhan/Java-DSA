import java.util.*;
public class IsEven {
    public static void isPrime(int a){
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        isPrime(num);
    }
    
}
