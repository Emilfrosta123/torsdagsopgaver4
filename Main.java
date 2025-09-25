public class Main{
    public static void main (String[]args){
        Team team = new Team("United");
        team.setRank(2);
        
        team.addPlayer("Emil");
        team.addPlayer("Marcus");
        team.addPlayer("Sofus");
        
        System.out.println(team.toString());
    }

}
