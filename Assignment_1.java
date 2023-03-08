import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter the third integer: ");
        int c = sc.nextInt();
        System.out.print("Enter the fourth integer: ");
        int d = sc.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}