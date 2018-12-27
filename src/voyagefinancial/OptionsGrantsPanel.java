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
public class OptionsGrantsPanel extends javax.swing.JPanel {

    /**
     * Creates new form OptionsGrantsPanel
     */
    
    
    
    
    private int awardDay;
    private int awardMonth;
    private int awardYear;
    private int currentAmount;
    private int currentValue;
    private int expirationDay;
    private int expirationMonth;
    private int expirationYear;
    private int rateOfReturn = 10;
    private boolean additionalPlans;
    
    private String belongsTo;
    
    
    public OptionsGrantsPanel() {
        initComponents();
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
        jLabel233 = new javax.swing.JLabel();
        currentAmountText = new javax.swing.JTextField();
        jLabel234 = new javax.swing.JLabel();
        expMonth = new javax.swing.JTextField();
        jLabel235 = new javax.swing.JLabel();
        expDay = new javax.swing.JTextField();
        jLabel236 = new javax.swing.JLabel();
        expYear = new javax.swing.JTextField();
        jLabel237 = new javax.swing.JLabel();
        awardDateMonth = new javax.swing.JTextField();
        jLabel238 = new javax.swing.JLabel();
        awardDateDay = new javax.swing.JTextField();
        jLabel239 = new javax.swing.JLabel();
        awardDateYear = new javax.swing.JTextField();
        jLabel240 = new javax.swing.JLabel();
        currentValueText = new javax.swing.JTextField();
        jLabel241 = new javax.swing.JLabel();
        rateOfReturnSlider = new javax.swing.JSlider();
        rateOfReturnLabel = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        hasAdditional403bPlansAfterFirstYes = new javax.swing.JRadioButton();
        hasAdditional403bPlansAfterFirstNo = new javax.swing.JRadioButton();
        jLabel193 = new javax.swing.JLabel();
        whoDoesItBelongToOptionsGrants = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        panelLabel.setText("Options and Grants Information");
        add(panelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 510, 40));

        jLabel233.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel233.setText("Amount");
        add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 50, 30));

        currentAmountText.setBackground(new java.awt.Color(204, 204, 204));
        currentAmountText.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        currentAmountText.setForeground(new java.awt.Color(102, 102, 102));
        currentAmountText.setText("Current Amount");
        currentAmountText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        currentAmountText.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        currentAmountText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                currentAmountTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                currentAmountTextFocusLost(evt);
            }
        });
        add(currentAmountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 520, 30));

        jLabel234.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel234.setText("Expiration Date:");
        add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 100, 30));

        expMonth.setBackground(new java.awt.Color(204, 204, 204));
        expMonth.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        expMonth.setForeground(new java.awt.Color(102, 102, 102));
        expMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expMonth.setText("mm");
        expMonth.setBorder(null);
        expMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                expMonthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                expMonthFocusLost(evt);
            }
        });
        add(expMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 30, 30));

        jLabel235.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel235.setText(" / ");
        add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, 30));

        expDay.setBackground(new java.awt.Color(204, 204, 204));
        expDay.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        expDay.setForeground(new java.awt.Color(102, 102, 102));
        expDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expDay.setText("dd");
        expDay.setBorder(null);
        expDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                expDayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                expDayFocusLost(evt);
            }
        });
        add(expDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 30, 30));

        jLabel236.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel236.setText(" / ");
        add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, -1, 30));

        expYear.setBackground(new java.awt.Color(204, 204, 204));
        expYear.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        expYear.setForeground(new java.awt.Color(102, 102, 102));
        expYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expYear.setText("yyyy");
        expYear.setBorder(null);
        expYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                expYearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                expYearFocusLost(evt);
            }
        });
        add(expYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 60, 30));

        jLabel237.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel237.setText("Award Date:");
        add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 80, 30));

        awardDateMonth.setBackground(new java.awt.Color(204, 204, 204));
        awardDateMonth.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        awardDateMonth.setForeground(new java.awt.Color(102, 102, 102));
        awardDateMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        awardDateMonth.setText("mm");
        awardDateMonth.setBorder(null);
        awardDateMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                awardDateMonthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                awardDateMonthFocusLost(evt);
            }
        });
        add(awardDateMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 30, 30));

        jLabel238.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel238.setText(" / ");
        add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 30));

        awardDateDay.setBackground(new java.awt.Color(204, 204, 204));
        awardDateDay.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        awardDateDay.setForeground(new java.awt.Color(102, 102, 102));
        awardDateDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        awardDateDay.setText("dd");
        awardDateDay.setBorder(null);
        awardDateDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                awardDateDayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                awardDateDayFocusLost(evt);
            }
        });
        add(awardDateDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 30, 30));

        jLabel239.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel239.setText(" / ");
        add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, 30));

        awardDateYear.setBackground(new java.awt.Color(204, 204, 204));
        awardDateYear.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        awardDateYear.setForeground(new java.awt.Color(102, 102, 102));
        awardDateYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        awardDateYear.setText("yyyy");
        awardDateYear.setBorder(null);
        awardDateYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                awardDateYearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                awardDateYearFocusLost(evt);
            }
        });
        add(awardDateYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 60, 30));

        jLabel240.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel240.setText("Current Value");
        add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 90, 30));

        currentValueText.setBackground(new java.awt.Color(204, 204, 204));
        currentValueText.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        currentValueText.setForeground(new java.awt.Color(102, 102, 102));
        currentValueText.setText("Current Value");
        currentValueText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        currentValueText.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        currentValueText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                currentValueTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                currentValueTextFocusLost(evt);
            }
        });
        add(currentValueText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 490, 30));

        jLabel241.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel241.setText("What is the assumed return?");
        add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, 30));

        rateOfReturnSlider.setBackground(new java.awt.Color(51, 51, 255));
        rateOfReturnSlider.setForeground(new java.awt.Color(0, 0, 255));
        rateOfReturnSlider.setMajorTickSpacing(5);
        rateOfReturnSlider.setMaximum(15);
        rateOfReturnSlider.setValue(10);
        rateOfReturnSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rateOfReturnSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rateOfReturnSliderStateChanged(evt);
            }
        });
        add(rateOfReturnSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 380, 30));

        rateOfReturnLabel.setText("10%");
        add(rateOfReturnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 40, 30));

        jLabel242.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel242.setText("Additional Options and/or Grants?");
        add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, 30));

        hasAdditional403bPlansAfterFirstYes.setSelected(true);
        hasAdditional403bPlansAfterFirstYes.setText("Yes");
        hasAdditional403bPlansAfterFirstYes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hasAdditional403bPlansAfterFirstYesStateChanged(evt);
            }
        });
        add(hasAdditional403bPlansAfterFirstYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, 30));

        hasAdditional403bPlansAfterFirstNo.setText("No");
        hasAdditional403bPlansAfterFirstNo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hasAdditional403bPlansAfterFirstNoStateChanged(evt);
            }
        });
        add(hasAdditional403bPlansAfterFirstNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, -1, 30));

        jLabel193.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel193.setText("Belongs to");
        add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, 30));

        whoDoesItBelongToOptionsGrants.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Choose One]", "Client", "Spouse" }));
        whoDoesItBelongToOptionsGrants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoDoesItBelongToOptionsGrantsActionPerformed(evt);
            }
        });
        add(whoDoesItBelongToOptionsGrants, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void currentAmountTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currentAmountTextFocusGained
        if (currentAmountText.getText().equals("Current Amount")) {
            currentAmountText.setText("");
            currentAmountText.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_currentAmountTextFocusGained

    private void currentAmountTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currentAmountTextFocusLost
        if (currentAmountText.getText().equals("")) {
            currentAmountText.setText("Current Amount");
            currentAmountText.setForeground(Color.GRAY);
        } else {
            try {
                currentAmount = Integer.parseInt(currentAmountText.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Current Amount");
            }
        }
    }//GEN-LAST:event_currentAmountTextFocusLost

    private void expMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expMonthFocusGained
        if (expMonth.getText().equals("mm")) {
            expMonth.setText("");
            expMonth.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_expMonthFocusGained

    private void expMonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expMonthFocusLost
        if (expMonth.getText().equals("")) {
            expMonth.setText("mm");
            expMonth.setForeground(Color.GRAY);
        } else {
            try {
                expirationMonth = Integer.parseInt(expMonth.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Expiration Month");
            }
        }
    }//GEN-LAST:event_expMonthFocusLost

    private void expDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expDayFocusGained
        if (expDay.getText().equals("dd")) {
            expDay.setText("");
            expDay.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_expDayFocusGained

    private void expDayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expDayFocusLost
        if (expDay.getText().equals("")) {
            expDay.setText("dd");
            expDay.setForeground(Color.GRAY);
        } else {
            try {
                expirationDay = Integer.parseInt(expDay.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Expiration Day");
            }
        } 
    }//GEN-LAST:event_expDayFocusLost

    private void expYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expYearFocusGained
        if (expYear.getText().equals("yyyy")) {
            expYear.setText("");
            expYear.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_expYearFocusGained

    private void expYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expYearFocusLost
        if (expYear.getText().equals("")) {
            expYear.setText("yyyy");
            expYear.setForeground(Color.GRAY);
        } else {
            try {
                expirationYear = Integer.parseInt(expYear.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Expiration Year");
            }
        }
    }//GEN-LAST:event_expYearFocusLost

    private void awardDateMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_awardDateMonthFocusGained
        if (awardDateMonth.getText().equals("mm")) {
            awardDateMonth.setText("");
            awardDateMonth.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_awardDateMonthFocusGained

    private void awardDateMonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_awardDateMonthFocusLost
        if (awardDateMonth.getText().equals("")) {
            awardDateMonth.setText("mm");
            awardDateMonth.setForeground(Color.GRAY);
        } else {
            try {
                awardMonth = Integer.parseInt(awardDateMonth.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Award Month");
            }
        }
    }//GEN-LAST:event_awardDateMonthFocusLost

    private void awardDateDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_awardDateDayFocusGained
        if (awardDateDay.getText().equals("dd")) {
            awardDateDay.setText("");
            awardDateDay.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_awardDateDayFocusGained

    private void awardDateDayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_awardDateDayFocusLost
        if (awardDateDay.getText().equals("")) {
            awardDateDay.setText("dd");
            awardDateDay.setForeground(Color.GRAY);
        } else {
            try {
                awardDay = Integer.parseInt(awardDateDay.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Award Day");
            }
        }
    }//GEN-LAST:event_awardDateDayFocusLost

    private void awardDateYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_awardDateYearFocusGained
        if (awardDateYear.getText().equals("yyyy")) {
            awardDateYear.setText("");
            awardDateYear.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_awardDateYearFocusGained

    private void awardDateYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_awardDateYearFocusLost
        if (awardDateYear.getText().equals("")) {
            awardDateYear.setText("yyyy");
            awardDateYear.setForeground(Color.GRAY);
        } else {
            try {
                awardYear = Integer.parseInt(awardDateYear.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Award Year");
            }
        }
    }//GEN-LAST:event_awardDateYearFocusLost

    private void currentValueTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currentValueTextFocusGained
        if (currentValueText.getText().equals("Current Value")) {
            currentValueText.setText("");
            currentValueText.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_currentValueTextFocusGained

    private void currentValueTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currentValueTextFocusLost
        if (currentValueText.getText().equals("")) {
            currentValueText.setText("Current Value");
            currentValueText.setForeground(Color.GRAY);
        } else {
            try {
                currentValue = Integer.parseInt(currentValueText.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Current Value");
            }
        }
    }//GEN-LAST:event_currentValueTextFocusLost

    private void rateOfReturnSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rateOfReturnSliderStateChanged
        int getValue = rateOfReturnSlider.getValue();
        rateOfReturnLabel.setText(getValue + "%");
        
        rateOfReturn = getValue;
    }//GEN-LAST:event_rateOfReturnSliderStateChanged

    private void hasAdditional403bPlansAfterFirstYesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hasAdditional403bPlansAfterFirstYesStateChanged
        if (hasAdditional403bPlansAfterFirstYes.isSelected()) {
            hasAdditional403bPlansAfterFirstNo.setSelected(false);
            additionalPlans = true;
        }
    }//GEN-LAST:event_hasAdditional403bPlansAfterFirstYesStateChanged

    private void hasAdditional403bPlansAfterFirstNoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hasAdditional403bPlansAfterFirstNoStateChanged
        if (hasAdditional403bPlansAfterFirstNo.isSelected()) {
            hasAdditional403bPlansAfterFirstYes.setSelected(false);
            additionalPlans= false;
        }
    }//GEN-LAST:event_hasAdditional403bPlansAfterFirstNoStateChanged

    private void whoDoesItBelongToOptionsGrantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoDoesItBelongToOptionsGrantsActionPerformed
        if (whoDoesItBelongToOptionsGrants.getSelectedItem().toString().equals("Client")) {
            belongsTo = "Client";
        } else if (whoDoesItBelongToOptionsGrants.getSelectedItem().toString().equals("Spouse")) {
            belongsTo = "Spouse";
        }
    }//GEN-LAST:event_whoDoesItBelongToOptionsGrantsActionPerformed

    public String getBelongsTo() {
        return belongsTo;
    }

    
    
    //GETTERS AND SETTERS

    public void setBelongsTo(String belongsTo) {
        this.belongsTo = belongsTo;
    }
    
    
    
    
    public void setRateOfReturn(int rateOfReturn) {
        this.rateOfReturn = rateOfReturn;
    }

    public int getRateOfReturn() {
        return rateOfReturn;
    }

    public int getAwardDay() {
        return awardDay;
    }
    
    public void setAwardDay(int day) {
        awardDay = day;
    }
    
    public int getAwardMonth() {
        return awardMonth;
    }
    
    public void setAwardMonth(int month) {
        awardMonth = month;
    }
    
    public int getAwardYear() {
        return awardYear;
    }
    
    public void setAwardYear(int year) {
        awardYear = year;
    }
    
    public int getCurrentAmount() {
        return currentAmount;
    }
    
    public void setCurrentAmount(int amount) {
        currentAmount = amount;
    }
    
    public int getCurrentValue() {
        return currentValue;
    }
    
    public void setCurrentValue(int value) {
        currentValue = value;
    }
    
    public int getExpirationDay() {
        return expirationDay;
    }
    
    public void setExpirationDay(int day) {
        expirationDay = day;
    }
    
    
    public int getExpirationMonth() {
        return expirationMonth;
    }
    
    public void setExpirationMonth(int month) {
        expirationMonth = month;
    }
    
    public int getExpirationYear() {
        return expirationYear;
    }
    
    public void setExpirationYear(int year) {
        expirationYear = year;
    }
    
   
    public boolean getExtraPanel() {
        return additionalPlans;
    }
    
    public void setExtraPanel(boolean plus) {
        additionalPlans = plus;
    }
    
    
   
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField awardDateDay;
    public javax.swing.JTextField awardDateMonth;
    public javax.swing.JTextField awardDateYear;
    public javax.swing.JTextField currentAmountText;
    public javax.swing.JTextField currentValueText;
    public javax.swing.JTextField expDay;
    public javax.swing.JTextField expMonth;
    public javax.swing.JTextField expYear;
    private javax.swing.JRadioButton hasAdditional403bPlansAfterFirstNo;
    private javax.swing.JRadioButton hasAdditional403bPlansAfterFirstYes;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel panelLabel;
    private javax.swing.JLabel rateOfReturnLabel;
    private javax.swing.JSlider rateOfReturnSlider;
    private javax.swing.JComboBox<String> whoDoesItBelongToOptionsGrants;
    // End of variables declaration//GEN-END:variables
}
