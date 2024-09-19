class PathSum {

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
        val = x;
      }
    }
  
    public boolean hasPathSum(TreeNode root, int sum) {
      if (root == null)
        return false;
      if (root.val == sum && root.left == null && root.right == null)
        return true;
      return                                       
          hasPathSum(root.left, sum - root.val) || 
          hasPathSum(root.right, sum - root.val);
    }
  
    public static void main(String[] args) {
      
      TreeNode root = new TreeNode(5);
      root.left = new TreeNode(4);
      root.right = new TreeNode(8);
      root.left.left = new TreeNode(11);
      root.left.left.left = new TreeNode(7);
      root.left.left.right = new TreeNode(2);
      root.right.left = new TreeNode(13);
      root.right.right = new TreeNode(4);
      root.right.right.right = new TreeNode(1);
  
      PathSum pathSum = new PathSum();
      int targetSum = 22;
  
      
      boolean result = pathSum.hasPathSum(root, targetSum);
  
      System.out.println("Has path sum " + targetSum + ": " + result);
    }
  }
  