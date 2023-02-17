class Solution {
    
    List<Integer> ls=new ArrayList<>();
        private void postorder(TreeNode root){
    if(root==null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    ls.add(root.val);
    
        }
        public List<Integer> postorderTraversal(TreeNode root) {
            
            postorder(root);
            return ls;
        }
    }