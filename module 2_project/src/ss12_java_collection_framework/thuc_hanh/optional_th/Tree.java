package ss12_java_collection_framework.thuc_hanh.optional_th;

public interface Tree<E> {
    public boolean insert(E e);
    /**
     * Inorder traversal from the root
     */
    public void inorder();
    /**
     * Get the number of nodes in the tree
     */
    public int getSize();
}
