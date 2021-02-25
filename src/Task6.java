public class Task6 {
    public static void main(String[] args) {
        char black = '*';
        char white = 'o';
        int k = 1;
        for (int i = 1 ; i <= 8; i++){
            for (int j = 1; j <=8; j++){
                if (k % 2 == 0){
                    System.out.print(black);
                    System.out.print(" ");
                    k++;
                }else{
                    System.out.print(white);
                    System.out.print(" ");
                    k++;
                }
            }
            k = k % 2 +1;
            System.out.println("");
        }
    }
}
