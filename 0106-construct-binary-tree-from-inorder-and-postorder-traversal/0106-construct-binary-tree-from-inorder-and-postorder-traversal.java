/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private int postIdx;
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        postIdx = postorder.length - 1;

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int left, int right) {

        if (left > right) return null;

        int rootVal = postorder[postIdx--];
        TreeNode root = new TreeNode(rootVal);

        int idx = map.get(rootVal);

        // Right first because we're traversing postorder backwards
        root.right = build(inorder, postorder, idx + 1, right);
        root.left = build(inorder, postorder, left, idx - 1);

        return root;
    }
}