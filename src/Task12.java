import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int max = scan.nextInt();
        int count = 1;

        for (int i = 0; i < n - 1; i++){
            int x = scan.nextInt();
            if (x > max){
                max = x;
                count = 1;
            }else if (x == max){
                count++;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Count: " + count);
    }
}
