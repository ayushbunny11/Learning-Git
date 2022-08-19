import java.util.Scanner;
//import java.util.regex.*;
public class Java_Regex_IP {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        //sc.close();
        while(sc.hasNext()){

            String IP = sc.next(); 
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        sc.close();
    }
}
class MyRegex{
    String num = "([01]?\\d{1,2}|2[0,4]\\d|25[0-5])";
    String pattern = num+"."+num+"."+num+"."+num;
}
