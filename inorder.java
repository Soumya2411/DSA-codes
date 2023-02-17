class Solution {
    private List<Integer> res = new ArrayList<>();
    private void inorder(TreeNode root){
if(root==null){
            return;
        }
        else{
inorder(root.left);
res.add(root.val);
inorder(root.right);

        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
inorder(root);
return res;
        
    }