package pac_01_SOLID.interface_segregation_principle.task_01_01;

public class BinarySearchTree implements Tree{
    @Override
    public void insert() {
        System.out.println("BST: Inserting a new item...");
    }

    @Override
    public void delete() {
        System.out.println("BST: Removing a given item...");
    }

    @Override
    public void traverse() {
        System.out.println("BST: In-order traversal in O(N)...");
    }
}

