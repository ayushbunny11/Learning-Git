public class HalfArray {

    public int[] funcsort(int[] inputList, int num){
        int size = inputList.length;
        int answer[] = new int[size];

        for(int i=0; i<num; i++){
            if(inputList[i]>inputList[i+1]){
                int temp = inputList[i];
                inputList[i] = inputList[i+1];
                inputList[i+1] = temp;
            }
            answer[i] = inputList[i];
        }
        for(int i=num+1; i<size-1; i++){
            if(inputList[i]<inputList[i+1]){
                int temp = inputList[i];
                inputList[i] = inputList[i+1];
                inputList[i+1] = temp;
            }
            answer[i] = inputList[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arr[10] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(funcsort(arr, 5));
        
    }
}
