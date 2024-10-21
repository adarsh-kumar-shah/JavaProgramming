public class ReverseBits {
    public int reverseBits(int n) {
      int ans = 0;
  
      for (int i = 0; i < 32; ++i)
        if ((n >> i & 1) == 1)
          ans |= 1 << 31 - i;
  
      return ans;
    }
  
    public static void main(String[] args) {
      ReverseBits reverseBits = new ReverseBits();
      
      int n = 43261596;  
      int result = reverseBits.reverseBits(n);
      
      System.out.println("Reversed bits: " + result);
    }
  }
  