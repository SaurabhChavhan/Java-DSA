import java.util.*;
public class HallowRectangular {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hgt = 20;
        int brd = 25;

        for(int i = 1; i<=hgt; i++){
            for(int j = 1; j<=brd; j++){
                if(i==1 || j==1 || i==hgt || j==brd){
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        

    }
    
}
