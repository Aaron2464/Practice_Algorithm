/**
 * 94. Binary Tree Inorder Traversal
 * Definition for a binary tree node.
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * 
 * Output: [1,3,2]
 */
class Solution {
    var result:[Int] = [Int]()
    func inorderTraversal(_ root: TreeNode?) -> [Int] {
        if let ln = root.left{
            inorderTraversal(ln)
        }
        result.append(root.val)
        if let rn = root.right{
            inorderTraversal(ln)
        }
        return root
    }
}

public class TreeNode {
    public var val: Int
    public var left: TreeNode?
    public var right: TreeNode?
    public init(_ val: Int) {
        self.val = val
        self.left = nil
        self.right = nil
    }
}