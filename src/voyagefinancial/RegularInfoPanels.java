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
public class RegularInfoPanels extends javax.swing.JPanel implements GettingJPanelInterface {

    /**
     * Creates new form RegularInfoPanels
     */
    
    private boolean plusPanel;
    private boolean belongsToClient;
    private boolean belongsToSpouse;
    
    
    private int currentBalance;
    private int balanceMonth;
    private int balanceDay;
    private int balanceYear;
    private String contributionType;
    private int contributionBalance;
    private int contributionPercent;
    private int firstPercentMatchNum;
    private int firstPercentOfNum;
    private int secondPercentMatchNum;
    private int secondPercentOfNum; 
    private String whoIsIt;
    private int rateOfReturn;
    private boolean additionalPlans;
    private String panelName;
    
    
    
    
    
    public RegularInfoPanels(String type) {
        initComponents();
        
        hasAdditional403bPlansAfterFirstYes.setSelected(false);
        hasAdditional403bPlansAfterFirstNo.setSelected(false);
        
        plusPanel = false;
        belongsToClient = false;
        belongsToSpouse = false;
        contributionPercent = 10;
        rateOfReturn = 10;
        panelName = type;
        
        panelLabel.setText(type + " Information");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        percentOrBalance403bPanel = new javax.swing.JPanel();
        balance403bPanel = new javax.swing.JPanel();
        contribution403b = new javax.swing.JTextField();
        percent403bPanel = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        percentContributing403b = new javax.swing.JSlider();
        percentContributing403bLabel = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        panelLabel = new javax.swing.JLabel();
        currentBalance403b = new javax.swing.JTextField();
        jLabel234 = new javax.swing.JLabel();
        monthAsOf403b = new javax.swing.JTextField();
        jLabel235 = new javax.swing.JLabel();
        dayAsOf403b = new javax.swing.JTextField();
        jLabel236 = new javax.swing.JLabel();
        yearAsOf403b = new javax.swing.JTextField();
        areContributionsPercentDropDown403b = new javax.swing.JComboBox<>();
        jLabel230 = new javax.swing.JLabel();
        whatIsMatchLabel6 = new javax.swing.JLabel();
        firstCompanyMatch403bText = new javax.swing.JTextField();
        secondPercentMatch6 = new javax.swing.JLabel();
        firstPercentMatched403bText = new javax.swing.JTextField();
        firstPercentMatch6 = new javax.swing.JLabel();
        secondCompanyMatch403bText = new javax.swing.JTextField();
        thirdPercentMatch6 = new javax.swing.JLabel();
        secondPercentMatched403bText = new javax.swing.JTextField();
        fourthPercentMatch6 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        whoDoes403bBelongto = new javax.swing.JComboBox<>();
        hasAdditional403bPlansAfterFirstNo = new javax.swing.JRadioButton();
        hasAdditional403bPlansAfterFirstYes = new javax.swing.JRadioButton();
        jLabel239 = new javax.swing.JLabel();
        rateOfReturn403bLabel = new javax.swing.JLabel();
        rateOfReturn403bSlider = new javax.swing.JSlider();
        jLabel238 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        percentOrBalance403bPanel.setLayout(new java.awt.CardLayout());

        balance403bPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contribution403b.setBackground(new java.awt.Color(204, 204, 204));
        contribution403b.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        contribution403b.setForeground(new java.awt.Color(102, 102, 102));
        contribution403b.setText("Contribution");
        contribution403b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        contribution403b.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        contribution403b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contribution403bFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contribution403bFocusLost(evt);
            }
        });
        contribution403b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contribution403bActionPerformed(evt);
            }
        });
        balance403bPanel.add(contribution403b, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 490, 30));

        percentOrBalance403bPanel.add(balance403bPanel, "card3");

        percent403bPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel154.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel154.setText("Percent Contributions");
        percent403bPanel.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        percentContributing403b.setBackground(new java.awt.Color(51, 51, 255));
        percentContributing403b.setForeground(new java.awt.Color(0, 0, 255));
        percentContributing403b.setMajorTickSpacing(5);
        percentContributing403b.setValue(10);
        percentContributing403b.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        percentContributing403b.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                percentContributing403bStateChanged(evt);
            }
        });
        percent403bPanel.add(percentContributing403b, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 360, 30));

        percentContributing403bLabel.setText("10%");
        percent403bPanel.add(percentContributing403bLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 30));

        percentOrBalance403bPanel.add(percent403bPanel, "card2");

        add(percentOrBalance403bPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 550, 50));

        jLabel233.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel233.setText("Current Balances");
        add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, 30));

        panelLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        panelLabel.setText("403B Information");
        add(panelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 300, 40));

        currentBalance403b.setBackground(new java.awt.Color(204, 204, 204));
        currentBalance403b.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        currentBalance403b.setForeground(new java.awt.Color(102, 102, 102));
        currentBalance403b.setText("Current Balance");
        currentBalance403b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        currentBalance403b.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        currentBalance403b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                currentBalance403bFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                currentBalance403bFocusLost(evt);
            }
        });
        add(currentBalance403b, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 480, 30));

        jLabel234.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel234.setText("As of:");
        add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 40, 30));

        monthAsOf403b.setBackground(new java.awt.Color(204, 204, 204));
        monthAsOf403b.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        monthAsOf403b.setForeground(new java.awt.Color(102, 102, 102));
        monthAsOf403b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthAsOf403b.setText("mm");
        monthAsOf403b.setBorder(null);
        monthAsOf403b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                monthAsOf403bFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                monthAsOf403bFocusLost(evt);
            }
        });
        add(monthAsOf403b, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 30, 30));

        jLabel235.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel235.setText(" / ");
        add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, -1, 30));

        dayAsOf403b.setBackground(new java.awt.Color(204, 204, 204));
        dayAsOf403b.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        dayAsOf403b.setForeground(new java.awt.Color(102, 102, 102));
        dayAsOf403b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dayAsOf403b.setText("dd");
        dayAsOf403b.setBorder(null);
        dayAsOf403b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dayAsOf403bFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dayAsOf403bFocusLost(evt);
            }
        });
        add(dayAsOf403b, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 30, 30));

        jLabel236.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel236.setText(" / ");
        add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, -1, 30));

        yearAsOf403b.setBackground(new java.awt.Color(204, 204, 204));
        yearAsOf403b.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        yearAsOf403b.setForeground(new java.awt.Color(102, 102, 102));
        yearAsOf403b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearAsOf403b.setText("yyyy");
        yearAsOf403b.setBorder(null);
        yearAsOf403b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yearAsOf403bFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearAsOf403bFocusLost(evt);
            }
        });
        add(yearAsOf403b, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 120, 60, 30));

        areContributionsPercentDropDown403b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Percentage", "Balance" }));
        areContributionsPercentDropDown403b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areContributionsPercentDropDown403bActionPerformed(evt);
            }
        });
        add(areContributionsPercentDropDown403b, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 200, 30));

        jLabel230.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel230.setText("Contributions");
        add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 30));

        whatIsMatchLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        whatIsMatchLabel6.setText("What is the match?");
        add(whatIsMatchLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, 30));

        firstCompanyMatch403bText.setBackground(new java.awt.Color(204, 204, 204));
        firstCompanyMatch403bText.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        firstCompanyMatch403bText.setForeground(new java.awt.Color(102, 102, 102));
        firstCompanyMatch403bText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        firstCompanyMatch403bText.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        firstCompanyMatch403bText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstCompanyMatch403bTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstCompanyMatch403bTextFocusLost(evt);
            }
        });
        add(firstCompanyMatch403bText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 40, 30));

        secondPercentMatch6.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        secondPercentMatch6.setText("% of the first");
        add(secondPercentMatch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 90, 30));

        firstPercentMatched403bText.setBackground(new java.awt.Color(204, 204, 204));
        firstPercentMatched403bText.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        firstPercentMatched403bText.setForeground(new java.awt.Color(102, 102, 102));
        firstPercentMatched403bText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        firstPercentMatched403bText.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        firstPercentMatched403bText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstPercentMatched403bTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstPercentMatched403bTextFocusLost(evt);
            }
        });
        add(firstPercentMatched403bText, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 40, 30));

        firstPercentMatch6.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        firstPercentMatch6.setText("% and");
        add(firstPercentMatch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 50, 30));

        secondCompanyMatch403bText.setBackground(new java.awt.Color(204, 204, 204));
        secondCompanyMatch403bText.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        secondCompanyMatch403bText.setForeground(new java.awt.Color(102, 102, 102));
        secondCompanyMatch403bText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        secondCompanyMatch403bText.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        secondCompanyMatch403bText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                secondCompanyMatch403bTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                secondCompanyMatch403bTextFocusLost(evt);
            }
        });
        add(secondCompanyMatch403bText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 40, 30));

        thirdPercentMatch6.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        thirdPercentMatch6.setText("% of the second");
        add(thirdPercentMatch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 100, 30));

        secondPercentMatched403bText.setBackground(new java.awt.Color(204, 204, 204));
        secondPercentMatched403bText.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        secondPercentMatched403bText.setForeground(new java.awt.Color(102, 102, 102));
        secondPercentMatched403bText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        secondPercentMatched403bText.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        secondPercentMatched403bText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                secondPercentMatched403bTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                secondPercentMatched403bTextFocusLost(evt);
            }
        });
        add(secondPercentMatched403bText, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 40, 30));

        fourthPercentMatch6.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        fourthPercentMatch6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fourthPercentMatch6.setText("%");
        add(fourthPercentMatch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 30, 30));

        jLabel237.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel237.setText("Belongs to");
        add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, 30));

        whoDoes403bBelongto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Choose One]", "Client", "Spouse" }));
        whoDoes403bBelongto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoDoes403bBelongtoActionPerformed(evt);
            }
        });
        add(whoDoes403bBelongto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, 150, 30));

        hasAdditional403bPlansAfterFirstNo.setText("No");
        hasAdditional403bPlansAfterFirstNo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hasAdditional403bPlansAfterFirstNoStateChanged(evt);
            }
        });
        add(hasAdditional403bPlansAfterFirstNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, -1, 30));

        hasAdditional403bPlansAfterFirstYes.setSelected(true);
        hasAdditional403bPlansAfterFirstYes.setText("Yes");
        hasAdditional403bPlansAfterFirstYes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hasAdditional403bPlansAfterFirstYesStateChanged(evt);
            }
        });
        add(hasAdditional403bPlansAfterFirstYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 380, -1, 30));

        jLabel239.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel239.setText("Do you have any additional 403B plans?");
        add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, 30));

        rateOfReturn403bLabel.setText("10%");
        add(rateOfReturn403bLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 40, 30));

        rateOfReturn403bSlider.setBackground(new java.awt.Color(51, 51, 255));
        rateOfReturn403bSlider.setForeground(new java.awt.Color(0, 0, 255));
        rateOfReturn403bSlider.setMajorTickSpacing(5);
        rateOfReturn403bSlider.setMaximum(15);
        rateOfReturn403bSlider.setValue(10);
        rateOfReturn403bSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rateOfReturn403bSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rateOfReturn403bSliderStateChanged(evt);
            }
        });
        add(rateOfReturn403bSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 240, 30));

        jLabel238.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel238.setText("What is the assumed return?");
        add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void contribution403bFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contribution403bFocusGained
        if (contribution403b.getText().equals("Contribution")) {
            contribution403b.setText("");
            contribution403b.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_contribution403bFocusGained

    private void contribution403bFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contribution403bFocusLost
        if (contribution403b.getText().equals("")) {
            contribution403b.setText("Contribution");
            contribution403b.setForeground(Color.GRAY);

        } else {
            try {
                contributionBalance = Integer.parseInt(contribution403b.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Contribution");
            }
        }
    }//GEN-LAST:event_contribution403bFocusLost

    private void contribution403bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contribution403bActionPerformed

    }//GEN-LAST:event_contribution403bActionPerformed

    private void percentContributing403bStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_percentContributing403bStateChanged
        int getValue = percentContributing403b.getValue();

        percentContributing403bLabel.setText(getValue + "%");
        contributionPercent = getValue;
    }//GEN-LAST:event_percentContributing403bStateChanged

    private void currentBalance403bFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currentBalance403bFocusGained
        if (currentBalance403b.getText().equals("Current Balance")) {
            currentBalance403b.setText("");
            currentBalance403b.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_currentBalance403bFocusGained

    private void currentBalance403bFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currentBalance403bFocusLost
        if (currentBalance403b.getText().equals("")) {
            currentBalance403b.setText("Current Balance");
            currentBalance403b.setForeground(Color.GRAY);
        } else {
            try {
                currentBalance = Integer.parseInt(currentBalance403b.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Current Balance");
            }
        }
    }//GEN-LAST:event_currentBalance403bFocusLost

    private void monthAsOf403bFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthAsOf403bFocusGained
        if (monthAsOf403b.getText().equals("mm")) {
            monthAsOf403b.setText("");
            monthAsOf403b.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_monthAsOf403bFocusGained

    private void monthAsOf403bFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthAsOf403bFocusLost
        if (monthAsOf403b.getText().equals("")) {
            monthAsOf403b.setText("mm");
            monthAsOf403b.setForeground(Color.GRAY);
        } else {
            try {
                balanceMonth = Integer.parseInt(monthAsOf403b.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Month");
            }
        }
    }//GEN-LAST:event_monthAsOf403bFocusLost

    private void dayAsOf403bFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dayAsOf403bFocusGained
        if (dayAsOf403b.getText().equals("dd")) {
            dayAsOf403b.setText("");
            dayAsOf403b.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_dayAsOf403bFocusGained

    private void dayAsOf403bFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dayAsOf403bFocusLost
        if (dayAsOf403b.getText().equals("")) {
            dayAsOf403b.setText("dd");
            dayAsOf403b.setForeground(Color.GRAY);
        } else {
            try {
                balanceDay = Integer.parseInt(dayAsOf403b.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Day");
            }
        }
    }//GEN-LAST:event_dayAsOf403bFocusLost

    private void yearAsOf403bFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearAsOf403bFocusGained
        if (yearAsOf403b.getText().equals("yyyy")) {
            yearAsOf403b.setText("");
            yearAsOf403b.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_yearAsOf403bFocusGained

    private void yearAsOf403bFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearAsOf403bFocusLost
        if (yearAsOf403b.getText().equals("")) {
            yearAsOf403b.setText("yyyy");
            yearAsOf403b.setForeground(Color.GRAY);
        } else {
            try {
                balanceYear = Integer.parseInt(yearAsOf403b.getText());
            } catch (NumberFormatException e) {
                PopupMessage.popupMessage("Error", "Year");
            }
        }
    }//GEN-LAST:event_yearAsOf403bFocusLost

    private void areContributionsPercentDropDown403bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areContributionsPercentDropDown403bActionPerformed
        if (areContributionsPercentDropDown403b.getSelectedItem().toString().equals("Percentage")) {
            percentOrBalance403bPanel.removeAll();
            percentOrBalance403bPanel.add(percent403bPanel);
            percentOrBalance403bPanel.repaint();
            percentOrBalance403bPanel.revalidate();
            contributionType = "Percentage";
        } else {
            percentOrBalance403bPanel.removeAll();
            percentOrBalance403bPanel.add(balance403bPanel);
            percentOrBalance403bPanel.repaint();
            percentOrBalance403bPanel.revalidate();
            contributionType = "Balance";
        }
    }//GEN-LAST:event_areContributionsPercentDropDown403bActionPerformed

    private void whoDoes403bBelongtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoDoes403bBelongtoActionPerformed
        if (whoDoes403bBelongto.getSelectedItem().toString().equals("Client")) {
            belongsToClient = true;
            belongsToSpouse = false;
        } else if (whoDoes403bBelongto.getSelectedItem().toString().equals("Spouse")) {
            belongsToClient = false;
            belongsToSpouse = true;
        } else {
            belongsToClient = false;
            belongsToSpouse = false;
        }
    }//GEN-LAST:event_whoDoes403bBelongtoActionPerformed

    private void hasAdditional403bPlansAfterFirstNoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hasAdditional403bPlansAfterFirstNoStateChanged
        if (hasAdditional403bPlansAfterFirstNo.isSelected()) {
            hasAdditional403bPlansAfterFirstYes.setSelected(false);
            additionalPlans= false;
        }
    }//GEN-LAST:event_hasAdditional403bPlansAfterFirstNoStateChanged

    private void hasAdditional403bPlansAfterFirstYesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hasAdditional403bPlansAfterFirstYesStateChanged
        if (hasAdditional403bPlansAfterFirstYes.isSelected()) {
            hasAdditional403bPlansAfterFirstNo.setSelected(false);
            additionalPlans = true;
        }
    }//GEN-LAST:event_hasAdditional403bPlansAfterFirstYesStateChanged

    private void rateOfReturn403bSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rateOfReturn403bSliderStateChanged
        int getValue = rateOfReturn403bSlider.getValue();
        rateOfReturn403bLabel.setText(getValue + "%");
        rateOfReturn = getValue;
    }//GEN-LAST:event_rateOfReturn403bSliderStateChanged

    private void firstCompanyMatch403bTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstCompanyMatch403bTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCompanyMatch403bTextFocusGained

    private void firstCompanyMatch403bTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstCompanyMatch403bTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCompanyMatch403bTextFocusLost

    private void firstPercentMatched403bTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstPercentMatched403bTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_firstPercentMatched403bTextFocusGained

    private void firstPercentMatched403bTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstPercentMatched403bTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_firstPercentMatched403bTextFocusLost

    private void secondCompanyMatch403bTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secondCompanyMatch403bTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_secondCompanyMatch403bTextFocusGained

    private void secondCompanyMatch403bTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secondCompanyMatch403bTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_secondCompanyMatch403bTextFocusLost

    private void secondPercentMatched403bTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secondPercentMatched403bTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_secondPercentMatched403bTextFocusGained

    private void secondPercentMatched403bTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secondPercentMatched403bTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_secondPercentMatched403bTextFocusLost

    
    
    //GETTERS AND SETTERS
    
    
    
    public int getCurrentBalance() {
        return currentBalance;
    }
    
    public void setCurrentBalance(int balance) {
        currentBalance = balance;
    }
    
    public int getBalanceMonth() {
        return balanceMonth;
    }
    
    public void setBalanceMonth(int month) {
        balanceMonth = month;
    }
    
    public int getBalanceDay() {
        return balanceDay;
    }
    
    public void setBalanceDay(int day) {
        balanceDay = day;
    }
    
    public int getBalanceYear() {
        return balanceYear;
    }
    
    public void setBalanceYear(int year) {
        balanceYear = year;
    }
    
    public String getContributionType() {
        return contributionType;
    }
    
    public void setContributionType(String type) {
        contributionType = type;
    }
    
    public int getContributionBalance() {
        return contributionBalance;
    }
    
    public void setContributionBalance(int balance) {
        contributionBalance = balance;
    }
    
    public int getContributionPercent() {
        return contributionPercent;
    }
    
    public void setContributionPercent(int percent) {
        contributionPercent = percent;
    }
    
    public int getFirstPercentMatch() {
        return firstPercentMatchNum;
    }
    
    public void setFirstPercentMatch(int percent) {
        firstPercentMatchNum = percent;
    }
    
    public int getFirstPercentOf() {
        return firstPercentOfNum;
    }
     
    public void setFirstPercentOf(int num) {
        firstPercentOfNum = num;
    }
    
    public int getSecondPercentMatch() {
        return secondPercentMatchNum;
    }
    
    public void setSecondPercentMatch(int percent) {
        secondPercentMatchNum= percent;
    }
    
    public int getSecondPercentOf() {
        return secondPercentOfNum;
    }
    
    public void setSecondPercentOf(int num) {
        secondPercentOfNum = num;
    }
    
    public String getWhoIsIt() {
        return whoIsIt;
    }
    
    public void setWhoIsIt(String who) {
        whoIsIt = who;
    }
    
    public int getRateOfReturn() {
        return rateOfReturn;
    }
    
    public void setRateOfReturn(int rate) {
        rateOfReturn = rate;
    }
    
    public boolean getAdditionalPlans() {
        return additionalPlans;
    }
    
    public void setAdditionalPlans(boolean bool) {
        additionalPlans = bool;
    }
    
    @Override
    public boolean getExtraPanel() {
        return additionalPlans;
    }
    
    
    @Override
    public String getPanelName() {
        return panelName;
    }

    public boolean getBelongsToClient() {
        return belongsToClient;
    }

    public boolean getBelongsToSpouse() {
        return belongsToSpouse;
    }
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> areContributionsPercentDropDown403b;
    private javax.swing.JPanel balance403bPanel;
    public javax.swing.JTextField contribution403b;
    public javax.swing.JTextField currentBalance403b;
    public javax.swing.JTextField dayAsOf403b;
    public javax.swing.JTextField firstCompanyMatch403bText;
    private static javax.swing.JLabel firstPercentMatch6;
    public javax.swing.JTextField firstPercentMatched403bText;
    private static javax.swing.JLabel fourthPercentMatch6;
    private javax.swing.JRadioButton hasAdditional403bPlansAfterFirstNo;
    private javax.swing.JRadioButton hasAdditional403bPlansAfterFirstYes;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    public javax.swing.JTextField monthAsOf403b;
    private javax.swing.JLabel panelLabel;
    private javax.swing.JPanel percent403bPanel;
    private javax.swing.JSlider percentContributing403b;
    private javax.swing.JLabel percentContributing403bLabel;
    private javax.swing.JPanel percentOrBalance403bPanel;
    private javax.swing.JLabel rateOfReturn403bLabel;
    private javax.swing.JSlider rateOfReturn403bSlider;
    public javax.swing.JTextField secondCompanyMatch403bText;
    public static javax.swing.JLabel secondPercentMatch6;
    public javax.swing.JTextField secondPercentMatched403bText;
    private static javax.swing.JLabel thirdPercentMatch6;
    private static javax.swing.JLabel whatIsMatchLabel6;
    private javax.swing.JComboBox<String> whoDoes403bBelongto;
    public javax.swing.JTextField yearAsOf403b;
    // End of variables declaration//GEN-END:variables
}