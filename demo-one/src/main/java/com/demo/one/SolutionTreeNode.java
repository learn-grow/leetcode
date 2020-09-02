package com.demo.one;

/**
 * @author: lisy
 * @version: : SolutionTreeNode , v0.1 2020年06月09日 10:07 下午
 * @remark: the SolutionTreeNode is
 */
public class SolutionTreeNode {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    private int maxDepth = -1 ,res = -1;

    public int findBottomLeftValue(TreeNode root) {
        helper(root , 0);
        return res;
    }

    private void helper(TreeNode root, int i) {
        if (root == null) return;
        helper(root.left , i+1);
        if (i > maxDepth){
            maxDepth = i;
            res = root.val;
        }
        helper(root.right , i + 1);
    }
}
