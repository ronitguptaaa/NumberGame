import java.util.Scanner;

public class numgame{
    public static void main(String[] args){
        int secretNumber;
        int guess;
        boolean correct = false;
        

        Scanner key = new Scanner(System.in);
        System.out.print("Give Me Secret Number: ");

        secretNumber = key.nextInt();

        while(!correct){
            System.out.println("Guess: ");
            guess = key.nextInt();
            
            if( guess == secretNumber ){
                correct = true;
                System.out.println("You are Correct ");
            }
           else if(guess > secretNumber){
               System.out.println("LOWER");
           }
           else if(guess < secretNumber){
               System.out.println("HIGHER");
           }
        }
    }
}