import java.util.*;

public class QuizApp {

    static class Question {
        String questionText;
        String[] options;
        int correctAnswerIndex;

        Question(String questionText, String[] options, int correctAnswerIndex) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswerIndex = correctAnswerIndex;
        }

        boolean checkAnswer(int answerIndex) {
            return answerIndex == correctAnswerIndex;
        }
    }

    public static void main(String[] args) {
        // List of Java-related questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Which of the following is the correct syntax for declaring a class in Java?", 
            new String[] {"class MyClass {}", "MyClass class {}", "class = MyClass {}", "class: MyClass {}"}, 0));
        questions.add(new Question("Which data type is used to represent a decimal number in Java?", 
            new String[] {"int", "float", "boolean", "char"}, 1));
        questions.add(new Question("Which of these is not a valid access modifier in Java?", 
            new String[] {"public", "private", "protected", "default"}, 3));
        questions.add(new Question("What is the default value of a boolean variable in Java?", 
            new String[] {"true", "false", "0", "null"}, 1));
        questions.add(new Question("Which method is used to find the length of an array in Java?", 
            new String[] {"size()", "length()", "getSize()", "length"}, 3));
        questions.add(new Question("Which of the following keywords is used to prevent inheritance in Java?", 
            new String[] {"static", "final", "abstract", "extends"}, 1));
        questions.add(new Question("What does JVM stand for?", 
            new String[] {"Java Visual Machine", "Java Variable Machine", "Java Virtual Machine", "Java Virtual Method"}, 2));
        questions.add(new Question("Which of the following is used to start a thread in Java?", 
            new String[] {"startThread()", "run()", "init()", "start()"}, 3));
        questions.add(new Question("Which of these is a valid way to create an object of a class in Java?", 
            new String[] {"ClassName obj = new ClassName();", "new obj = ClassName();", "obj = new ClassName();", "Class obj = new ClassName();"}, 0));
        questions.add(new Question("What is the size of a `char` in Java?", 
            new String[] {"8 bits", "16 bits", "32 bits", "64 bits"}, 1));

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Loop through the questions
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            // Print the question and options
            System.out.println((i + 1) + ". " + q.questionText);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            // Get user's answer
            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            // Check if the answer is correct
            if (q.checkAnswer(userAnswer - 1)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer was: " + q.options[q.correctAnswerIndex] + "\n");
            }
        }

        // Display the final score
        System.out.println("Your final score is: " + score + "/" + questions.size());
        scanner.close();
    }
}