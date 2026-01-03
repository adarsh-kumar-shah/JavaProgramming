public class BinarySearch {
    public static void main(String[] args){
        int array[] = {2,4,6,8,10,12,14};
        int key = 12;
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(key==array[mid]){
                System.out.println(array[mid]);
            }
            else if(key>mid){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
    }
}
