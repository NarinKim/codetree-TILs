import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 키
        int sqaure =n*n;

        if(n < 5) {
            System.out.println(sqaure);
            System.out.print("tiny");
        } else {
            System.out.println(sqaure);
        }
    }
}