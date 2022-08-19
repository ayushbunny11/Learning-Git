//package Monthly_Goal.April5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_DuplicateWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String pattern = "\\b(\\w+)(\\s+\\1\\b)*";
        Pattern p= Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);

        // \b : Start of a word boundary

        // \w+ : Any number of word characters

        // (\s+\1\b)* : Any number of space followed by word which matches the previous word and ends the word boundary.
        //  Whole thing wrapped in * helps to find more than one repetitions.

        while(n-- >0)
        {
            String s=sc.nextLine();
            Matcher m = p.matcher(s);
            while(m.find()){
                s = s.replaceAll(m.group(), m.group(1));
            }
            System.out.println(s);
        }
        sc.close();
    }
}
