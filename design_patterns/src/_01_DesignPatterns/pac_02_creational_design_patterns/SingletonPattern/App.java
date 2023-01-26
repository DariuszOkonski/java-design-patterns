package _01_DesignPatterns.pac_02_creational_design_patterns.SingletonPattern;

import _01_DesignPatterns.pac_01_SOLID.dependency_inversion_principle.task_01_01.DatabaseController;

public class App {
    public static void main(String[] args) {
//        var o1 = DatabaseConnector.getInstance();
//        var o2 = DatabaseConnector.getInstance();
//
//        System.out.println(o1.equals(o2));

            var db1 = Database.INSTANCE;
            var db2 = Database.INSTANCE;

        System.out.println(db1 == db2);
    }
}

