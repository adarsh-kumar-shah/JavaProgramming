public class UglyNumber {
    public boolean isUgly(int n) {
      if (n == 0)
        return false;
  
      for (final int prime : new int[] {2, 3, 5})
        while (n % prime == 0)
          n /= prime;
  
      return n == 1;
    }
  
    
    public static void main(String[] args) {
      UglyNumber uglyNumber = new UglyNumber();
      
      int testNumber = 6; 
      if (uglyNumber.isUgly(testNumber)) {
        System.out.println(testNumber + " is an ugly number.");
      } else {
        System.out.println(testNumber + " is not an ugly number.");
      }
    }
  }
  