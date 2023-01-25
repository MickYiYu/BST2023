public class Main {
    public static void main(String[] args) {
        BSTree<Integer> tree = new BSTree<>();

        tree.add(100);
        tree.add(50);
        tree.add(75);
        tree.add(25);
        tree.add(10);
        tree.add(1);
        tree.delete(25);
        tree.PrintInOrder();
    }
}
