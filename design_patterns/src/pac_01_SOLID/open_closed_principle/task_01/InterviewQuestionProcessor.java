package pac_01_SOLID.open_closed_principle.task_01;

public class InterviewQuestionProcessor {
    public static void process(InterviewQuestion question) {
        // this is a typical implementation of the loosely coupled system
        // this class knows nothing about the question and its type
        // this is a pure abstraction
        question.execute();
    }
}
