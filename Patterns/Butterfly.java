public class Butterfly {
    public static void main(String[] args){
        int num = 7;

        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            int space = 2*(num-i);
            for(int j = 1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = num; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            int space = 2*(num-i);
            for(int j = 1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
    }
    
}
}
