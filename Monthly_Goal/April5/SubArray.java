import java.util.Scanner;

/*
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of n integers, find and print its number of negative SUBARRAYS on a new line.

*/

public class SubArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
                for(int j=i;j<n;j++){
                    sum+=arr[j];
                    if(sum<0){
                        count++;
                    }
                }
        }
        System.out.println(count);
        sc.close();
    }
}
