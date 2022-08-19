import java.util.Arrays;
import java.util.Scanner;

public class anagrams {

    public static boolean isAnagram(String s1, String s2){

        if(s1.length()!=s2.length())
            return false;
        else{
            char ArrayS1[]= s1.toLowerCase().toCharArray();
            char ArrayS2[]= s2.toLowerCase().toCharArray();

            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);

            boolean status = Arrays.equals(ArrayS1, ArrayS2);
            if(status)
                return true;
            else{
                return false;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        boolean res = isAnagram(a, b);
        System.out.println( (res) ? "Anagrams" : "Not Anagrams" );
    }
}
