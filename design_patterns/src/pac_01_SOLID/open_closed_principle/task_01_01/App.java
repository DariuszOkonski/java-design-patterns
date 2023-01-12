package pac_01_SOLID.open_closed_principle.task_01_01;

// 2 important design patterns that can quarantee that the o/c principle is not violated
// strategy pattern, template pattern

public class App {
    public static void main(String[] args) {
        // several interview question: A, AI, QF

        InterviewQuestionProcessor.process(new AlgorithmsInterviewQuestions());
        InterviewQuestionProcessor.process(new AIInterviewQuestions());
        InterviewQuestionProcessor.process(new FinanceInterviewQuestions());
    }
}

