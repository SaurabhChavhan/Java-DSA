import java.util.*;
public class GreatestOfTwoNum {
    public static void isGreat(int a, int b){
        if(a>b){
            System.out.println(a+" is Greater");
        }
        else{
            System.out.println(b+" is Greater");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        isGreat(a, b);
    }
    
}
