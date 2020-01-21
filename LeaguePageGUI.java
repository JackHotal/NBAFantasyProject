package nbafantasycenter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JackHotaling
 */
public class LeaguePageGUI extends javax.swing.JFrame {

    /**
     * Creates new form LeaguePage
     */
    public LeaguePageGUI() {
        initComponents();
    }
    
    
    public LeaguePageGUI(User currentUser, User selectedUser, League selectedLeague) {
        this();
        this.selectedUser = selectedUser;
        this.currentUser = currentUser;
        guiType = 1;
        this.currentLeague = selectedLeague;
        System.out.print("\ncurrentLeagueNAME: " + this.currentLeague.getLeagueName());
        jTextField3.setText(Double.toString(this.currentLeague.getBuyIn()));
        System.out.print("\ncurrentLeagueStatus: " + this.currentLeague.getLeagueStatus());
        jTextField1.setText(this.currentLeague.getLeagueStatus());
        jTextField4.setText(this.currentLeague.getLeagueName());
        jTextField2.setText(Double.toString(this.currentLeague.getBuyIn()*6));
        
//        DefaultTableModel model;
        
        User[] leagueMembers = currentLeague.getLeagueMembers();
        Team[] teamList = currentLeague.getTeamList();
        
        int o = 0;
        for(int i = 0; i<6; i++){
            if (leagueMembers[i] != null){
                //jTable1.setValueAt(leagueMembers[i].getFirstName(), i, 0);
                
                //testing
                jTable1.setValueAt(teamList[i].getUser().getFirstName(), i, 0);
                
                jTable1.setValueAt(teamList[i].getTeamName(), i, 1);
                jTable1.setValueAt(teamList[i].getWins(), i, 2);
                jTable1.setValueAt(teamList[i].getLosses(), i, 3);
                jTable1.setValueAt(teamList[i].getRank(), i, 4);

//                if ((teamList[i].getTeamStatus().equals("Finalized"))&&(currentLeague.getLeagueStatus().equals("Creating Teams"))){
//                    o++;
//                    System.out.print("\nFinalized Teams: "+o);
//                    if(o==6){
//                        currentLeague.setLeagueStatus("Complete");
//                        System.out.print("set??: "+currentLeague.getLeagueStatus());
//                        currentLeague.simulation();
//                        if(currentLeague.checkWinner(currentUser) == true){
//                            JOptionPane.showMessageDialog(null, "Congratulations! You won: "+(currentLeague.getBuyIn()*6));
//                        }
//                        //if (currentUser wins)
//                        LeaguePageGUI l = new LeaguePageGUI(currentUser, currentLeague);
//                        l.setVisible(true);
//                        this.dispose();
//                    }
//                }
            }
        }
        
    }
    
    
    public LeaguePageGUI(User currentUser, League currentLeague) {
        this();
        this.currentUser = currentUser;
        this.currentLeague = currentLeague;
        System.out.print("\ncurrentLeagueNAME: " + this.currentLeague.getLeagueName());
        jTextField3.setText(Double.toString(this.currentLeague.getBuyIn()));
        System.out.print("\ncurrentLeagueStatus: " + this.currentLeague.getLeagueStatus());
        jTextField1.setText(this.currentLeague.getLeagueStatus());
        jTextField4.setText(this.currentLeague.getLeagueName());
        jTextField2.setText(Double.toString(this.currentLeague.getBuyIn()*6));
        
//        DefaultTableModel model;
        
        User[] leagueMembers = currentLeague.getLeagueMembers();
        Team[] teamList = currentLeague.getTeamList();
        
        int o = 0;
        for(int i = 0; i<6; i++){
            if (leagueMembers[i] != null){
                //jTable1.setValueAt(leagueMembers[i].getFirstName(), i, 0);
                
                //testing
                jTable1.setValueAt(teamList[i].getUser().getFirstName(), i, 0);
                
                jTable1.setValueAt(teamList[i].getTeamName(), i, 1);
                jTable1.setValueAt(teamList[i].getWins(), i, 2);
                jTable1.setValueAt(teamList[i].getLosses(), i, 3);
                jTable1.setValueAt(teamList[i].getRank(), i, 4);

//                if ((teamList[i].getTeamStatus().equals("Finalized"))&&(currentLeague.getLeagueStatus().equals("Creating Teams"))){
//                    o++;
//                    System.out.print("\nFinalized Teams: "+o);
//                    if(o==6){
//                        currentLeague.setLeagueStatus("Complete");
//                        System.out.print("set??: "+currentLeague.getLeagueStatus());
//                        currentLeague.simulation();
//                        if(currentLeague.checkWinner(currentUser) == true){
//                            JOptionPane.showMessageDialog(null, "Congratulations! You won: "+(currentLeague.getBuyIn()*6));
//                        }
//                        //if (currentUser wins)
//                        LeaguePageGUI l = new LeaguePageGUI(currentUser, currentLeague);
//                        l.setVisible(true);
//                        this.dispose();
//                    }
//                }
            }
        }
        
//        if(currentLeague.checkWinner(currentUser) == true){
//            JOptionPane.showMessageDialog(null, "Congratulations! You won: "+(currentLeague.getBuyIn()*6));
//        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("League Page");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "League Member", "Team Name", "Wins", "Losses", "Rank"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setText("Standings:");

        jButton1.setText("Create My Team");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Return Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Prize:");

        jTextField2.setText("$30.00");

        jButton3.setText("Selected Team's Page");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("League Status:");

        jTextField1.setText("(Awaiting users, Creating teams, Complete)");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton4.setText("Join League");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Buy-In:");

        jTextField3.setText("$5.00");

        jTextField4.setText("jTextField4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    //return home
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        HomeMenuGUI h = new HomeMenuGUI(currentUser);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    //join league button:
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(guiType == 1){
            JOptionPane.showMessageDialog(null, "Can not join concluded league(as visitor)");
            return;
        }
        
        if (currentLeague.userPartOfLeague(currentUser) == false){
            if (currentUser.getCashBalance()>=currentLeague.getBuyIn()){
                currentLeague.addUserToLeagueMembers(currentUser);
                currentUser.subCash(currentLeague.getBuyIn());
                currentUser.addLeagueToUserLeagueList(currentLeague);
                JOptionPane.showMessageDialog(null, "Success! Remaining Cash:" + currentUser.getCashBalance());
                //display updated league member list:
                LeaguePageGUI l = new LeaguePageGUI(currentUser, currentLeague);
                l.setVisible(true);
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "Not Enough Cash. Current Balance:" + currentUser.getCashBalance());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Already In League");
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
    //create my team
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(guiType == 1){
            JOptionPane.showMessageDialog(null, "Can not join create team (as visitor)");
            return;
        }
        if (currentLeague.getLeagueStatus().equals("Creating Teams")){
            CreateMyTeamGUI c = new CreateMyTeamGUI(currentUser, currentLeague);
            //CreateMyTeamGUI c = new CreateMyTeamGUI(currentUser, currentLeague, currentTeam);
            c.setVisible(true);
            this.dispose();
        } else if(currentLeague.getLeagueStatus().equals("Awaiting Users")){
            JOptionPane.showMessageDialog(null, "League is Awaiting Users");
        } else if(currentLeague.getLeagueStatus().equals("Complete")){
            JOptionPane.showMessageDialog(null, "League is already Complete");
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    //GO TO SELECTED TEAMS PAGE
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if (currentLeague.getLeagueStatus().equals("Complete")){
            
            Team selectedTeam;
            if(jTable1.getSelectionModel().isSelectionEmpty() == false){
                int i = jTable1.getSelectionModel().getAnchorSelectionIndex();
                Team[] teamList = currentLeague.getTeamList();
                selectedTeam = teamList[i];
                
                //VISITOR TESTING
                if(guiType == 1){
                    JOptionPane.showMessageDialog(null, "Visiting a team page....");
                    FantasyTeamPageGUI f = new FantasyTeamPageGUI(selectedUser, currentLeague, selectedTeam); //current User, selected member
                    f.setVisible(true);
                    this.dispose();
                    return;
                }
            
                FantasyTeamPageGUI f = new FantasyTeamPageGUI(currentUser, currentLeague, selectedTeam); //current User, selected member
                f.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Select a team to view");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wait until league is in a completed status");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LeaguePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaguePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaguePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaguePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaguePageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    private User currentUser;
    private User selectedUser;
    private League currentLeague;
    private int guiType = 0;
}
