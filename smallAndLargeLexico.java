import java.util.Scanner;

//Smallest and largest substring lexicographicallt ofg a given string

public class smallAndLargeLexico {

    public static String lexicoString(String s, int k){

        String smallest=s.substring(0,k);
        String largest=s.substring(0,k);
        for(int i=1; i<s.length()-k+1;i++){
            
            String subStr = s.substring(i,i+k);
            if(subStr.compareTo(smallest)<0){
                smallest=subStr;
            }
            if(subStr.compareTo(largest)>0){
                largest=subStr;
            }
        }
        return smallest+"\n"+largest;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Eneter the string: ");
        String s= sc.next();
        System.out.println("Enter the number of characters you want to separate it with: ");
        int k = sc.nextInt();
        System.out.println(lexicoString(s, k));
        sc.close();
    }
}
