import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        int sum=0;
        double avg = 0;
        int i;
        for(i=0; i<=arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 250) {
                sum+=arr[i];
            } else break;
        }
        avg = ((double)sum/i)*10/10;
        System.out.print(sum +" "+avg);
    }
}