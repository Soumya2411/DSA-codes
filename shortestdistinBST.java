class Solution{
    int result=Integer.MAX_VALUE;
    TreeNode prev=null;
     private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        result=Math.min(result,root.val-prev.val);
        prev=root;
        inorder(root.right);
  }
  public int minDiffInBST(TreeNode root){
    inorder(root);
    return result;
  }
}