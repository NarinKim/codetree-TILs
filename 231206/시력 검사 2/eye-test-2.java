import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        a = sc.nextDouble();

        if(a >= 1.0) {
            System.out.println("High");
        } else if(a >= 0.5) {
            System.out.println("middle");
        } else {
            System.out.println("low");
        }
    }
}