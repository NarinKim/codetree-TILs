import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            int p = 0;
        for(int i = 0; i < n; i++) {
            int [] arr = new int [4];
            int sum = 0;

            for(int j =0 ;  j<4; j++) {
                arr[j] = sc.nextInt();    
            }

            for(int j =0 ;  j<4; j++) {
                sum+=arr[j];
            }

            double avg = (double)sum/4;
            
            if(avg>=60) {
                p++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
        System.out.print(p);    
    }
}