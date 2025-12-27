import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length; i++) { // Fix: Use < instead of <=
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < a.length; i++) { // Fix: Use < instead of <=
            System.out.println(a[i] + " ");
        }
    }
}