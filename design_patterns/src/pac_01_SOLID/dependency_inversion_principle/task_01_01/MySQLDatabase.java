package pac_01_SOLID.dependency_inversion_principle.task_01_01;

// low level module
public class MySQLDatabase implements IDatabase {
    public void connect() {
        System.out.println("Connecting to a MySQL database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting the MySQL database...");
    }
}


