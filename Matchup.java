/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbafantasycenter;

/**
 *
 * @author JackHotaling
 */
public class Matchup {
    private Team teamA, teamB;

    public Matchup(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }
    //return true if teamA wins the matchup and updates the wins and losses of teamA and teamB
    public void gameResult(){
        if (teamA.getTeamPerformPoints()>teamB.getTeamPerformPoints()){           
            teamA.addWin();teamB.addLoss();
            //return true;
        }
        
        else{
            teamA.addLoss();teamB.addWin();
            //return false;
        }
         
    }
}
