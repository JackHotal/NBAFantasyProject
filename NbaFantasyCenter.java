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
public class NbaFantasyCenter implements Serializable {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NbaFantasyCenter n = new NbaFantasyCenter();
        LogInOrRegGUI l = new LogInOrRegGUI();
        l.setVisible(true);
        
        //test data for login:
        //NbaFantasyCenter.addUser("Jack", "Hotaling", "jackhotalufl.edu", "Password1");
    }
    
    private static LinkedList<Player> hisPlayerSimStats = new LinkedList<>();
    
    public static LinkedList<Player> getHisPlayerSimStats(){
        return hisPlayerSimStats;
    }
    
    public static void setHisPlayerSimStats(LinkedList<Player> h){
        hisPlayerSimStats = h;
    }

    public static void addSimStatsList(Team[] teamList) {
        for (Team team : teamList) {
            for (Player player : team.getPlayerArray()) {
                hisPlayerSimStats.add(player);
            }
        }
        System.out.print("\n\n\n"+hisPlayerSimStats.get(1).getPlayerName());
    } 

    static Player temp;

    public static void rankPlayers() {

        for (int i = 0; i < hisPlayerSimStats.size(); i++) {
            System.out.print(hisPlayerSimStats.get(i).getPlayerName());
            if (hisPlayerSimStats.get(i) != null){
                temp.equals(hisPlayerSimStats.get(i));
            }
            

            for (int j = 1; j < (hisPlayerSimStats.size() - i); j++) {
                if (((Pfrontcourt) hisPlayerSimStats.get(j)).getPerformPoints() >= hisPlayerSimStats.get(j - 1).getPerformPoints()) {
                    temp = hisPlayerSimStats.get(j);
                    hisPlayerSimStats.get(j).equals(hisPlayerSimStats.get(j - 1));
                    hisPlayerSimStats.get(j - 1).equals(temp);

                }

            }

        }

    }
    
    private static LinkedList<Player> players = new LinkedList<>();
    
    public static LinkedList<Player> getPlayers() {
        return players;
    }
    
    private static LinkedList<User> users = new LinkedList<>();
    
    private static LinkedList<League> allHistoricalLeagues = new LinkedList<>();
    
    private static User currentUser;
    
    private static User lastLoggedIn;
    
    public static User getLastUserAdded(){
        return users.getLast();
    }
    
    public static void setCurrentUser(User user){
        currentUser = user;
        System.out.print("\n\n\n||Current User:" + user.getFirstName());
    }
    
    public static User getCurrentUser(){
        return currentUser;
    }
    
    public static LinkedList<User> getAllUsers() {
        return users;
    }
    
    public static User getLastLoggedIn(){
        return lastLoggedIn;
    }
    
  
    private static LinkedList<League> leagues = new LinkedList<>();
    
    private static League currentLeague;
    
    //write 
    public static void setLeagues(LinkedList<League> leagues1) { leagues = leagues1; }
    public static void setUsers(LinkedList<User> user1) { users = user1; }
    public static void setHistoricalLeagues(LinkedList<League> leagues2) { allHistoricalLeagues = leagues2; }
    
    public static LinkedList<League> getAvailableLeagues(){
        //+leagues current user is not a part of
        LinkedList<League> availableLeagues = new LinkedList<>();
        for(int i = 0; i < leagues.size(); i++){
            if(leagues.get(i) != null){
                
                
                //MONITOR LIST OF LEAGUES
                //nbafantasycenter.User cannot be cast to nbafantasycenter.League?????
//                System.out.print("\nAVAILABLE LEAGUE LIST***: "+leagues.get(i).getLeagueName());
                if(leagues.get(i).getLeagueStatus().equals("Awaiting Users")){
                    User[] leagueMembers = leagues.get(i).getLeagueMembers();
                    //for(int e = 0; e<leagueMembers.length; e++) {             ----- loop logic???
                        if (leagueMembers[0] != currentUser && leagueMembers[1] != currentUser &&
                            leagueMembers[2] != currentUser && leagueMembers[3] != currentUser &&
                            leagueMembers[4] != currentUser && leagueMembers[5] != currentUser){   
                                availableLeagues.add(leagues.get(i));
                        }

                    //}

                    //availableLeagues.add(leagues.get(i));
                }
            }
        }
        return availableLeagues;
    }
    
    public static League getAvailableLeagueByName(String leagueName){
        LinkedList<League> availableLeagues = getAvailableLeagues();
        
        for(int i = 0; i<availableLeagues.size(); i++){
            if (availableLeagues.get(i).getLeagueName().equals(leagueName)){
                return availableLeagues.get(i);
            }
        }
        
        return availableLeagues.get(0); // INCORRECT LOGIC!!!!!!!!!!!!!!!!!!!!
        
    }
    
    
    public static League[] getMyLeagues(){
        League[] leagues = currentUser.getUserLeagueList();
        
//        if (leagues[2] != null){
//            String leagueName = leagues[2].getLeagueName();
//            System.out.print("NBA Fantasy Center league in element 3: " + leagueName);
//        }
        
        //System.out.print("NBA Fantasy Center league in element 3: " + leagueName);
        return currentUser.getUserLeagueList();
    }
    
    public static LinkedList<League> getAllLeagues() {
        return leagues;
    }
    
    public static LinkedList<League> getAllHistoricalLeagues() {
        return allHistoricalLeagues;
    }
    
    
    
    
    public static void addUser(String firstName, String lastName, String email, String password) {
        User u = new User(firstName, lastName, email, password);
        users.add(u);
        //addToUserList(u);
    }
    
    public static void addLeague(String leagueName, Double buyIn) {
        League l = new League(leagueName, buyIn);
        leagues.add(l);
        //add to list
        //assign to user
        currentUser.addLeagueToUserLeagueList(l);
    }
    
    // addTeam in League class??
    
    //add NBA player types
//    public static void addPlayer(String name, String nbaTeam, Double avgPoints, Double avgRebounds, Double avgAssists, Double avgSteals, Double avgBlocks, Double avgTurnovers, Double avgFouls) {
//        Player p = new Player(name, nbaTeam, avgPoints, avgRebounds, avgAssists, avgSteals, avgBlocks, avgTurnovers, avgFouls);
//        players.add(p);
//    }
    
    public static void addPguard(Double turnAssistsRatio, String name, String nbaTeam, Double avgPoints, Double avgRebounds, Double avgAssists, Double avgSteals, Double avgBlocks, Double avgTurnovers, Double avgFouls, int nbaPts) {
        Player p = new Pguard(turnAssistsRatio, name, nbaTeam, avgPoints, avgRebounds, avgAssists, avgSteals, avgBlocks, avgTurnovers, avgFouls, nbaPts);
        players.add(p);
    }
    
    public static void addPfrontcourt(Double offRebRatio, String name, String nbaTeam, Double avgPoints, Double avgRebounds, Double avgAssists, Double avgSteals, Double avgBlocks, Double avgTurnovers, Double avgFouls, int nbaPts) {
        Player p = new Pfrontcourt(offRebRatio, name, nbaTeam, avgPoints, avgRebounds, avgAssists, avgSteals, avgBlocks, avgTurnovers, avgFouls, nbaPts);
        players.add(p);
    }
    
    public static Player searchPlayer(int i){
        return players.get(i);
    }
    
    //public static void assignLeagueToUser??????
    
    
    //boolean?
    public static boolean logIn(String email, String password) {
        String e = email; String p = password;
        
        for(int i = 0; i < users.size(); i++) {
            if(e.equals(users.get(i).getEmail())){
                //System.out.print("matching user!");
                if(p.equals(users.get(i).getPassword())){
                    lastLoggedIn = users.get(i);
                    return true;
                }
            }
        }
        return false;
    }
    
    //public static void addUserToList
    
    public static League getCurrentUsersLeagueRefWithName(String leagueName) {
        League[] currentUsersLeagues = currentUser.getUserLeagueList();
        //
        //System.out.print("\n%%%%%%%"+currentUser.getFirstName());
        //System.out.print("%%%%%%%"+currentLeague);
        for (int i = 0; i < currentUsersLeagues.length; i++){
            //
            if (currentUsersLeagues[i] != null) {
        //        System.out.print("    !@#"+currentUsersLeagues[i].getLeagueName());
                if (currentUsersLeagues[i].getLeagueName().equals(leagueName)){
                    return currentUsersLeagues[i];
                }
            }
        }
        return currentUsersLeagues[0]; // INCORRECT LOGIC!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
    
    
    public static League getHistLeagueRefWithName(String leagueName) {
        
        for (int i = 0; i < allHistoricalLeagues.size(); i++){
            //
            if (allHistoricalLeagues.get(i) != null) {
        //        System.out.print("    !@#"+currentUsersLeagues[i].getLeagueName());
                if (allHistoricalLeagues.get(i).getLeagueName().equals(leagueName)){
                    return allHistoricalLeagues.get(i);
                }
            }
        }
        return allHistoricalLeagues.get(0); // INCORRECT LOGIC!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
    
    
    public static void concludeLeague(League finishedLeague){
        System.out.print(finishedLeague.getLeagueName());
        allHistoricalLeagues.add(finishedLeague);
    }
    
    
    
    
    
    
    
}
