// sum of even natural nymbers
// import java.util.*;
// public class SumEvenNum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number");
//         int num = sc.nextInt();
//         int sum = 0;
//         for(int i=2;i<=num;i=i+2){
//              sum = sum+i;
//             }
//             System.out.print(sum);
        
        
//     }
    
// }


// sum of odd numbers
import java.util.*;
public class SumEvenNum{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i=i+2){
            sum= sum+i;
        }
        System.out.println(sum);

    }
}

