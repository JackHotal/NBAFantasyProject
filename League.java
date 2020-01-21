/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbafantasycenter;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author JackHotaling
 */
public class League implements Serializable {
    
    private String leagueName;
    private double buyIn = 0.00;
    
    private String leagueStatus = "Awaiting Users";
    
    private User[] leagueMembers = new User[6];
    private Team[] teamList = new Team[6];
    
    private Matchup[] matchupList = new Matchup[15];
    
    public String getLeagueName(){
        return leagueName;
    }
    
    public void setLeagueStatus(String string) {
        this.leagueStatus = string;
        System.out.print(leagueName + " " + string);
    }
    
    public String getLeagueStatus() {
        return leagueStatus;
    }
    
    public User[] getLeagueMembers() {
        return leagueMembers;
    }
    
    public Team[] getTeamList() {
        return teamList;
    }
    
    public double getBuyIn() {
        return buyIn;
    }
    

    public League(String leagueName, Double buyIn){
        this.leagueName = leagueName;
        this.buyIn = buyIn;
    }
    
    
    public boolean userPartOfLeague(User user){
        for (int i = 0; i < leagueMembers.length; i++){
            if(leagueMembers[i] != null){
                String userEmail = leagueMembers[i].getEmail();
                if (userEmail.equals(user.getEmail()) ){
                    return true;
                } 
            }    
        }
        return false;
    }
    
    public void addUserToLeagueMembers(User user){
        for (int i = 0; i < leagueMembers.length; i++){
            if(leagueMembers[i] == null) {
                leagueMembers[i] = user;
                Team t = new Team(user, NbaFantasyCenter.getCurrentUsersLeagueRefWithName(leagueName));
                teamList[i] = t;
                if(leagueMembers[5] != null){
                    setLeagueStatus("Creating Teams");
                }
                break;
            }
        }
    }
    
        //used to generate simulation stats line; not complete the randization part yet!!!!!!
    //leave the NbaPts and NbaTeam value the same!!!!
    private void generateSimStats() {
        for (Team team : teamList) {
            Player[] playerArray = team.getPlayerArray();
            for(Player player : playerArray){    
                //                if(playerArray[i] instanceof Pfrontcourt){
                double assist1 = (player.getAvgAssists() - 1) + (Math.random() * 2);
                double foul1 = (player.getAvgFouls() * Math.random() - 0.5) + (Math.random());
                double block1 = (player.getAvgBlocks() * Math.random() - 0.5) + (Math.random());
                double point1 = (player.getAvgPoints() - 2) + (Math.random() * 4);
                double rebound1 = (player.getAvgRebounds() - 1) + (Math.random() * 2);
                double steal1 = (player.getAvgSteals() - 0.5) + (Math.random());
                double turnover1 = (player.getAvgTurnovers() - 0.5) + (Math.random());
                double sepcialSkill = player.getSpecialityPoints() * (0.5 + Math.random());
                //set the generated stats
                player.setAvgAssists(assist1);
                player.setAvgFouls(foul1);
                player.setAvgBlocks(block1);
                player.setAvgPoints(point1);
                player.setAvgRebounds(rebound1);
                player.setAvgSteals(steal1);
                player.setAvgTurnovers(turnover1);
                player.setSpecialityPoints(sepcialSkill);
            }    
        }
    }

    //run the simulation
    public void simulation() {
        //go through the teamlist, 6 teams in the league, every team will have 5 matchups; in total C(6, 2)=15 matchups in total
        //each team should compete against any other team, 

        //generated random data for selected players! by going through the teamList 
        generateSimStats();

        //populate the matchuplist
        //for (Matchup matchup : matchupList) {
            for (int i = 0; i < teamList.length; i++) {
                int j=i+1;
                while (j < teamList.length) {

                    Matchup matchup = new Matchup(teamList[i], teamList[j]);
                    
                    matchup.gameResult();//run the simulation for the game
                    j++;
                    //System.out.println(j);
                }//populate the matchuplist like a triangle as a new matchup
               
//System.out.println(j); 
            }//go through teams one by one as the base team

       // }//end of populating the matchupList

    }
    //a method to sort team rank by number of wins
    //should be called after the simulation!\
    
    private LinkedList<Team> sortedList=new LinkedList<Team>();
    Team temp;//a team object called temp to store temperate top ranked team
    
    
    
    public void rankTeams() {
        for (int i = 0; i < teamList.length; i++) {
            temp = teamList[i];
            //while loop to go over the the team after the original team to find the highest ranked team
            
            
            //ystem.out.println(j);
//          System.out.println(temp.getWins());
//          System.out.println("fff");
            for(int j=1; j < (teamList.length-i); j++){
                
                if (teamList[j].getWins() >= teamList[j-1].getWins()) {
                    temp = teamList[j];
                    teamList[j]=teamList[j-1];
                    teamList[j-1]=temp;
                   
                }
               
      
               
            }//end of while
            //temp is the highest ranking team
            //temp.setRank(i + 1);
            
           //sortedList.add(temp);// put the top 
          
        }
        
      for(int i=0; i< teamList.length;i++){
            
            teamList[i].setRank(i+1);
        }
        
    }
    
    private User winner;
    
    public User getWinner(){
        return winner;
    }
    
    public boolean checkWinner(User currentUser){
        for (int i = 0; i < teamList.length; i++){
            if(teamList[i].getRank() == 1){ //award winner
                winner = teamList[i].getUser();
                winner.addWinnings(buyIn*6);
                if (teamList[i].getUser()==currentUser){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkFinalTeam(){
        int o = 0;
            for(int i = 0; i<6; i++){
                if (leagueMembers[i] != null){
                    if ((teamList[i].getTeamStatus().equals("Finalized"))&&(getLeagueStatus().equals("Creating Teams"))){
                        o++;
                        System.out.print("\nFinalized Teams: "+o);
                        
                        if(o==6){
                            setLeagueStatus("Complete");
                            System.out.print("\n\ncreating teams->complete: "+getLeagueStatus());
                            simulation();
                            rankTeams();
                            NbaFantasyCenter.addSimStatsList(teamList);
                            System.out.print(this.getLeagueName()); 
                            NbaFantasyCenter.concludeLeague(this);
                            return true;
                        }
                    }
                }
            }
            return false;
    }
    
}    

