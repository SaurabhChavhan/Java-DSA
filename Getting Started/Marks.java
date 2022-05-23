import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Varible 0 or 1:");
        int var = sc.nextInt();
         if(var==1){
             System.out.println("Enter Marks:");

             int marks = sc.nextInt();
             if(marks>=90){
                 System.out.println("This is Good");
             }
             else if(marks>=60){
                 System.out.println("This is also Good");
             }
             else{
                 System.out.println("This is Good as well");
             }
             
         }
         else if(var==0){
             System.out.println("Stop");
         }
         }
    }
    

