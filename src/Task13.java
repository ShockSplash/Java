import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;

        int [] arr = new int [n];
        for (int i = 0; i < n; i++){
            System.out.println("Вводите n чисел");
            arr[i] = scan.nextInt();
            for (int j = 0; j < n; j++){
                if (((arr[j] == arr[i] + 1) || (arr[j] == arr[i] -1)) && (arr[j] != 0)){
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("false");

    }
}
