class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;
        return p.val == q.val &&          //
            isSameTree(p.left, q.left) && //
            isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(tree1, tree2);

        System.out.println("Are the two trees the same? " + result);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        
        val = x;
    }
}
