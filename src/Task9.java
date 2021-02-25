import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.print(i*j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
