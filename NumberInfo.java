import java.util.Scanner;

//Given an input integer, you must determine which primitive data types are capable of properly storing that input.

// -150 can be fitted in:
// * short
// * int
// * long
// 150000 can be fitted in:
// * int
// * long
// 1500000000 can be fitted in:
// * int
// * long
// 213333333333333333333333333333333333 can't be fitted anywhere.
// -100000000000000 can be fitted in:
// * long

public class NumberInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to check: ");
        int queries = sc.nextInt();
        for (int i = 1; i <= queries; i++) {

            try {
                long num = sc.nextLong();
                System.out.println(num + " Can be fitted to: \n");
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE)
                    System.out.println("* Byte");
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
                    System.out.println("* Short");
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
                    System.out.println("* Integer");
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE)
                    System.out.println("* Long");
            } catch (Exception e) {
                System.out.println(sc.next() + " Cant be fitted to any number!!");
            }
        }
        sc.close();
    }
}
