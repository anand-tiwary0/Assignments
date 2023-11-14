package rev;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

*
// Definition for a binary tree node.
 public class TreeNode {
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
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        //this list of list will store each level
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        //this queue will contain elements which are in the given level
        queue.add(root);
//        TreeNode current = root;
        while(!queue.isEmpty()){
            
        }





        return result;
    }
}