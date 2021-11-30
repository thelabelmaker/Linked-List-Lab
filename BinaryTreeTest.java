public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>(52);
        tree.add(51);
        tree.add(92);
        tree.add(11);
        tree.add(46);
        tree.add(54);
        tree.add(97);
        tree.add(98);
        
        System.out.print("Pre Order: ");
        System.out.print(tree.pre_order()+"\n\n");

        System.out.print("Post Order: ");
        System.out.print(tree.post_order()+"\n\n");

        System.out.print("In Order: ");
        System.out.print(tree.in_order()+"\n");
    }
}
