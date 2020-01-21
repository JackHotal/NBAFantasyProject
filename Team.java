/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbafantasycenter;

import java.io.Serializable;

/**
 *
 * @author JackHotaling
 */
public class Team implements Serializable{
    
    private User user;
    
    public User getUser(){
    return user;
    }
    
    private League league;
    
    private String teamName = "undetermined";
    
    private int wins = 0;
    private int losses = 0;
    private int rank = 0;
    
    //private Pfrontcourt[] frontCourtList = new Pfrontcourt[3];
    //private Pguard[] guardList = new Pguard[2];
    //vs
    //IF HAVE TIME
    private Player[] playerArray = new Player[5];
    private int fCount;
    private int gCount;
    
    public int getFCount() {
        return fCount;
    }
    
    public int getGCount() {
        return gCount;
    }
    
    public Player[] getPlayerArray(){
        return playerArray;
    }
    
    
    private int availableNbaPts = 200;
    
    public int getAvailableNbaPts(){
        return availableNbaPts;
    }
    
    private String teamStatus = "In Progress";
    
    public void setTeamStatus(String status){
        teamStatus = status;
    }
    
    public String getTeamStatus (){
        return teamStatus;
    }
    

    
    public Team(User user, League league){
        this.user = user;
        this.league = league;
    }
    
    public Team(){}
    
    
    
    
    
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public double getTeamPerformPoints() {
        double sum = 0;
        for (Player player : playerArray) {
            sum += player.getPerformPoints();
        }

        return sum;
    }

    public void addWin() {
        wins++;
    }

    public void addLoss() {
        losses++;
    }

    
    public boolean addPlayer(Player player){ //not allowed to add the same player + check for max players
         
        for(int i = 0; i<playerArray.length; i++){
            if(playerArray[i] == null){
                if ((player != playerArray[0])&&(player != playerArray[1])&&(player != playerArray[2])&&(player != playerArray[3])&&(player != playerArray[4])){                 // ensure no duplicate players
//                    System.out.print("player: "+player.getPlayerName());
//                    System.out.print("player: "+playerArray[i].getPlayerName());
                    playerArray[i] = player;
                    availableNbaPts -= player.getNbaPts();
                    System.out.print("?....."+playerArray[i].getPlayerName()); // testing
                    if(player instanceof Pfrontcourt){
                        fCount++;
                    } else {
                        gCount++;
                    }
                    return true;
                }
                return false;
            }
        }
        return false;
    }        
    
    public boolean dropPlayer(Player player){
            if(player instanceof Pfrontcourt){
                for(int i = 0; i<playerArray.length; i++){
                    if(playerArray[i]==player){
                       playerArray[i] = null;
                       availableNbaPts += player.getNbaPts();
                       fCount--;
                       return true;
                    }
                }
            }
            if(player instanceof Pguard){
                for(int i = 0; i<playerArray.length; i++){
                    if(playerArray[i]==player){
                       playerArray[i] = null;
                       availableNbaPts += player.getNbaPts();
                       gCount--;
                       return true;
                    }
                }
            }
        return false;
    }
    
}
