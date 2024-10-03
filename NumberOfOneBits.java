public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int ans = 0;

        for (int i = 0; i < 32; ++i) {
            if (((n >> i) & 1) == 1) {
                ++ans;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        NumberOfOneBits solution = new NumberOfOneBits();

        int number = 11; 
        System.out.println("Number of 1 bits in " + number + " is: " + solution.hammingWeight(number));

        number = 128;
        System.out.println("Number of 1 bits in " + number + " is: " + solution.hammingWeight(number));

        number = -3;
        System.out.println("Number of 1 bits in " + number + " is: " + solution.hammingWeight(number));
    }
}
