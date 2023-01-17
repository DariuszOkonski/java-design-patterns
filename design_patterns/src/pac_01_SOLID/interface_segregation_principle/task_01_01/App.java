package pac_01_SOLID.interface_segregation_principle.task_01_01;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Tree binaryTree = new BinarySearchTree();

        binaryTree.insert();
        binaryTree.delete();
        binaryTree.traverse();

        System.out.println("==========");

        RotationTree balancedTree = new BalancedTree();
        balancedTree.insert();
        balancedTree.delete();
        balancedTree.traverse();
        balancedTree.leftRotation();
        balancedTree.rightRotation();


        System.out.println("============");
        List<Tree> list = new ArrayList<>();
        list.add(binaryTree);
        list.add(balancedTree);

        list.forEach(tree -> {
            tree.traverse();
        });
    }
}

