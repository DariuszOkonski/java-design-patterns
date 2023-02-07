package _01_DesignPatterns.pac_02_creational_design_patterns.BuilderPattern;

public class App {
    public static void main(String[] args) {
        Person person = new Person.Builder("Kevin", "kevin@gmail.com").setAge(15).build();

        System.out.println(person.toString());

        Student student = new Student.Builder("Darek", "Polibuda").build();

        System.out.println(student.toString());
    }
}

