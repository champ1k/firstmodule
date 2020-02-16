package firstmodule;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    public int getHeight(TreeNode root)
    {
        if(root!=null)
            return 1+ Math.max(getHeight(root.left),getHeight(root.right));
        else
            return 0;
    }
    public void insert( TreeNode nodeTree) {
        if ( nodeTree.val < val )
            if ( left != null ) left.insert( nodeTree);
            else left = nodeTree;
        else
        if ( right != null ) right.insert( nodeTree );
        else right = nodeTree;
    }
}
