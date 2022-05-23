import java.util.*;
public class AreaOfPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int len = sc.nextInt();
        System.out.println("Enter Breadth");
        int brd = sc.nextInt();
        int Ans = 2*(len+brd); 
        System.out.println(Ans);
    }
    
}
