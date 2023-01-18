package pac_01_SOLID.dependency_inversion_principle.task_01_01;

// the high level module
public class DatabaseController {
    private IDatabase database;

    public DatabaseController(IDatabase database) {
        this.database = database;
    }

    public void connect() {
        this.database.connect();
    }

    public void disconnect() {
        this.database.disconnect();
    }
}

