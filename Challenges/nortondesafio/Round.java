
package nortondesafio;

import java.util.ArrayList;
import java.util.List;

public class Round {
    public int idPlayer;
    public int secret;
    public String result;
    public List<Integer> guess;
    
    //Constructor
    public Round() {
        this.guess = new ArrayList<>();
    }
    
    //Test Metods
    
    public void tryGuess(int guess){
        this.guess.add(guess);
    }  
}
