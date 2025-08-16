import java.util.*;

class Question {
        String question;
    String[] options;
    int answer;

    public Question(String question, String[] options, int answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public void displayQuestion() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean checkAnswer(int answer) {
        return this.answer == answer;
    } 
}
public class quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();
        System.out.println("\n");
        questions.add(new Question("Which language is used for android development", new String[]{"Java", "Python", "C++", "Swift"}, 1));
        questions.add(new Question ("Which company developed Java", new String[]{"Microsoft", "Sun Microsystems", "Apple", "Google"}, 2));
        questions.add(new Question("What is the size of an int in Java", new String[]{"2 bytes", "4 bytes", "8 bytes", "Depends on system"}, 2));
        questions.add(new Question("Which of the following is not a Java feature", new String[]{"Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented"}, 3));

        int score = 0;
        for(Question q : questions) {
            q.displayQuestion();
            System.out.print("Enter your answer (1-4): ");
            int ans = scanner.nextInt();

            if(q.checkAnswer(ans)) {
                System.out.println("Correct!");
                System.out.println();
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + q.options[q.answer - 1]);
                System.out.println();
            }
            
        }

        System.out.println("Quiz Over!");
        System.out.println("Your Score: " + score + "/" + questions.size());
        scanner.close();

    }
}
