package pac_01_SOLID.dependency_inversion_principle.task_01_01;

// this i another low level module
public class OracleDatabase implements IDatabase {

    public void connect() {
        System.out.println("Connecting to a Oracle database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from a Oracle database...");
    }
}
