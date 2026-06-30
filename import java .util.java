import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.next();   
        sc.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Integer: " + n);
    }   
}