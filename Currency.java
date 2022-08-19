import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double payment= sc.nextDouble();
        sc.close();

        Locale India = new Locale("en","IN");

        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat Ind = NumberFormat.getCurrencyInstance(India);
        NumberFormat China = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat France = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US "+US.format(payment));
        System.out.println("India "+Ind.format(payment));
        System.out.println("China "+China.format(payment));
        System.out.println("France "+France.format(payment));
    }
}
