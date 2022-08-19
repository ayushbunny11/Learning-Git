import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // int mid = s.length()/2;
        for(int i=0,j=s.length()-1;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                flag=false;
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();

        // String s="madam";
        // int l=s.length();
        // if(s.substring(0,(l/2)+1)==s.substring((l/2),l)){
        //     System.out.println("Yes");
        }
    }
