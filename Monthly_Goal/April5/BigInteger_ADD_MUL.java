import java.math.BigInteger;
import java.util.Scanner;

/*
In this problem, you have to add and multiply huge numbers!
These numbers are so big that you can't contain them in any ordinary data types like a long integer.
Use the power of Java's BigInteger class and solve this problem.


*/


public class BigInteger_ADD_MUL {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BigInteger a=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();

        BigInteger add= a.add(b);
        BigInteger mul = a.multiply(b);

        System.out.println(add);
        System.out.println(mul);
        sc.close();
    }
}
