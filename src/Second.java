import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        double min = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 6; i++){
            double x = scan.nextDouble();
            if (i == 0){
                min = x;
            }
            if (x<0){
                count++;
            }else{
                sum+= x;
            }
            if (x < min){
                min = x;
            }

        }
        System.out.println("count: " + count);
        System.out.println("sum: " + sum);
        System.out.println("Minimum: " + min);
    }
}
