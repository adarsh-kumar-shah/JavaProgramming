import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i= 0; i<arr.length; i++){
            int last = arr.length -i -1;
            int max = maxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    static int maxIndex(int[] arr, int start, int last){
        int max = start;
        for(int i= 0; i<=last; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}