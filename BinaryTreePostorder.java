/**
 * 145. Binary Tree Postorder Traversal
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * Input: [1,null,2,3]
 * 1
 *  \
 *   2
 *  /
 * 3
 * Output: [3,2,1]
 */

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
public class BinaryTreePostorder {
    public List<Integer> postorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return result;
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.peek();
        if(temp.left==null && temp.right==null) {
            TreeNode pop = stack.pop();
            result.add(pop.val);
        } else {
            if(temp.right!=null) {
                stack.push(temp.right);
                temp.right = null;
            }
        }

        if(temp.left!=null) {
            stack.push(temp.left);
            temp.left = null;
        }
    }
        return result;
    }
}