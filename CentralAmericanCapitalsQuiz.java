import java.util.*;
/**
 * Your knowledge of the Central American countries capitals is to be quizzed in this program.
 * 
 * @Daniela Moreno
 * @December 2016 FinalVersion
 */

public class CentralAmericanCapitalsQuiz
{
    static Scanner scnr = new Scanner(System.in);
    static int capitalsAnswer = 0;
    static int correctAnswers = 0;
    
    public static void main(String[] args) {
        String initialAnswer = " ";
        int correctNumber = 0;
        
        System.out.println("-----Central America's Capitals Quiz-----");
        System.out.println();
        System.out.println("Are you ready to be quizzed on Central American countries' capitals? (Yes/No)");
        initialAnswer = scnr.next();
        do{
            correctAnswers = 0;
            if (initialAnswer.equalsIgnoreCase("yes")) {
                System.out.println("Great! Let's see how many of the seven capitals you know.");
                System.out.println();
            }
            else {
                System.out.println("You'll be missing out on a fun game.");
            }

            System.out.println("Which of the following is Belize's capital?(Enter the answer's number)");
            System.out.println("1)San Salvador.");
            System.out.println("2)San Jose.");
            System.out.println("3)Belmopan.");
            userOutcome(3);

            System.out.println();
            System.out.println("Which of the following is Honduras' capital?(Enter the answer's number)");
            System.out.println("1)Tegucigalpa.");
            System.out.println("2)San Jose.");
            System.out.println("3)San Salvador.");
            userOutcome(1);

            System.out.println(correctAnswers + " Correct out of 2");
            System.out.println();

            System.out.println("Which of the following is Guatemala's capital?(Enter the answer's number)");
            System.out.println("1)San Salvador.");
            System.out.println("2)Guatemala City.");
            System.out.println("3)Managua.");
            userOutcome(2);

            System.out.println(correctAnswers + " Correct out of 3");
            System.out.println();

            System.out.println("Which of the following is El Salvador's capital?(Enter the answer's number)");
            System.out.println("1)San Jose.");
            System.out.println("2)Panama City.");
            System.out.println("3)San Salvador.");
            userOutcome(3);

            System.out.println(correctAnswers + " Correct out of 4");
            System.out.println();

            System.out.println("Which of the following is Costa Rica's capital?(Enter the answer's number)");
            System.out.println("1)San Jose.");
            System.out.println("2)Belmopan.");
            System.out.println("3)Managua.");
            userOutcome(1);

            System.out.println(correctAnswers + " Correct out of 5");
            System.out.println();

            System.out.println("Which of the following is Panama's capital?(Enter the answer's number)");
            System.out.println("1)San Salvador.");
            System.out.println("2)Panama City.");
            System.out.println("3)Managua.");
            userOutcome(2);

            System.out.println(correctAnswers + " Correct out of 6");
            System.out.println();

            System.out.println("Which of the following is Nicaragua's capital?(Enter the answer's number)");
            System.out.println("1)Tegucigalpa.");
            System.out.println("2)Guatemala City.");
            System.out.println("3)Managua.");
            userOutcome(3);

            System.out.println(correctAnswers + " Correct out of 7");
            System.out.println();
            sum(correctAnswers);
            System.out.println("Would you like to play once again?(Yes/No)");
            initialAnswer = scnr.next();
        } while(initialAnswer.equalsIgnoreCase("Yes"));
    }

    public static void sum(int correctAnswers) {
        if(correctAnswers == 7) {
            System.out.println("Wow, you knew all of the Central American countries' capitals!");
        }
        else if(correctAnswers < 7) {
            System.out.println("You got some of the questions wrong, you should probably try playing the game once again.");
        }
    }

    public static void userOutcome(int correctNumber){
        capitalsAnswer = scnr.nextInt();
        if(capitalsAnswer < 1 || capitalsAnswer > 3) {
            System.out.println("That is not a valid option.");
        }
        else if(capitalsAnswer == correctNumber){
            correctAnswers++;
        }
        else {
            System.out.println("That is a wrong answer.");
        } 
    }
}

