//package Monthly_Goal.April5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TagContentExtractor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String regex ="<(.+)>([^>]+)</\\1>";
        Pattern p = Pattern.compile(regex);
        
        while(n-- != 0){
            String content = sc.nextLine();
            Matcher m = p.matcher(content);
            boolean match = false;
            while(m.find()){
                System.out.println(m.group(2));
                match = true;
            }
            if(!match)
                System.out.println("None");
        }
        sc.close();
    }   
}
