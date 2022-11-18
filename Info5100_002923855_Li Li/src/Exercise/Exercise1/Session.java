package Exercise.Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Session {

    ArrayList<Student> studentList;
    ArrayList<FullTime> fullTimeList;
    ArrayList<PartTime> partTimeList;

   // Create a class Session
    public Session(){
        studentList = new ArrayList<>();
        fullTimeList = new ArrayList<>();
        partTimeList = new ArrayList<>();
    }

    public void populateAll() {
        //  ArrayList<PartTime> partTimeList = new ArrayList<>();
        //        PartTime partOne = new PartTime("Tom");
        //        PartTime partTwo = new PartTime("Jerry");

        //Use data structure to hold 20 students in a Session, some are part-time, some are full-time
        studentList.add(new PartTime("Lily"));
        studentList.add(new PartTime("Amber"));
        studentList.add(new PartTime("Tina"));
        studentList.add(new PartTime("Cindy"));
        studentList.add(new PartTime("Nancy"));
        studentList.add(new PartTime("Jerry"));
        studentList.add(new PartTime("Tom"));
        studentList.add(new PartTime("Jack"));
        studentList.add(new PartTime("Lucy"));
        studentList.add(new PartTime("Wendy"));
        studentList.add(new FullTime("John"));
        studentList.add(new FullTime("Chris"));
        studentList.add(new FullTime("Ana"));
        studentList.add(new FullTime("Fanny"));
        studentList.add(new FullTime("Jenny"));
        studentList.add(new FullTime("Vicky"));
        studentList.add(new FullTime("Ada"));
        studentList.add(new FullTime("Lilian"));
        studentList.add(new FullTime("Lian"));
        studentList.add(new FullTime("Long"));

        // loop studentList to get all the students and give 15 quiz random scores to each one
        Random random = new Random();
        for (Student stu : studentList) {
            for (int i = 0; i < 15; i++) {
                stu.quiz[i] = random.nextInt(100);
            }

            // add fullTime Student to fullTimeList
            // add partTime Student to partTimeList
            if (stu.fullTimeOrPartTime == "fullTime") {
                fullTimeList.add((FullTime) stu);
            } else {
                partTimeList.add((PartTime) stu);
            }
        }
        // loop fullTimeList to get all the fullTime students and give 2 exam random scores to each one
        for (FullTime fullTimeStudent : fullTimeList) {
            fullTimeStudent.ExamScore1 = random.nextInt(100);
            fullTimeStudent.ExamScore2 = random.nextInt(100);
        }
    }

        // Create public methods to calculate average quiz scores per student for the whole class
        public List<Double> averageQuizScores(){
            List<Double> averageQuizScores = new ArrayList<>();
            for(Student stu : studentList){
                double total = 0;
                for(double score : stu.quiz){
                    total += score;
                }
                averageQuizScores.add(total / 15);
                System.out.println(stu.name+" average quiz score is "+ total / 15);
            }
            return averageQuizScores;
        }




    // Create public method to print the list of quiz scores in ascending order for one session

    public void printQuiz(String name){
        for(Student stu : studentList){
            if(stu.name == name){
                Arrays.sort(stu.quiz);
                System.out.println(name + "'s quiz scores are ");

                for(double score : stu.quiz)
                    System.out.println(score + " ");
            }
        }
    }
    // Create public method to print names of part-time students
    public void printPartTimeNames(){
        System.out.print("Part time students are: ");
        for(PartTime partTimeStudent : partTimeList){
                System.out.print(partTimeStudent.name + "\t ");
        }
        System.out.println();
    }

    // Create public method to print exam scores of full-time students
    public void printFullTimeExamScores(){
        for(FullTime fullTimeStudent : fullTimeList){
            System.out.println(fullTimeStudent.name + "'s exam score are "+ fullTimeStudent.ExamScore1
                    + " and " + fullTimeStudent.ExamScore2 + ".");
        }
    }
}





    /* assignment
        Use suitable data structure to hold 15 quizzes scores for each student (part-time or full-time)

        Create a class Session

        Use data structure to hold 20 students in a Session, some are part-time, some are full-time

        Create public methods to calculate average quiz scores per student for the whole class

        Create public method to print the list of quiz scores in ascending order for one session

        Create public method to print names of part-time students

        Create public method to print exam scores of full-time students

        Main Program

        Create an instance of Session, populate it with 20 students and dummy scores

        Call all public methods of Session and capture the output of those methods on console
*/

