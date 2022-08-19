import java.util.Scanner;

public class Greater_AreaPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = length*breadth;
        int peri = 2*(length+breadth);

        if(area>peri){
            System.out.println("Area \n"+area);
        }
        else if(peri>area){
            System.out.println("Peri \n"+peri);
        }
        else{
            System.out.println("Equal \n"+peri);
        }
        sc.close();
    }
}
