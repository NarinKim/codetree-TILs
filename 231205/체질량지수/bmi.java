import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 키
        int n2 = sc.nextInt(); //몸무게

        double bmi = n2/((n*0.01)*(n*0.01));

        if(bmi >= 25) {
            System.out.println((int)bmi);
            System.out.print("Obesity");
        } else {
            System.out.print((int)bmi);
        }
    }
}