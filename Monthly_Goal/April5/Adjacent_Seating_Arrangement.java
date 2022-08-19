import java.util.Scanner;

/*

There are N rows and M coloumns forming a N*M table. In each grid only one can sit.
After shuffling each person, Each person must occupy exactly one table.
Each person should occup a table that is adjacent to the original table he was sitting, 
            i.e left OR right OR top OR buttom of the original table.

Print "Yes" if the shuffling is possible and "No" if the condtions are not satisfied.

*/


public class Adjacent_Seating_Arrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases-- > 0)
        {
            int N = sc.nextInt(); // ROWS
            int M = sc.nextInt(); // COLOUMNS

            if(M*N%2==0){
                System.out.println("YES");
            }

            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
