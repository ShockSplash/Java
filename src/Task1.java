public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        while(i <= 100){
            System.out.println("Temp C: " + i);
            double f = 1.8 * i +32;
            System.out.println("Temp f: " + f);
            i+=10;
        }
    }
}
