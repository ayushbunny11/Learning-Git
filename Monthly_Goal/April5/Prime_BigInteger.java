import java.math.BigInteger;
import java.util.Scanner;

public class Prime_BigInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        BigInteger n = sc.nextBigInteger();
        if(n.isProbablePrime(100))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        sc.close();
    }
}
