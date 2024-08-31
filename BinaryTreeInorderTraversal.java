import java.util.*;

class BinaryTreeInorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }

        return ans;
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal tree = new BinaryTreeInorderTraversal();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> inorderResult = tree.inorderTraversal(root);

        System.out.println("Inorder Traversal: " + inorderResult);
    }
}
