import java.util.Scanner;

public class decToBin{
    public static void main(String[] args) {
        
        int index=0;
        int bin[]= new int[40];
        // Decimal To Binary coversion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in decimal format: \n");
        int dec = sc.nextInt();
        while(dec>0){
            bin[index++] = dec%2;
            dec = dec/2;
        }
        for(int i=index-1;i>=0;i--){
            System.out.print(bin[i]);
        }
        System.out.println();
        sc.close();
    }
}
