package _01_DesignPatterns.pac_01_SOLID.interface_segregation_principle.task_01_01;

public class BalancedTree implements RotationTree {
    @Override
    public void insert() {
        System.out.println("BT: Inserting a new item...");
    }

    @Override
    public void delete() {
        System.out.println("BT: Removing a given item...");
    }

    @Override
    public void traverse() {
        System.out.println("BT: In-order traversal in O(N)...");
    }

    @Override
    public void leftRotation() {
        System.out.println("BT: Left rotation...");
    }

    @Override
    public void rightRotation() {
        System.out.println("BT: Right rotation...");
    }
}
