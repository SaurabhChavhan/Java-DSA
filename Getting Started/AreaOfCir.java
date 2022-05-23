import java.util.*;
public class AreaOfCir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int rad = sc.nextInt();
        double pie = 3.14;
        double area = pie*rad*rad;
        System.out.println(area);
    }
    
}
