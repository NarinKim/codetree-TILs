import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double ft = 30.48;
        double d= a * ft;
        System.out.printf("%.1f", d);
    }
}