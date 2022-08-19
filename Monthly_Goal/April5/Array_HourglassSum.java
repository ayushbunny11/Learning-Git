import java.util.Scanner;

/*
You are given a 6*6 2D array.
       a b c
         d         
       e f g

An hourglass and sum is a+b+c+d+e+f+g.

The sum of an hourglass is the sum of all the numbers within it.
In this problem you have to print the largest sum among all the hourglasses in the array.
*/
public class Array_HourglassSum {

    static int arr[][];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        arr = new int[6][6];
        for(int i=0; i<6;i++){
            for(int j=0; j<6;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int r=1;r<5;r++)
        {
            for(int c=1;c<5;c++){
                curr=getHour(r,c);
                if(curr>max)
                    max=curr;
            }
        }
        System.out.println(max);
        sc.close();
    }

public static int getHour(int row, int col){
    int sum = 0;   

    sum+=arr[row-1][col-1];
    sum+=arr[row-1][col];
    sum+=arr[row-1][col+1];

    sum+=arr[row][col];
    
    sum+=arr[row+1][col-1];
    sum+=arr[row+1][col];
    sum+=arr[row+1][col+1];

    return sum;
    }
}
