package _01_DesignPatterns.pac_01_SOLID.single_responsibility_principle.task_01_02;

public class NumberPair {
    private Integer number1;
    private Integer number2;
    public NumberPair(StringNumberPair stringNumberPair) {
        this.number1 = Integer.parseInt(stringNumberPair.getNumber1());
        this.number2 = Integer.parseInt(stringNumberPair.getNumber2());
    }
    public Integer CountResult() {
        return this.number1 + this.number2;
    }
}
