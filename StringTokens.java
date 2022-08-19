import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.isEmpty()){
            System.out.println("output: "+0);
        }
        else{
            String arr[]=s.trim().split("[ .,?!'_@]+");
            int count=0;
            for(String e: arr){
                count++;
            }
            System.out.println(count);
            for(String e: arr){
            System.out.println(e);
            }
        }
        sc.close();
    }
}
