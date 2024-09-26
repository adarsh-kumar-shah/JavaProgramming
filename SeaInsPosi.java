class SeaInsPosi {
    public int searchInsert(int[] nums, int target) {
      int l = 0;
      int r = nums.length;
  
      while (l < r) {
        final int m = (l + r) / 2;
        if (nums[m] == target)
          return m;
        if (nums[m] < target)
          l = m + 1;
          
        else
          r = m;
      }
  
      return l;
    }
  
    public static void main(String[] args) {
        SeaInsPosi solution = new SeaInsPosi();
      
      int[] nums = {1, 3, 5, 6};
      int target = 5;
      System.out.println("Index of target: " + solution.searchInsert(nums, target)); // Output: 2
      
      target = 2;
      System.out.println("Index of target: " + solution.searchInsert(nums, target)); // Output: 1
      
      target = 0;
      System.out.println("Index of target: " + solution.searchInsert(nums, target)); // Output: 0
  }
}