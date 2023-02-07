package _01_DesignPatterns.pac_02_creational_design_patterns.BuilderPattern;

public class Person {
    private final String name;
    private final String email;
    private final String address;
    private final int age;
    private final String university;

    private String nameOfMother;

    public Person(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
        this.age = builder.age;
        this.university = builder.university;
        this.nameOfMother = builder.nameOfMother;
    }

    public static class Builder {
        private final String name;
        private final String email;
        private String address;
        private int age;
        private String university;

        private String nameOfMother;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setNameOfMother(String nameOfMother) {
            this.nameOfMother = nameOfMother;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                '}';
    }
}
