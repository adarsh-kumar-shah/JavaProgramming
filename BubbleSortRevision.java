public class BubbleSortRevision {

    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<arr.length; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            System.out.println();
        }
        System.out.println("After Sorting");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        System.out.println("Before Sorting");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        bubbleSort(arr);
    }
}
