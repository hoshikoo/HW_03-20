package nyc.c4q.hoshikoo;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class TwentyQuestionGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNumber = new Random().nextInt(100000);

        System.out.println(randomNumber);
        //System.out.println("Please guess a number between 1 and 100,000");

        int userNumber;

        for (int i = 0; i<20;i++) {
            System.out.println("Please guess a number between 1 and 100,000");
            //userNumber = input.nextInt();
            //System.out.println("countint: "+(i+1));

            try {
                userNumber = input.nextInt();
            }
            catch (InputMismatchException e) {
                userNumber = 0;
                input.next();
            }

            if(userNumber>100000 ||userNumber<=0){ //how to add if it was not a number...catch??
                System.out.println("You input wrong number");
                i--;
            }
            else if (userNumber > randomNumber){
                System.out.println("Your guess it too high");
            }else if(userNumber < randomNumber){
                System.out.println("Your guess it too low");
            }else if (userNumber == randomNumber){
                System.out.println("You win!");
                break;
            }else{
                System.out.println("You input wrong number");
                i--;
            }
        }
    }
}
