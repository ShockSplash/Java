import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = n;
        int count = 1;
        while (n != 0){
            n = scan.nextInt();
            if (n > max){
                max = n;
                count = 1;
            }else if (n == max){
                count++;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Count: " + count);
    }
}
