import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int mCount = 0;
        int chetCount = 0;
        int res = 1;
        do {
            int n = scan.nextInt();
            System.out.println("Хотите продолжить? Для отмены введите  '0', для продолжения введите 1");
            res= scan.nextInt();
            mCount++;
            if (n % 2 == 0){
                chetCount++;
            }

        }while (res != 0);
        System.out.println("Main count:" + mCount);
        System.out.println("Chet Cont: " +chetCount);
    }
}
