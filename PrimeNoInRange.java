import java.util.Scanner;

public class PrimeNoInRange {

    public static void rangePrime(int x){

        for(int i=1; i<=x; i++){
            for(int j=2; j<=i; j++){
                if(i%j!=0){
                    System.out.print(i + " ");
            }
        }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        rangePrime(x);
        
    }
}
