public class FirstTaskB {
    public static void main(String[] args) {
        double x = -5;
        double y;
        do {
        if (x < -2.5){
            y = 0.5 * x * x * x * x;
            System.out.println(y);
            x+= 0.5;
        }else if(x <= 2.5){
            y = Math.sqrt(2 * x -1);
                System.out.println(y);
                x+= 0.5;
            }else{
            y = ((Math.sin(Math.PI*Math.abs(x))));
            System.out.println(y);
            x+= 0.5;
            }
        }while (x <= 5);
    }
}
