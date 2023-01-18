package pac_01_SOLID.dependency_inversion_principle.task_01_01;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<DatabaseController> list = new ArrayList<>();

        DatabaseController databaseController = new DatabaseController(new OracleDatabase());
        list.add(databaseController);

        databaseController = new DatabaseController(new MySQLDatabase());
        list.add(databaseController);

        databaseController = new DatabaseController(new MongoDatabase());
        list.add(databaseController);

        System.out.println("=== LIST ===");
        System.out.println(list.size());
        list.forEach(databaseController1 -> {
            databaseController1.connect();
            databaseController1.disconnect();
        });
    }
}

