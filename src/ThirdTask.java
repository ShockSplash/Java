import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double s = 0;
        for (int i = 1; i <= n; i++){
            s += 1/(2.0*i);
        }
        System.out.println(s);
    }
}
