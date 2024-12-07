package nortondesafio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Nortondesafio {

    
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        
       //All Players 
       List<Player> Players = new ArrayList<>();
       
       //Default Guest Player
       Player guestPlayer = new Player(0, "Guest");
       Players.add(guestPlayer);
       
       //Start Game
        while (true) {
            System.out.println("""
                               Guessing Game
                               1 - Play
                               2 - Exit""");
       
            int option = keyboard.nextInt();
            keyboard.nextLine();
            
            switch (option) {
                case 1 -> SelectPlayer(Players, keyboard);
                case 2 -> {
                    System.out.println("Game Over");
                    System.exit(0);
               }
                default -> System.out.println("Invalid option.");
            }
        } 
    }
    
    public static void SelectPlayer(List<Player> Players, Scanner keyboard) {
        while (true) {
            System.out.println("""
                               Select Player:
                               1 - Show all players
                               2 - Create a new player
                               3 - Back to Guessing Game""");
            
            int selectPlayerOption = keyboard.nextInt();
            keyboard.nextLine();

            switch (selectPlayerOption) {
                case 1 -> showAllPlayers(Players , keyboard);
                case 2 -> createNewPlayer(Players, keyboard);
                case 3 -> {
                    return;  // Return to main Menu
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
    
    public static void showAllPlayers(List<Player> Players , Scanner keyboard) {
        while (true) {
            System.out.println("All Players:");

            //Show all Players
            for (Player i : Players) {
                System.out.println(i.id + " - " + i.name);
            }

            System.out.println("Select a player (enter player ID or 999 to return):");
            int selectedPlayerId;

            try {
                selectedPlayerId = keyboard.nextInt();
                keyboard.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid player ID or 999 to return.");
                keyboard.nextLine();
                continue;
            }

                if (selectedPlayerId == 999) {
                    return;  //Return to Select Player Menu
                }

            Player selectedPlayer = null;

            for (Player n : Players) {
                if (n.id == selectedPlayerId) {
                    selectedPlayer = n;
                }   
            }
            if (selectedPlayer != null) {
                    System.out.println("Player selected: " + selectedPlayer.name);
                    playGame(selectedPlayer, keyboard);
                    break;  // Break Loop when game End.
                } else {
                    System.out.println("Player not found. Please enter a valid player ID or 999 to return.");
                }
        }
    }
    
    public static void createNewPlayer(List<Player> Players, Scanner keyboard) {
        
        //Gets next available ID
        int newPlayerId = 1;
        
        for (Player x : Players) {
            if (x.id >= newPlayerId) {
                newPlayerId = x.id +1;
                
            }
        }

        System.out.println("Enter the name of the new player:");
        String newPlayerName = keyboard.nextLine();

        Player newPlayer = new Player(newPlayerId, newPlayerName);
        Players.add(newPlayer);

        System.out.println("New player created:");
        System.out.println("Name: " + newPlayer.name + " , ID: " + newPlayer.id);
    }
    
    public static void Game(Player selectedPlayer, Scanner keyboard){
        Round round = new Round();
        Random random = new Random();
        int secretNumber = random.nextInt(11);
        boolean win = false;
        int Guess;

        System.out.println("I think in a number between 1 and 10, try to guess!");

        for(int c = 0; c < 5; c++ ){
            System.out.println("Guess" + c + "/4");
            Guess = keyboard.nextInt();
            round.tryGuess(Guess);
            
            if(secretNumber == Guess){
                System.out.println("Congratulations, you guessed the number " + secretNumber);
                win = true;
                break;
            }else if(Guess < secretNumber){
                System.out.println("The Number is Higher");
            }else{
                System.out.println("The Number is Lower");
            }   
        }
        round.idPlayer = selectedPlayer.id;
        round.result = (win) ? "Win" : "Lose";
        round.secret = secretNumber;
        selectedPlayer.addHistory(round);

    System.out.println("End Game");
    }
    
    public static void playGame(Player selectedPlayer, Scanner keyboard) {
        Game(selectedPlayer,keyboard);
        System.out.println("""
                           1 - Play Again
                           2 - View Game History
                           3 - Back to Select Player""");
        

        int playOption = keyboard.nextInt();
        keyboard.nextLine();

        switch (playOption) {
            case 1 -> playGame(selectedPlayer, keyboard);
            case 2 -> viewGameHistory(selectedPlayer, keyboard);
            case 3 -> {
            return;
            }
        default -> System.out.println("Invalid option.");
        }   
    }
    
    public static void viewGameHistory(Player selectedPlayer , Scanner keyboard){
        System.out.println("Game history for player: " + selectedPlayer.name);
        int c = 0;
            for(Round round : selectedPlayer.history){
                System.out.println("Round: " + c++ + " Result: " + round.result + " Secret: " + round.secret + " All Guesses: " + round.guess);    
        }
    }
}
