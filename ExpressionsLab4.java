 public class ExpressionsLab4 {
    public static void main(String[] args){

        int m1 =969;
        int f1 = 834;
        System.out.println(m1 / 10 + m1 % 10);
        System.out.println(m1 % 2 + f1 % 2);
        System.out.println((m1 + f1) / 2);
        System.out.println((m1 + f1) / 2.0);
        System.out.println( (int) (0.5 * (m1 + f1)));
        System.out.println((int) Math.round(0.5 * (m1 + f1)));
    }
}
