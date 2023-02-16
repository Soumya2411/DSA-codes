import javax.swing.tree.TreeNode;

public class heightbalanced {
    public boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }
        else if(Math.abs(height(root.right))-height(root.left))>1{
            return false;
        }
        else {
            return isBalanced(root.right)&&isBalanced(root.right)
        }
    }
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(lheight,rheight)+1;
        
    }
}

