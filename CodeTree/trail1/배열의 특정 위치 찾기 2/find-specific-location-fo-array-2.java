import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int oddSum = 0;
        int evenSum = 0;
        
        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            
            if (i % 2 != 0) {
                oddSum += num;//홀
            } else {
                evenSum += num;//짝
            }
        }
        
        System.out.println(Math.abs(oddSum - evenSum));
    }
}