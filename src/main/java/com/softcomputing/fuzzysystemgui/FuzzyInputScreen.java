package com.softcomputing.fuzzysystemgui;

import com.softcomputing.fuzzysystem.FuzzyRuleSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author oguz
 */
public class FuzzyInputScreen extends JFrame {
    
    public FuzzyInputScreen() {

        initComponents();

        firstRuleResult.setEditable(false);
        secondRuleResult.setEditable(false);
        thirdRuleResult.setEditable(false);
        fourthRuleResult.setEditable(false);

        this.setResizable(false);

        for (int i = 1; i <= 100; i++) {
            distanceInputCombobox.addItem(i);
        }

        for (int i = 0; i <= 200; i++) {
            speedInputCombobox.addItem(i);
        }

       
        final FuzzyRuleSet ruleSet = new FuzzyRuleSet();

        String firstSpeed = firstSpeedRule.getSelectedItem().toString();
        String firstDistance = firstDistanceRule.getSelectedItem().toString();
        String firstRuleOutput = ruleSet.getOutput(firstSpeed + "-" + firstDistance);

        String secondSpeed = secondSpeedRule.getSelectedItem().toString();
        String secondDistance = secondDistanceRule.getSelectedItem().toString();
        String secondRuleOutput = ruleSet.getOutput(secondSpeed + "-" + secondDistance);

        String thirdSpeed = thirdSpeedRule.getSelectedItem().toString();
        String thirdDistance = thirdDistanceRule.getSelectedItem().toString();
        String thirdRuleOutput = ruleSet.getOutput(thirdSpeed + "-" + thirdDistance);

        String fourthSpeed = fourthSpeedRule.getSelectedItem().toString();
        String fourthDistance = fourthDistanceRule.getSelectedItem().toString();
        String fourthRuleOutput = ruleSet.getOutput(fourthSpeed + "-" + fourthDistance);

        firstRuleResult.setText(firstRuleOutput);
        secondRuleResult.setText(secondRuleOutput);
        thirdRuleResult.setText(thirdRuleOutput);
        fourthRuleResult.setText(fourthRuleOutput);

        firstSpeedRule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = firstSpeedRule.getSelectedItem().toString();
                String d = firstDistanceRule.getSelectedItem().toString();
                String ss = ruleSet.getOutput(s + "-" + d);
                firstRuleResult.setText(ss);
            }
        });

        firstDistanceRule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = firstSpeedRule.getSelectedItem().toString();
                String d = firstDistanceRule.getSelectedItem().toString();
                String ss = ruleSet.getOutput(s + "-" + d);
                firstRuleResult.setText(ss);
            }
        });

        secondSpeedRule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = secondSpeedRule.getSelectedItem().toString();
                String d = secondDistanceRule.getSelectedItem().toString();
                String ss = ruleSet.getOutput(s + "-" + d);
                secondRuleResult.setText(ss);
            }
        });

        secondDistanceRule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = secondSpeedRule.getSelectedItem().toString();
                String d = secondDistanceRule.getSelectedItem().toString();
                String ss = ruleSet.getOutput(s + "-" + d);
                secondRuleResult.setText(ss);
            }
        });

        thirdSpeedRule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = thirdSpeedRule.getSelectedItem().toString();
                String d = thirdDistanceRule.getSelectedItem().toString();
                String ss = ruleSet.getOutput(s + "-" + d);
                thirdRuleResult.setText(ss);
            }
        });

        thirdDistanceRule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = thirdSpeedRule.getSelectedItem().toString();
                String d = thirdDistanceRule.getSelectedItem().toString();
                String ss = ruleSet.getOutput(s + "-" + d);
                thirdRuleResult.setText(ss);
            }
        });

        fourthSpeedRule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = fourthSpeedRule.getSelectedItem().toString();
                String d = fourthDistanceRule.getSelectedItem().toString();
                String ss = ruleSet.getOutput(s + "-" + d);
                fourthRuleResult.setText(ss);
            }
        });

        fourthDistanceRule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = fourthSpeedRule.getSelectedItem().toString();
                String d = fourthDistanceRule.getSelectedItem().toString();
                String ss = ruleSet.getOutput(s + "-" + d);
                fourthRuleResult.setText(ss);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        speedLabel = new javax.swing.JLabel();
        speedInputCombobox = new javax.swing.JComboBox();
        distanceLabel = new javax.swing.JLabel();
        distanceInputCombobox = new javax.swing.JComboBox();
        firstSpeedRule = new javax.swing.JComboBox();
        firstDistanceRule = new javax.swing.JComboBox();
        secondSpeedRule = new javax.swing.JComboBox();
        secondDistanceRule = new javax.swing.JComboBox();
        thirdSpeedRule = new javax.swing.JComboBox();
        thirdDistanceRule = new javax.swing.JComboBox();
        fourthSpeedRule = new javax.swing.JComboBox();
        fourthDistanceRule = new javax.swing.JComboBox();
        firstRuleOutput = new javax.swing.JLabel();
        secondRuleOutput = new javax.swing.JLabel();
        ThirdRuleOutput = new javax.swing.JLabel();
        fourthRuleOutput = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstRuleResult = new javax.swing.JTextField();
        secondRuleResult = new javax.swing.JTextField();
        thirdRuleResult = new javax.swing.JTextField();
        fourthRuleResult = new javax.swing.JTextField();
        analysisButton = new javax.swing.JButton();
        speedMembershipGraphButton = new javax.swing.JButton();
        distanceMembershipGraphButton = new javax.swing.JButton();
        speedChangeMembershipGraphButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        speedLabel.setText("Speed");

        distanceLabel.setText("Distance");

        firstSpeedRule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Very Slow", "Slow", "Medium", "Fast", "Very Fast" }));

        firstDistanceRule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Very Close", "Close", "Normal", "Away" }));

        secondSpeedRule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Very Slow", "Slow", "Medium", "Fast", "Very Fast" }));

        secondDistanceRule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Very Close", "Close", "Normal", "Away" }));

        thirdSpeedRule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Very Slow", "Slow", "Medium", "Fast", "Very Fast" }));

        thirdDistanceRule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Very Close", "Close", "Normal", "Away" }));

        fourthSpeedRule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Very Slow", "Slow", "Medium", "Fast", "Very Fast" }));

        fourthDistanceRule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Very Close", "Close", "Normal", "Away" }));

        jLabel1.setText("and");

        jLabel2.setText("then");

        jLabel3.setText("and");

        jLabel4.setText("then");

        jLabel5.setText("and");

        jLabel6.setText("then");

        jLabel7.setText("and");

        jLabel8.setText("then");

        analysisButton.setText("ANALYZE");
        analysisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysisButtonActionPerformed(evt);
            }
        });

        speedMembershipGraphButton.setText("Speed Membership");
        speedMembershipGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedMembershipGraphButtonActionPerformed(evt);
            }
        });

        distanceMembershipGraphButton.setText("Distance Membership");
        distanceMembershipGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanceMembershipGraphButtonActionPerformed(evt);
            }
        });

        speedChangeMembershipGraphButton.setText("Speed Change Membership");
        speedChangeMembershipGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedChangeMembershipGraphButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(speedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstSpeedRule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondSpeedRule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdSpeedRule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourthSpeedRule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(speedInputCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(speedMembershipGraphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addComponent(jLabel5))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(distanceMembershipGraphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(distanceLabel)
                    .addComponent(firstDistanceRule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondDistanceRule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdDistanceRule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourthDistanceRule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(distanceInputCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(speedChangeMembershipGraphButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourthRuleResult, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thirdRuleResult, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondRuleResult, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstRuleResult, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstRuleOutput)
                    .addComponent(secondRuleOutput)
                    .addComponent(ThirdRuleOutput)
                    .addComponent(fourthRuleOutput))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(analysisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedLabel)
                    .addComponent(distanceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedInputCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distanceInputCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstSpeedRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstDistanceRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstRuleOutput)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstRuleResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(secondSpeedRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(secondDistanceRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(secondRuleOutput)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(secondRuleResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thirdSpeedRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirdDistanceRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThirdRuleOutput)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(thirdRuleResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourthSpeedRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourthDistanceRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourthRuleOutput)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(fourthRuleResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedMembershipGraphButton)
                    .addComponent(distanceMembershipGraphButton)
                    .addComponent(speedChangeMembershipGraphButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(analysisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analysisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysisButtonActionPerformed

        try {
            controlOutputsWhetherDifferent();
            Graphics graphicScreen = new Graphics();
            
            String firstSpeedString = firstSpeedRule.getSelectedItem().toString();
            String firstDistanceString = firstDistanceRule.getSelectedItem().toString();
            String firstMotorSpeedChangeString = firstRuleResult.getText();
            
            String secondSpeedString = secondSpeedRule.getSelectedItem().toString();
            String secondDistanceString = secondDistanceRule.getSelectedItem().toString();
            String secondMotorSpeedChangeString = secondRuleResult.getText();
            
            String thirdSpeedString = thirdSpeedRule.getSelectedItem().toString();
            String thirdDistanceString = thirdDistanceRule.getSelectedItem().toString();
            String thirdMotorSpeedChangeString = thirdRuleResult.getText();
            
            String fourthSpeedString = fourthSpeedRule.getSelectedItem().toString();
            String fourthDistanceString = fourthDistanceRule.getSelectedItem().toString();
            String fourthMotorSpeedChangeString = fourthRuleResult.getText();
            
            int speed = Integer.valueOf(speedInputCombobox.getSelectedItem().toString());
            int distance = Integer.valueOf(distanceInputCombobox.getSelectedItem().toString());
            
            String[][] rules = {{firstSpeedString, firstDistanceString, firstMotorSpeedChangeString},
                                {secondSpeedString, secondDistanceString, secondMotorSpeedChangeString},
                                {thirdSpeedString, thirdDistanceString, thirdMotorSpeedChangeString},
                                {fourthSpeedString, fourthDistanceString, fourthMotorSpeedChangeString}};
           
            graphicScreen.setRules(rules);
            graphicScreen.setSpeedInput(speed);
            graphicScreen.setDistanceInput(distance);         
            graphicScreen.setVisible(true);
            
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_analysisButtonActionPerformed

    private void speedMembershipGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedMembershipGraphButtonActionPerformed
        SpeedMembershipGraph graph = new SpeedMembershipGraph();
        graph.showGraph();
    }//GEN-LAST:event_speedMembershipGraphButtonActionPerformed

    private void distanceMembershipGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanceMembershipGraphButtonActionPerformed
        DistanceMembershipGraph graph = new DistanceMembershipGraph();
        graph.showGraph();
    }//GEN-LAST:event_distanceMembershipGraphButtonActionPerformed

    private void speedChangeMembershipGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedChangeMembershipGraphButtonActionPerformed
        MotorSpeedChangeMembershipGraph graph = new MotorSpeedChangeMembershipGraph();
        graph.showGraph();
    }//GEN-LAST:event_speedChangeMembershipGraphButtonActionPerformed

    private void controlOutputsWhetherDifferent() throws RuntimeException {
        String firstOutput = firstRuleResult.getText();
        String secondOutput = secondRuleResult.getText();
        String thirdOutput = thirdRuleResult.getText();
        String fourthOutput = fourthRuleResult.getText();

        String[] outputs = {firstOutput, secondOutput, thirdOutput, fourthOutput};

        for (int i = 0; i < outputs.length; i++) {
            for (int j = 0; j < outputs.length; j++) {
                if (i == j) {
                    continue;
                }

                if (outputs[i].equals(outputs[j])) {
                    throw new RuntimeException("Rules output must be different");
                }
            }
        }

    }

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
            java.util.logging.Logger.getLogger(FuzzyInputScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuzzyInputScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuzzyInputScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuzzyInputScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuzzyInputScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ThirdRuleOutput;
    private javax.swing.JButton analysisButton;
    private javax.swing.JComboBox distanceInputCombobox;
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JButton distanceMembershipGraphButton;
    private javax.swing.JComboBox firstDistanceRule;
    private javax.swing.JLabel firstRuleOutput;
    private javax.swing.JTextField firstRuleResult;
    private javax.swing.JComboBox firstSpeedRule;
    private javax.swing.JComboBox fourthDistanceRule;
    private javax.swing.JLabel fourthRuleOutput;
    private javax.swing.JTextField fourthRuleResult;
    private javax.swing.JComboBox fourthSpeedRule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox secondDistanceRule;
    private javax.swing.JLabel secondRuleOutput;
    private javax.swing.JTextField secondRuleResult;
    private javax.swing.JComboBox secondSpeedRule;
    private javax.swing.JButton speedChangeMembershipGraphButton;
    private javax.swing.JComboBox speedInputCombobox;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JButton speedMembershipGraphButton;
    private javax.swing.JComboBox thirdDistanceRule;
    private javax.swing.JTextField thirdRuleResult;
    private javax.swing.JComboBox thirdSpeedRule;
    // End of variables declaration//GEN-END:variables
}
