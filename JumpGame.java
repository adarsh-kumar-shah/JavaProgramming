class JumpGame {
    public boolean canJump(int[] nums) {
      int i = 0;
  
      for (int reach = 0; i < nums.length && i <= reach; ++i)
        reach = Math.max(reach, i + nums[i]);
  
      return i == nums.length;
    }
  
    public static void main(String[] args) {
      JumpGame jumpGame = new JumpGame();
      
      
      int[] nums1 = {2, 3, 1, 1, 4};
      System.out.println("Can jump (test case 1): " + jumpGame.canJump(nums1)); 
  
      int[] nums2 = {3, 2, 1, 0, 4};
      System.out.println("Can jump (test case 2): " + jumpGame.canJump(nums2)); 
    }
  }
  