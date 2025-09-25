import java.util.ArrayList;

public class Team{
    private String teamName;	
    private int teamRank;
    private ArrayList<String> teamPlayers;
    
    public Team(){
        this.teamPlayers = new ArrayList<>();
    }
    
    public Team(String teamName){
        this.teamName = teamName;
        this.teamPlayers = new ArrayList<>();
    }
    
    public void setRank(int teamRank){
        this.teamRank = teamRank; 
        
    }
    
  
    public void addPlayer(String playerName){
        this.teamPlayers.add(playerName);
    }
    
   
    public String toString(){
        String result = "Team: " + teamName + " Rank: " + teamRank + "\nPlayers:\n";
        for(String player : teamPlayers){
            result += "- " + player + "\n";
        }
        return result;
    }
}