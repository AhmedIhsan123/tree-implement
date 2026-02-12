public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10, new TreeNode(9, new TreeNode(5, null, null), new TreeNode(2, null, null)), new TreeNode(15, new TreeNode(-3, null, null), new TreeNode(5, null, new TreeNode(22, null, null))));
    
    preorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
    inorder(root);
  }

  public static void preorder(TreeNode node) {
    if (node == null) return;
    System.out.print(node.value + " ");
    preorder(node.left);
    preorder(node.right);
  }

  public static void postorder(TreeNode node) {
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value + " ");
  }

  public static void inorder(TreeNode node) {
    if (node == null) return;
    inorder(node.left);
    System.out.print(node.value + " ");
    inorder(node.right);
  }
}
