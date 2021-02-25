import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество углов");
        int n = scan.nextInt();
        double s = 0;
        for (int i = 0; i < n ; i++){
            System.out.println("Введите координаты x");
            double x = scan.nextDouble();
            System.out.println("Введите координаты у");
            double y =scan.nextDouble();
            s+= Math.abs(x-y);
        }
        System.out.println(s);
    }
}
