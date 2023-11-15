public class test_tree {
        public static void main(String[] args) {
            binary_tree<Integer> tree = new binary_tree<>();
            tree.add(5);
            tree.add(3);
            tree.add(7);
            tree.sum();
            System.out.println("полные узлы: " +tree.find_full_nodes());
            System.out.println("сумма: " + tree.sum());
            System.out.println("Содержит 3: " + tree.find(3));
            System.out.println("Содержит 8: " + tree.find(8));

            binary_tree<Integer> copiedTree = new binary_tree<>(tree);
            System.out.println("размер нового дерева: " + copiedTree.size());

            tree.clear();
            System.out.println("размер дерева после очистки: " + tree.size());

            System.out.println("размер нового дерева после очистки исходного: " + copiedTree.size());
        }
    }

