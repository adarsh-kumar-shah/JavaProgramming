class MoveZeroes {
    public void moveZeroes(int[] nums) {
      int i = 0;
      for (final int num : nums)
        if (num != 0)
          nums[i++] = num;
  
      while (i < nums.length)
        nums[i++] = 0;
    }
  
    public static void main(String[] args) {
      MoveZeroes mz = new MoveZeroes();
      
      int[] nums = {0, 1, 0, 3, 12};
      
      mz.moveZeroes(nums);
      
      System.out.print("Array after moving zeroes: ");
      for (int num : nums) {
        System.out.print(num + " ");
      }
    }
  }
  