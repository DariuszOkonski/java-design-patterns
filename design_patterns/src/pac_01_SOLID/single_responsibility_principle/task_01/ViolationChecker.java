package pac_01_SOLID.single_responsibility_principle.task_01;

public class ViolationChecker {

    // we have to return true if the pair components are number
    // otherwise we return false
    public static boolean isValid(Pair pair) {
        String firstNumber = pair.getFirst();
        String secondNumber = pair.getSecond();

        try {
            Integer.parseInt(firstNumber);
        }catch (NumberFormatException nfe) {
            return false;
        }

        try {
            Integer.parseInt(secondNumber);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
}
