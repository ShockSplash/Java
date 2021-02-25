import java.util.Scanner;

public class ThirdB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double e = scan.nextDouble();
        double s = 1;
        int z = -1;
        double s1 = 0;
        int i = 3;
        while(Math.abs(s1-s) >= e){
            s1 = s;
            s = s +(1.0/i)*z;
            z*= -1;
            i+=2;
        }
        System.out.println(s);
    }
}
