import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int FirstAngel = 0;
        int SecondAngel = 0;
        int ThirdAngel = 0;
        int FourAngel = 0;

        for (int i = 0; i < n; i++){
            System.out.println("X: ");
            int x = scan.nextInt();
            System.out.println("Y: ");
            int y = scan.nextInt();
            if ((x >= 0 && y > 0) || (x > 0 && y >= 0))
                FirstAngel++;
            if ((x <= 0 && y > 0) || (x < 0 && y >= 0))
                SecondAngel++;
            if ((x <= 0 && y < 0) || (x < 0 && y <= 0))
                ThirdAngel++;
            if ((x >= 0 && y < 0) || (x > 0 && y <= 0))
                FourAngel++;
            }

        System.out.println("First angel: " + FirstAngel);
        System.out.println("Second angel: " + SecondAngel);
        System.out.println("Third angel: " + ThirdAngel);
        System.out.println("Four angel: " + FourAngel);
    }
}
