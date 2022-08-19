import java.util.Scanner;


public class Lexicographic_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A= sc.next();
        String B= sc.next();
        sc.close();

        int lenOfA = A.length();
        int lenOfB = B.length();
        System.out.println(lenOfA+lenOfB);

        if(A.compareTo(B)>0)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(A.compareTo(B));

        String UpA=A.substring(0, 1).toUpperCase();
        String UpB=B.substring(0, 1).toUpperCase();
        System.out.println(UpA+A.substring(1, lenOfA)+" "+UpB+B.substring(1, lenOfB));

    }
}
