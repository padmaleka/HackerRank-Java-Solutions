import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args){
        int n,c;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (c=1; c<=10; c++)
        System.out.println(n+" x "+c+" = "+n*c);
    }
}
