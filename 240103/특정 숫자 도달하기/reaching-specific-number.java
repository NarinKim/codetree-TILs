import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        int sum, cnt =0;
        double avg = 0;

        for(int i=0; i<=arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<=arr.length; i++){
            if(arr[i] >= 250) break;
            sum += arr[i];
            cnt++;
        }
        avg = (double)sum/cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}