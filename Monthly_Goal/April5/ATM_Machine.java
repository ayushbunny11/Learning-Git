import java.util.Scanner;

public class ATM_Machine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("print the number of testcases: ");
        int testcases= sc.nextInt();
        while(testcases-- > 0){
            System.out.print("\nEnter the total units of money in the ATM machine: ");
            int K = sc.nextInt();
            System.out.print("\nEnter the total number of people in the queue: ");
            int N = sc.nextInt();
            for(int i=1; i<=N; i++){
                int Ai = sc.nextInt();
                if(K>=Ai){
                    K=K-Ai;
                    System.out.print("1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
