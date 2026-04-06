import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println(a);
        }
        scanner.close();
    }
}
