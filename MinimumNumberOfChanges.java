public class MinimumNumberOfChanges {
    public int minChanges(String s) {
      int ans = 0;
  
      for (int i = 0; i + 1 < s.length(); i += 2)
        if (s.charAt(i) != s.charAt(i + 1))
          ++ans;
  
      return ans;
    }
  
    public static void main(String[] args) {
      MinimumNumberOfChanges solution = new MinimumNumberOfChanges();
      String s = "101010"; 
      int result = solution.minChanges(s);
      System.out.println("Minimum number of changes needed: " + result);
    }
  }
  