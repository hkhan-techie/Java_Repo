//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(8);
        tree.insert(9);
        tree.insert(11);
        tree.insert(12);

        tree.inOrder();
        System.out.println(tree.search(5));
        // Not found
        System.out.println(tree.search(13));
    }
}