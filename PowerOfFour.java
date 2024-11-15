public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        return n > 0 && Integer.bitCount(n) == 1 && (n - 1) % 3 == 0;
    }

    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();

        int test1 = 16;
        int test2 = 5;
        int test3 = 64;

        System.out.println(test1 + " is power of four: " + powerOfFour.isPowerOfFour(test1));
        System.out.println(test2 + " is power of four: " + powerOfFour.isPowerOfFour(test2));
        System.out.println(test3 + " is power of four: " + powerOfFour.isPowerOfFour(test3));
    }
}
