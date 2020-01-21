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


public class Pguard extends Player {
    
    private double turnAssistsRatio;

    public Pguard(double turnAssistsRatio, String playerName, String nbaTeam, double avgPoints, double avgRebounds, double avgAssists, double avgSteals, double avgBlocks, double avgTurnovers, double avgFouls, int nbaPts) {
        super(playerName, nbaTeam, avgPoints, avgRebounds, avgAssists, avgSteals, avgBlocks, avgTurnovers, avgFouls, nbaPts);
        this.turnAssistsRatio=avgTurnovers/avgAssists;
    }
    
    //check if turnover and assists ratio is less than .2. if so, return true, and the guards will get bonus points on the nba performance points
    private boolean checkSteals(){
        return turnAssistsRatio<0.2;
    }
    
    
    //Speciality Points - override abstract We actually don't need these two method!!
    @Override
    public double getSpecialityPoints() {
        return turnAssistsRatio;
    }
    
    @Override
    public void setSpecialityPoints(double pts) {
        turnAssistsRatio = pts;
    }
     
    @Override
    public double getPerformPoints(){
        if (checkSteals()==true){
            return super.getPerformPoints()+ 10*(1-turnAssistsRatio);
        }
        
        return super.getPerformPoints();
    }

//    public double getTurnAssistsRatio() {
//        return turnAssistsRatio;
//    }
//
//    public void setTurnAssistsRatio(double turnAssistsRatio) {
//        this.turnAssistsRatio = turnAssistsRatio;
//    }
    
}
