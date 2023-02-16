package maxdepthofbintree;

import org.w3c.dom.Node;

public class maxdepthofbintree {
    int height(Node root){
        if(root==NULL){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
        
    }
    }

