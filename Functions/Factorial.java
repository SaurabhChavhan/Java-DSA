import java.util.*;
public class Factorial {
    public static void printFact(int a){
        int fact = 1;
        for(int i = a; i>=1; i--){
            fact=fact*i;
        }
        System.out.println("Answer: "+fact);

        return;
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number: ");
            int num = sc.nextInt();
            printFact(num);


            }

    
}

