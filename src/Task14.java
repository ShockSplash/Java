import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double f = 0;// f = sin(x) from 0 to PI
        System.out.println("Введите количество частей");
        int n = scan.nextInt();
        double a = 0;
        double b = 0 + Math.PI/n;

        for (int i = 0; i < n; i++){
            f += (Math.sin((a + b)/2))*(b- a);
            a = b;
            b+=Math.PI/n;
        }
        System.out.println(f);


    }
}
