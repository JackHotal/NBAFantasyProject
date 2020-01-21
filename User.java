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
public class User implements Serializable {
    
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    
    //private int nbaPoints;
    private League[] userLeagueList = new League[3];
    private LinkedList<League> historicalLeagues = new LinkedList<>();
    private double cashBalance = 0.00;
    private double totalWinnings = 0.00;
    private int wins = 0;
    
    //get/set
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public double getCashBalance() {
        return cashBalance;
    }
    
    public League[] getUserLeagueList() {
        return userLeagueList;
    }
    
    public Boolean checkForMaxLeagues() {
        if (userLeagueList[2] == null){
            return false;
        } else {
            return true;
        }
    }
    
    public LinkedList<League> getHistoricalLeagues(){
        return historicalLeagues;
    }
    
    public double getTotalWinnings(){
        return totalWinnings;
    }
    
    public int getWins(){
        return wins;
    }
    
    
    //constructors
    public User(String firstName, String lastName, String email, String password){
        this.firstName = firstName; this.lastName = lastName;
        this.email = email; this.password = password;
        //System.out.print("user added ");
    }
    
    
    
    
    
    
    //methods
    public double addCash(double cash){
        cashBalance += cash;
        return cashBalance;
    }
    
    public double subCash(double cash){
        cashBalance -= cash;
        return cashBalance;
    }
    
    
    public void addWinnings(double prize){
        cashBalance+= prize;
        totalWinnings+= prize;
        wins++;
    }
    
    
    
    public void addLeagueToUserLeagueList(League league){
        for(int i = 0; i < userLeagueList.length; i++){
            if (userLeagueList[i] == null){
                userLeagueList[i] = league;
                break;
            }
        }
    }
    
    public void concludeLeague(League completedLeague){
        for(int i = 0; i<userLeagueList.length; i++){
            if((userLeagueList[i] != null)&&(userLeagueList[i] == completedLeague)){
                System.out.print("LEAGUE TO CONCLUDE???  "+userLeagueList[i].getLeagueName());
                userLeagueList[i] = null;
                historicalLeagues.add(completedLeague);
                
            }
        }
    }
    
}
