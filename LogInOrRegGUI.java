package nbafantasycenter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JackHotaling
 */


/**
jh p1

ww p2

w1 p3

w2 p4

w3 p5

w4 p6*/
public class LogInOrRegGUI extends javax.swing.JFrame {

  
                
                  


    public LogInOrRegGUI() {
        initComponents();
        
        //test users:
        NbaFantasyCenter.addUser("Jack", "Hotaling", "jh", "p1");
        NbaFantasyCenter.addUser("Wen", "Wang", "ww", "p2");
        NbaFantasyCenter.addUser("Wen1", "Wang", "w1", "p3");
        NbaFantasyCenter.addUser("Wen2", "Wang", "w2", "p4");
        NbaFantasyCenter.addUser("Wen3", "Wang", "w3", "p5");
        NbaFantasyCenter.addUser("Wen4", "Wang", "w4", "p6");
        
        //test players:
        //dif teams
//        NbaFantasyCenter.addPguard(1.42, "player1", "NBA1", 2.00, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPfrontcourt(1.42, "player2", "NBA1", 2.09, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPguard(1.42, "player3", "NBA2", 2.01, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPfrontcourt(1.42, "player4", "NBA2", 2.03, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPfrontcourt(1.42, "player5", "NBA1", 2.00, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPguard(1.42, "player6", "NBA1", 2.09, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPfrontcourt(1.42, "player7", "NBA2", 2.01, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPguard(1.42, "player8", "NBA2", 2.03, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPfrontcourt(1.42, "player9", "NBA3", 2.00, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPfrontcourt(1.42, "player10", "NBA3", 2.09, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPguard(1.42, "player11", "NBA2", 2.01, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPfrontcourt(1.42, "player12", "NBA3", 2.03, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPfrontcourt(1.42, "player13", "NBA3", 2.00, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPguard(1.42, "player14", "NBA3", 2.09, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPfrontcourt(1.42, "player15", "NBA2", 2.01, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
//        NbaFantasyCenter.addPguard(1.42, "player16", "NBA2", 2.03, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel3.setText("NBA Fanta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jTextField2.setText("                       ");

        jTextField1.setText("                       ");

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setName(""); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email:");

        jLabel2.setText("Password:");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField3.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("NBA Fantasy Center");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        jLabel5.setText("Welcome to");

        jLabel6.setText("No account?");

        jButton2.setText("Log In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Write");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Read");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField3)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Log In:
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        NbaFantasyCenter.addUser("Jack", "Hotaling", "jh", "p1");
//        NbaFantasyCenter.addUser("Wen", "Wang", "ww", "p2");
        
        boolean b = NbaFantasyCenter.logIn(jTextField3.getText(), jPasswordField2.getText());
        if(b == true){
            //System.out.print("here0");
            NbaFantasyCenter.setCurrentUser(NbaFantasyCenter.getLastLoggedIn());
            HomeMenuGUI h = new HomeMenuGUI(NbaFantasyCenter.getCurrentUser());
            //System.out.print("here1");
            //HomeMenuGUI h = new HomeMenuGUI(); //here
            //System.out.print("here2");
            h.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No Such User");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

//Register:
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RegistrationFormGUI r = new RegistrationFormGUI();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //write
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
             FileOutputStream fos = new FileOutputStream("rs.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             
             oos.writeObject(NbaFantasyCenter.getAllUsers());
             oos.writeObject(NbaFantasyCenter.getAllLeagues());
             oos.writeObject(NbaFantasyCenter.getAllHistoricalLeagues());
             oos.writeObject(NbaFantasyCenter.getHisPlayerSimStats());
             
             oos.close();
             
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //read
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
             FileInputStream fis = new FileInputStream("rs.dat");
             ObjectInputStream ois = new ObjectInputStream(fis);
             
             LinkedList<User> users = (LinkedList<User>)ois.readObject();
             LinkedList<League> leagues = (LinkedList<League>)ois.readObject();
             LinkedList<League> histLeagues = (LinkedList<League>)ois.readObject();
             LinkedList<Player> hisPlayerSimStats = (LinkedList<Player>)ois.readObject();
             
             NbaFantasyCenter.setUsers(users);
             NbaFantasyCenter.setLeagues(leagues);
             NbaFantasyCenter.setHistoricalLeagues(histLeagues);
             NbaFantasyCenter.setHisPlayerSimStats(hisPlayerSimStats);
//             Customer.setNextId((int)ois.readObject());
//             RentalItem.setNextId((int)ois.readObject());
             //order in writing, order in reading
             
             ois.close();
             
        } catch (Exception e){
            System.out.println(e.toString());
        }
        
        
        //saved leagues:
        for(int i = 0; i< NbaFantasyCenter.getAllLeagues().size(); i++){
            if(NbaFantasyCenter.getAllLeagues().get(i) != null){
                System.out.print("Read Leagues..."+NbaFantasyCenter.getAllLeagues().get(i).getLeagueName());
            }
        }
        
//        HomeMenuGUI h = new HomeMenuGUI(currentUser);
//        h.setVisible(true);

        LogInOrRegGUI l = new LogInOrRegGUI();
        l.setVisible(true);
        this.dispose();
        
        /*NbaFantasyCenter.addPguard(1.42, "player1", "NBA1", 2.00, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 1);
        NbaFantasyCenter.addPfrontcourt(1.42, "player2", "NBA1", 2.09, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 1);
        NbaFantasyCenter.addPguard(1.42, "player3", "NBA2", 2.01, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 1);
        NbaFantasyCenter.addPfrontcourt(1.42, "player4", "NBA2", 2.03, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 1);
        NbaFantasyCenter.addPfrontcourt(1.42, "player5", "NBA1", 2.00, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 100);
        NbaFantasyCenter.addPguard(1.42, "player6", "NBA1", 2.09, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 102);
        NbaFantasyCenter.addPfrontcourt(1.42, "player7", "NBA2", 2.01, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 123);
        NbaFantasyCenter.addPguard(1.42, "player8", "NBA2", 2.03, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 46);
        NbaFantasyCenter.addPfrontcourt(1.42, "player9", "NBA3", 2.00, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 345);
        NbaFantasyCenter.addPfrontcourt(1.42, "player10", "NBA3", 2.09, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 234);
        NbaFantasyCenter.addPguard(1.42, "player11", "NBA2", 2.01, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 45);
        NbaFantasyCenter.addPfrontcourt(1.42, "player12", "NBA3", 2.03, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 93);
        NbaFantasyCenter.addPfrontcourt(1.42, "player13", "NBA3", 2.00, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 243);
        NbaFantasyCenter.addPguard(1.42, "player14", "NBA3", 2.09, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 198);
        NbaFantasyCenter.addPfrontcourt(1.42, "player15", "NBA2", 2.01, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 190);
        NbaFantasyCenter.addPguard(1.42, "player16", "NBA2", 2.03, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 159);
        NbaFantasyCenter.addPfrontcourt(1.42, "player17", "NBA4", 2.09, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 211);
        NbaFantasyCenter.addPguard(1.42, "player18", "NBA4", 2.01, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 201);
        NbaFantasyCenter.addPfrontcourt(1.42, "player19", "NBA4", 2.03, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 196);
        NbaFantasyCenter.addPfrontcourt(1.42, "player20", "NBA4", 2.00, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 204);
        NbaFantasyCenter.addPguard(1.42, "player21", "NBA5", 2.09, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 300);
        NbaFantasyCenter.addPfrontcourt(1.42, "player22", "NBA5", 2.01, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 98);
        NbaFantasyCenter.addPguard(1.42, "player23", "NBA5", 2.03, 3.00, 5.05, 1.00, 1.20, 1.03, 23.00, 245);*/
        
         //read the historical stats from text files
        Scanner s1=null,s2 = null;
        try {
            File f1 = new File("guard.txt");
            s1 = new Scanner(f1);
            while (s1.hasNextLine()) {
                String line=s1.nextLine();
                String[] stats = line.split(",");
//                for (String st : stats) {
//                    System.out.println(st);
//                }
//System.out.println(stats.length);
//System.out.println(stats[1]);
//         
                NbaFantasyCenter.addPguard(3.2,//Double.parseDouble(stats[0].trim()), 
                        stats[1].trim(), stats[2].trim(), Double.parseDouble(stats[3].trim()), 
                        Double.parseDouble(stats[4].trim()),
                        Double.parseDouble(stats[5].trim()), Double.parseDouble(stats[6].trim()), Double.parseDouble(stats[7].trim()), 
                        Double.parseDouble(stats[8].trim()),
                        Double.parseDouble(stats[9].trim()), Integer.parseInt(stats[10].trim()));

            }
        } 
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        } 
        finally {
            if (s1 != null)s1.close();
               }

        try {
            File f2 = new File("frontcourt.txt");
            s2 = new Scanner(f2);
            while (s2.hasNextLine()) {
                String[] stats = s2.nextLine().split(",");
                NbaFantasyCenter.addPfrontcourt(
                        Double.parseDouble(stats[0]), stats[1], stats[2], Double.parseDouble(stats[3]), Double.parseDouble(stats[4]),
                        Double.parseDouble(stats[5]), Double.parseDouble(stats[6]), Double.parseDouble(stats[7]), Double.parseDouble(stats[8]),
                        Double.parseDouble(stats[9]), Integer.parseInt(stats[10])
                );

            }
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        } finally {
            if (s2 != null) {
                s2.close();
            }
        }

        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(LogInOrRegGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInOrRegGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInOrRegGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInOrRegGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

//        //read the historical stats from text files
//        Scanner input = null;
//        try {
//            File file = new File("guard.csv");
//            input = new Scanner(file);
//            while (input.hasNextLine()) {
//                String[] stats = input.nextLine().split(",");
//                NbaFantasyCenter.addPguard(
//                        Double.parseDouble(stats[0]), stats[1], stats[2], Double.parseDouble(stats[3]), Double.parseDouble(stats[4]),
//                        Double.parseDouble(stats[5]), Double.parseDouble(stats[6]), Double.parseDouble(stats[7]), Double.parseDouble(stats[8]),
//                        Double.parseDouble(stats[9]), Integer.parseInt(stats[10])
//                );
//            }
//        } catch (IOException ioe) {
//            System.out.println(ioe.toString());
//        } finally {
//            if (input != null) {
//                input.close();
//            }
//        }
//
//        try {
//            File file = new File("frontcourt.csv");
//            input = new Scanner(file);
//            while (input.hasNextLine()) {
//                String[] stats = input.nextLine().split(",");
//                NbaFantasyCenter.addPfrontcourt(
//                        Double.parseDouble(stats[0]), stats[1], stats[2], Double.parseDouble(stats[3]), Double.parseDouble(stats[4]),
//                        Double.parseDouble(stats[5]), Double.parseDouble(stats[6]), Double.parseDouble(stats[7]), Double.parseDouble(stats[8]),
//                        Double.parseDouble(stats[9]), Integer.parseInt(stats[10])
//                );
//
//                System.out.println(stats[1]);
//            }
//        } catch (IOException ioe) {
//            System.out.println(ioe.toString());
//        } finally {
//            if (input != null) {
//                input.close();
//            }
//        }

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInOrRegGUI().setVisible(true);
                
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
