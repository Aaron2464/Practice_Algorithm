/**
144. Binary Tree Preorder Traversal
Given a binary tree, return the preorder traversal of its nodes' values.

Input: [1,null,2,3]
1
 \
  2
 /
3
Output: [1,2,3]
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return result;
        
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        
        return result;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 