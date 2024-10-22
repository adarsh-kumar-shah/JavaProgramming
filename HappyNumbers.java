public class HappyNumbers {
    public boolean isHappy(int n) {
        int slow = squaredSum(n);
        int fast = squaredSum(squaredSum(n));

        while (slow != fast) {
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        }

        return slow == 1;
    }

    private int squaredSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumbers obj = new HappyNumbers();

        int n1 = 19; 
        int n2 = 2; 
        System.out.println("Is " + n1 + " a happy number? " + obj.isHappy(n1));
        System.out.println("Is " + n2 + " a happy number? " + obj.isHappy(n2));
    }
}
