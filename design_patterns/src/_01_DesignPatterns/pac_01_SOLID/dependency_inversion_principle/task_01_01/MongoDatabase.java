package _01_DesignPatterns.pac_01_SOLID.dependency_inversion_principle.task_01_01;

public class MongoDatabase implements IDatabase {
    @Override
    public void connect() {
        System.out.println("Connecting to a MongoDB database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MongoDB database...");
    }
}
