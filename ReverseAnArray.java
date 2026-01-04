public class ReverseAnArray {

    public static void reverseArray(int num[]){
        int first = 0;
        int last = num.length - 1;

        while(first<last){
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args){
        int numbers[] = {2,5,3,7,9,13,53};
        
        System.out.println("Before reversing the numbers: ");

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        reverseArray(numbers);

        System.out.println("After reversing the numbers: ");

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    
}
