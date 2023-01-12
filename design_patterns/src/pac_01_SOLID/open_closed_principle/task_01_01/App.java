package pac_01_SOLID.open_closed_principle.task_01_01;

// 2 important design patterns that can quarantee that the o/c principle is not violated
// strategy pattern, template pattern

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // several interview question: A, AI, QF
        List<InterviewQuestion> listOfQuestions = new ArrayList<>();
        listOfQuestions.add(new AlgorithmsInterviewQuestions());
        listOfQuestions.add(new AIInterviewQuestions());
        listOfQuestions.add(new FinanceInterviewQuestions());
        listOfQuestions.add(new CSInterviewQuestions());

        listOfQuestions.forEach(question -> {
            InterviewQuestionProcessor.process(question);;
        });

//        InterviewQuestionProcessor.process(new AlgorithmsInterviewQuestions());
//        InterviewQuestionProcessor.process(new AIInterviewQuestions());
//        InterviewQuestionProcessor.process(new FinanceInterviewQuestions());
//        InterviewQuestionProcessor.process(new CSInterviewQuestions());
    }
}

