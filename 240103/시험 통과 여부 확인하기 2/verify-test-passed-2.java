import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int person = 0;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            int [] arr = new int [4];
            
            for(int j=0; j<4; j++) {
                arr[j] = sc.nextInt();
                sum+= arr[i];
            }
            int avg = sum/4;
            if(avg>=60) {
                System.out.println("pass");
                person++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.print(person);        
    }
}