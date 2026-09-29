import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char c = scanner.next().charAt(0);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        System.out.printf("%c%n", c);
        System.out.printf("%.2f%n", a);
        System.out.printf("%.2f%n", b);        
    }
}
