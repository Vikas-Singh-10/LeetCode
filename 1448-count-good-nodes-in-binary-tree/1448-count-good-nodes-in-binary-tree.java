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
    class Node{
        TreeNode node;
        int max;
        Node(TreeNode node,int max) {
            this.node=node;
            this.max=max;
        }
    }
    public int goodNodes(TreeNode root) {
        ArrayDeque<Node> dq = new ArrayDeque<>();
        dq.add(new Node(root,root.val));
        int ans=0;
        while(dq.size()>0) {
            Node n = dq.pop();
            TreeNode node = n.node;
            int max = n.max;
            if(node==null) continue;
            
            if(max<=node.val) {
                ans++;
                max=node.val;
            }
            
            dq.add(new Node(node.left,max));
            dq.add(new Node(node.right,max));
        }
        return ans;
    }
}