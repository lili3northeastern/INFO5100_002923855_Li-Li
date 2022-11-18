package Exercise.Exercise1;

import java.util.ArrayList;

public class Exercise1main {
    public static void main(String[] args) {

        // Create an instance of Session, populate it with 20 students and dummy scores
        Session session = new Session();

        // Call all public methods of Session and capture the output of those methods on console

        session.populateAll();
        session.averageQuizScores();

        session.printQuiz("Lily");
        session.printQuiz("Amber");
        session.printQuiz("Tina");
        session.printQuiz("Cindy");
        session.printQuiz("Nancy");
        session.printQuiz("Jerry");
        session.printQuiz("Tom");
        session.printQuiz("Jack");
        session.printQuiz("Lucy");
        session.printQuiz("Wendy");
        session.printQuiz("John");
        session.printQuiz("Chris");
        session.printQuiz("Ana");
        session.printQuiz("Lilian");
        session.printQuiz("Long");
        session.printQuiz("Jenny");
        session.printQuiz("Fanny");
        session.printQuiz("Lian");
        session.printQuiz("Vicky");
        session.printQuiz("Long");

        session.printPartTimeNames();
        session.printFullTimeExamScores();


    }
}
