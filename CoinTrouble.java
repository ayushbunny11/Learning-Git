//TCS CAMPUS QUESTIONS


import java.util.ArrayList;
import java.util.Scanner;

public class CoinTrouble {
    
    public static String CoinDis(ArrayList<Integer> lst, int len){
            int sum=0;
            for(int i=0; i<len; i++){
                sum= sum+lst.get(i);
            }
            if(sum%3==0){
                return "True";
            }
            else{
                return "False";
            }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i, n, len;
        System.out.println("Enter the length:\n");
        len = sc.nextInt();
        for(i=0; i<len; i++){
            n=sc.nextInt();
            lst.add(n);
        }
        System.out.println(CoinDis(lst, len));

    }
}
