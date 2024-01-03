import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];

        int sum = 0;
        double avg = 0.0;
        int cnt = 0;

        for(int i =0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if(arr[i]==0) break;
            cnt++;
        }
        
        avg = sum/cnt;

        System.out.printf("%d %.1f", sum, avg);



    }
}