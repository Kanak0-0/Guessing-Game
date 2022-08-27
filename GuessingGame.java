/**
 * GuessingGame
 */
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
            
        Random generator = new Random();
        int number = 1 + generator.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100");
        for (int i = 0; i < 3; i++) {
            int guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("Congratulations you guessed the correct number ");
            }else if (number-guess<10) {
                System.out.println("You're Close. Try again");
            }else if (guess>number) {
                System.out.println("Too High");
            }else if(guess<number){
                System.out.println("Too Low");
            }else{
                System.out.println("Enter a integer next time.");
            }
            System.out.println();
            System.out.println(3-(i+1)+" tries left.");
            
        }
        
    }
}