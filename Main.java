import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int b = rand.nextInt(11);
        int attempts = 3;
        boolean won = false;
        int ammountat = 0;

        for(int i = 0; i < attempts; i++){
            
            if(i == 0) {
                System.out.println("Guess a number between 0 and 10 (attempt 1)");
            } else {
                System.out.println("Try again (attempt: " + (i + 1) + ")");
            }
            
            boolean validInput = false;
            while(!validInput) {
                if(sc.hasNextInt()){
                    ammountat += 1;
                    int a = sc.nextInt();
                    validInput = true;
                    
                    if(a == b){
                        System.out.println("You Win! It took you " + ammountat + "attempts");
                        won = true;
                        break;
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer between 0 and 10.");
                    sc.next(); // consume the invalid input
                }
            }
            
            if(won) break;
        }
        
        if(!won){
            System.out.println("Game over! The number was: " + b);
        }
        sc.close();
    }
}