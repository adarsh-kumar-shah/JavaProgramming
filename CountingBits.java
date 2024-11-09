public class CountingBits {
    public int[] countBits(int n) {
      int[] ans = new int[n + 1];
  
      for (int i = 1; i <= n; ++i)
        ans[i] = ans[i / 2] + (i % 2);
  
      return ans;
    }
  
    public static void main(String[] args) {
      CountingBits countingBits = new CountingBits();
      int n = 5; 
      int[] result = countingBits.countBits(n);
  
      System.out.print("Number of 1s in binary representation from 0 to " + n + ": ");
      for (int i : result) {
        System.out.print(i + " ");
      }
    }
  }
  