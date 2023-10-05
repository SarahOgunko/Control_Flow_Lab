import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] arg) {


//        prompt a user to guess a  secret number between 1-10
        System.out.println("Guess a secret number between 1-10 ");

//        collect user input
        Scanner reader = new Scanner(System.in);
        int guessedNumber = reader.nextInt();

//        secret number is 6
//        if number is less than 6 print "WRONG, higher number needed !"
//        if number is greater than six print "WRONG lower number needed !"
9
//        if the number is 6 print "You guessed correctly"

        int secretNumber = 6;

        if (guessedNumber < 1 || guessedNumber > 10) {
            System.out.println("error enter a number between 1 and 10 ");

        } else if (guessedNumber < secretNumber) {
            System.out.println("WRONG higher number needed !");
        } else if (guessedNumber > secretNumber) {
            System.out.println("WRONG, lower number needed !");
        } else {
            System.out.println("You guessed correctly");
        }


    }
}
