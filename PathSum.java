/**
 * 112. Path Sum
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Example:
 * 
 * Given the below binary tree and sum = 22,
 * 
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 */

public class PathSum {
    int nodeSum=0;
    boolean res=false;
    public boolean hasPathSum(TreeNode root, int sum) {
	    if(root==null) return res;
	    DFS(root, sum);
    	return res;      
    }
    public void DFS(TreeNode root, int sum) {
	    if(root==null) return;
	    nodeSum += root.val;
		
        if(root.left!=null) DFS(root.left,sum);
        if(root.right!=null) DFS(root.right,sum);
		
        if(nodeSum == sum && root.left == null && root.right == null) {
			res=true;
	    	return;
		}
		nodeSum -= root.val;
	}
}