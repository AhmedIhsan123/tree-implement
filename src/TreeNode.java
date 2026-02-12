public class TreeNode {
    // -- Instance fields --

    // The value of the node
    public int value;

    // Left and right pointers
    public TreeNode left;
    public TreeNode right;

    // -- Contructors --
    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}