import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        
        System.out.println("================================");
        scanner.close();

    }
}
