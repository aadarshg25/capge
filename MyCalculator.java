import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);2
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        if (b == "+") {
            System.out.println(a + c);
        } else if (b == "-") {
            System.out.println(a - c);
        } else if (b == "*") {
            System.out.println(a * c);
        } else if (b == "/") {
            System.out.println(a / c);
        } else {
            System.out.println("Enter a  Valid input");
        }
    }
}
