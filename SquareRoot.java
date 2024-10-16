public class SquareRoot {
    public int mySqrt(long x) {
        long l = 1;
        long r = x + 1;

        while (l < r) {
            final long m = (l + r) / 2;
            if (m > x / m)
                r = m;
            
            else
            
                l = m + 1;
        }

        return (int) l - 1;
    }

    
    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();
        
        long num1 = 4L;
        long num2 = 8L;
        long num3 = 16L;
        long num4 = 2147395600L;  

        System.out.println("Square root of " + num1 + " is: " + squareRoot.mySqrt(num1));
        System.out.println("Square root of " + num2 + " is: " + squareRoot.mySqrt(num2));
        System.out.println("Square root of " + num3 + " is: " + squareRoot.mySqrt(num3));
        System.out.println("Square root of " + num4 + " is: " + squareRoot.mySqrt(num4));
    }
}
