/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyagefinancial;

import java.awt.Color;

/**
 *
 * @author TannerLuke
 */
public class SocialSecurityPanel extends javax.swing.JPanel {

    /**
     * Creates new form SocialSecurityPanel
     */
    
    private boolean currentlyReceivingSS;
    private boolean ssAmountIsKnown;
    private int areFedTaxesWithheld;
    private int areStateTaxesWithheld;
    private boolean extraPanel;
    private boolean belongsToClient;
    private boolean belongsToSpouse;
    
    private int statePercentWithheldValue;
    private int ageRecievingBenefits = 60;
    private int expectedMonthlyAmountValue;
    private int federalPercentWithheldValue;
    private int ssAmountValue;
    
   
    
    
    public SocialSecurityPanel() {
        initComponents();
        federalPercentWithheld.setVisible(false);
        statePercentWithheld.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLabel = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        currentlyRecieving = new javax.swing.JRadioButton();
        clientSocialSecurityCard = new javax.swing.JPanel();
        currentlyRecievingPanel = new javax.swing.JPanel();
        ssAmount = new javax.swing.JTextField();
        areFederalTaxesHeldIDK = new javax.swing.JRadioButton();
        jLabel150 = new javax.swing.JLabel();
        areFederalTaxesHeldYes = new javax.swing.JRadioButton();
        areFederalTaxesHeldNo = new javax.swing.JRadioButton();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        areStateTaxesHeldYes = new javax.swing.JRadioButton();
        areStateTaxesHeldNo = new javax.swing.JRadioButton();
        areStateTaxesHeldIDK = new javax.swing.JRadioButton();
        statePercentWithheld = new javax.swing.JTextField();
        federalPercentWithheld = new javax.swing.JTextField();
        futureRecievingPanel = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        amountUnknown = new javax.swing.JRadioButton();
        expectedMonthlyAmount = new javax.swing.JTextField();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        ageToReceiveBenefits = new javax.swing.JComboBox<>();
        notCurrentlyReceiving = new javax.swing.JRadioButton();
        hasAdditionalSSYes = new javax.swing.JRadioButton();
        hasAdditionalSSNo = new javax.swing.JRadioButton();
        jLabel156 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        whoDoesSSBelongTo = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        panelLabel.setText("Social Security Information");
        add(panelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 440, 40));

        jLabel149.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel149.setText("Are you currently recieving Social Security Benefits?");
        add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, 30));

        currentlyRecieving.setText("Yes");
        currentlyRecieving.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                currentlyRecievingStateChanged(evt);
            }
        });
        add(currentlyRecieving, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, -1, 30));

        clientSocialSecurityCard.setLayout(new java.awt.CardLayout());

        currentlyRecievingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ssAmount.setBackground(new java.awt.Color(204, 204, 204));
        ssAmount.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ssAmount.setForeground(new java.awt.Color(102, 102, 102));
        ssAmount.setText("Monthly Amount");
        ssAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        ssAmount.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        ssAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ssAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ssAmountFocusLost(evt);
            }
        });
        currentlyRecievingPanel.add(ssAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 470, 30));

        areFederalTaxesHeldIDK.setText("I Don't Know");
        areFederalTaxesHeldIDK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                areFederalTaxesHeldIDKStateChanged(evt);
            }
        });
        currentlyRecievingPanel.add(areFederalTaxesHeldIDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, 30));

        jLabel150.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel150.setText("Are taxes being withheld?");
        currentlyRecievingPanel.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, 30));

        areFederalTaxesHeldYes.setText("Yes");
        areFederalTaxesHeldYes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                areFederalTaxesHeldYesStateChanged(evt);
            }
        });
        currentlyRecievingPanel.add(areFederalTaxesHeldYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, 30));

        areFederalTaxesHeldNo.setText("No");
        areFederalTaxesHeldNo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                areFederalTaxesHeldNoStateChanged(evt);
            }
        });
        currentlyRecievingPanel.add(areFederalTaxesHeldNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, 30));

        jLabel151.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel151.setText("Federal?");
        currentlyRecievingPanel.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, 30));

        jLabel152.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel152.setText("State?");
        currentlyRecievingPanel.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, 30));

        areStateTaxesHeldYes.setText("Yes");
        areStateTaxesHeldYes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                areStateTaxesHeldYesStateChanged(evt);
            }
        });
        currentlyRecievingPanel.add(areStateTaxesHeldYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, 30));

        areStateTaxesHeldNo.setText("No");
        areStateTaxesHeldNo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                areStateTaxesHeldNoStateChanged(evt);
            }
        });
        currentlyRecievingPanel.add(areStateTaxesHeldNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, 30));

        areStateTaxesHeldIDK.setText("I Don't Know");
        areStateTaxesHeldIDK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                areStateTaxesHeldIDKStateChanged(evt);
            }
        });
        currentlyRecievingPanel.add(areStateTaxesHeldIDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, 30));

        statePercentWithheld.setBackground(new java.awt.Color(204, 204, 204));
        statePercentWithheld.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        statePercentWithheld.setForeground(new java.awt.Color(102, 102, 102));
        statePercentWithheld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        statePercentWithheld.setText("%");
        statePercentWithheld.setBorder(null);
        statePercentWithheld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statePercentWithheldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                statePercentWithheldFocusLost(evt);
            }
        });
        currentlyRecievingPanel.add(statePercentWithheld, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 60, 30));

        federalPercentWithheld.setBackground(new java.awt.Color(204, 204, 204));
        federalPercentWithheld.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        federalPercentWithheld.setForeground(new java.awt.Color(102, 102, 102));
        federalPercentWithheld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        federalPercentWithheld.setText("%");
        federalPercentWithheld.setBorder(null);
        federalPercentWithheld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                federalPercentWithheldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                federalPercentWithheldFocusLost(evt);
            }
        });
        currentlyRecievingPanel.add(federalPercentWithheld, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 60, 30));

        clientSocialSecurityCard.add(currentlyRecievingPanel, "card3");

        futureRecievingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel153.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel153.setText("or");
        futureRecievingPanel.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 20, 30));

        amountUnknown.setText("Unkown");
        amountUnknown.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                amountUnknownStateChanged(evt);
            }
        });
        futureRecievingPanel.add(amountUnknown, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, 30));

        expectedMonthlyAmount.setBackground(new java.awt.Color(204, 204, 204));
        expectedMonthlyAmount.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        expectedMonthlyAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expectedMonthlyAmount.setBorder(null);
        expectedMonthlyAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                expectedMonthlyAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                expectedMonthlyAmountFocusLost(evt);
            }
        });
        futureRecievingPanel.add(expectedMonthlyAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 190, 30));

        jLabel154.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel154.setText("What age do you plan to recieve benefits?");
        futureRecievingPanel.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 260, 30));

        jLabel155.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel155.setText("Expected monthly amount:");
        futureRecievingPanel.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 180, 30));

        ageToReceiveBenefits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70" }));
        ageToReceiveBenefits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageToReceiveBenefitsActionPerformed(evt);
            }
        });
        futureRecievingPanel.add(ageToReceiveBenefits, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        clientSocialSecurityCard.add(futureRecievingPanel, "card2");

        add(clientSocialSecurityCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1160, 240));

        notCurrentlyReceiving.setText("No");
        notCurrentlyReceiving.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                notCurrentlyReceivingStateChanged(evt);
            }
        });
        add(notCurrentlyReceiving, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, -1, 30));

        hasAdditionalSSYes.setText("Yes");
        hasAdditionalSSYes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hasAdditionalSSYesStateChanged(evt);
            }
        });
        add(hasAdditionalSSYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, 30));

        hasAdditionalSSNo.setText("No");
        hasAdditionalSSNo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hasAdditionalSSNoStateChanged(evt);
            }
        });
        add(hasAdditionalSSNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, -1, 30));

        jLabel156.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel156.setText("Do you have an additional Social Security benefits?");
        add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, 30));

        jLabel237.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel237.setText("Belongs to");
        add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, 30));

        whoDoesSSBelongTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Choose One]", "Client", "Spouse" }));
        whoDoesSSBelongTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoDoesSSBelongToActionPerformed(evt);
            }
        });
        add(whoDoesSSBelongTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void currentlyRecievingStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_currentlyRecievingStateChanged
        if (currentlyRecieving.isSelected()) {
            notCurrentlyReceiving.setSelected(false);
            currentlyReceivingSS = true;
            
            clientSocialSecurityCard.removeAll();
            clientSocialSecurityCard.add(currentlyRecievingPanel);
            clientSocialSecurityCard.repaint();
            clientSocialSecurityCard.revalidate();
            
        }
    }//GEN-LAST:event_currentlyRecievingStateChanged

    private void amountUnknownStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_amountUnknownStateChanged
        if (amountUnknown.isSelected()) {
            ssAmountIsKnown = false;
        }
    }//GEN-LAST:event_amountUnknownStateChanged

    private void statePercentWithheldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statePercentWithheldFocusGained
        if (statePercentWithheld.getText().equals("%")) {
            statePercentWithheld.setText("");
            statePercentWithheld.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_statePercentWithheldFocusGained

    private void statePercentWithheldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statePercentWithheldFocusLost
        if (statePercentWithheld.getText().equals("")) {
            statePercentWithheld.setText("%");
            statePercentWithheld.setForeground(Color.GRAY);
        } else {
            try {
                statePercentWithheldValue = Integer.parseInt(statePercentWithheld.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "State Percent Withheld");
            }
        }
    }//GEN-LAST:event_statePercentWithheldFocusLost

    private void ssAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ssAmountFocusGained
        if (ssAmount.getText().equals("Monthly Amount")) {
            ssAmount.setText("");
            ssAmount.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_ssAmountFocusGained

    private void ssAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ssAmountFocusLost
        if (ssAmount.getText().equals("")) {
            ssAmount.setText("Monthly Amount");
            ssAmount.setForeground(Color.GRAY);
        } else {
            try {
                ssAmountValue = Integer.parseInt(ssAmount.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Social Security Amount");
            }
        }
    }//GEN-LAST:event_ssAmountFocusLost

    private void areFederalTaxesHeldYesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_areFederalTaxesHeldYesStateChanged
        if (areFederalTaxesHeldYes.isSelected()) {
            areFederalTaxesHeldIDK.setSelected(false);
            areFederalTaxesHeldNo.setSelected(false);
            areFedTaxesWithheld = 1;    //TRUE OR FALSE OR IDK    -1 = FALSE, 0 = IDK, 1 = TRUE
            federalPercentWithheld.setVisible(true);
        }
    }//GEN-LAST:event_areFederalTaxesHeldYesStateChanged

    private void areFederalTaxesHeldIDKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_areFederalTaxesHeldIDKStateChanged
        if (areFederalTaxesHeldIDK.isSelected()) {
            areFederalTaxesHeldNo.setSelected(false);
            areFederalTaxesHeldYes.setSelected(false);
            areFedTaxesWithheld = 0;
            federalPercentWithheld.setVisible(false);
        }
    }//GEN-LAST:event_areFederalTaxesHeldIDKStateChanged

    private void areFederalTaxesHeldNoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_areFederalTaxesHeldNoStateChanged
        if (areFederalTaxesHeldNo.isSelected()) {
            areFederalTaxesHeldYes.setSelected(false);
            areFederalTaxesHeldIDK.setSelected(false);
            areFedTaxesWithheld = -1;
            federalPercentWithheld.setVisible(false);
            
        }
    }//GEN-LAST:event_areFederalTaxesHeldNoStateChanged

    private void areStateTaxesHeldYesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_areStateTaxesHeldYesStateChanged
        if (areStateTaxesHeldYes.isSelected()) {
            areStateTaxesHeldNo.setSelected(false);
            areStateTaxesHeldIDK.setSelected(false);
            areStateTaxesWithheld = 1;
            statePercentWithheld.setVisible(true);
        }
    }//GEN-LAST:event_areStateTaxesHeldYesStateChanged

    private void areStateTaxesHeldNoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_areStateTaxesHeldNoStateChanged
        if (areStateTaxesHeldNo.isSelected()) {
            areStateTaxesHeldYes.setSelected(false);
            areStateTaxesHeldIDK.setSelected(false);
            areStateTaxesWithheld = -1;
            statePercentWithheld.setVisible(false);
        }
    }//GEN-LAST:event_areStateTaxesHeldNoStateChanged

    private void areStateTaxesHeldIDKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_areStateTaxesHeldIDKStateChanged
        if (areStateTaxesHeldIDK.isSelected()) {
            areStateTaxesHeldYes.setSelected(false);
            areStateTaxesHeldNo.setSelected(false);
            areStateTaxesWithheld = 0;
            statePercentWithheld.setVisible(false);
        }
    }//GEN-LAST:event_areStateTaxesHeldIDKStateChanged

    private void expectedMonthlyAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expectedMonthlyAmountFocusGained
       
    }//GEN-LAST:event_expectedMonthlyAmountFocusGained

    private void expectedMonthlyAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expectedMonthlyAmountFocusLost
        if (!expectedMonthlyAmount.getText().equals("")) {
            try {
                expectedMonthlyAmountValue = Integer.parseInt(expectedMonthlyAmount.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Expected Monthly Amount");
            }
        }
    }//GEN-LAST:event_expectedMonthlyAmountFocusLost

    private void federalPercentWithheldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_federalPercentWithheldFocusGained
        if (federalPercentWithheld.getText().equals("%")) {
            federalPercentWithheld.setText("");
            federalPercentWithheld.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_federalPercentWithheldFocusGained

    private void federalPercentWithheldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_federalPercentWithheldFocusLost
        if (federalPercentWithheld.getText().equals("")) {
            federalPercentWithheld.setText("%");
            federalPercentWithheld.setForeground(Color.GRAY);
        } else {
            try {
                federalPercentWithheldValue = Integer.parseInt(federalPercentWithheld.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Federal Percent Withheld");
            }
        }
    }//GEN-LAST:event_federalPercentWithheldFocusLost

    private void notCurrentlyReceivingStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_notCurrentlyReceivingStateChanged
        if (notCurrentlyReceiving.isSelected()) {
            currentlyRecieving.setSelected(false);
            clientSocialSecurityCard.removeAll();
            clientSocialSecurityCard.add(futureRecievingPanel);
            clientSocialSecurityCard.repaint();
            clientSocialSecurityCard.revalidate();
        }
    }//GEN-LAST:event_notCurrentlyReceivingStateChanged

    private void hasAdditionalSSYesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hasAdditionalSSYesStateChanged
        if (hasAdditionalSSYes.isSelected()) {
            hasAdditionalSSNo.setSelected(false);
            extraPanel = true;
        }
    }//GEN-LAST:event_hasAdditionalSSYesStateChanged

    private void hasAdditionalSSNoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hasAdditionalSSNoStateChanged
        if (hasAdditionalSSNo.isSelected()) {
            hasAdditionalSSYes.setSelected(false);
            extraPanel = false;
        }
    }//GEN-LAST:event_hasAdditionalSSNoStateChanged

    private void whoDoesSSBelongToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoDoesSSBelongToActionPerformed
        if (whoDoesSSBelongTo.getSelectedItem().toString().equals("Client")) {
            belongsToClient = true;
            belongsToSpouse = false;
        } else if (whoDoesSSBelongTo.getSelectedItem().toString().equals("Spouse")) {
            belongsToClient = false;
            belongsToSpouse = true;
        } else {
            belongsToClient = false;
            belongsToSpouse = false;
        }
    }//GEN-LAST:event_whoDoesSSBelongToActionPerformed

    private void ageToReceiveBenefitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageToReceiveBenefitsActionPerformed
        try {
            ageRecievingBenefits = Integer.parseInt(ageToReceiveBenefits.getSelectedItem().toString());
        } catch (NumberFormatException e) {
            System.out.println("error");
        }
    }//GEN-LAST:event_ageToReceiveBenefitsActionPerformed

    
    
    
    
    // GETTERS AND SETTERS
    public boolean getExtraPanel() {
        return extraPanel;
    }
    
    public void setExtraPanel(boolean extraPanel) {
        this.extraPanel = extraPanel;
    }

    public boolean isBelongsToClient() {
        return belongsToClient;
    }

    public boolean isBelongsToSpouse() {
        return belongsToSpouse;
    }
    
    public void setCurrentlyReceivingSS(boolean currentlyReceivingSS) {
        this.currentlyReceivingSS = currentlyReceivingSS;
    }

    public void setSsAmountIsKnown(boolean ssAmountIsKnown) {
        this.ssAmountIsKnown = ssAmountIsKnown;
    }

    public void setAreFedTaxesWithheld(int areFedTaxesWithheld) {
        this.areFedTaxesWithheld = areFedTaxesWithheld;
    }

    public void setAreStateTaxesWithheld(int areStateTaxesWithheld) {
        this.areStateTaxesWithheld = areStateTaxesWithheld;
    }

    public void setBelongsToClient(boolean belongsToClient) {
        this.belongsToClient = belongsToClient;
    }

    public void setBelongsToSpouse(boolean belongsToSpouse) {
        this.belongsToSpouse = belongsToSpouse;
    }

    public boolean getCurrentlyReceivingSS() {
        return currentlyReceivingSS;
    }

    public boolean getssAmountIsKnown() {
        return ssAmountIsKnown;
    }

    public int getAreFedTaxesWithheld() {
        return areFedTaxesWithheld;
    }

    public int getAreStateTaxesWithheld() {
        return areStateTaxesWithheld;
    }

    public boolean getBelongsToClient() {
        return belongsToClient;
    }

    public boolean getBelongsToSpouse() {
        return belongsToSpouse;
    }

    public int getStatePercentWithheldValue() {
        return statePercentWithheldValue;
    }

    public int getAgeRecievingBenefits() {
        return ageRecievingBenefits;
    }

    public int getExpectedMonthlyAmountValue() {
        return expectedMonthlyAmountValue;
    }

    public int getFederalPercentWithheldValue() {
        return federalPercentWithheldValue;
    }

    public int getSsAmountValue() {
        return ssAmountValue;
    }

    public void setStatePercentWithheldValue(int statePercentWithheldValue) {
        this.statePercentWithheldValue = statePercentWithheldValue;
    }

    public void setAgeRecievingBenefits(int ageRecievingBenefits) {
        this.ageRecievingBenefits = ageRecievingBenefits;
    }

    public void setExpectedMonthlyAmountValue(int expectedMonthlyAmountValue) {
        this.expectedMonthlyAmountValue = expectedMonthlyAmountValue;
    }

    public void setFederalPercentWithheldValue(int federalPercentWithheldValue) {
        this.federalPercentWithheldValue = federalPercentWithheldValue;
    }

    public void setSsAmountValue(int ssAmountValue) {
        this.ssAmountValue = ssAmountValue;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ageToReceiveBenefits;
    private javax.swing.JRadioButton amountUnknown;
    private javax.swing.JRadioButton areFederalTaxesHeldIDK;
    private javax.swing.JRadioButton areFederalTaxesHeldNo;
    private javax.swing.JRadioButton areFederalTaxesHeldYes;
    private javax.swing.JRadioButton areStateTaxesHeldIDK;
    private javax.swing.JRadioButton areStateTaxesHeldNo;
    private javax.swing.JRadioButton areStateTaxesHeldYes;
    private javax.swing.JPanel clientSocialSecurityCard;
    private javax.swing.JRadioButton currentlyRecieving;
    private javax.swing.JPanel currentlyRecievingPanel;
    public javax.swing.JTextField expectedMonthlyAmount;
    public javax.swing.JTextField federalPercentWithheld;
    private javax.swing.JPanel futureRecievingPanel;
    private javax.swing.JRadioButton hasAdditionalSSNo;
    private javax.swing.JRadioButton hasAdditionalSSYes;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JRadioButton notCurrentlyReceiving;
    private javax.swing.JLabel panelLabel;
    public javax.swing.JTextField ssAmount;
    public javax.swing.JTextField statePercentWithheld;
    private javax.swing.JComboBox<String> whoDoesSSBelongTo;
    // End of variables declaration//GEN-END:variables
}
