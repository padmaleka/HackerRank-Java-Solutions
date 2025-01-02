import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            try {
                long n = scanner.nextLong();
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        
        scanner.close();
    }
}
