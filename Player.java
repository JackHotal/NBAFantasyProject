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
public abstract class Player implements Serializable {
    
   private String playerName, nbaTeam;
    private double avgPoints, avgRebounds, avgAssists, avgSteals,avgBlocks, avgTurnovers, avgFouls;
    private int nbaPts;
    
    
    
    
    //constructors
    public Player(String playerName, String nbaTeam, Double avgPoints, Double avgRebounds, Double avgAssists, Double avgSteals, Double avgBlocks, Double avgTurnovers, Double avgFouls, int nbaPts) {
        this.playerName = playerName; this.nbaTeam = nbaTeam; this.avgPoints = avgPoints; this.avgRebounds = avgRebounds;
        this.avgAssists = avgAssists; this.avgSteals = avgSteals; this.avgBlocks = avgBlocks;
        this.avgTurnovers = avgTurnovers; this.avgFouls = avgFouls; this.nbaPts = nbaPts;
    }
    
    
    //SPECIAL PERFORM POINTS BY TYPE -- ABSTRACT //these two methods are unnecessary
    
    public abstract double getSpecialityPoints();
    
    public abstract void setSpecialityPoints(double pts);
    


    public void setNbaPts(int pts){
        nbaPts = pts; //----- necessary??? Why not!
    }
    
    public int getNbaPts(){
        return nbaPts;
    }
    
    public String getNbaTeam() {
        return nbaTeam;
    }

    public void setNbaTeam(String nbaTeam) {
        this.nbaTeam = nbaTeam;
    }
    
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getAvgPoints() {
        return avgPoints;
    }

    public void setAvgPoints(double avgPoints) {
        this.avgPoints = avgPoints;
    }

    public double getAvgRebounds() {
        return avgRebounds;
    }

    public void setAvgRebounds(double avgRebounds) {
        this.avgRebounds = avgRebounds;
    }

    public double getAvgAssists() {
        return avgAssists;
    }

    public void setAvgAssists(double avgAssists) {
        this.avgAssists = avgAssists;
    }

    public double getAvgSteals() {
        return avgSteals;
    }

    public void setAvgSteals(double avgSteals) {
        this.avgSteals = avgSteals;
    }

    public double getAvgBlocks() {
        return avgBlocks;
    }

    public void setAvgBlocks(double avgBlocks) {
        this.avgBlocks = avgBlocks;
    }

    public double getAvgTurnovers() {
        return avgTurnovers;
    }

    public void setAvgTurnovers(double avgTurnovers) {
        this.avgTurnovers = avgTurnovers;
    }

    public double getAvgFouls() {
        return avgFouls;
    }

    public void setAvgFouls(double avgFouls) {
        this.avgFouls = avgFouls;
    }
    
    
    //wench     NEED ALL GET AND SET???  no need!
    public double getPerformPoints(){
        return avgPoints*1+avgRebounds*2+avgAssists*2+avgSteals*4+avgBlocks*4-avgTurnovers*2-avgFouls*1;
    }
}
