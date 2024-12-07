package nortondesafio;

import java.util.ArrayList;
import java.util.List;


public class Player {
    public int id;
    public String name;
    public List<Round> history;
    
    //Constructor 

    public Player(int id , String name) {
        this.id = id;
        this.name = name;
        this.history = new ArrayList<>();
    }
    
    //Methods
    
    public void addHistory(Round current) {
    this.history.add(current);
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", name=" + name + ", history=" + history + '}';
    }
    
    
}
