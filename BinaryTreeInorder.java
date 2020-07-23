import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        
        while(!stack.empty() || node != null){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            
            node = stack.pop();
            result.add(node.val);
            node = node.right;
        }
        return result;
    }
}

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }