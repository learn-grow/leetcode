package com.learn.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author: lisy
 * @version: : TreeNodeTest , v0.1 2020年04月10日 2:58 下午
 * @remark: the TreeNodeTest is
 */
public class TreeNodeTest {

    public static void main(String[] args) {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for (int i = 0; i < 3; i++) {
            node[i] = new TreeNode(i);
        }
        for (int i = 0; i < 3; i++) {
            if (i * 2 + 1 < 3)
                node[i].left = node[i * 2 + 1];
            if (i * 2 + 2 < 3)
                node[i].right = node[i * 2 + 2];
        }
        List<Integer> res = new ArrayList<Integer>();

        /**
         * 前序遍历
         */
        List<Integer> list = preOrder(node[0], res);
        System.out.println("前序遍历");
        list.forEach(new Consumer<Integer>() {
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        /**
         * 中序遍历
         */
        List<Integer>  list1 = inOrder(node[0], res);
        System.out.println("中序遍历");
        list1.forEach(new Consumer<Integer>() {
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        /**
         * 后序遍历
         */
        List<Integer>  list2 = postOrder(node[0], res);
        System.out.println("后序遍历");
        list2.forEach(new Consumer<Integer>() {
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

    }

    /**
     * 前序遍历 root->left->right
     * @param root
     * @param res
     * @return
     */
    public static List<Integer> preOrder(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.left != null) preOrder(root.left, res);
            if (root.right != null) preOrder(root.right , res);
        }

        return res;
    }

    /**
     * 中序遍历 left->root->right
     * @param root
     * @param res
     * @return
     */
    public static List<Integer> inOrder(TreeNode root,List<Integer> res){
        if (root != null){
            if (root.left != null) inOrder(root.left , res);
            res.add(root.val);
            if (root.right != null) inOrder(root.right , res);
        }
        return res;
    }

    /**
     * 后序遍历 left->right->root
     * @param root
     * @param res
     * @return
     */
    public static List<Integer> postOrder(TreeNode root,List<Integer> res){
        if (root != null){
            if (root.left != null) postOrder(root.left , res);
            if (root.right != null) postOrder(root.right , res);
            res.add(root.val);
        }
        return res;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}

