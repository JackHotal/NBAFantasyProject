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
public class Pfrontcourt extends Player{
        
    private double offRebRatio;

    public Pfrontcourt(double offRebRatio, String playerName, String nbaTeam, double avgPoints, double avgRebounds, double avgAssists, double avgSteals, double avgBlocks, double avgTurnovers, double avgFouls, int nbaPts) {
        super(playerName, nbaTeam, avgPoints, avgRebounds, avgAssists, avgSteals, avgBlocks, avgTurnovers, avgFouls, nbaPts);
        this.offRebRatio=offRebRatio;
    }
    //check if offence rebound ratio is over .5, return true, and the frontcourt will get bonus points on the nba performance points
    private boolean checkOffRebRatio(){
        return offRebRatio>0.5;
    }
     
    //Speciality Points - override abstract actually don't need them
    @Override
    public double getSpecialityPoints() {
        return offRebRatio;
    }
    
    @Override
    public void setSpecialityPoints(double pts) {
        offRebRatio = pts;
    }
     
    @Override
    public double getPerformPoints(){
        if (checkOffRebRatio()==true){
            return super.getPerformPoints()+ 10*offRebRatio;
        }
        
        return super.getPerformPoints();
    }

//    public double getOffRebRatio() {
//        return offRebRatio;
//    }
//
//    public void setOffRebRatio(double offRebRatio) {
//        this.offRebRatio = offRebRatio;
//    }
    
}
