class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;

        while (l < r) {
            final long m = (l + r) / 2;
            if (m >= num / m)
                r = m;
            else
                l = m + 1;
        }

        return l * l == num;
    }

    public static void main(String[] args) {
        ValidPerfectSquare vps = new ValidPerfectSquare();

        int test1 = 16;
        int test2 = 14;
        int test3 = 1;

        System.out.println("Is " + test1 + " a perfect square? " + vps.isPerfectSquare(test1));
        System.out.println("Is " + test2 + " a perfect square? " + vps.isPerfectSquare(test2));
        System.out.println("Is " + test3 + " a perfect square? " + vps.isPerfectSquare(test3));
    }
}
