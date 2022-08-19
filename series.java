import java.util.Scanner;

// We use the integers a, b, and n to create the following series:

// (a+(2^0.b)), (a+ 2^0.b + 2^1.b), (a+ 2^0.b + 2^1.b +2^2.b)..........n

// You are given q queries in the form of a, b, and n. 
// For each query, print the series corresponding to the given , , and  values 
// as a single line of n space-separated integers.

public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of queries you want to print for: ");
        int que = sc.nextInt();
        for(int i=1; i<=que;i++){
            System.out.println(("Print for query: "+i));
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            System.out.println("Enter n: ");
            int n = sc.nextInt();
            int c=a;
            for(int j=0;j<n;j++){
                c += Math.pow(2, j)*b;
                System.out.printf("%s ",c);
            }
            System.out.println();
        }
       
    }
}
//     public static void funcSeries(int a, int b, int n){
//         double c= a;
//         for(int j=0;j<n;j++){
//             for(int i=0; i<=n-1;i++){
//                 c=(c+(Math.pow(2,i)*b));
//                 System.out.print(c+" ");
//             }
//         }
//         System.out.println("\n");
//     }
// }
