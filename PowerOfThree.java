public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
      return n > 0 && Math.pow(3, 19) % n == 0;
    }
  
    public static void main(String[] args) {
      PowerOfThree powerOfThree = new PowerOfThree();
      int[] testNumbers = {1, 3, 9, 27, 28, 0, -3};
  
      for (int num : testNumbers) {
        System.out.println("Is " + num + " a power of three? " + powerOfThree.isPowerOfThree(num));
      }
    }
  }
  