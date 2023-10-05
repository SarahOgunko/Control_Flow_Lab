import java.util.Scanner;

public class GuessingGame {

    public static void main (String[]arg){


//        prompt a user to guess a  secret number between 1-10
        System.out.print("Guess a secret number between 1-10 ");

//        collect user input
        Scanner reader  = new Scanner (System.in);
        int guessedNumber  = reader.nextInt();

//        secret number is 6
//        if number is less than 6 print "WRONG, higher number needed !"
//        if number is greater than six print "WRONG lower number needed !"
//        if the number is 6 print "You guessed correctly"

        int secretNumber = 6 ;

        if (guessedNumber < secretNumber ){
            System.out.print("WRONG, higher number needed !");

        } else if(guessedNumber > secretNumber){
            System.out.print("WRONG lower number needed !");
        } else {
            System.out.print("You guessed correctly");
        }


    }
}
