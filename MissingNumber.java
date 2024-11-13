class MissingNumber {
    public int missingNumber(int[] nums) {
      int ans = nums.length;
  
      for (int i = 0; i < nums.length; ++i)
        ans ^= i ^ nums[i];
  
      return ans;
    }
  
    public static void main(String[] args) {
      MissingNumber solution = new MissingNumber();
      
      int[] nums = {3, 0, 1}; 
      int missing = solution.missingNumber(nums);
      
      System.out.println("The missing number is: " + missing);
    }
  }
  
  