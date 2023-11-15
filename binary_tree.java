
public class binary_tree<T extends Number & Comparable<T>>{
    private Node root;
    private int col_el;

    class Node<T extends Comparable<T>>  {
        Node left;
        Node right;
        T data;

        public Node(T data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
    public binary_tree() {
        this.root = null;
        this.col_el = 0;
    }
    public binary_tree(binary_tree old_tree){
        this.root = clone(old_tree.root);
        this.col_el = old_tree.col_el;
    }

    public void add(T data) {
        this.root = insert(this.root, data);
        this.col_el++;
    }
    public boolean find(T data){
        return search(this.root, data);
    }

    public int sum(){
        return sum_elem(this.root);
    }

    public int find_full_nodes(){
        return count_full_knot(this.root);
    }

    private Node<T> clone(Node<T> node) {
        if (node == null) {
            return null;
        }
        Node<T> newNode = new Node<T>(node.data);
        newNode.left = clone(node.left);
        newNode.right = clone(node.right);
        return newNode;
    }

    private Node<T> insert(Node<T> node, T data) {
        if (node == null) {
            return new Node<>(data);
        }

        int cmp = data.compareTo(node.data);

        if (cmp < 0) {
            node.left = insert(node.left, data);
        } else if (cmp > 0) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    private boolean search(Node<T> node, T data) {
        if (node == null) {
            return false;
        }

        int cmp = data.compareTo(node.data);

        if (cmp == 0) {
            return true;
        } else if (cmp < 0) {
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

    private int sum_elem(Node<T> node) {
        if (node == null) {
            return 0;
        }

        int left_sum = sum_elem(node.left);
        int right_sum = sum_elem(node.right);

        return node.data.intValue() + left_sum + right_sum;
    }

    private int count_full_knot(Node<T> node) {
        if (node == null) {
            return 0;
        }

        int left_count = count_full_knot(node.left);
        int right_count = count_full_knot(node.right);

        if (node.left != null && node.right != null) {
            return 1 + left_count + right_count;
        } else {
            return left_count + right_count;
        }
    }



    public int size() {
        return this.col_el;
    }
    public void clear() {
        this.root = null;
        this.col_el = 0;
    }

}
