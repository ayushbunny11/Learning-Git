/*
-------------------------------------------------------------QUESTION-----------------------------------------------------------
If the soldiers carry even number of weapons, they are "lucky".
If the soldiers carry odd number of weapons, they are "unlucky".

If the lucky number of soldiers is greater than unlucky, print "READY FOR BATTLE"
Else print "NOT READY"

Input: N - number of soldiers
       Ai - number of weapons the i'th soldier is holding

 Output: READY FOR BATTLE or NOT READY 

*/
import java.util.Scanner;


public class ReadyForBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of soldiers: ");
        int N = sc.nextInt();
        int c1=0;
        int c2=0;
        for(int i=1; i<=N; i++){
            int Ai= sc.nextInt();
            if(Ai%2==0){
                c1=c1+1;
            }
            else{
                c2=c2+1;
            }
        }
        if(c1>c2){
            System.out.println("READY FOR BATTLE");
        }
        else{
            System.out.println("NOT READY");
        }
        sc.close();
    }
}
