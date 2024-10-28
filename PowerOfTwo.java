class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
      return n > 0 && Integer.bitCount(n) == 1;
    }
  
    public static void main(String[] args) {
      PowerOfTwo powerOfTwo = new PowerOfTwo();
      
      int[] testNumbers = {1, 2, 3, 4, 5, 16, 18, 32, 64, 100};
      
      for (int num : testNumbers) {
        System.out.println("Is " + num + " a power of two? " + powerOfTwo.isPowerOfTwo(num));
      }
    }
  }
  