public class Main {
    public static void main(String[] args) {
        double ftToCm = 30.48;
        double miToCm = 160934;
        
        double ftVal = 9.2;
        double miVal = 1.3;
        
        System.out.printf("9.2ft = %.1fcm\n", ftVal * ftToCm);
        System.out.printf("1.3mi = %.1fcm\n", miVal * miToCm);
    }
}