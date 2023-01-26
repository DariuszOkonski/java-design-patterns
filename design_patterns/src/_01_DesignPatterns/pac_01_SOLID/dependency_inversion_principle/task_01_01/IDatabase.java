package _01_DesignPatterns.pac_01_SOLID.dependency_inversion_principle.task_01_01;

// this is the abstract layer
public interface IDatabase {
    void connect();
    void disconnect();
}
