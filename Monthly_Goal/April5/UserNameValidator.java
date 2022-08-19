//package Monthly_Goal.April5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidator {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]\\w{7,29}$";
        Pattern p = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        while(n-- >0)
        {
            String userName = sc.next();
            Matcher m = p.matcher(userName);
            if(m.matches()==true){
                System.out.println("Valid");
            }
            else
                System.out.println("Invalid");
        }
        sc.close();
    }
}
