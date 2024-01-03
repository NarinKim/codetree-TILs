import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] arr = new double[n];
        double sum = 0.0;
        double avg =0.0;
        int cnt = 0;

        for(int i=0; i <arr.length; i++){
            arr[i]=sc.nextDouble();
            sum += arr[i];
            cnt++;            
        }

        avg = sum/cnt;
        System.out.printf("%.1f\n", avg);
        if(avg>=4.0) {
            System.out.print("Perfect");
        } else if(avg >= 3.0) {
            System.out.print("Good");
        } else {
            System.out.print("Poor");
        }


    }
}