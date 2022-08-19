import java.util.Scanner;

public class HalfArray2 {
    public static int[] funcsort(int[] inputList, int num){
        int size = inputList.length;
        int answer[] = new int[size];
        System.out.println("\nSize is: "+size);

        for(int i=0; i<num; i++){
            for(int j=1; j<i; j++){
                if(inputList[i]<inputList[j]){
                    int temp = inputList[i];
                    inputList[i] = inputList[j];
                    inputList[j] = temp;
                }
            }
            answer[i] = inputList[i];
        }
        for(int i=num; i<size-1; i++){
            for(int j=num+1; j<i; j++){
                if(inputList[i]>inputList[j]){
                    int temp = inputList[i];
                    inputList[i] = inputList[j];
                    inputList[j] = temp;
                }
            }
            
            answer[i] = inputList[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RUNNING SUCCESFULLY!!!! ");
        System.out.println("Enter the split size: ");
        int num = sc.nextInt();
        System.out.println("Enter the array index size: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Sorting: \n");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }

        int result[] = new int[len];
        result = funcsort(arr, num);
        System.out.println("\nAfter Required sorting: ");
        for(int i=0; i<result.length-1; i++){
            System.out.print(result[i]+" ");
        }
    }
}
