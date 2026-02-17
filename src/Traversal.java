public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<Integer>(10, new TreeNode<Integer>(9, new TreeNode<Integer>(5, null, null), new TreeNode<Integer>(2, null, null)), new TreeNode<Integer>(15, new TreeNode<Integer>(-3, null, null), new TreeNode<Integer>(5, null, new TreeNode<Integer>(22, null, null))));
    
    preorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
    inorder(root);
    System.out.println();

    TreeNode<String> stringRoot = new TreeNode<String>("Hello", new TreeNode<String>("how", new TreeNode<String>("are", null, null), new TreeNode<String>("you", null, null)), new TreeNode<String>("I", new TreeNode<String>("am", null, null), new TreeNode<String>("so", null, new TreeNode<String>("good", null, null))));

    preorder(stringRoot);
    System.out.println();
    postorder(stringRoot);
    System.out.println();
    inorder(stringRoot);
    System.out.println();

    printGreater(root, 10);
    System.out.println();

    System.out.println(countNodes(root));
  }

  public static int countNodes(TreeNode<?> node) {
    int count = 0;
    if (node == null) {
      return 0;
    } else {
      count++;
      count += (countNodes(node.right) + countNodes(node.left)); 
    }
    return count;
  }
  
  public static void printGreater(TreeNode<Integer> node, int threshold) {
    if (node == null) return;
    if (node.value > threshold) {
      System.out.print(node.value + " ");
    }
    printGreater(node.left, threshold);
    printGreater(node.right, threshold);
  }

  public static <T> void preorder(TreeNode<T> node) {
    if (node == null) return;
    System.out.print(node.value + " ");
    preorder(node.left);
    preorder(node.right);
  }

  public static <T> void postorder(TreeNode<T> node) {
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value + " ");
  }

  public static <T> void inorder(TreeNode<T> node) {
    if (node == null) return;
    inorder(node.left);
    System.out.print(node.value + " ");
    inorder(node.right);
  }
}
