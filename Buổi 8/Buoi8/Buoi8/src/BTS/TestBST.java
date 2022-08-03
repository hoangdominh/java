package BTS;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert(String.valueOf(30));
        tree.insert(String.valueOf(5));
        tree.insert(String.valueOf(4));
        tree.insert(String.valueOf(2));
        tree.insert(String.valueOf(7));
        tree.insert(String.valueOf(16));
        tree.insert(String.valueOf(14));
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println();
        System.out.println("Postorder (sorted): ");
        tree.postorder();
        System.out.println();
        System.out.println("Preorder (sorted): ");
        tree.preorder();
        System.out.println();
        System.out.println("The number of nodes is: " + tree.getSize());


        //test search
        System.out.println("Test search");
        System.out.println(tree.search(String.valueOf(30)));

        //test delete
        System.out.println("Test delete");
        tree.delete(String.valueOf(30));

        tree.inorder();
    }
}