import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
       // 0 = Rock
       // 1 = Paper
       // 2 = scissor
       Scanner sc  = new Scanner(System.in);
       System.out.println("enter 0 for Rock \n 1 for paper \n 2 for Scissor");
       int userInput = sc.nextInt();

       Random random = new Random();
       int botInput = random.nextInt(3);

       if (userInput == botInput){
        System.out.println("Draw");
       } else if (userInput == 0 && botInput == 2 || userInput ==1  && botInput == 0
        || userInput ==2 && botInput ==1){
            System.out.println("User Win");

        }else {
            System.out.println("Bot Win");
        }
        if (botInput == 0){
            System.out.println("Bot Choice: Rock");
        }else if (botInput == 1){
            System.out.println("Bot Choice: paper");

        }else if (botInput == 2){
            System.out.println("Bot Choice: Scisser");
        }
    }
    }
