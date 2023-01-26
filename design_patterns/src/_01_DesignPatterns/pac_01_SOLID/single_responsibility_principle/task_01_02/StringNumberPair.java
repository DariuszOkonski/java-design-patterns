package _01_DesignPatterns.pac_01_SOLID.single_responsibility_principle.task_01_02;

public class StringNumberPair {
    private String number1;
    private String number2;

    public StringNumberPair(String number1, String number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public StringNumberPair() {
        this.number1 = "";
        this.number2 = "";
    }

    public String getNumber1() {
        return number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }
}
