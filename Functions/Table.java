import java.util.*;
public class Table {
    public static void printTable(int a){
        for(int i = 1; i<=10; i++){
            System.out.println(a*i);
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int num = sc.nextInt();
        printTable(num);
    }
    
}
