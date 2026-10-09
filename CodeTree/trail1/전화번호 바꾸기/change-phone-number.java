import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        String[] parts = input.split("-");
        
        String prefix = parts[0];
        String middle = parts[1];
        String last = parts[2];
        
        System.out.println(prefix + "-" + last + "-" + middle);
        
        sc.close();
    }
}
