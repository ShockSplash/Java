import java.util.Scanner;

public class Task15A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите епсилон");
        double e = scan.nextDouble();

        System.out.println("Введите х");
        double x = scan.nextDouble();

        double f = 1;
        double repeat = 10;
        int calc = 2;
        double factorial = 2;

        while (Math.abs(repeat - f) > e){
            repeat = f;
            if (calc == 2){
                f += -1 * (x * x)/2;
                x= x * x;
            }else{
                factorial *= calc * (calc - 1);
                if (calc % 4 == 0)
                    f = f + (x * x)/ factorial;
                else
                    f = f + -1 * (x * x) / factorial;
                x = x * x;
            }
            calc += 2;
        }
        double difference = Math.abs(Math.cos(x) - f);
        System.out.println("Difference: " + difference);
        System.out.println("Count: "+ calc/2);

    }
}
