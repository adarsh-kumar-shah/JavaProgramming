class NumberComplement {
    public int findComplement(int num) {
        for (long i = 1; i <= num; i <<= 1)
            num ^= i;
        return num;
    }

    public static void main(String[] args) {
        NumberComplement solution = new NumberComplement();
        int num = 5; 
        int result = solution.findComplement(num);
        System.out.println("The complement of " + num + " is: " + result);
    }
}
