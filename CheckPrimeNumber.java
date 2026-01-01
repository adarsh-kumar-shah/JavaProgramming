import java.util.Scanner;

public class CheckPrimeNumber {

    public static boolean isPrime(int x){
        boolean isPrime = true;
        for(int i = 2; i<x; i++){
            if(x%i==0){
                isPrime = false;
                
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(isPrime(x));


    }
}
