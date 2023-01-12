package pac_01_SOLID.single_responsibility_principle.task_01_02;

public class Validation {
    public static boolean isValid(StringNumberPair number) {
        try {
            Integer.parseInt(number.getNumber1());
            Integer.parseInt(number.getNumber2());
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
