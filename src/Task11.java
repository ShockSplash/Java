import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double b = scan.nextDouble();
        double a = 1;
        double remember = 1;
        int count = 0;

        while (b > a){
            a = remember * remember + 1;
            remember = a;
            if (b > remember){
                System.out.println(remember);
                count++;
            }
        }
        System.out.println("count: " + count);
    }
}
