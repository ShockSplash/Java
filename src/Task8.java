import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if ((a > 0 && b > 0) || (a < 0 && b > 0 ) || (a > 0 && b < 0)){
            a = Math.abs(a);
            b = Math.abs(b);
            while (a != b){
                if (a > b){
                    a -= b;
                }else if (b > a){
                    b -= a;
                }
            }
            System.out.println("Нод: " + a);
        }else{
            while (a != b){
                if (a > b){
                    b -= a;
                }else if (b > a){
                    a -= b;
                }
            }
            System.out.println("Нод: " + Math.abs(a));
        }
    }
}
