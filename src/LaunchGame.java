import java.util.Scanner;

class Guesser{
    int guessNum;
    public int guessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please kindly guess the Number From 1 to 10::");
        guessNum = sc.nextInt();
        if(guessNum < 1 || guessNum > 10){
            System.out.println("Enter a valid Number!");
            guessNumber();
        }
        return guessNum;
    }
}

class Player{
    int playerGuessNumber;
    public int guessNumber(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Player Kindly Guess the Number Between 1 to 10::");
            playerGuessNumber = sc.nextInt();
            if(playerGuessNumber < 1 || playerGuessNumber > 10){
                System.out.println("Please Enter a valid Number!");
                guessNumber();
            }
        return playerGuessNumber;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumberFromGuesser(){
        Guesser gu = new Guesser();
        numFromGuesser = gu.guessNumber();
    }

    public void collectNumberFromPlayers(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNumber();
        numFromPlayer2 = p2.guessNumber();
        numFromPlayer3 = p3.guessNumber();
    }

    public void compare(){
        collectNumberFromGuesser();
        collectNumberFromPlayers();
        if(numFromPlayer1 == numFromGuesser){
            if(numFromPlayer1 == numFromPlayer2 && numFromPlayer1 == numFromPlayer3){
                System.out.println("Game tied, All players Guessed the Number correctely");
            }else if(numFromPlayer1 == numFromPlayer2){
                System.out.println("Player1 and player2 Gueesed the number correctly");
            }else if(numFromPlayer1 == numFromPlayer3){
                System.out.println("Player1 and player3 Won the match!");
            }
            else{
                System.out.println("Player1 Guessed the correct Number !");
            }
        }
        else if(numFromPlayer2 == numFromGuesser){
            if(numFromPlayer2 == numFromPlayer3){
                System.out.println("Player2 and Player3 guessed the correct Number!");
            }else{
                System.out.println("Player2 Won the game");
            }
        }
        else if(numFromPlayer3 == numFromGuesser){
            System.out.println("Player3 Won the match !");
        }
        else{
            System.out.println("Sorry! Game Lost no one guess the correct Number.");
        }
    }
}

public class LaunchGame{
    public static void main(String args[]){
        Umpire um = new Umpire();
        um.compare();
    }
}