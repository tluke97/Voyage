/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyagefinancial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author TannerLuke
 */
public class UserInterface extends javax.swing.JFrame {

    
    
    private static final UserInterface ui = new UserInterface();
    
    
    Color onHover = new Color(128,128,128,255);
    Color backgroundColor = new Color(180,180,180,255);
    
    
    String currentPanel;
    PanelArray panels;
    
    int panelIterator;
    int panelCount;
    
    
    
    ClientProfile clientProfile;
    ClientProfile spouseProfile;
    
    
    //JPANEL VARIABLES
    
    DataTableClass dataTable;
    PersonalInformationPanel clientInfoPanel;
    PersonalInformationPanel spouseInfoPanel;
    TraditionalVsRothPanels info401KPanel;
    RegularInfoPanels hsaInfoPanel;
    RegularInfoPanels info403bPanel;
    RegularInfoPanels info457Panel;
    RegularInfoPanels flexSpendInfoPanel;
    IraInfoPanel iraPanel;
    PensionInfoPanel pensionPanel;
    OptionsGrantsPanel optionsAndGrantsPanel;
    RetirementPlansPanel retirementPlansPanel; 
    AnnuitiesPanel annuitiesPanel;
    SocialSecurityPanel socialSecurityPanel;
    HomePanel homePanel;
    
    
    JButton nextBtn = new JButton();
    JButton backBtn = new JButton();
    
    
    //JPANEL DECLARATION ROUND 2
    
    OptionsGrantsPanel optionsAndGrantsPanel2;
    AnnuitiesPanel annuitiesPanel2;
    TraditionalVsRothPanels info401KPanel2;
    RegularInfoPanels hsaInfoPanel2;
    RegularInfoPanels info403bPanel2;
    RegularInfoPanels info457Panel2;
    RegularInfoPanels flexSpendInfoPanel2;
    IraInfoPanel iraPanel2;
    PensionInfoPanel pensionPanel2;
    SocialSecurityPanel socialSecurityPanel2;
    
    // JPANEL DECLARATION ROUND 3
    
    OptionsGrantsPanel optionsAndGrantsPanel3;
    AnnuitiesPanel annuitiesPanel3;
    TraditionalVsRothPanels info401KPanel3;
    RegularInfoPanels hsaInfoPanel3;
    RegularInfoPanels info403bPanel3;
    RegularInfoPanels info457Panel3;
    RegularInfoPanels flexSpendInfoPanel3;
    IraInfoPanel iraPanel3;
    PensionInfoPanel pensionPanel3;
    
    
    
    
    
    ArrayList<JPanel> panelArray;
    ArrayList<String> panelStringArray;
    
    
    long differenceInDays;
    
    
    
    
    static Connection con;
    static PreparedStatement pst;
    static DBConnection dbConnection;
    public boolean switchPanels;
    
    
    
           
    public ArrayList<JPanel> retirementPlanPanels = new ArrayList<JPanel>();
    //public PanelArrayObjects getRetirementObjects;
    public int iteratingRetirementPanels = 0;
    public ArrayList<String> retirementPlanPanelsString = new ArrayList<String>();
    public int iteratingRetirementPanelsString = 1;
    
    boolean isClientContributing;
    
    public boolean clientRecievesLumpSumBool = false;
    public boolean clientRecievesMonthlyBool = false;
    
    
    //getting the amount of 401k Panels
    
    public boolean plus401kAfterFirst = false;
    public boolean plus401kAfterSecond = false;
    public boolean plus401kAfterThird = false;
    public boolean plus401kAfterFourth = false;
    
    
    
    //getting the amount of 403b panels
    
    
    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
        initComponents();
        
        createButtons();
       
       
        
        currentPanel = "home";
        
        socialSecurityPanel = new SocialSecurityPanel();
        annuitiesPanel = new AnnuitiesPanel();
        clientInfoPanel = new PersonalInformationPanel(true);
        spouseInfoPanel = new PersonalInformationPanel(false);
        info401KPanel = new TraditionalVsRothPanels("401K");
        hsaInfoPanel = new RegularInfoPanels("HSA");
        info403bPanel = new RegularInfoPanels("403B");
        info457Panel = new RegularInfoPanels("457");
        flexSpendInfoPanel = new RegularInfoPanels("Flexible Spending");
        iraPanel = new IraInfoPanel();
        pensionPanel = new PensionInfoPanel();
        retirementPlansPanel = new RetirementPlansPanel(); 
        homePanel = new HomePanel();
        optionsAndGrantsPanel = new OptionsGrantsPanel();
        clientProfile = new ClientProfile();
        
       
        
        workSpacePanel.removeAll();
        workSpacePanel.add(homePanel);
        workSpacePanel.repaint();
        workSpacePanel.revalidate();
        
        
        
        
       
        
        panels = new PanelArray();
        panelArray = new ArrayList<JPanel>();
        panelStringArray = new ArrayList<String>();
        panelIterator = 0;
        panelCount = 0;
        
        nextBtn.setVisible(false);
        backBtn.setVisible(false);
        
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(15,15); //Border corners arcs {width,height}, change this to whatever you want
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        //Draws the rounded panel with borders.
            graphics.setColor(getBackground());
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
            }
        };
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideButtonPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        workSpacePanel = new javax.swing.JPanel();
        voyagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideButtonPanel.setBackground(new java.awt.Color(0, 51, 102));
        sideButtonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Input");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sideButtonPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 0, 125, 38));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sideButtonPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 38));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        sideButtonPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        getContentPane().add(sideButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1280, 40));

        workSpacePanel.setBackground(new java.awt.Color(255, 255, 255));
        workSpacePanel.setForeground(new java.awt.Color(0, 39, 169));
        workSpacePanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(workSpacePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 155, 1180, 480));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        jLabel1.setText("Voyage Financial");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel2.setText("Because Retirement is a Journey... not a Destination");

        javax.swing.GroupLayout voyagePanelLayout = new javax.swing.GroupLayout(voyagePanel);
        voyagePanel.setLayout(voyagePanelLayout);
        voyagePanelLayout.setHorizontalGroup(
            voyagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(voyagePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(voyagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(660, Short.MAX_VALUE))
        );
        voyagePanelLayout.setVerticalGroup(
            voyagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(voyagePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(voyagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 1150, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1280, 510));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 40, 240));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 260, 40, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void createButtons() {
        nextBtn.setSize(jPanel1.getWidth(), jPanel1.getHeight());
        nextBtn.setBackground(backgroundColor);
        nextBtn.setOpaque(true);
        nextBtn.setMargin(new Insets(0,0,0,0));
        nextBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        nextBtn.setBorderPainted(true);
        nextBtn.addActionListener((e) -> {goForward();});
        nextBtn.setFont(new Font("Helvetica Neue", Font.BOLD, 24));
        nextBtn.setForeground(Color.WHITE);
        
        nextBtn.addMouseListener(new MouseAdapter() {
        
                @Override
                public void mouseEntered(MouseEvent evt)
                {
                   nextBtn.setBackground(onHover);
                
                }
                @Override
                public void mouseExited(MouseEvent evt)
                {
                    nextBtn.setBackground(backgroundColor);
                }
        
            }
        );
                
        
        nextBtn.setContentAreaFilled(true);
        nextBtn.setText(">");
        
        jPanel1.add(nextBtn);
        
        
        backBtn.setSize(jPanel1.getWidth(), jPanel1.getHeight());
        backBtn.setBackground(backgroundColor);
        backBtn.setOpaque(true);
        backBtn.setMargin(new Insets(0,0,0,0));
        backBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        backBtn.setBorderPainted(true);
        
        backBtn.setFont(new Font("Helvetica Neue", Font.BOLD, 24));
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener((e) -> {
            goBack();
        });
        backBtn.addMouseListener(new MouseAdapter() {
        
                @Override
                public void mouseEntered(MouseEvent evt)
                {
                   backBtn.setBackground(onHover);
                
                }
                @Override
                public void mouseExited(MouseEvent evt)
                {
                    backBtn.setBackground(backgroundColor);
                }
        
            }
        );
                
        
        backBtn.setContentAreaFilled(true);
        backBtn.setText("<");
        
        jPanel3.add(backBtn);
        
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        backBtn.setVisible(true);
        nextBtn.setVisible(true);
        
        workSpacePanel.removeAll();
        workSpacePanel.add(clientInfoPanel);
        workSpacePanel.repaint();
        workSpacePanel.revalidate();
        
        currentPanel = "clientInfo";
        
        //backButton.setVisible(true);
        
        /*
        inputCardPanel.removeAll();
        inputCardPanel.add(clientInfoPanel);
        inputCardPanel.repaint();
        inputCardPanel.revalidate();
        */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        workSpacePanel.removeAll();
        //workSpacePanel.add(homeCardPanel);
        workSpacePanel.repaint();
        workSpacePanel.revalidate();
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DataTableClass dataTables = new DataTableClass();
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
    
    private void checkOnBack() {
        
        String currentPan = panelStringArray.get(panelIterator);
        System.out.println(currentPan);
        
        
        if (currentPan.equals("pensionPanel1")) {
            
           
            
        } 
        else if (currentPan.equals("info401kPanel2")) {
            
          
            if (!info401KPanel2.getExtraPanel()) {
                
                //panels.insertPanel(info401KPanel2, info401KPanel, "info401kPanel2");
                panels.removePanel(info401KPanel3, "info401kPanel3");
                
            }
              
        } else if (currentPan.equals("info401KPanel1")) {
            
            if (!info401KPanel.getExtraPanel()) {
                
                panels.removePanel(info401KPanel2, "info401kPanel2");
                if (panelStringArray.contains("info401kPanel3")) {
                    panels.removePanel(info401KPanel3, "info401kPanel3");
                }
            }
            
        } else if (currentPan.equals("info403bPanel2")) {
            
            if (!info403bPanel2.getExtraPanel()) {
                
                panels.removePanel(info403bPanel3, "info403bPanel3");
            }
            
        } else if (currentPan.equals("info403bPanel")) {
            
            if (!info403bPanel.getExtraPanel()) {
                
                panels.removePanel(info403bPanel2, "info403bPanel2");
                
                if (panelStringArray.contains("info403bPanel3")) {
                    panels.removePanel(info403bPanel3, "info403bPanel3");
                }
                
            }
            
        } else if (currentPan.equals("info457Panel1")) {
             
            if (!info457Panel.getExtraPanel()) {
                System.out.println("working");
                panels.removePanel(info457Panel2, "info457Panel2");
                
                if (panelStringArray.contains("info457Panel3")) {
                    panels.removePanel(info457Panel3, "info457Panel3");
                }
                
            }
            
        } else if (currentPan.equals("info457Panel2")) {
            
            if (!info457Panel2.getExtraPanel()) {
                panels.removePanel(info457Panel3, "info457Panel3");
            }
            
        } else if (currentPan.equals("iraPanel1")) {
            
            if (!iraPanel.getExtraPanel()) {
                
                panels.removePanel(iraPanel2, "iraPanel2");
                if (panelStringArray.contains("iraPanel3")) {
                    panels.removePanel(iraPanel3, "iraPanel3");
                }
            }
            
        } else if (currentPan.equals("iraPanel2")) {
            
            if (!iraPanel2.getExtraPanel()) {
                panels.removePanel(iraPanel3, "iraPanel3");
            }
            
        } else if (currentPan.equals("hsaInfoPanel1")) {
            
            if (!hsaInfoPanel.getExtraPanel()) {
                panels.removePanel(hsaInfoPanel2, "hsaInfoPanel2");
                if (panelStringArray.contains("hsaInfoPanel3")) {
                    panels.removePanel(hsaInfoPanel, "hsaInfoPanel3");
                }
            }
        } else if (currentPan.equals("hsaInfoPanel2")) {
            
            if (!hsaInfoPanel2.getExtraPanel()) {
                panels.removePanel(hsaInfoPanel3, "hsaInfoPanel3");
            }
            
        } else if (currentPan.equals("flexSpendInfoPanel1")) {
            
            if (!flexSpendInfoPanel.getExtraPanel()) {
                panels.removePanel(flexSpendInfoPanel2, "flexSpendInfoPanel2");
                if (panelStringArray.contains("flexSpendInfoPanel3")) {
                    panels.removePanel(flexSpendInfoPanel3, "flexSpendInfoPanel3");
                }
            }
            
        } else if (currentPan.equals("flexSpendInfoPanel2")) {
            
            if (!flexSpendInfoPanel2.getExtraPanel()) {
                panels.removePanel(flexSpendInfoPanel3, "flexSpendInfoPanel3");
            }
        } else if (currentPan.equals("annuitiesPanel2")) {
            if (!annuitiesPanel2.getExtraPanel()) {
                panels.removePanel(annuitiesPanel3, "annuitiesPanel3");
            }
        } else if (currentPan.equals("annuitiesPanel1")) {
            if (!annuitiesPanel.getExtraPanel()) {
                panels.removePanel(annuitiesPanel2, "annuitiesPanel2");
                if (panelArray.contains(annuitiesPanel2)) {
                    panels.removePanel(annuitiesPanel3, "annuitiesPanel3");
                }
            }
        } else if (currentPan.equals("socialSecurityPanel1")) {
            if (!socialSecurityPanel.getExtraPanel()) {
                panels.removePanel(socialSecurityPanel2, "socialSecurityPanel2");
            }
        } else if (currentPan.equals("optionsAndGrantsPanel2")) {
            if (!optionsAndGrantsPanel2.getExtraPanel()) {
                panels.removePanel(optionsAndGrantsPanel3, "optionsAndGrantsPanel3");
            }
        } else if (currentPan.equals("optionsAndGrantsPanel1")) {
            if (!optionsAndGrantsPanel.getExtraPanel()) {
                panels.removePanel(optionsAndGrantsPanel2, "optionsAndGrantsPanel2");
                if (panelArray.contains(optionsAndGrantsPanel3)) {
                    panels.removePanel(optionsAndGrantsPanel3, "optionsAndGrantsPanel3");
                }
            }
        }
        
        
        
        
        
        
        
        
        //System.out.println(panelIterator);
        
        panelArray = panels.getPanels();
        panelStringArray = panels.getPanelStrings();
            
        panelCount = panelArray.size();
        
        //System.out.println(panelStringArray);
        
        
    }
    
    
    
    
    
    
    
    public void addToPanelArray() {
        
        
        
        String currentPan = panelStringArray.get(panelIterator);
        
       
       
        
        if (currentPan.equals("pensionPanel1")) {
            
           if (pensionPanel.getExtraPanel()) {
               pensionPanel2 = new PensionInfoPanel();
               panels.insertPanel(pensionPanel2, pensionPanel, "pensionPanel2");
           }
            
        } 
        else if (currentPan.equals("info401KPanel1")) {
            
          
            if (info401KPanel.getExtraPanel()) {
                info401KPanel2 = new TraditionalVsRothPanels("401K");
                panels.insertPanel(info401KPanel2, info401KPanel, "info401kPanel2");
                
            }
              
        } else if (currentPan.equals("info401kPanel2")) {
            
            if (info401KPanel2.getExtraPanel()) {
                info401KPanel3 = new TraditionalVsRothPanels("401K");
                panels.insertPanel(info401KPanel3, info401KPanel2, "info401kPanel3");
            }
            
        } else if (currentPan.equals("info403bPanel1")) {
            System.out.println(info403bPanel.getExtraPanel());
            if (info403bPanel.getExtraPanel()) {
                info403bPanel2 = new RegularInfoPanels("403B");
                panels.insertPanel(info403bPanel2, info403bPanel, "info403bPanel2");
            }
            
        } else if (currentPan.equals("info403bPanel2")) {
            
            if (info403bPanel2.getExtraPanel()) {
                info403bPanel3 = new RegularInfoPanels("403B");
                panels.insertPanel(info403bPanel3, info403bPanel2, "info403bPanel3");
            }
            
        } else if (currentPan.equals("info457Panel1")) {
             
            if (info457Panel.getExtraPanel()) {
                info457Panel2 = new RegularInfoPanels("457");
                panels.insertPanel(info457Panel2, info457Panel, "info457Panel2");
            }
            
        } else if (currentPan.equals("info457Panel2")) {
            
            if (info457Panel2.getExtraPanel()) {
                info457Panel3 = new RegularInfoPanels("457");
                panels.insertPanel(info457Panel3, info457Panel2, "info457Panel3");
            }
            
        } else if (currentPan.equals("iraPanel1")) {
            
            if (iraPanel.getExtraPanel()) {
                iraPanel2 = new IraInfoPanel();
                panels.insertPanel(iraPanel2, iraPanel, "iraPanel2");
            }
            
        } else if (currentPan.equals("iraPanel2")) {
            
            if (iraPanel2.getExtraPanel()) {
                iraPanel3 = new IraInfoPanel();
                panels.insertPanel(iraPanel3, iraPanel2, "iraPanel3");
            }
            
        } else if (currentPan.equals("hsaInfoPanel1")) {
            
            if (hsaInfoPanel.getExtraPanel()) {
                hsaInfoPanel2 = new RegularInfoPanels("HSA");
                panels.insertPanel(hsaInfoPanel2, hsaInfoPanel, "hsaInfoPanel2");
            }
        } else if (currentPan.equals("hsaInfoPanel2")) {
            
            if (hsaInfoPanel2.getExtraPanel()) {
                hsaInfoPanel3 = new RegularInfoPanels("HSA");
                panels.insertPanel(hsaInfoPanel3, hsaInfoPanel2, "hsaInfoPanel3");
            }
            
        } else if (currentPan.equals("flexSpendInfoPanel1")) {
            
            if (flexSpendInfoPanel.getExtraPanel()) {
                flexSpendInfoPanel2 = new RegularInfoPanels("Flexible Spending");
                panels.insertPanel(flexSpendInfoPanel2, flexSpendInfoPanel, "flexSpendInfoPanel2");
            }
            
        } else if (currentPan.equals("flexSpendInfoPanel2")) {
            
            if (flexSpendInfoPanel2.getExtraPanel()) {
                flexSpendInfoPanel3 = new RegularInfoPanels("Flexible Spending");
                panels.insertPanel(flexSpendInfoPanel3, flexSpendInfoPanel2, "flexSpendInfoPanel3");
            }
        } else if (currentPan.equals("annuitiesPanel1")) {
            if (annuitiesPanel.getExtraPanel()) {
                annuitiesPanel2 = new AnnuitiesPanel();
                panels.insertPanel(annuitiesPanel2, annuitiesPanel, "annuitiesPanel2");
            }
        } else if (currentPan.equals("annuitiesPanel2")) {
            if (annuitiesPanel2.getExtraPanel()) {
                annuitiesPanel3 = new AnnuitiesPanel();
                panels.insertPanel(annuitiesPanel3, annuitiesPanel2, "annuitiesPanel3");
            }
        } else if (currentPan.equals("socialSecurityPanel1")) {
            if (socialSecurityPanel.getExtraPanel()) {
                socialSecurityPanel2 = new SocialSecurityPanel();
                panels.insertPanel(voyagePanel, voyagePanel, currentPan);
            }
        } else if (currentPan.equals("optionsAndGrantsPanel1")) {
            if (optionsAndGrantsPanel.getExtraPanel()) {
                optionsAndGrantsPanel2 = new OptionsGrantsPanel();
                panels.insertPanel(optionsAndGrantsPanel2, optionsAndGrantsPanel, "optionsAndGrantsPanel2");
            }
        } else if (currentPan.equals("optionsAndGrantsPanel2")) {
            if (optionsAndGrantsPanel2.getExtraPanel()) {
                optionsAndGrantsPanel3 = new OptionsGrantsPanel();
                panels.insertPanel(optionsAndGrantsPanel3, optionsAndGrantsPanel2, "optionsAndGrantsPanel3");
            }
        }
        
       
        
        
        
        
        
        
        
        panelArray = panels.getPanels();
            
        panelCount = panelArray.size();
        
        //System.out.println(panelStringArray);
        
        
        
        if (panelIterator < panelCount) {   
            workSpacePanel.removeAll();
            workSpacePanel.add(panelArray.get(panelIterator+1));
            workSpacePanel.repaint();
            workSpacePanel.revalidate();
            
            currentPanel = "panelArray";
            
        } 
        
//        if (panelIterator == 0) {
//            workSpacePanel.removeAll();
//            workSpacePanel.add(panelArray.get(panelIterator));
//            workSpacePanel.repaint();
//            workSpacePanel.revalidate();
//        }
        
            
        panelIterator++;
            
        
    }
    
  
    public void goBack() {
        if (currentPanel.equals("retirementInfo") && clientInfoPanel.getSpouseBool()) {
            workSpacePanel.removeAll();
            workSpacePanel.add(spouseInfoPanel);
            workSpacePanel.repaint();
            workSpacePanel.revalidate();
            currentPanel = "spouseInfo";
            backBtn.setVisible(true);
            
        } else if (currentPanel.equals("retirementInfo") && !clientInfoPanel.getSpouseBool())  {
            
            workSpacePanel.removeAll();
            workSpacePanel.add(clientInfoPanel);
            workSpacePanel.repaint();
            workSpacePanel.revalidate();
            currentPanel = "clientInfo";
            backBtn.setVisible(false);
        } else if (currentPanel.equals("spouseInfo")) {
            workSpacePanel.removeAll();
            workSpacePanel.add(clientInfoPanel);
            workSpacePanel.repaint();
            workSpacePanel.revalidate();
            currentPanel = "clientInfo";
            backBtn.setVisible(false);
        } else if (currentPanel.equals("panelArray")) {
           checkOnBack();
            if (panelIterator > 0) {   
                workSpacePanel.removeAll();
                workSpacePanel.add(panelArray.get(panelIterator - 1));
                workSpacePanel.repaint();
                workSpacePanel.revalidate();
            
                currentPanel = "panelArray";
               
                panelIterator--;
            } else {
                panels.clearPanels();
                
                workSpacePanel.removeAll();
                workSpacePanel.add(retirementPlansPanel);
                workSpacePanel.repaint();
                workSpacePanel.revalidate();
                
                System.out.println(panels.getPanelStrings() + " " + panels.getPanels() );
                currentPanel = "retirementInfo";
            }
            
        }
        System.out.println(panelIterator);
        
    }
    
    
    
    
    public void goForward() {
        
         if (currentPanel.equals("clientInfo") && clientInfoPanel.getSpouseBool()) {
            workSpacePanel.removeAll();
            workSpacePanel.add(spouseInfoPanel);
            workSpacePanel.repaint();
            workSpacePanel.revalidate();
            currentPanel = "spouseInfo";
            backBtn.setVisible(true);
        }
        
        else if (currentPanel.equals("clientInfo")) {
            workSpacePanel.removeAll();
            workSpacePanel.add(retirementPlansPanel);
            workSpacePanel.repaint();
            workSpacePanel.revalidate();
            currentPanel = "retirementInfo";
            backBtn.setVisible(true);
        }
        
        else if (currentPanel.equals("spouseInfo")) {
            workSpacePanel.removeAll();
            workSpacePanel.add(retirementPlansPanel);
            workSpacePanel.repaint();
            workSpacePanel.revalidate();
            currentPanel = "retirementInfo";
        }
        
        else if (currentPanel.equals("retirementInfo") || currentPanel.equals("panelArray")) {
          
            if (currentPanel.equals("retirementInfo")) {
                panelArray.removeAll(panelArray);
                initPanels();
                
                if (panelIterator < panelCount) {   
                    workSpacePanel.removeAll();
                    workSpacePanel.add(panelArray.get(panelIterator));
                    workSpacePanel.repaint();
                    workSpacePanel.revalidate();
            
                    currentPanel = "panelArray";
                    
                }
            } else {
                try {
                    checkOnBack();
                    addToPanelArray();
                } catch (IndexOutOfBoundsException e) {
                    createClientProfile();
                    if (clientInfoPanel.getSpouseBool()) {
                        spouseProfile = new ClientProfile();
                        createSpouseProfile();
                    }
                    dataTable = new DataTableClass();
                    workSpacePanel.removeAll();
                    workSpacePanel.add(dataTable);
                    workSpacePanel.repaint();
                    workSpacePanel.revalidate();
                }
                
            }    
        }  
    }
    
    
    
    
    
    
    public static void showPane(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
    public void initPanels() {
        if (retirementPlansPanel.getHasPension()) {
                panels.addPanel(pensionPanel, "pensionPanel1");
            }
            
            if (retirementPlansPanel.getHasSocialSecurity()) {
               panels.addPanel(socialSecurityPanel, "socialSecurityPanel1");
            }
            
            if (retirementPlansPanel.getHas401k()) {
                panels.addPanel(info401KPanel, "info401KPanel1");
            }
            
            if (retirementPlansPanel.getHas403b()) {
                panels.addPanel(info403bPanel, "info403bPanel1");
            }
            
            if (retirementPlansPanel.getHas457()) {
                panels.addPanel(info457Panel, "info457Panel1");
            }
            
            if (retirementPlansPanel.getHasIra()) {
                panels.addPanel(iraPanel, "iraPanel1");
            }
            
            if (retirementPlansPanel.getHasSimpleIra()) {
                // add simple ira panel
            }
            
            if (retirementPlansPanel.getNonRetirementInvestmentAccount()) {
                // add investment account panel
            }
            
            if (retirementPlansPanel.getHasAnnuities()) {
                panels.addPanel(annuitiesPanel, "annuitiesPanel1");
            }
            
            if (retirementPlansPanel.getHasCds()) {
                //add CDs panel
            }
            
            if (retirementPlansPanel.getHasChecking()) {
                // add checking panel
            }
            
            if (retirementPlansPanel.getHasSavings()) {
                //add checking panel
            }
            
            if (retirementPlansPanel.getHasDefferedComp()) {
                // add deferred comp panel
            }
            
            if (retirementPlansPanel.getHasHsa()) {
                panels.addPanel(hsaInfoPanel, "hsaInfoPanel1");
            }
            
            if (retirementPlansPanel.getHasFlexibleSoending()) {
                panels.addPanel(flexSpendInfoPanel, "flexSpendInfoPanel1");
            }
            
            if (retirementPlansPanel.getHasOptionsGrants()) {
                panels.addPanel(optionsAndGrantsPanel, "optionsAndGrantsPanel1");
            }
            
            
            panelArray = panels.getPanels();
            panelStringArray = panels.getPanelStrings();
            panelCount = panelArray.size();
            
    }
    
    
    
    
    public void createClientProfile() {
   
        
        clientProfile.setAge(clientInfoPanel.getAge());
        
        clientProfile.setFirstName(clientInfoPanel.getFirstName());
        
        clientProfile.setLastName(clientInfoPanel.getLastName());
        clientProfile.setBirthMonth(clientInfoPanel.getBirthMonth());
        clientProfile.setBirthDay(clientInfoPanel.getBirthDay());
        clientProfile.setBirthYear(clientInfoPanel.getBirthYear());
        clientProfile.setRetirementMonth(clientInfoPanel.getRetirementMonth());
        clientProfile.setRetirementDay(clientInfoPanel.getRetirementDay());
        clientProfile.setRetirementYear(clientInfoPanel.getRetirementYear());
        clientProfile.setCompany(clientInfoPanel.getCompany());
        clientProfile.setServiceMonth(clientInfoPanel.getServiceMonth());
        clientProfile.setServiceDay(clientInfoPanel.getServiceDay());
        clientProfile.setServiceYear(clientInfoPanel.getServiceYear());
        clientProfile.setBonus(clientInfoPanel.getBonus());
        clientProfile.setBaseSalary(clientInfoPanel.getBaseSalary());
        
       
        
        if (panelStringArray.contains("annuitiesPanel1") && annuitiesPanel.getBelongsTo().equals("Client")) {
            if (!clientProfile.isAnnuitiesFilled()) {
                clientProfile.setSavingsCurrentBalanceText(annuitiesPanel.getSavingsCurrentBalanceText());
                clientProfile.setAssumedIncomeText(annuitiesPanel.getAssumedIncomeText());
                clientProfile.setBalancedFundsCostBasisText(annuitiesPanel.getBalancedFundsCostBasisText());
                clientProfile.setBalancedFundsCurrentBalanceText(annuitiesPanel.getBalancedFundsCurrentBalanceText());
                clientProfile.setBalancedFundsDayText(annuitiesPanel.getBalancedFundsDayText());
                clientProfile.setBalancedFundsMonthText(annuitiesPanel.getBalancedFundsMonthText());
                clientProfile.setBalancedFundsYearText(annuitiesPanel.getBalancedFundsYearText());
                clientProfile.setBondsCostBasisText(annuitiesPanel.getBondsCostBasisText());
                clientProfile.setBondsCurrentBalanceText(annuitiesPanel.getBondsCurrentBalanceText());
                clientProfile.setBondsDayText(annuitiesPanel.getBondsDayText());
                clientProfile.setBondsMonthText(annuitiesPanel.getBondsMonthText());
                clientProfile.setBondsYearText(annuitiesPanel.getBondsYearText());
                clientProfile.setCheckingBalanceCostBasisText(annuitiesPanel.getCheckingBalanceCostBasisText());
                clientProfile.setCheckingCurrentBalanceText(annuitiesPanel.getCheckingCurrentBalanceText());
                clientProfile.setCheckingDayText(annuitiesPanel.getCheckingDayText());
                clientProfile.setCheckingMonthText(annuitiesPanel.getCheckingMonthText());
                clientProfile.setCheckingYearText(annuitiesPanel.getCheckingYearText());
                clientProfile.setmBondsCurrentBalanceText(annuitiesPanel.getmBondsCurrentBalanceText());
                clientProfile.setmBondsMonthText(annuitiesPanel.getmBondsMonthText());
                clientProfile.setmBondsDayText(annuitiesPanel.getmBondsDayText());
                clientProfile.setmBondsYearText(annuitiesPanel.getmBondsYearText());
                clientProfile.setmBondsCostBasis(annuitiesPanel.getmBondsCostBasisText());
                clientProfile.setRateOfReturnText(annuitiesPanel.getRateOfReturnText());
                clientProfile.setSavingsCostBasisText(annuitiesPanel.getSavingsCostBasisText());
                clientProfile.setSavingsDayText(annuitiesPanel.getSavingsDayText());
                clientProfile.setSavingsMonthText(annuitiesPanel.getSavingsMonthText());
                clientProfile.setSavingsYearText(annuitiesPanel.getSavingsYearText());
                clientProfile.setStocksCostBasisText(annuitiesPanel.getStocksCostBasisText());
                clientProfile.setStocksCurrentBalanceText(annuitiesPanel.getStocksCurrentBalanceText());
                clientProfile.setStocksDayText(annuitiesPanel.getStocksDayText());
                clientProfile.setStocksMonthText(annuitiesPanel.getStocksMonthText());
                clientProfile.setStocksYearText(annuitiesPanel.getStocksYearText());
                clientProfile.setAnnuitiesFilled(true);

            } else if (clientProfile.isAnnuitiesFilled()) {
                clientProfile.setSavingsCurrentBalanceText2(annuitiesPanel.getSavingsCurrentBalanceText());
                clientProfile.setAssumedIncomeText2(annuitiesPanel.getAssumedIncomeText());
                clientProfile.setBalancedFundsCostBasisText2(annuitiesPanel.getBalancedFundsCostBasisText());
                clientProfile.setBalancedFundsCurrentBalanceText2(annuitiesPanel.getBalancedFundsCurrentBalanceText());
                clientProfile.setBalancedFundsDayText2(annuitiesPanel.getBalancedFundsDayText());
                clientProfile.setBalancedFundsMonthText2(annuitiesPanel.getBalancedFundsMonthText());
                clientProfile.setBalancedFundsYearText2(annuitiesPanel.getBalancedFundsYearText());
                clientProfile.setBondsCostBasisText2(annuitiesPanel.getBondsCostBasisText());
                clientProfile.setBondsCurrentBalanceText2(annuitiesPanel.getBondsCurrentBalanceText());
                clientProfile.setBondsDayText2(annuitiesPanel.getBondsDayText());
                clientProfile.setBondsMonthText2(annuitiesPanel.getBondsMonthText());
                clientProfile.setBondsYearText2(annuitiesPanel.getBondsYearText());
                clientProfile.setCheckingBalanceCostBasisText2(annuitiesPanel.getCheckingBalanceCostBasisText());
                clientProfile.setCheckingCurrentBalanceText2(annuitiesPanel.getCheckingCurrentBalanceText());
                clientProfile.setCheckingDayText2(annuitiesPanel.getCheckingDayText());
                clientProfile.setCheckingMonthText2(annuitiesPanel.getCheckingMonthText());
                clientProfile.setCheckingYearText2(annuitiesPanel.getCheckingYearText());
                clientProfile.setmBondsCurrentBalanceText2(annuitiesPanel.getmBondsCurrentBalanceText());
                clientProfile.setmBondsMonthText2(annuitiesPanel.getmBondsMonthText());
                clientProfile.setmBondsDayText2(annuitiesPanel.getmBondsDayText());
                clientProfile.setmBondsYearText2(annuitiesPanel.getmBondsYearText());
                clientProfile.setmBondsCostBasis2(annuitiesPanel.getmBondsCostBasisText());
                clientProfile.setRateOfReturnText2(annuitiesPanel.getRateOfReturnText());
                clientProfile.setSavingsCostBasisText2(annuitiesPanel.getSavingsCostBasisText());
                clientProfile.setSavingsDayText2(annuitiesPanel.getSavingsDayText());
                clientProfile.setSavingsMonthText2(annuitiesPanel.getSavingsMonthText());
                clientProfile.setSavingsYearText2(annuitiesPanel.getSavingsYearText());
                clientProfile.setStocksCostBasisText2(annuitiesPanel.getStocksCostBasisText());
                clientProfile.setStocksCurrentBalanceText2(annuitiesPanel.getStocksCurrentBalanceText());
                clientProfile.setStocksDayText2(annuitiesPanel.getStocksDayText());
                clientProfile.setStocksMonthText2(annuitiesPanel.getStocksMonthText());
                clientProfile.setStocksYearText2(annuitiesPanel.getStocksYearText());
                clientProfile.setAnnuitiesFilled2(true);
            } 
            
            
        }
        
        
        
        if (panelStringArray.contains("iraPanel1") && iraPanel.getBelongsTo().equals("Client")) {
            if (!clientProfile.isIraFilled()) {
                clientProfile.setMonthIra(iraPanel.getMonth());
                clientProfile.setDayIra(iraPanel.getDay());
                clientProfile.setYearIra(iraPanel.getYear());
                clientProfile.setContributionRothIra(iraPanel.getContributionRoth());
                clientProfile.setContributionTraditionalIra(iraPanel.getContributionTraditional());
                clientProfile.setBalanceChosen(iraPanel.isBalanceChosen());
                if (clientProfile.isBalanceChosen()) {
                    clientProfile.setRothBalance(iraPanel.getRothBalance());
                    clientProfile.setTraditionalBalance(iraPanel.getTraditionalBalance());
                } else {
                    clientProfile.setPercentRoth(iraPanel.getPercentRoth());
                    clientProfile.setPercentTraditional(iraPanel.getPercentTraditional());
                }
                clientProfile.setIraFilled(true);
            } else if (clientProfile.isIraFilled()) {
                clientProfile.setMonthIra2(iraPanel.getMonth());
                clientProfile.setDayIra2(iraPanel.getDay());
                clientProfile.setYearIra2(iraPanel.getYear());
                clientProfile.setContributionRothIra2(iraPanel.getContributionRoth());
                clientProfile.setContributionTraditionalIra2(iraPanel.getContributionTraditional());
                clientProfile.setBalanceChosen2(iraPanel.isBalanceChosen());
                if (clientProfile.isBalanceChosen2()) {
                    clientProfile.setRothBalance2(iraPanel.getRothBalance());
                    clientProfile.setTraditionalBalance2(iraPanel.getTraditionalBalance());
                } else {
                    clientProfile.setPercentRoth2(iraPanel.getPercentRoth());
                    clientProfile.setPercentTraditional2(iraPanel.getPercentTraditional());
                }
                clientProfile.setIraFilled2(true);
            } else if (clientProfile.isIraFilled2()) {
                clientProfile.setMonthIra3(iraPanel.getMonth());
                clientProfile.setDayIra3(iraPanel.getDay());
                clientProfile.setYearIra3(iraPanel.getYear());
                clientProfile.setContributionRothIra3(iraPanel.getContributionRoth());
                clientProfile.setContributionTraditionalIra3(iraPanel.getContributionTraditional());
                clientProfile.setBalanceChosen3(iraPanel.isBalanceChosen());
                if (clientProfile.isBalanceChosen3()) {
                    clientProfile.setRothBalance3(iraPanel.getRothBalance());
                    clientProfile.setTraditionalBalance3(iraPanel.getTraditionalBalance());
                } else {
                    clientProfile.setPercentRoth3(iraPanel.getPercentRoth());
                    clientProfile.setPercentTraditional3(iraPanel.getPercentTraditional());
                }
                clientProfile.setIraFilled3(true);
            }
            
            System.out.println(clientProfile.getMonthIra());
            System.out.println(clientProfile.getDayIra());
            System.out.println(clientProfile.getYearIra());
            System.out.println(clientProfile.getContributionRothIra());
            System.out.println(clientProfile.getContributionRothIra());
            System.out.println(clientProfile.isBalanceChosen());
            System.out.println(clientProfile.getRothBalance());
            System.out.println(clientProfile.getTraditionalBalance());
            System.out.println(clientProfile.getPercentRoth());
            System.out.println(clientProfile.getPercentTraditional());
            
        }
        
        if (panelStringArray.contains("optionsAndGrantsPanel1") && optionsAndGrantsPanel.getBelongsTo().equals("Client")) {
            
            if (!clientProfile.isOptionsGrantsFilled()) {
                clientProfile.setAwardDay(optionsAndGrantsPanel.getAwardDay());
                clientProfile.setAwardMonth(optionsAndGrantsPanel.getAwardMonth());
                clientProfile.setAwardYear(optionsAndGrantsPanel.getAwardYear());
                clientProfile.setCurrentAmount(optionsAndGrantsPanel.getCurrentAmount());
                clientProfile.setCurrentValue(optionsAndGrantsPanel.getCurrentValue());
                clientProfile.setExpirationDay(optionsAndGrantsPanel.getExpirationDay());
                clientProfile.setExpirationMonth(optionsAndGrantsPanel.getExpirationMonth());
                clientProfile.setExpirationYear(optionsAndGrantsPanel.getExpirationYear());
                clientProfile.setRateOfReturn(optionsAndGrantsPanel.getRateOfReturn());
                clientProfile.setOptionsGrantsFilled(true);
                
            } else if (clientProfile.isOptionsGrantsFilled()) {
                
                clientProfile.setAwardDay2(optionsAndGrantsPanel.getAwardDay());
                clientProfile.setAwardMonth2(optionsAndGrantsPanel.getAwardMonth());
                clientProfile.setAwardYear2(optionsAndGrantsPanel.getAwardYear());
                clientProfile.setCurrentAmount2(optionsAndGrantsPanel.getCurrentAmount());
                clientProfile.setCurrentValue2(optionsAndGrantsPanel.getCurrentValue());
                clientProfile.setExpirationDay2(optionsAndGrantsPanel.getExpirationDay());
                clientProfile.setExpirationMonth2(optionsAndGrantsPanel.getExpirationMonth());
                clientProfile.setExpirationYear2(optionsAndGrantsPanel.getExpirationYear());
                clientProfile.setRateOfReturn2(optionsAndGrantsPanel.getRateOfReturn());
                clientProfile.setOptionsGrantsFilled2(true);
                
            } else if (clientProfile.isOptionsGrantsFilled2()) {
                clientProfile.setAwardDay3(optionsAndGrantsPanel.getAwardDay());
                clientProfile.setAwardMonth3(optionsAndGrantsPanel.getAwardMonth());
                clientProfile.setAwardYear3(optionsAndGrantsPanel.getAwardYear());
                clientProfile.setCurrentAmount3(optionsAndGrantsPanel.getCurrentAmount());
                clientProfile.setCurrentValue3(optionsAndGrantsPanel.getCurrentValue());
                clientProfile.setExpirationDay3(optionsAndGrantsPanel.getExpirationDay());
                clientProfile.setExpirationMonth3(optionsAndGrantsPanel.getExpirationMonth());
                clientProfile.setExpirationYear3(optionsAndGrantsPanel.getExpirationYear());
                clientProfile.setRateOfReturn3(optionsAndGrantsPanel.getRateOfReturn());
                clientProfile.setOptionsGrantsFilled3(true);
            }
            
            System.out.println(clientProfile.getAwardDay());
            System.out.println(clientProfile.getAwardMonth());
            System.out.println(clientProfile.getAwardYear());
            System.out.println(clientProfile.getCurrentAmount());
            System.out.println(clientProfile.getCurrentValue());
            System.out.println(clientProfile.getExpirationDay());
            System.out.println(clientProfile.getExpirationMonth());
            System.out.println(clientProfile.getExpirationYear());
            System.out.println(clientProfile.getRateOfReturn());
        }
        
        
        
        if (panelStringArray.contains("pensionPanel1") && pensionPanel.getBelongToClient()) {
            
            if (!clientProfile.isPensionFilled()) {
                clientProfile.setClientRecievesLumpSumBool(pensionPanel.getLumpBool());
                clientProfile.setClientRecievesMonthlyBool(pensionPanel.getMonthlyBool());
                clientProfile.setCostOfLivingAdjustment(pensionPanel.getCostOfLivingAdjustment());
                clientProfile.setAmountPension(pensionPanel.getAmountPension());
                clientProfile.setPensionDay(pensionPanel.getDay());
                clientProfile.setPensionMonth(pensionPanel.getMonth());
                clientProfile.setPensionYear(pensionPanel.getYear());
                clientProfile.setPensionFilled(true);
            } else if (clientProfile.isPensionFilled()) {
                
                clientProfile.setClientRecievesLumpSumBool2(pensionPanel.getLumpBool());
                clientProfile.setClientRecievesMonthlyBool2(pensionPanel.getMonthlyBool());
                clientProfile.setCostOfLivingAdjustment2(pensionPanel.getCostOfLivingAdjustment());
                clientProfile.setAmountPension2(pensionPanel.getAmountPension());
                clientProfile.setPensionDay2(pensionPanel.getDay());
                clientProfile.setPensionMonth2(pensionPanel.getMonth());
                clientProfile.setPensionYear2(pensionPanel.getYear());
                clientProfile.setPensionFilled2(true);
                
            } else if (clientProfile.isPensionFilled2()) {
                clientProfile.setClientRecievesLumpSumBool3(pensionPanel.getLumpBool());
                clientProfile.setClientRecievesMonthlyBool3(pensionPanel.getMonthlyBool());
                clientProfile.setCostOfLivingAdjustment3(pensionPanel.getCostOfLivingAdjustment());
                clientProfile.setAmountPension3(pensionPanel.getAmountPension());
                clientProfile.setPensionDay3(pensionPanel.getDay());
                clientProfile.setPensionMonth3(pensionPanel.getMonth());
                clientProfile.setPensionYear3(pensionPanel.getYear());
                clientProfile.setPensionFilled3(true);
            }
            System.out.println(clientProfile.isClientRecievesLumpSumBool());
            System.out.println(clientProfile.isClientRecievesMonthlyBool());
            System.out.println(clientProfile.getCostOfLivingAdjustment());
            System.out.println(clientProfile.getAmountPension());
            System.out.println(clientProfile.getPensionDay());
            System.out.println(clientProfile.getPensionMonth());
            System.out.println(clientProfile.getPensionYear());
        }
        
        
        
        if (panelStringArray.contains("info403bPanel1") && info403bPanel.getBelongsToClient()) {
            
            if (!clientProfile.isFilled403B()) {
                clientProfile.setCurrentBalance403B(info403bPanel.getCurrentBalance());
                clientProfile.setBalanceDay403B(info403bPanel.getBalanceDay());
                clientProfile.setBalanceMonth403B(info403bPanel.getBalanceMonth());
                clientProfile.setBalanceYear403B(info403bPanel.getBalanceYear());
                clientProfile.setContributionType403B(info403bPanel.getContributionType());
                if (clientProfile.getContributionType403B().equals("Percentage")) {
                    clientProfile.setContributionPercent403B(info403bPanel.getContributionPercent());
                } else if (clientProfile.getContributionType403B().equals("Balance")) {
                    clientProfile.setContributionBalance403B(info403bPanel.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNum403B(info403bPanel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum403B(info403bPanel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum403B(info403bPanel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum403B(info403bPanel.getSecondPercentOf());
                clientProfile.setRateOfReturn403B(info403bPanel.getRateOfReturn());        
                clientProfile.setFilled403B(true);
            } else if (clientProfile.isFilled403B()) {
                clientProfile.setCurrentBalance403B2(info403bPanel.getCurrentBalance());
                clientProfile.setBalanceDay403B2(info403bPanel.getBalanceDay());
                clientProfile.setBalanceMonth403B2(info403bPanel.getBalanceMonth());
                clientProfile.setBalanceYear403B2(info403bPanel.getBalanceYear());
                clientProfile.setContributionType403B2(info403bPanel.getContributionType());
                if (clientProfile.getContributionType403B2().equals("Percentage")) {
                    clientProfile.setContributionPercent403B2(info403bPanel.getContributionPercent());
                } else if (clientProfile.getContributionType403B2().equals("Balance")) {
                    clientProfile.setContributionBalance403B2(info403bPanel.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNum403B2(info403bPanel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum403B2(info403bPanel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum403B2(info403bPanel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum403B2(info403bPanel.getSecondPercentOf());
                clientProfile.setRateOfReturn403B2(info403bPanel.getRateOfReturn());  
                clientProfile.setFilled403B2(true);
            } else if (clientProfile.isFilled403B2()) {
                clientProfile.setCurrentBalance403B3(info403bPanel.getCurrentBalance());
                clientProfile.setBalanceDay403B3(info403bPanel.getBalanceDay());
                clientProfile.setBalanceMonth403B3(info403bPanel.getBalanceMonth());
                clientProfile.setBalanceYear403B3(info403bPanel.getBalanceYear());
                clientProfile.setContributionType403B3(info403bPanel.getContributionType());
                if (clientProfile.getContributionType403B3().equals("Percentage")) {
                    clientProfile.setContributionPercent403B3(info403bPanel.getContributionPercent());
                } else if (clientProfile.getContributionType403B3().equals("Balance")) {
                    clientProfile.setContributionBalance403B3(info403bPanel.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNum403B3(info403bPanel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum403B3(info403bPanel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum403B3(info403bPanel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum403B3(info403bPanel.getSecondPercentOf());
                clientProfile.setRateOfReturn403B3(info403bPanel.getRateOfReturn());         
                clientProfile.setFilled403B3(true);
            }
            
            
            
        }
        
        
        
        if (panelStringArray.contains("hsaInfoPanel1") && hsaInfoPanel.getBelongsToClient()) {
            if (!clientProfile.isHsaFilled()) {
                clientProfile.setCurrentBalanceHSA(hsaInfoPanel.getCurrentBalance());
                clientProfile.setBalanceMonthHSA(hsaInfoPanel.getBalanceMonth());
                clientProfile.setBalanceDayHSA(hsaInfoPanel.getBalanceDay());
                clientProfile.setBalanceYearHSA(hsaInfoPanel.getBalanceYear());
                clientProfile.setContributionTypeHSA(hsaInfoPanel.getContributionType());
                if (clientProfile.getContributionTypeHSA().equals("Percentage")) {
                    clientProfile.setContributionPercentHSA(hsaInfoPanel.getContributionPercent());
                } else if (clientProfile.getContributionTypeHSA().equals("Balance")) {
                    clientProfile.setContributionBalanceHSA(hsaInfoPanel.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNumHSA(hsaInfoPanel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumHSA(hsaInfoPanel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumHSA(hsaInfoPanel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumHSA(hsaInfoPanel.getSecondPercentOf());
                clientProfile.setRateOfReturnHSA(hsaInfoPanel.getRateOfReturn());
                clientProfile.setHsaFilled(true);
            } else if (clientProfile.isHsaFilled()) {
                clientProfile.setCurrentBalanceHSA2(hsaInfoPanel.getCurrentBalance());
                clientProfile.setBalanceMonthHSA2(hsaInfoPanel.getBalanceMonth());
                clientProfile.setBalanceDayHSA2(hsaInfoPanel.getBalanceDay());
                clientProfile.setBalanceYearHSA2(hsaInfoPanel.getBalanceYear());
                clientProfile.setContributionTypeHSA2(hsaInfoPanel.getContributionType());
                if (clientProfile.getContributionTypeHSA2().equals("Percentage")) {
                    clientProfile.setContributionPercentHSA2(hsaInfoPanel.getContributionPercent());
                } else if (clientProfile.getContributionTypeHSA2().equals("Balance")) {
                    clientProfile.setContributionBalanceHSA2(hsaInfoPanel.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNumHSA2(hsaInfoPanel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumHSA2(hsaInfoPanel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumHSA2(hsaInfoPanel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumHSA2(hsaInfoPanel.getSecondPercentOf());
                clientProfile.setRateOfReturnHSA2(hsaInfoPanel.getRateOfReturn());
                clientProfile.setHsaFilled2(true);
            } else if (clientProfile.isHsaFilled2()) {
                clientProfile.setCurrentBalanceHSA3(hsaInfoPanel.getCurrentBalance());
                clientProfile.setBalanceMonthHSA3(hsaInfoPanel.getBalanceMonth());
                clientProfile.setBalanceDayHSA3(hsaInfoPanel.getBalanceDay());
                clientProfile.setBalanceYearHSA3(hsaInfoPanel.getBalanceYear());
                clientProfile.setContributionTypeHSA3(hsaInfoPanel.getContributionType());
                if (clientProfile.getContributionTypeHSA3().equals("Percentage")) {
                    clientProfile.setContributionPercentHSA3(hsaInfoPanel.getContributionPercent());
                } else if (clientProfile.getContributionTypeHSA3().equals("Balance")) {
                    clientProfile.setContributionBalanceHSA3(hsaInfoPanel.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNumHSA3(hsaInfoPanel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumHSA3(hsaInfoPanel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumHSA3(hsaInfoPanel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumHSA3(hsaInfoPanel.getSecondPercentOf());
                clientProfile.setRateOfReturnHSA3(hsaInfoPanel.getRateOfReturn());
                clientProfile.setHsaFilled3(true);
            }
        }
        
        
        
        
        if (panelStringArray.contains("info457Panel1") && info457Panel.getBelongsToClient()) {
            if (!clientProfile.isFilled457()) {
                clientProfile.setCurrentBalance457(info457Panel.getCurrentBalance());
                clientProfile.setBalanceMonth457(info457Panel.getBalanceMonth());
                clientProfile.setBalanceDay457(info457Panel.getBalanceDay());
                clientProfile.setBalanceYear457(info457Panel.getBalanceYear());
                clientProfile.setContributionType457(info457Panel.getContributionType());
                if (clientProfile.getContributionType457().equals("Balance")) {
                    clientProfile.setContributionBalance457(info457Panel.getContributionBalance());
                } else if (clientProfile.getContributionType457().equals("Percent")) {
                    clientProfile.setContributionPercent457(info457Panel.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum457(info457Panel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum457(info457Panel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum457(info457Panel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum457(info457Panel.getSecondPercentOf());
                clientProfile.setRateOfReturn457(info457Panel.getRateOfReturn());
            } else if (clientProfile.isFilled457()) {
                clientProfile.setCurrentBalance4572(info457Panel.getCurrentBalance());
                clientProfile.setBalanceMonth4572(info457Panel.getBalanceMonth());
                clientProfile.setBalanceDay4572(info457Panel.getBalanceDay());
                clientProfile.setBalanceYear4572(info457Panel.getBalanceYear());
                clientProfile.setContributionType4572(info457Panel.getContributionType());
                if (clientProfile.getContributionType4572().equals("Balance")) {
                    clientProfile.setContributionBalance4572(info457Panel.getContributionBalance());
                } else if (clientProfile.getContributionType4572().equals("Percent")) {
                    clientProfile.setContributionPercent4572(info457Panel.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum4572(info457Panel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum4572(info457Panel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum4572(info457Panel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum4572(info457Panel.getSecondPercentOf());
                clientProfile.setRateOfReturn4572(info457Panel.getRateOfReturn());
            } else if (clientProfile.isFilled4572()) {
                clientProfile.setCurrentBalance4573(info457Panel.getCurrentBalance());
                clientProfile.setBalanceMonth4573(info457Panel.getBalanceMonth());
                clientProfile.setBalanceDay4573(info457Panel.getBalanceDay());
                clientProfile.setBalanceYear4573(info457Panel.getBalanceYear());
                clientProfile.setContributionType4573(info457Panel.getContributionType());
                if (clientProfile.getContributionType4573().equals("Balance")) {
                    clientProfile.setContributionBalance4573(info457Panel.getContributionBalance());
                } else if (clientProfile.getContributionType4573().equals("Percent")) {
                    clientProfile.setContributionPercent4573(info457Panel.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum4573(info457Panel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum4573(info457Panel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum4573(info457Panel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum4573(info457Panel.getSecondPercentOf());
                clientProfile.setRateOfReturn4573(info457Panel.getRateOfReturn());
            }
        }
        
        
        
        if (panelStringArray.contains("flexSpendInfoPanel1") && flexSpendInfoPanel.getBelongsToClient()) {
            if (!clientProfile.isFlexSpendFilled()) {
                clientProfile.setCurrentBalanceFlex(flexSpendInfoPanel.getCurrentBalance());
                clientProfile.setBalanceMonthFlex(flexSpendInfoPanel.getBalanceMonth());
                clientProfile.setBalanceDayFlex(flexSpendInfoPanel.getBalanceDay());
                clientProfile.setBalanceYearFlex(flexSpendInfoPanel.getBalanceYear());
                clientProfile.setContributionTypeFlex(flexSpendInfoPanel.getContributionType());
                if (clientProfile.getContributionTypeFlex().equals("Balance")) {
                    clientProfile.setContributionBalanceFlex(flexSpendInfoPanel.getContributionBalance());
                } else if (clientProfile.getContributionTypeFlex().equals("Percentage")) {
                    clientProfile.setContributionPercentFlex(flexSpendInfoPanel.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNumFlex(flexSpendInfoPanel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumFlex(flexSpendInfoPanel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumFlex(flexSpendInfoPanel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumFlex(flexSpendInfoPanel.getSecondPercentOf());
                clientProfile.setRateOfReturnFlex(flexSpendInfoPanel.getRateOfReturn());
            } else if (clientProfile.isFlexSpendFilled()) {
                clientProfile.setCurrentBalanceFlex2(flexSpendInfoPanel.getCurrentBalance());
                clientProfile.setBalanceMonthFlex2(flexSpendInfoPanel.getBalanceMonth());
                clientProfile.setBalanceDayFlex2(flexSpendInfoPanel.getBalanceDay());
                clientProfile.setBalanceYearFlex2(flexSpendInfoPanel.getBalanceYear());
                clientProfile.setContributionTypeFlex2(flexSpendInfoPanel.getContributionType());
                if (clientProfile.getContributionTypeFlex2().equals("Balance")) {
                    clientProfile.setContributionBalanceFlex2(flexSpendInfoPanel.getContributionBalance());
                } else if (clientProfile.getContributionTypeFlex2().equals("Percentage")) {
                    clientProfile.setContributionPercentFlex2(flexSpendInfoPanel.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNumFlex2(flexSpendInfoPanel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumFlex2(flexSpendInfoPanel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumFlex2(flexSpendInfoPanel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumFlex2(flexSpendInfoPanel.getSecondPercentOf());
                clientProfile.setRateOfReturnFlex2(flexSpendInfoPanel.getRateOfReturn());
            } else if (clientProfile.isFlexSpendFilled2()) {
                clientProfile.setCurrentBalanceFlex3(flexSpendInfoPanel.getCurrentBalance());
                clientProfile.setBalanceMonthFlex3(flexSpendInfoPanel.getBalanceMonth());
                clientProfile.setBalanceDayFlex3(flexSpendInfoPanel.getBalanceDay());
                clientProfile.setBalanceYearFlex3(flexSpendInfoPanel.getBalanceYear());
                clientProfile.setContributionTypeFlex3(flexSpendInfoPanel.getContributionType());
                if (clientProfile.getContributionTypeFlex3().equals("Balance")) {
                    clientProfile.setContributionBalanceFlex3(flexSpendInfoPanel.getContributionBalance());
                } else if (clientProfile.getContributionTypeFlex3().equals("Percentage")) {
                    clientProfile.setContributionPercentFlex3(flexSpendInfoPanel.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNumFlex3(flexSpendInfoPanel.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumFlex3(flexSpendInfoPanel.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumFlex3(flexSpendInfoPanel.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumFlex3(flexSpendInfoPanel.getSecondPercentOf());
                clientProfile.setRateOfReturnFlex3(flexSpendInfoPanel.getRateOfReturn());
            }
        }
        
        
        
        if (panelStringArray.contains("socialSecurityPanel1") && socialSecurityPanel.getBelongsToClient()) {
            
            clientProfile.setStatePercentWithheldValue(socialSecurityPanel.getStatePercentWithheldValue());
            clientProfile.setAgeRecievingBenefits(socialSecurityPanel.getAgeRecievingBenefits());
            clientProfile.setExpectedMonthlyAmountValue(socialSecurityPanel.getExpectedMonthlyAmountValue());
            clientProfile.setFederalPercentWithheldValue(socialSecurityPanel.getFederalPercentWithheldValue());
            clientProfile.setSsAmountValue(socialSecurityPanel.getSsAmountValue());
            clientProfile.setCurrentlyReceivingSS(socialSecurityPanel.getCurrentlyReceivingSS());
            clientProfile.setSsAmountIsKnown(socialSecurityPanel.getssAmountIsKnown());
            clientProfile.setAreFedTaxesWithheld(socialSecurityPanel.getAreFedTaxesWithheld());
            clientProfile.setAreStateTaxesWithheld(socialSecurityPanel.getAreStateTaxesWithheld());
            clientProfile.setBelongsToClient(socialSecurityPanel.getBelongsToClient());
            clientProfile.setBelongsToSpouse(socialSecurityPanel.getBelongsToSpouse());
            
            
        }
        
        
        if (panelStringArray.contains("info401KPanel1") && info401KPanel.getWhoIsIt().equals("Client")) {
            if (!clientProfile.isFilled401K()) {
                clientProfile.setRothBalance401K(info401KPanel.getRothBalance());
                clientProfile.setTraditionalBalance401K(info401KPanel.getTraditionalBalance());
                clientProfile.setBalanceMonth401K(info401KPanel.getBalanceMonth());
                clientProfile.setBalanceDay401K(info401KPanel.getBalanceDay());
                clientProfile.setBalanceYear401K(info401KPanel.getBalanceYear());
                clientProfile.setContributionType401K(info401KPanel.getContributionType());
                clientProfile.setPercentOrBalance(info401KPanel.getPercentOrBalance());
                if (clientProfile.getContributionType401K().equals("Balance")) {
                    clientProfile.setRothContributionBalance401K(info401KPanel.getRothContributionBalance());
                    clientProfile.setTraditionalContributionBalance401K(info401KPanel.getTraditionalContributionBalance());
                } else if (clientProfile.getContributionType401K().equals("Percentage")) {
                    clientProfile.setRothContributionPercent401K(info401KPanel.getRothContributionPercent());
                    clientProfile.setTraditionalContributionPercent401K(info401KPanel.getTraditionalContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum401K(info401KPanel.getFirstPercentMatchNum());
                clientProfile.setFirstPercentOfNum401K(info401KPanel.getFirstPercentOfNum());
                clientProfile.setSecondPercentMatchNum401K(info401KPanel.getSecondPercentMatchNum());
                clientProfile.setSecondPercentOfNum401K(info401KPanel.getSecondPercentOfNum());
                clientProfile.setRateOfReturn401K(info401KPanel.getRateOfReturn());
            } else if (clientProfile.isFilled401K()) {
                clientProfile.setRothBalance401K2(info401KPanel.getRothBalance());
                clientProfile.setTraditionalBalance401K2(info401KPanel.getTraditionalBalance());
                clientProfile.setBalanceMonth401K2(info401KPanel.getBalanceMonth());
                clientProfile.setBalanceDay401K2(info401KPanel.getBalanceDay());
                clientProfile.setBalanceYear401K2(info401KPanel.getBalanceYear());
                clientProfile.setContributionType401K2(info401KPanel.getContributionType());
                clientProfile.setPercentOrBalance2(info401KPanel.getPercentOrBalance());
                if (clientProfile.getContributionType401K2().equals("Balance")) {
                    clientProfile.setRothContributionBalance401K2(info401KPanel.getRothContributionBalance());
                    clientProfile.setTraditionalContributionBalance401K2(info401KPanel.getTraditionalContributionBalance());
                } else if (clientProfile.getContributionType401K2().equals("Percentage")) {
                    clientProfile.setRothContributionPercent401K2(info401KPanel.getRothContributionPercent());
                    clientProfile.setTraditionalContributionPercent401K2(info401KPanel.getTraditionalContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum401K2(info401KPanel.getFirstPercentMatchNum());
                clientProfile.setFirstPercentOfNum401K2(info401KPanel.getFirstPercentOfNum());
                clientProfile.setSecondPercentMatchNum401K2(info401KPanel.getSecondPercentMatchNum());
                clientProfile.setSecondPercentOfNum401K2(info401KPanel.getSecondPercentOfNum());
                clientProfile.setRateOfReturn401K2(info401KPanel.getRateOfReturn());
            } else if (clientProfile.isFilled401K2()) {
                clientProfile.setRothBalance401K3(info401KPanel.getRothBalance());
                clientProfile.setTraditionalBalance401K3(info401KPanel.getTraditionalBalance());
                clientProfile.setBalanceMonth401K3(info401KPanel.getBalanceMonth());
                clientProfile.setBalanceDay401K3(info401KPanel.getBalanceDay());
                clientProfile.setBalanceYear401K3(info401KPanel.getBalanceYear());
                clientProfile.setContributionType401K3(info401KPanel.getContributionType());
                clientProfile.setPercentOrBalance3(info401KPanel.getPercentOrBalance());
                if (clientProfile.getContributionType401K3().equals("Balance")) {
                    clientProfile.setRothContributionBalance401K3(info401KPanel.getRothContributionBalance());
                    clientProfile.setTraditionalContributionBalance401K3(info401KPanel.getTraditionalContributionBalance());
                } else if (clientProfile.getContributionType401K3().equals("Percentage")) {
                    clientProfile.setRothContributionPercent401K3(info401KPanel.getRothContributionPercent());
                    clientProfile.setTraditionalContributionPercent401K3(info401KPanel.getTraditionalContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum401K3(info401KPanel.getFirstPercentMatchNum());
                clientProfile.setFirstPercentOfNum401K3(info401KPanel.getFirstPercentOfNum());
                clientProfile.setSecondPercentMatchNum401K3(info401KPanel.getSecondPercentMatchNum());
                clientProfile.setSecondPercentOfNum401K3(info401KPanel.getSecondPercentOfNum());
                clientProfile.setRateOfReturn401K3(info401KPanel.getRateOfReturn());
            }
            
        }
        
       
        
        // ROUND 2
        
        
        if (panelStringArray.contains("iraPanel2") && iraPanel2.getBelongsTo().equals("Client")) {
            if (!clientProfile.isIraFilled()) {
                clientProfile.setMonthIra(iraPanel2.getMonth());
                clientProfile.setDayIra(iraPanel2.getDay());
                clientProfile.setYearIra(iraPanel2.getYear());
                clientProfile.setContributionRothIra(iraPanel2.getContributionRoth());
                clientProfile.setContributionTraditionalIra(iraPanel2.getContributionTraditional());
                clientProfile.setBalanceChosen(iraPanel2.isBalanceChosen());
                if (clientProfile.isBalanceChosen()) {
                    clientProfile.setRothBalance(iraPanel2.getRothBalance());
                    clientProfile.setTraditionalBalance(iraPanel2.getTraditionalBalance());
                } else {
                    clientProfile.setPercentRoth(iraPanel2.getPercentRoth());
                    clientProfile.setPercentTraditional(iraPanel2.getPercentTraditional());
                }
            } else if (clientProfile.isIraFilled()) {
                clientProfile.setMonthIra2(iraPanel2.getMonth());
                clientProfile.setDayIra2(iraPanel2.getDay());
                clientProfile.setYearIra2(iraPanel2.getYear());
                clientProfile.setContributionRothIra2(iraPanel2.getContributionRoth());
                clientProfile.setContributionTraditionalIra2(iraPanel2.getContributionTraditional());
                clientProfile.setBalanceChosen2(iraPanel2.isBalanceChosen());
                if (clientProfile.isBalanceChosen2()) {
                    clientProfile.setRothBalance2(iraPanel2.getRothBalance());
                    clientProfile.setTraditionalBalance2(iraPanel2.getTraditionalBalance());
                } else {
                    clientProfile.setPercentRoth2(iraPanel2.getPercentRoth());
                    clientProfile.setPercentTraditional2(iraPanel2.getPercentTraditional());
                }
            } else if (clientProfile.isIraFilled2()) {
                clientProfile.setMonthIra3(iraPanel2.getMonth());
                clientProfile.setDayIra3(iraPanel2.getDay());
                clientProfile.setYearIra3(iraPanel2.getYear());
                clientProfile.setContributionRothIra3(iraPanel2.getContributionRoth());
                clientProfile.setContributionTraditionalIra3(iraPanel2.getContributionTraditional());
                clientProfile.setBalanceChosen3(iraPanel2.isBalanceChosen());
                if (clientProfile.isBalanceChosen3()) {
                    clientProfile.setRothBalance3(iraPanel2.getRothBalance());
                    clientProfile.setTraditionalBalance3(iraPanel2.getTraditionalBalance());
                } else {
                    clientProfile.setPercentRoth3(iraPanel2.getPercentRoth());
                    clientProfile.setPercentTraditional3(iraPanel2.getPercentTraditional());
                }
            }
        }
        
        if (panelStringArray.contains("optionsAndGrantsPanel2")) {
            if (optionsAndGrantsPanel2.getBelongsTo().equals("Client") && optionsAndGrantsPanel.getBelongsTo().equals("Client")) {
                if (!clientProfile.isOptionsGrantsFilled()) {
                    clientProfile.setAwardDay(optionsAndGrantsPanel2.getAwardDay());
                    clientProfile.setAwardMonth(optionsAndGrantsPanel2.getAwardMonth());
                    clientProfile.setAwardYear(optionsAndGrantsPanel2.getAwardYear());
                    clientProfile.setCurrentAmount(optionsAndGrantsPanel2.getCurrentAmount());
                    clientProfile.setCurrentValue(optionsAndGrantsPanel2.getCurrentValue());
                    clientProfile.setExpirationDay(optionsAndGrantsPanel2.getExpirationDay());
                    clientProfile.setExpirationMonth(optionsAndGrantsPanel2.getExpirationMonth());
                    clientProfile.setExpirationYear(optionsAndGrantsPanel2.getExpirationYear());
                    clientProfile.setRateOfReturn(optionsAndGrantsPanel2.getRateOfReturn());
                } else if (clientProfile.isOptionsGrantsFilled()) {
                    clientProfile.setAwardDay2(optionsAndGrantsPanel2.getAwardDay());
                    clientProfile.setAwardMonth2(optionsAndGrantsPanel2.getAwardMonth());
                    clientProfile.setAwardYear2(optionsAndGrantsPanel2.getAwardYear());
                    clientProfile.setCurrentAmount2(optionsAndGrantsPanel2.getCurrentAmount());
                    clientProfile.setCurrentValue2(optionsAndGrantsPanel2.getCurrentValue());
                    clientProfile.setExpirationDay2(optionsAndGrantsPanel2.getExpirationDay());
                    clientProfile.setExpirationMonth2(optionsAndGrantsPanel2.getExpirationMonth());
                    clientProfile.setExpirationYear2(optionsAndGrantsPanel2.getExpirationYear());
                    clientProfile.setRateOfReturn2(optionsAndGrantsPanel2.getRateOfReturn());
                } else if (clientProfile.isOptionsGrantsFilled2()) {
                    clientProfile.setAwardDay3(optionsAndGrantsPanel2.getAwardDay());
                    clientProfile.setAwardMonth3(optionsAndGrantsPanel2.getAwardMonth());
                    clientProfile.setAwardYear3(optionsAndGrantsPanel2.getAwardYear());
                    clientProfile.setCurrentAmount3(optionsAndGrantsPanel2.getCurrentAmount());
                    clientProfile.setCurrentValue3(optionsAndGrantsPanel2.getCurrentValue());
                    clientProfile.setExpirationDay3(optionsAndGrantsPanel2.getExpirationDay());
                    clientProfile.setExpirationMonth3(optionsAndGrantsPanel2.getExpirationMonth());
                    clientProfile.setExpirationYear3(optionsAndGrantsPanel2.getExpirationYear());
                    clientProfile.setRateOfReturn3(optionsAndGrantsPanel2.getRateOfReturn());
                }
            }
        }
        
        if (panelStringArray.contains("pensionPanel2") && pensionPanel2.getBelongToClient()) {
            if (!clientProfile.isPensionFilled()) {
                clientProfile.setClientRecievesLumpSumBool(pensionPanel2.getLumpBool());
                clientProfile.setClientRecievesMonthlyBool(pensionPanel2.getMonthlyBool());
                clientProfile.setCostOfLivingAdjustment(pensionPanel2.getCostOfLivingAdjustment());
                clientProfile.setAmountPension(pensionPanel2.getAmountPension());
                clientProfile.setPensionDay(pensionPanel2.getDay());
                clientProfile.setPensionMonth(pensionPanel2.getMonth());
                clientProfile.setPensionYear(pensionPanel2.getYear());
            } else if (clientProfile.isPensionFilled()) {
                clientProfile.setClientRecievesLumpSumBool2(pensionPanel2.getLumpBool());
                clientProfile.setClientRecievesMonthlyBool2(pensionPanel2.getMonthlyBool());
                clientProfile.setCostOfLivingAdjustment2(pensionPanel2.getCostOfLivingAdjustment());
                clientProfile.setAmountPension2(pensionPanel2.getAmountPension());
                clientProfile.setPensionDay2(pensionPanel2.getDay());
                clientProfile.setPensionMonth2(pensionPanel2.getMonth());
                clientProfile.setPensionYear2(pensionPanel2.getYear());
            } else if (clientProfile.isPensionFilled2()) {
                clientProfile.setClientRecievesLumpSumBool3(pensionPanel2.getLumpBool());
                clientProfile.setClientRecievesMonthlyBool3(pensionPanel2.getMonthlyBool());
                clientProfile.setCostOfLivingAdjustment3(pensionPanel2.getCostOfLivingAdjustment());
                clientProfile.setAmountPension3(pensionPanel2.getAmountPension());
                clientProfile.setPensionDay3(pensionPanel2.getDay());
                clientProfile.setPensionMonth3(pensionPanel2.getMonth());
                clientProfile.setPensionYear3(pensionPanel2.getYear());
            }
        }
        
        
        if (panelStringArray.contains("info403bPanel2") && info403bPanel2.getBelongsToClient()) {
            if (!clientProfile.isFilled403B()) {
                clientProfile.setCurrentBalance403B(info403bPanel2.getCurrentBalance());
                clientProfile.setBalanceDay403B(info403bPanel2.getBalanceDay());
                clientProfile.setBalanceMonth403B(info403bPanel2.getBalanceMonth());
                clientProfile.setBalanceYear403B(info403bPanel2.getBalanceYear());
                clientProfile.setContributionType403B(info403bPanel2.getContributionType());
                if (clientProfile.getContributionType403B().equals("Percentage")) {
                    clientProfile.setContributionPercent403B(info403bPanel2.getContributionPercent());
                } else if (clientProfile.getContributionType403B().equals("Balance")) {
                    clientProfile.setContributionBalance403B(info403bPanel2.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNum403B(info403bPanel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum403B(info403bPanel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum403B(info403bPanel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum403B(info403bPanel2.getSecondPercentOf());
                clientProfile.setRateOfReturn403B(info403bPanel2.getRateOfReturn());
            }
            else if (clientProfile.isFilled403B()) {
                clientProfile.setCurrentBalance403B2(info403bPanel2.getCurrentBalance());
                clientProfile.setBalanceDay403B2(info403bPanel2.getBalanceDay());
                clientProfile.setBalanceMonth403B2(info403bPanel2.getBalanceMonth());
                clientProfile.setBalanceYear403B2(info403bPanel2.getBalanceYear());
                clientProfile.setContributionType403B2(info403bPanel2.getContributionType());
                if (clientProfile.getContributionType403B2().equals("Percentage")) {
                    clientProfile.setContributionPercent403B2(info403bPanel2.getContributionPercent());
                } else if (clientProfile.getContributionType403B2().equals("Balance")) {
                    clientProfile.setContributionBalance403B2(info403bPanel2.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNum403B2(info403bPanel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum403B2(info403bPanel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum403B2(info403bPanel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum403B2(info403bPanel2.getSecondPercentOf());
                clientProfile.setRateOfReturn403B2(info403bPanel2.getRateOfReturn());            
            } else if (clientProfile.isFilled403B2()) {
                clientProfile.setCurrentBalance403B3(info403bPanel2.getCurrentBalance());
                clientProfile.setBalanceDay403B3(info403bPanel2.getBalanceDay());
                clientProfile.setBalanceMonth403B3(info403bPanel2.getBalanceMonth());
                clientProfile.setBalanceYear403B3(info403bPanel2.getBalanceYear());
                clientProfile.setContributionType403B3(info403bPanel2.getContributionType());
                if (clientProfile.getContributionType403B3().equals("Percentage")) {
                    clientProfile.setContributionPercent403B3(info403bPanel2.getContributionPercent());
                } else if (clientProfile.getContributionType403B3().equals("Balance")) {
                    clientProfile.setContributionBalance403B3(info403bPanel2.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNum403B3(info403bPanel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum403B3(info403bPanel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum403B3(info403bPanel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum403B3(info403bPanel2.getSecondPercentOf());
                clientProfile.setRateOfReturn403B3(info403bPanel2.getRateOfReturn());
            }
        } 
        
        if (panelStringArray.contains("hsaInfoPanel2") && hsaInfoPanel2.getBelongsToClient()) {
            if (!clientProfile.isHsaFilled()) {
                clientProfile.setCurrentBalanceHSA(hsaInfoPanel2.getCurrentBalance());
                clientProfile.setBalanceMonthHSA(hsaInfoPanel2.getBalanceMonth());
                clientProfile.setBalanceDayHSA(hsaInfoPanel2.getBalanceDay());
                clientProfile.setBalanceYearHSA(hsaInfoPanel2.getBalanceYear());
                clientProfile.setContributionTypeHSA(hsaInfoPanel2.getContributionType());
                if (clientProfile.getContributionTypeHSA().equals("Percentage")) {
                    clientProfile.setContributionPercentHSA(hsaInfoPanel2.getContributionPercent());
                } else if (clientProfile.getContributionTypeHSA().equals("Balance")) {
                    clientProfile.setContributionBalanceHSA(hsaInfoPanel2.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNumHSA(hsaInfoPanel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumHSA(hsaInfoPanel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumHSA(hsaInfoPanel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumHSA(hsaInfoPanel2.getSecondPercentOf());
                clientProfile.setRateOfReturnHSA(hsaInfoPanel2.getRateOfReturn());
            }
            else if (clientProfile.isHsaFilled()) {
                clientProfile.setCurrentBalanceHSA2(hsaInfoPanel2.getCurrentBalance());
                clientProfile.setBalanceMonthHSA2(hsaInfoPanel2.getBalanceMonth());
                clientProfile.setBalanceDayHSA2(hsaInfoPanel2.getBalanceDay());
                clientProfile.setBalanceYearHSA2(hsaInfoPanel2.getBalanceYear());
                clientProfile.setContributionTypeHSA2(hsaInfoPanel2.getContributionType());
                if (clientProfile.getContributionTypeHSA2().equals("Percentage")) {
                    clientProfile.setContributionPercentHSA2(hsaInfoPanel2.getContributionPercent());
                } else if (clientProfile.getContributionTypeHSA2().equals("Balance")) {
                    clientProfile.setContributionBalanceHSA2(hsaInfoPanel2.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNumHSA2(hsaInfoPanel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumHSA2(hsaInfoPanel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumHSA2(hsaInfoPanel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumHSA2(hsaInfoPanel2.getSecondPercentOf());
                clientProfile.setRateOfReturnHSA2(hsaInfoPanel2.getRateOfReturn());
            } else if (clientProfile.isHsaFilled2()) {
                clientProfile.setCurrentBalanceHSA3(hsaInfoPanel2.getCurrentBalance());
                clientProfile.setBalanceMonthHSA3(hsaInfoPanel2.getBalanceMonth());
                clientProfile.setBalanceDayHSA3(hsaInfoPanel2.getBalanceDay());
                clientProfile.setBalanceYearHSA3(hsaInfoPanel2.getBalanceYear());
                clientProfile.setContributionTypeHSA3(hsaInfoPanel2.getContributionType());
                if (clientProfile.getContributionTypeHSA3().equals("Percentage")) {
                    clientProfile.setContributionPercentHSA3(hsaInfoPanel2.getContributionPercent());
                } else if (clientProfile.getContributionTypeHSA3().equals("Balance")) {
                    clientProfile.setContributionBalanceHSA3(hsaInfoPanel2.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNumHSA3(hsaInfoPanel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumHSA3(hsaInfoPanel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumHSA3(hsaInfoPanel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumHSA3(hsaInfoPanel2.getSecondPercentOf());
                clientProfile.setRateOfReturnHSA3(hsaInfoPanel2.getRateOfReturn());
            }
            
        }
        
        if (panelStringArray.contains("info457Panel2") && info457Panel2.getBelongsToClient()) {
            if (!clientProfile.isFilled457()) {
                clientProfile.setCurrentBalance457(info457Panel2.getCurrentBalance());
                clientProfile.setBalanceMonth457(info457Panel2.getBalanceMonth());
                clientProfile.setBalanceDay457(info457Panel2.getBalanceDay());
                clientProfile.setBalanceYear457(info457Panel2.getBalanceYear());
                clientProfile.setContributionType457(info457Panel2.getContributionType());
                if (clientProfile.getContributionType457().equals("Balance")) {
                    clientProfile.setContributionBalance457(info457Panel2.getContributionBalance());
                } else if (clientProfile.getContributionType457().equals("Percentage")) {
                    clientProfile.setContributionPercent457(info457Panel2.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum457(info457Panel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum457(info457Panel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum457(info457Panel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum457(info457Panel2.getSecondPercentOf());
                clientProfile.setRateOfReturn457(info457Panel2.getRateOfReturn());
            }
            else if (clientProfile.isFilled457()) {
                clientProfile.setCurrentBalance4572(info457Panel2.getCurrentBalance());
                clientProfile.setBalanceMonth4572(info457Panel2.getBalanceMonth());
                clientProfile.setBalanceDay4572(info457Panel2.getBalanceDay());
                clientProfile.setBalanceYear4572(info457Panel2.getBalanceYear());
                clientProfile.setContributionType4572(info457Panel2.getContributionType());
                if (clientProfile.getContributionType4572().equals("Balance")) {
                    clientProfile.setContributionBalance4572(info457Panel2.getContributionBalance());
                } else if (clientProfile.getContributionType4572().equals("Percentage")) {
                    clientProfile.setContributionPercent4572(info457Panel2.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum4572(info457Panel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum4572(info457Panel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum4572(info457Panel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum4572(info457Panel2.getSecondPercentOf());
                clientProfile.setRateOfReturn4572(info457Panel2.getRateOfReturn());
            } else if (clientProfile.isFilled4572()) {
                clientProfile.setCurrentBalance4573(info457Panel2.getCurrentBalance());
                clientProfile.setBalanceMonth4573(info457Panel2.getBalanceMonth());
                clientProfile.setBalanceDay4573(info457Panel2.getBalanceDay());
                clientProfile.setBalanceYear4573(info457Panel2.getBalanceYear());
                clientProfile.setContributionType4573(info457Panel2.getContributionType());
                if (clientProfile.getContributionType4573().equals("Balance")) {
                    clientProfile.setContributionBalance4573(info457Panel2.getContributionBalance());
                } else if (clientProfile.getContributionType4573().equals("Percentage")) {
                    clientProfile.setContributionPercent4573(info457Panel2.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum4573(info457Panel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum4573(info457Panel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum4573(info457Panel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum4573(info457Panel2.getSecondPercentOf());
                clientProfile.setRateOfReturn4573(info457Panel2.getRateOfReturn());
            }
        }
        
        if (panelStringArray.contains("flexSpendInfoPanel2") && flexSpendInfoPanel2.getBelongsToClient()) {
            if (!clientProfile.isFlexSpendFilled()) {
                clientProfile.setCurrentBalanceFlex(flexSpendInfoPanel2.getCurrentBalance());
                clientProfile.setBalanceMonthFlex(flexSpendInfoPanel2.getBalanceMonth());
                clientProfile.setBalanceDayFlex(flexSpendInfoPanel2.getBalanceDay());
                clientProfile.setBalanceYearFlex(flexSpendInfoPanel2.getBalanceYear());
                clientProfile.setContributionTypeFlex(flexSpendInfoPanel2.getContributionType());
                if (clientProfile.getContributionTypeFlex().equals("Balance")) {
                    clientProfile.setContributionBalanceFlex(flexSpendInfoPanel2.getContributionBalance());
                } else if (clientProfile.getContributionTypeFlex().equals("Percentage")) {
                    clientProfile.setContributionPercentFlex(flexSpendInfoPanel2.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNumFlex(flexSpendInfoPanel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumFlex(flexSpendInfoPanel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumFlex(flexSpendInfoPanel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumFlex(flexSpendInfoPanel2.getSecondPercentOf());
                clientProfile.setRateOfReturnFlex(flexSpendInfoPanel2.getRateOfReturn());
            } else if (clientProfile.isFlexSpendFilled()) {
                clientProfile.setCurrentBalanceFlex2(flexSpendInfoPanel2.getCurrentBalance());
                clientProfile.setBalanceMonthFlex2(flexSpendInfoPanel2.getBalanceMonth());
                clientProfile.setBalanceDayFlex2(flexSpendInfoPanel2.getBalanceDay());
                clientProfile.setBalanceYearFlex2(flexSpendInfoPanel2.getBalanceYear());
                clientProfile.setContributionTypeFlex2(flexSpendInfoPanel2.getContributionType());
                if (clientProfile.getContributionTypeFlex2().equals("Balance")) {
                    clientProfile.setContributionBalanceFlex2(flexSpendInfoPanel2.getContributionBalance());
                } else if (clientProfile.getContributionTypeFlex2().equals("Percentage")) {
                    clientProfile.setContributionPercentFlex2(flexSpendInfoPanel2.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNumFlex2(flexSpendInfoPanel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumFlex2(flexSpendInfoPanel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumFlex2(flexSpendInfoPanel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumFlex2(flexSpendInfoPanel2.getSecondPercentOf());
                clientProfile.setRateOfReturnFlex2(flexSpendInfoPanel2.getRateOfReturn());
            } else if (clientProfile.isFlexSpendFilled2()) {
                clientProfile.setCurrentBalanceFlex3(flexSpendInfoPanel2.getCurrentBalance());
                clientProfile.setBalanceMonthFlex3(flexSpendInfoPanel2.getBalanceMonth());
                clientProfile.setBalanceDayFlex3(flexSpendInfoPanel2.getBalanceDay());
                clientProfile.setBalanceYearFlex3(flexSpendInfoPanel2.getBalanceYear());
                clientProfile.setContributionTypeFlex3(flexSpendInfoPanel2.getContributionType());
                if (clientProfile.getContributionTypeFlex3().equals("Balance")) {
                    clientProfile.setContributionBalanceFlex3(flexSpendInfoPanel2.getContributionBalance());
                } else if (clientProfile.getContributionTypeFlex3().equals("Percentage")) {
                    clientProfile.setContributionPercentFlex3(flexSpendInfoPanel2.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNumFlex3(flexSpendInfoPanel2.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumFlex3(flexSpendInfoPanel2.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumFlex3(flexSpendInfoPanel2.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumFlex3(flexSpendInfoPanel2.getSecondPercentOf());
                clientProfile.setRateOfReturnFlex3(flexSpendInfoPanel2.getRateOfReturn());
            }
        }
        
        
        if (panelStringArray.contains("socialSecurityPanel2") && socialSecurityPanel2.getBelongsToClient()) {
            if (!clientProfile.isFilledSS()) {
                clientProfile.setStatePercentWithheldValue(socialSecurityPanel2.getStatePercentWithheldValue());
                clientProfile.setAgeRecievingBenefits(socialSecurityPanel2.getAgeRecievingBenefits());
                clientProfile.setExpectedMonthlyAmountValue(socialSecurityPanel2.getExpectedMonthlyAmountValue());
                clientProfile.setFederalPercentWithheldValue(socialSecurityPanel2.getFederalPercentWithheldValue());
                clientProfile.setSsAmountValue(socialSecurityPanel2.getSsAmountValue());
                clientProfile.setCurrentlyReceivingSS(socialSecurityPanel2.getCurrentlyReceivingSS());
                clientProfile.setSsAmountIsKnown(socialSecurityPanel2.getssAmountIsKnown());
                clientProfile.setAreFedTaxesWithheld(socialSecurityPanel2.getAreFedTaxesWithheld());
                clientProfile.setAreStateTaxesWithheld(socialSecurityPanel2.getAreStateTaxesWithheld());
                clientProfile.setBelongsToClient(socialSecurityPanel2.getBelongsToClient());
                clientProfile.setBelongsToSpouse(socialSecurityPanel2.getBelongsToSpouse());
            } else if (clientProfile.isFilledSS()) {
                clientProfile.setStatePercentWithheldValue2(socialSecurityPanel2.getStatePercentWithheldValue());
                clientProfile.setAgeRecievingBenefits2(socialSecurityPanel2.getAgeRecievingBenefits());
                clientProfile.setExpectedMonthlyAmountValue2(socialSecurityPanel2.getExpectedMonthlyAmountValue());
                clientProfile.setFederalPercentWithheldValue2(socialSecurityPanel2.getFederalPercentWithheldValue());
                clientProfile.setSsAmountValue2(socialSecurityPanel2.getSsAmountValue());
                clientProfile.setCurrentlyReceivingSS2(socialSecurityPanel2.getCurrentlyReceivingSS());
                clientProfile.setSsAmountIsKnown2(socialSecurityPanel2.getssAmountIsKnown());
                clientProfile.setAreFedTaxesWithheld2(socialSecurityPanel2.getAreFedTaxesWithheld());
                clientProfile.setAreStateTaxesWithheld2(socialSecurityPanel2.getAreStateTaxesWithheld());
                clientProfile.setBelongsToClient2(socialSecurityPanel2.getBelongsToClient());
                clientProfile.setBelongsToSpouse2(socialSecurityPanel2.getBelongsToSpouse());
            } else if (clientProfile.isFilledSS2()) {
                clientProfile.setStatePercentWithheldValue3(socialSecurityPanel2.getStatePercentWithheldValue());
                clientProfile.setAgeRecievingBenefits3(socialSecurityPanel2.getAgeRecievingBenefits());
                clientProfile.setExpectedMonthlyAmountValue3(socialSecurityPanel2.getExpectedMonthlyAmountValue());
                clientProfile.setFederalPercentWithheldValue3(socialSecurityPanel2.getFederalPercentWithheldValue());
                clientProfile.setSsAmountValue3(socialSecurityPanel2.getSsAmountValue());
                clientProfile.setCurrentlyReceivingSS3(socialSecurityPanel2.getCurrentlyReceivingSS());
                clientProfile.setSsAmountIsKnown3(socialSecurityPanel2.getssAmountIsKnown());
                clientProfile.setAreFedTaxesWithheld3(socialSecurityPanel2.getAreFedTaxesWithheld());
                clientProfile.setAreStateTaxesWithheld3(socialSecurityPanel2.getAreStateTaxesWithheld());
                clientProfile.setBelongsToClient3(socialSecurityPanel2.getBelongsToClient());
                clientProfile.setBelongsToSpouse3(socialSecurityPanel2.getBelongsToSpouse());
            }
            
        }
        
        
        if (panelStringArray.contains("info401KPanel2") && info401KPanel2.getWhoIsIt().equals("Client")) {
            if (!clientProfile.isFilled401K()) {
                clientProfile.setRothBalance401K(info401KPanel2.getRothBalance());
                clientProfile.setTraditionalBalance401K(info401KPanel2.getTraditionalBalance());
                clientProfile.setBalanceMonth401K(info401KPanel2.getBalanceMonth());
                clientProfile.setBalanceDay401K(info401KPanel2.getBalanceDay());
                clientProfile.setBalanceYear401K(info401KPanel2.getBalanceYear());
                clientProfile.setContributionType401K(info401KPanel2.getContributionType());
                clientProfile.setPercentOrBalance(info401KPanel2.getPercentOrBalance());

                if (clientProfile.getContributionType401K().equals("Balance")) {
                    clientProfile.setRothContributionBalance401K(info401KPanel2.getRothContributionBalance());
                    clientProfile.setTraditionalContributionBalance401K(info401KPanel2.getTraditionalContributionBalance());
                } else if (clientProfile.getContributionType401K().equals("Percentage")) {
                    clientProfile.setRothContributionPercent401K(info401KPanel2.getRothContributionPercent());
                    clientProfile.setTraditionalContributionPercent401K(info401KPanel2.getTraditionalContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum401K(info401KPanel2.getFirstPercentMatchNum());
                clientProfile.setFirstPercentOfNum401K(info401KPanel2.getFirstPercentOfNum());
                clientProfile.setSecondPercentMatchNum401K(info401KPanel2.getSecondPercentMatchNum());
                clientProfile.setSecondPercentOfNum401K(info401KPanel2.getSecondPercentOfNum());
                clientProfile.setRateOfReturn401K(info401KPanel2.getRateOfReturn());
            }
            else if (clientProfile.isFilled401K()) {
                clientProfile.setRothBalance401K2(info401KPanel2.getRothBalance());
                clientProfile.setTraditionalBalance401K2(info401KPanel2.getTraditionalBalance());
                clientProfile.setBalanceMonth401K2(info401KPanel2.getBalanceMonth());
                clientProfile.setBalanceDay401K2(info401KPanel2.getBalanceDay());
                clientProfile.setBalanceYear401K2(info401KPanel2.getBalanceYear());
                clientProfile.setContributionType401K2(info401KPanel2.getContributionType());
                clientProfile.setPercentOrBalance2(info401KPanel2.getPercentOrBalance());

                if (clientProfile.getContributionType401K2().equals("Balance")) {
                    clientProfile.setRothContributionBalance401K2(info401KPanel2.getRothContributionBalance());
                    clientProfile.setTraditionalContributionBalance401K2(info401KPanel2.getTraditionalContributionBalance());
                } else if (clientProfile.getContributionType401K2().equals("Percentage")) {
                    clientProfile.setRothContributionPercent401K2(info401KPanel2.getRothContributionPercent());
                    clientProfile.setTraditionalContributionPercent401K2(info401KPanel2.getTraditionalContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum401K2(info401KPanel2.getFirstPercentMatchNum());
                clientProfile.setFirstPercentOfNum401K2(info401KPanel2.getFirstPercentOfNum());
                clientProfile.setSecondPercentMatchNum401K2(info401KPanel2.getSecondPercentMatchNum());
                clientProfile.setSecondPercentOfNum401K2(info401KPanel2.getSecondPercentOfNum());
                clientProfile.setRateOfReturn401K2(info401KPanel2.getRateOfReturn());
            } else if (clientProfile.isFilled401K2()) {
                clientProfile.setRothBalance401K3(info401KPanel2.getRothBalance());
                clientProfile.setTraditionalBalance401K3(info401KPanel2.getTraditionalBalance());
                clientProfile.setBalanceMonth401K3(info401KPanel2.getBalanceMonth());
                clientProfile.setBalanceDay401K3(info401KPanel2.getBalanceDay());
                clientProfile.setBalanceYear401K3(info401KPanel2.getBalanceYear());
                clientProfile.setContributionType401K3(info401KPanel2.getContributionType());
                clientProfile.setPercentOrBalance3(info401KPanel2.getPercentOrBalance());

                if (clientProfile.getContributionType401K3().equals("Balance")) {
                    clientProfile.setRothContributionBalance401K3(info401KPanel2.getRothContributionBalance());
                    clientProfile.setTraditionalContributionBalance401K3(info401KPanel2.getTraditionalContributionBalance());
                } else if (clientProfile.getContributionType401K3().equals("Percentage")) {
                    clientProfile.setRothContributionPercent401K3(info401KPanel2.getRothContributionPercent());
                    clientProfile.setTraditionalContributionPercent401K3(info401KPanel2.getTraditionalContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum401K3(info401KPanel2.getFirstPercentMatchNum());
                clientProfile.setFirstPercentOfNum401K3(info401KPanel2.getFirstPercentOfNum());
                clientProfile.setSecondPercentMatchNum401K3(info401KPanel2.getSecondPercentMatchNum());
                clientProfile.setSecondPercentOfNum401K3(info401KPanel2.getSecondPercentOfNum());
                clientProfile.setRateOfReturn401K3(info401KPanel2.getRateOfReturn());
            }
                    
        }
    
      //Panel declaration round 3
      
      if (panelStringArray.contains("iraPanel3") && iraPanel3.getBelongsTo().equals("Client")) {
            if (!clientProfile.isIraFilled()) {
                clientProfile.setMonthIra(iraPanel3.getMonth());
                clientProfile.setDayIra(iraPanel3.getDay());
                clientProfile.setYearIra(iraPanel3.getYear());
                clientProfile.setContributionRothIra(iraPanel3.getContributionRoth());
                clientProfile.setContributionTraditionalIra(iraPanel3.getContributionTraditional());
                clientProfile.setBalanceChosen(iraPanel3.isBalanceChosen());
                if (clientProfile.isBalanceChosen()) {
                    clientProfile.setRothBalance(iraPanel3.getRothBalance());
                    clientProfile.setTraditionalBalance(iraPanel3.getTraditionalBalance());
                } else {
                    clientProfile.setPercentRoth(iraPanel3.getPercentRoth());
                    clientProfile.setPercentTraditional(iraPanel3.getPercentTraditional());
                }
                clientProfile.setIraFilled(true);
            } else if (clientProfile.isIraFilled()) {
                clientProfile.setMonthIra2(iraPanel3.getMonth());
                clientProfile.setDayIra2(iraPanel3.getDay());
                clientProfile.setYearIra2(iraPanel3.getYear());
                clientProfile.setContributionRothIra2(iraPanel3.getContributionRoth());
                clientProfile.setContributionTraditionalIra2(iraPanel3.getContributionTraditional());
                clientProfile.setBalanceChosen2(iraPanel3.isBalanceChosen());
                if (clientProfile.isBalanceChosen2()) {
                    clientProfile.setRothBalance2(iraPanel3.getRothBalance());
                    clientProfile.setTraditionalBalance2(iraPanel3.getTraditionalBalance());
                } else {
                    clientProfile.setPercentRoth2(iraPanel3.getPercentRoth());
                    clientProfile.setPercentTraditional2(iraPanel3.getPercentTraditional());
                }
                clientProfile.setIraFilled2(true);
            } else if (clientProfile.isIraFilled2()) {
                clientProfile.setMonthIra3(iraPanel3.getMonth());
                clientProfile.setDayIra3(iraPanel3.getDay());
                clientProfile.setYearIra3(iraPanel3.getYear());
                clientProfile.setContributionRothIra3(iraPanel3.getContributionRoth());
                clientProfile.setContributionTraditionalIra3(iraPanel3.getContributionTraditional());
                clientProfile.setBalanceChosen3(iraPanel3.isBalanceChosen());
                if (clientProfile.isBalanceChosen3()) {
                    clientProfile.setRothBalance3(iraPanel3.getRothBalance());
                    clientProfile.setTraditionalBalance3(iraPanel3.getTraditionalBalance());
                } else {
                    clientProfile.setPercentRoth3(iraPanel3.getPercentRoth());
                    clientProfile.setPercentTraditional3(iraPanel3.getPercentTraditional());
                }
                clientProfile.setIraFilled3(true);
            }
            
            System.out.println(clientProfile.getMonthIra());
            System.out.println(clientProfile.getDayIra());
            System.out.println(clientProfile.getYearIra());
            System.out.println(clientProfile.getContributionRothIra());
            System.out.println(clientProfile.getContributionRothIra());
            System.out.println(clientProfile.isBalanceChosen());
            System.out.println(clientProfile.getRothBalance());
            System.out.println(clientProfile.getTraditionalBalance());
            System.out.println(clientProfile.getPercentRoth());
            System.out.println(clientProfile.getPercentTraditional());
            
        }
        
        if (panelStringArray.contains("optionsAndGrantsPanel3") && optionsAndGrantsPanel3.getBelongsTo().equals("Client")) {
            
            if (!clientProfile.isOptionsGrantsFilled()) {
                clientProfile.setAwardDay(optionsAndGrantsPanel3.getAwardDay());
                clientProfile.setAwardMonth(optionsAndGrantsPanel3.getAwardMonth());
                clientProfile.setAwardYear(optionsAndGrantsPanel3.getAwardYear());
                clientProfile.setCurrentAmount(optionsAndGrantsPanel3.getCurrentAmount());
                clientProfile.setCurrentValue(optionsAndGrantsPanel3.getCurrentValue());
                clientProfile.setExpirationDay(optionsAndGrantsPanel3.getExpirationDay());
                clientProfile.setExpirationMonth(optionsAndGrantsPanel3.getExpirationMonth());
                clientProfile.setExpirationYear(optionsAndGrantsPanel3.getExpirationYear());
                clientProfile.setRateOfReturn(optionsAndGrantsPanel3.getRateOfReturn());
                clientProfile.setOptionsGrantsFilled(true);
                
            } else if (clientProfile.isOptionsGrantsFilled()) {
                
                clientProfile.setAwardDay2(optionsAndGrantsPanel3.getAwardDay());
                clientProfile.setAwardMonth2(optionsAndGrantsPanel3.getAwardMonth());
                clientProfile.setAwardYear2(optionsAndGrantsPanel3.getAwardYear());
                clientProfile.setCurrentAmount2(optionsAndGrantsPanel3.getCurrentAmount());
                clientProfile.setCurrentValue2(optionsAndGrantsPanel3.getCurrentValue());
                clientProfile.setExpirationDay2(optionsAndGrantsPanel3.getExpirationDay());
                clientProfile.setExpirationMonth2(optionsAndGrantsPanel3.getExpirationMonth());
                clientProfile.setExpirationYear2(optionsAndGrantsPanel3.getExpirationYear());
                clientProfile.setRateOfReturn2(optionsAndGrantsPanel3.getRateOfReturn());
                clientProfile.setOptionsGrantsFilled2(true);
                
            } else if (clientProfile.isOptionsGrantsFilled2()) {
                clientProfile.setAwardDay3(optionsAndGrantsPanel3.getAwardDay());
                clientProfile.setAwardMonth3(optionsAndGrantsPanel3.getAwardMonth());
                clientProfile.setAwardYear3(optionsAndGrantsPanel3.getAwardYear());
                clientProfile.setCurrentAmount3(optionsAndGrantsPanel3.getCurrentAmount());
                clientProfile.setCurrentValue3(optionsAndGrantsPanel3.getCurrentValue());
                clientProfile.setExpirationDay3(optionsAndGrantsPanel3.getExpirationDay());
                clientProfile.setExpirationMonth3(optionsAndGrantsPanel3.getExpirationMonth());
                clientProfile.setExpirationYear3(optionsAndGrantsPanel3.getExpirationYear());
                clientProfile.setRateOfReturn3(optionsAndGrantsPanel3.getRateOfReturn());
                clientProfile.setOptionsGrantsFilled3(true);
            }
            
            
        }
        
        
        
        if (panelStringArray.contains("pensionPanel3") && pensionPanel3.getBelongToClient()) {
            
            if (!clientProfile.isPensionFilled()) {
                clientProfile.setClientRecievesLumpSumBool(pensionPanel3.getLumpBool());
                clientProfile.setClientRecievesMonthlyBool(pensionPanel3.getMonthlyBool());
                clientProfile.setCostOfLivingAdjustment(pensionPanel3.getCostOfLivingAdjustment());
                clientProfile.setAmountPension(pensionPanel3.getAmountPension());
                clientProfile.setPensionDay(pensionPanel3.getDay());
                clientProfile.setPensionMonth(pensionPanel3.getMonth());
                clientProfile.setPensionYear(pensionPanel3.getYear());
                clientProfile.setPensionFilled(true);
            } else if (clientProfile.isPensionFilled()) {
                
                clientProfile.setClientRecievesLumpSumBool2(pensionPanel3.getLumpBool());
                clientProfile.setClientRecievesMonthlyBool2(pensionPanel3.getMonthlyBool());
                clientProfile.setCostOfLivingAdjustment2(pensionPanel3.getCostOfLivingAdjustment());
                clientProfile.setAmountPension2(pensionPanel3.getAmountPension());
                clientProfile.setPensionDay2(pensionPanel3.getDay());
                clientProfile.setPensionMonth2(pensionPanel3.getMonth());
                clientProfile.setPensionYear2(pensionPanel3.getYear());
                clientProfile.setPensionFilled2(true);
                
            } else if (clientProfile.isPensionFilled2()) {
                clientProfile.setClientRecievesLumpSumBool3(pensionPanel3.getLumpBool());
                clientProfile.setClientRecievesMonthlyBool3(pensionPanel3.getMonthlyBool());
                clientProfile.setCostOfLivingAdjustment3(pensionPanel3.getCostOfLivingAdjustment());
                clientProfile.setAmountPension3(pensionPanel3.getAmountPension());
                clientProfile.setPensionDay3(pensionPanel3.getDay());
                clientProfile.setPensionMonth3(pensionPanel3.getMonth());
                clientProfile.setPensionYear3(pensionPanel3.getYear());
                clientProfile.setPensionFilled3(true);
            }
            
        }
        
        
        
        if (panelStringArray.contains("info403bPanel3") && info403bPanel3.getBelongsToClient()) {
            
            if (!clientProfile.isFilled403B()) {
                clientProfile.setCurrentBalance403B(info403bPanel3.getCurrentBalance());
                clientProfile.setBalanceDay403B(info403bPanel3.getBalanceDay());
                clientProfile.setBalanceMonth403B(info403bPanel3.getBalanceMonth());
                clientProfile.setBalanceYear403B(info403bPanel3.getBalanceYear());
                clientProfile.setContributionType403B(info403bPanel3.getContributionType());
                if (clientProfile.getContributionType403B().equals("Percentage")) {
                    clientProfile.setContributionPercent403B(info403bPanel3.getContributionPercent());
                } else if (clientProfile.getContributionType403B().equals("Balance")) {
                    clientProfile.setContributionBalance403B(info403bPanel3.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNum403B(info403bPanel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum403B(info403bPanel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum403B(info403bPanel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum403B(info403bPanel3.getSecondPercentOf());
                clientProfile.setRateOfReturn403B(info403bPanel3.getRateOfReturn());        
                clientProfile.setFilled403B(true);
            } else if (clientProfile.isFilled403B()) {
                clientProfile.setCurrentBalance403B2(info403bPanel3.getCurrentBalance());
                clientProfile.setBalanceDay403B2(info403bPanel3.getBalanceDay());
                clientProfile.setBalanceMonth403B2(info403bPanel3.getBalanceMonth());
                clientProfile.setBalanceYear403B2(info403bPanel3.getBalanceYear());
                clientProfile.setContributionType403B2(info403bPanel3.getContributionType());
                if (clientProfile.getContributionType403B2().equals("Percentage")) {
                    clientProfile.setContributionPercent403B2(info403bPanel3.getContributionPercent());
                } else if (clientProfile.getContributionType403B2().equals("Balance")) {
                    clientProfile.setContributionBalance403B2(info403bPanel3.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNum403B2(info403bPanel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum403B2(info403bPanel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum403B2(info403bPanel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum403B2(info403bPanel3.getSecondPercentOf());
                clientProfile.setRateOfReturn403B2(info403bPanel3.getRateOfReturn());  
                clientProfile.setFilled403B2(true);
            } else if (clientProfile.isFilled403B2()) {
                clientProfile.setCurrentBalance403B3(info403bPanel3.getCurrentBalance());
                clientProfile.setBalanceDay403B3(info403bPanel3.getBalanceDay());
                clientProfile.setBalanceMonth403B3(info403bPanel3.getBalanceMonth());
                clientProfile.setBalanceYear403B3(info403bPanel3.getBalanceYear());
                clientProfile.setContributionType403B3(info403bPanel3.getContributionType());
                if (clientProfile.getContributionType403B3().equals("Percentage")) {
                    clientProfile.setContributionPercent403B3(info403bPanel3.getContributionPercent());
                } else if (clientProfile.getContributionType403B3().equals("Balance")) {
                    clientProfile.setContributionBalance403B3(info403bPanel3.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNum403B3(info403bPanel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum403B3(info403bPanel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum403B3(info403bPanel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum403B3(info403bPanel3.getSecondPercentOf());
                clientProfile.setRateOfReturn403B3(info403bPanel3.getRateOfReturn());         
                clientProfile.setFilled403B3(true);
            }
            
            
            
        }
        
        
        
        if (panelStringArray.contains("hsaInfoPanel3") && hsaInfoPanel3.getBelongsToClient()) {
            if (!clientProfile.isHsaFilled()) {
                clientProfile.setCurrentBalanceHSA(hsaInfoPanel3.getCurrentBalance());
                clientProfile.setBalanceMonthHSA(hsaInfoPanel3.getBalanceMonth());
                clientProfile.setBalanceDayHSA(hsaInfoPanel3.getBalanceDay());
                clientProfile.setBalanceYearHSA(hsaInfoPanel3.getBalanceYear());
                clientProfile.setContributionTypeHSA(hsaInfoPanel3.getContributionType());
                if (clientProfile.getContributionTypeHSA().equals("Percentage")) {
                    clientProfile.setContributionPercentHSA(hsaInfoPanel3.getContributionPercent());
                } else if (clientProfile.getContributionTypeHSA().equals("Balance")) {
                    clientProfile.setContributionBalanceHSA(hsaInfoPanel3.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNumHSA(hsaInfoPanel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumHSA(hsaInfoPanel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumHSA(hsaInfoPanel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumHSA(hsaInfoPanel3.getSecondPercentOf());
                clientProfile.setRateOfReturnHSA(hsaInfoPanel3.getRateOfReturn());
                clientProfile.setHsaFilled(true);
            } else if (clientProfile.isHsaFilled()) {
                clientProfile.setCurrentBalanceHSA2(hsaInfoPanel3.getCurrentBalance());
                clientProfile.setBalanceMonthHSA2(hsaInfoPanel3.getBalanceMonth());
                clientProfile.setBalanceDayHSA2(hsaInfoPanel3.getBalanceDay());
                clientProfile.setBalanceYearHSA2(hsaInfoPanel3.getBalanceYear());
                clientProfile.setContributionTypeHSA2(hsaInfoPanel3.getContributionType());
                if (clientProfile.getContributionTypeHSA2().equals("Percentage")) {
                    clientProfile.setContributionPercentHSA2(hsaInfoPanel3.getContributionPercent());
                } else if (clientProfile.getContributionTypeHSA2().equals("Balance")) {
                    clientProfile.setContributionBalanceHSA2(hsaInfoPanel3.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNumHSA2(hsaInfoPanel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumHSA2(hsaInfoPanel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumHSA2(hsaInfoPanel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumHSA2(hsaInfoPanel3.getSecondPercentOf());
                clientProfile.setRateOfReturnHSA2(hsaInfoPanel3.getRateOfReturn());
                clientProfile.setHsaFilled2(true);
            } else if (clientProfile.isHsaFilled2()) {
                clientProfile.setCurrentBalanceHSA3(hsaInfoPanel3.getCurrentBalance());
                clientProfile.setBalanceMonthHSA3(hsaInfoPanel3.getBalanceMonth());
                clientProfile.setBalanceDayHSA3(hsaInfoPanel3.getBalanceDay());
                clientProfile.setBalanceYearHSA3(hsaInfoPanel3.getBalanceYear());
                clientProfile.setContributionTypeHSA3(hsaInfoPanel3.getContributionType());
                if (clientProfile.getContributionTypeHSA3().equals("Percentage")) {
                    clientProfile.setContributionPercentHSA3(hsaInfoPanel3.getContributionPercent());
                } else if (clientProfile.getContributionTypeHSA3().equals("Balance")) {
                    clientProfile.setContributionBalanceHSA3(hsaInfoPanel3.getContributionBalance());
                }
                clientProfile.setFirstPercentMatchNumHSA3(hsaInfoPanel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumHSA3(hsaInfoPanel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumHSA3(hsaInfoPanel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumHSA3(hsaInfoPanel3.getSecondPercentOf());
                clientProfile.setRateOfReturnHSA3(hsaInfoPanel3.getRateOfReturn());
                clientProfile.setHsaFilled3(true);
            }
        }
        
        
        
        
        if (panelStringArray.contains("info457Panel3") && info457Panel3.getBelongsToClient()) {
            if (!clientProfile.isFilled457()) {
                clientProfile.setCurrentBalance457(info457Panel3.getCurrentBalance());
                clientProfile.setBalanceMonth457(info457Panel3.getBalanceMonth());
                clientProfile.setBalanceDay457(info457Panel3.getBalanceDay());
                clientProfile.setBalanceYear457(info457Panel3.getBalanceYear());
                clientProfile.setContributionType457(info457Panel3.getContributionType());
                if (clientProfile.getContributionType457().equals("Balance")) {
                    clientProfile.setContributionBalance457(info457Panel3.getContributionBalance());
                } else if (clientProfile.getContributionType457().equals("Percent")) {
                    clientProfile.setContributionPercent457(info457Panel3.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum457(info457Panel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum457(info457Panel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum457(info457Panel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum457(info457Panel3.getSecondPercentOf());
                clientProfile.setRateOfReturn457(info457Panel3.getRateOfReturn());
            } else if (clientProfile.isFilled457()) {
                clientProfile.setCurrentBalance4572(info457Panel3.getCurrentBalance());
                clientProfile.setBalanceMonth4572(info457Panel3.getBalanceMonth());
                clientProfile.setBalanceDay4572(info457Panel3.getBalanceDay());
                clientProfile.setBalanceYear4572(info457Panel3.getBalanceYear());
                clientProfile.setContributionType4572(info457Panel3.getContributionType());
                if (clientProfile.getContributionType4572().equals("Balance")) {
                    clientProfile.setContributionBalance4572(info457Panel3.getContributionBalance());
                } else if (clientProfile.getContributionType4572().equals("Percent")) {
                    clientProfile.setContributionPercent4572(info457Panel3.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum4572(info457Panel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum4572(info457Panel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum4572(info457Panel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum4572(info457Panel3.getSecondPercentOf());
                clientProfile.setRateOfReturn4572(info457Panel3.getRateOfReturn());
            } else if (clientProfile.isFilled4572()) {
                clientProfile.setCurrentBalance4573(info457Panel3.getCurrentBalance());
                clientProfile.setBalanceMonth4573(info457Panel3.getBalanceMonth());
                clientProfile.setBalanceDay4573(info457Panel3.getBalanceDay());
                clientProfile.setBalanceYear4573(info457Panel3.getBalanceYear());
                clientProfile.setContributionType4573(info457Panel3.getContributionType());
                if (clientProfile.getContributionType4573().equals("Balance")) {
                    clientProfile.setContributionBalance4573(info457Panel3.getContributionBalance());
                } else if (clientProfile.getContributionType4573().equals("Percent")) {
                    clientProfile.setContributionPercent4573(info457Panel3.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum4573(info457Panel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNum4573(info457Panel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNum4573(info457Panel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNum4573(info457Panel3.getSecondPercentOf());
                clientProfile.setRateOfReturn4573(info457Panel3.getRateOfReturn());
            }
        }
        
        
        
        if (panelStringArray.contains("flexSpendInfoPanel3") && flexSpendInfoPanel3.getBelongsToClient()) {
            if (!clientProfile.isFlexSpendFilled()) {
                clientProfile.setCurrentBalanceFlex(flexSpendInfoPanel3.getCurrentBalance());
                clientProfile.setBalanceMonthFlex(flexSpendInfoPanel3.getBalanceMonth());
                clientProfile.setBalanceDayFlex(flexSpendInfoPanel3.getBalanceDay());
                clientProfile.setBalanceYearFlex(flexSpendInfoPanel3.getBalanceYear());
                clientProfile.setContributionTypeFlex(flexSpendInfoPanel3.getContributionType());
                if (clientProfile.getContributionTypeFlex().equals("Balance")) {
                    clientProfile.setContributionBalanceFlex(flexSpendInfoPanel3.getContributionBalance());
                } else if (clientProfile.getContributionTypeFlex().equals("Percentage")) {
                    clientProfile.setContributionPercentFlex(flexSpendInfoPanel3.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNumFlex(flexSpendInfoPanel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumFlex(flexSpendInfoPanel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumFlex(flexSpendInfoPanel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumFlex(flexSpendInfoPanel3.getSecondPercentOf());
                clientProfile.setRateOfReturnFlex(flexSpendInfoPanel3.getRateOfReturn());
            } else if (clientProfile.isFlexSpendFilled()) {
                clientProfile.setCurrentBalanceFlex2(flexSpendInfoPanel3.getCurrentBalance());
                clientProfile.setBalanceMonthFlex2(flexSpendInfoPanel3.getBalanceMonth());
                clientProfile.setBalanceDayFlex2(flexSpendInfoPanel3.getBalanceDay());
                clientProfile.setBalanceYearFlex2(flexSpendInfoPanel3.getBalanceYear());
                clientProfile.setContributionTypeFlex2(flexSpendInfoPanel3.getContributionType());
                if (clientProfile.getContributionTypeFlex2().equals("Balance")) {
                    clientProfile.setContributionBalanceFlex2(flexSpendInfoPanel3.getContributionBalance());
                } else if (clientProfile.getContributionTypeFlex2().equals("Percentage")) {
                    clientProfile.setContributionPercentFlex2(flexSpendInfoPanel3.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNumFlex2(flexSpendInfoPanel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumFlex2(flexSpendInfoPanel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumFlex2(flexSpendInfoPanel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumFlex2(flexSpendInfoPanel3.getSecondPercentOf());
                clientProfile.setRateOfReturnFlex2(flexSpendInfoPanel3.getRateOfReturn());
            } else if (clientProfile.isFlexSpendFilled2()) {
                clientProfile.setCurrentBalanceFlex3(flexSpendInfoPanel3.getCurrentBalance());
                clientProfile.setBalanceMonthFlex3(flexSpendInfoPanel3.getBalanceMonth());
                clientProfile.setBalanceDayFlex3(flexSpendInfoPanel3.getBalanceDay());
                clientProfile.setBalanceYearFlex3(flexSpendInfoPanel3.getBalanceYear());
                clientProfile.setContributionTypeFlex3(flexSpendInfoPanel3.getContributionType());
                if (clientProfile.getContributionTypeFlex3().equals("Balance")) {
                    clientProfile.setContributionBalanceFlex3(flexSpendInfoPanel3.getContributionBalance());
                } else if (clientProfile.getContributionTypeFlex3().equals("Percentage")) {
                    clientProfile.setContributionPercentFlex3(flexSpendInfoPanel3.getContributionPercent());
                }
                clientProfile.setFirstPercentMatchNumFlex3(flexSpendInfoPanel3.getFirstPercentMatch());
                clientProfile.setFirstPercentOfNumFlex3(flexSpendInfoPanel3.getFirstPercentOf());
                clientProfile.setSecondPercentMatchNumFlex3(flexSpendInfoPanel3.getSecondPercentMatch());
                clientProfile.setSecondPercentOfNumFlex3(flexSpendInfoPanel3.getSecondPercentOf());
                clientProfile.setRateOfReturnFlex3(flexSpendInfoPanel3.getRateOfReturn());
            }
        }
        
        
        if (panelStringArray.contains("info401KPanel3") && info401KPanel3.getWhoIsIt().equals("Client")) {
            if (!clientProfile.isFilled401K()) {
                clientProfile.setRothBalance401K(info401KPanel3.getRothBalance());
                clientProfile.setTraditionalBalance401K(info401KPanel3.getTraditionalBalance());
                clientProfile.setBalanceMonth401K(info401KPanel3.getBalanceMonth());
                clientProfile.setBalanceDay401K(info401KPanel3.getBalanceDay());
                clientProfile.setBalanceYear401K(info401KPanel3.getBalanceYear());
                clientProfile.setContributionType401K(info401KPanel3.getContributionType());
                clientProfile.setPercentOrBalance(info401KPanel3.getPercentOrBalance());
                if (clientProfile.getContributionType401K().equals("Balance")) {
                    clientProfile.setRothContributionBalance401K(info401KPanel3.getRothContributionBalance());
                    clientProfile.setTraditionalContributionBalance401K(info401KPanel3.getTraditionalContributionBalance());
                } else if (clientProfile.getContributionType401K().equals("Percentage")) {
                    clientProfile.setRothContributionPercent401K(info401KPanel3.getRothContributionPercent());
                    clientProfile.setTraditionalContributionPercent401K(info401KPanel3.getTraditionalContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum401K(info401KPanel3.getFirstPercentMatchNum());
                clientProfile.setFirstPercentOfNum401K(info401KPanel3.getFirstPercentOfNum());
                clientProfile.setSecondPercentMatchNum401K(info401KPanel3.getSecondPercentMatchNum());
                clientProfile.setSecondPercentOfNum401K(info401KPanel3.getSecondPercentOfNum());
                clientProfile.setRateOfReturn401K(info401KPanel3.getRateOfReturn());
            } else if (clientProfile.isFilled401K()) {
                clientProfile.setRothBalance401K2(info401KPanel3.getRothBalance());
                clientProfile.setTraditionalBalance401K2(info401KPanel3.getTraditionalBalance());
                clientProfile.setBalanceMonth401K2(info401KPanel3.getBalanceMonth());
                clientProfile.setBalanceDay401K2(info401KPanel3.getBalanceDay());
                clientProfile.setBalanceYear401K2(info401KPanel3.getBalanceYear());
                clientProfile.setContributionType401K2(info401KPanel3.getContributionType());
                clientProfile.setPercentOrBalance2(info401KPanel3.getPercentOrBalance());
                if (clientProfile.getContributionType401K2().equals("Balance")) {
                    clientProfile.setRothContributionBalance401K2(info401KPanel3.getRothContributionBalance());
                    clientProfile.setTraditionalContributionBalance401K2(info401KPanel3.getTraditionalContributionBalance());
                } else if (clientProfile.getContributionType401K2().equals("Percentage")) {
                    clientProfile.setRothContributionPercent401K2(info401KPanel3.getRothContributionPercent());
                    clientProfile.setTraditionalContributionPercent401K2(info401KPanel3.getTraditionalContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum401K2(info401KPanel3.getFirstPercentMatchNum());
                clientProfile.setFirstPercentOfNum401K2(info401KPanel3.getFirstPercentOfNum());
                clientProfile.setSecondPercentMatchNum401K2(info401KPanel3.getSecondPercentMatchNum());
                clientProfile.setSecondPercentOfNum401K2(info401KPanel3.getSecondPercentOfNum());
                clientProfile.setRateOfReturn401K2(info401KPanel3.getRateOfReturn());
            } else if (clientProfile.isFilled401K2()) {
                clientProfile.setRothBalance401K3(info401KPanel3.getRothBalance());
                clientProfile.setTraditionalBalance401K3(info401KPanel3.getTraditionalBalance());
                clientProfile.setBalanceMonth401K3(info401KPanel3.getBalanceMonth());
                clientProfile.setBalanceDay401K3(info401KPanel3.getBalanceDay());
                clientProfile.setBalanceYear401K3(info401KPanel3.getBalanceYear());
                clientProfile.setContributionType401K3(info401KPanel3.getContributionType());
                clientProfile.setPercentOrBalance3(info401KPanel3.getPercentOrBalance());
                if (clientProfile.getContributionType401K3().equals("Balance")) {
                    clientProfile.setRothContributionBalance401K3(info401KPanel3.getRothContributionBalance());
                    clientProfile.setTraditionalContributionBalance401K3(info401KPanel3.getTraditionalContributionBalance());
                } else if (clientProfile.getContributionType401K3().equals("Percentage")) {
                    clientProfile.setRothContributionPercent401K3(info401KPanel3.getRothContributionPercent());
                    clientProfile.setTraditionalContributionPercent401K3(info401KPanel3.getTraditionalContributionPercent());
                }
                clientProfile.setFirstPercentMatchNum401K3(info401KPanel3.getFirstPercentMatchNum());
                clientProfile.setFirstPercentOfNum401K3(info401KPanel3.getFirstPercentOfNum());
                clientProfile.setSecondPercentMatchNum401K3(info401KPanel3.getSecondPercentMatchNum());
                clientProfile.setSecondPercentOfNum401K3(info401KPanel3.getSecondPercentOfNum());
                clientProfile.setRateOfReturn401K3(info401KPanel3.getRateOfReturn());
            }
            
        }
        
            
    }
    
    
    public void createSpouseProfile() {
        
   
        
        spouseProfile.setAge(spouseInfoPanel.getAge());
        
        spouseProfile.setFirstName(spouseInfoPanel.getFirstName());
        
        spouseProfile.setLastName(spouseInfoPanel.getLastName());
        spouseProfile.setBirthMonth(spouseInfoPanel.getBirthMonth());
        spouseProfile.setBirthDay(spouseInfoPanel.getBirthDay());
        spouseProfile.setBirthYear(spouseInfoPanel.getBirthYear());
        spouseProfile.setRetirementMonth(spouseInfoPanel.getRetirementMonth());
        spouseProfile.setRetirementDay(spouseInfoPanel.getRetirementDay());
        spouseProfile.setRetirementYear(spouseInfoPanel.getRetirementYear());
        spouseProfile.setCompany(spouseInfoPanel.getCompany());
        spouseProfile.setServiceMonth(spouseInfoPanel.getServiceMonth());
        spouseProfile.setServiceDay(spouseInfoPanel.getServiceDay());
        spouseProfile.setServiceYear(spouseInfoPanel.getServiceYear());
        spouseProfile.setBonus(spouseInfoPanel.getBonus());
        spouseProfile.setBaseSalary(spouseInfoPanel.getBaseSalary());
        
       
        
        if (panelStringArray.contains("annuitiesPanel1") && annuitiesPanel.getBelongsTo().equals("Spouse")) {
            if (!spouseProfile.isAnnuitiesFilled()) {
                spouseProfile.setSavingsCurrentBalanceText(annuitiesPanel.getSavingsCurrentBalanceText());
                spouseProfile.setAssumedIncomeText(annuitiesPanel.getAssumedIncomeText());
                spouseProfile.setBalancedFundsCostBasisText(annuitiesPanel.getBalancedFundsCostBasisText());
                spouseProfile.setBalancedFundsCurrentBalanceText(annuitiesPanel.getBalancedFundsCurrentBalanceText());
                spouseProfile.setBalancedFundsDayText(annuitiesPanel.getBalancedFundsDayText());
                spouseProfile.setBalancedFundsMonthText(annuitiesPanel.getBalancedFundsMonthText());
                spouseProfile.setBalancedFundsYearText(annuitiesPanel.getBalancedFundsYearText());
                spouseProfile.setBondsCostBasisText(annuitiesPanel.getBondsCostBasisText());
                spouseProfile.setBondsCurrentBalanceText(annuitiesPanel.getBondsCurrentBalanceText());
                spouseProfile.setBondsDayText(annuitiesPanel.getBondsDayText());
                spouseProfile.setBondsMonthText(annuitiesPanel.getBondsMonthText());
                spouseProfile.setBondsYearText(annuitiesPanel.getBondsYearText());
                spouseProfile.setCheckingBalanceCostBasisText(annuitiesPanel.getCheckingBalanceCostBasisText());
                spouseProfile.setCheckingCurrentBalanceText(annuitiesPanel.getCheckingCurrentBalanceText());
                spouseProfile.setCheckingDayText(annuitiesPanel.getCheckingDayText());
                spouseProfile.setCheckingMonthText(annuitiesPanel.getCheckingMonthText());
                spouseProfile.setCheckingYearText(annuitiesPanel.getCheckingYearText());
                spouseProfile.setmBondsCurrentBalanceText(annuitiesPanel.getmBondsCurrentBalanceText());
                spouseProfile.setmBondsMonthText(annuitiesPanel.getmBondsMonthText());
                spouseProfile.setmBondsDayText(annuitiesPanel.getmBondsDayText());
                spouseProfile.setmBondsYearText(annuitiesPanel.getmBondsYearText());
                spouseProfile.setmBondsCostBasis(annuitiesPanel.getmBondsCostBasisText());
                spouseProfile.setRateOfReturnText(annuitiesPanel.getRateOfReturnText());
                spouseProfile.setSavingsCostBasisText(annuitiesPanel.getSavingsCostBasisText());
                spouseProfile.setSavingsDayText(annuitiesPanel.getSavingsDayText());
                spouseProfile.setSavingsMonthText(annuitiesPanel.getSavingsMonthText());
                spouseProfile.setSavingsYearText(annuitiesPanel.getSavingsYearText());
                spouseProfile.setStocksCostBasisText(annuitiesPanel.getStocksCostBasisText());
                spouseProfile.setStocksCurrentBalanceText(annuitiesPanel.getStocksCurrentBalanceText());
                spouseProfile.setStocksDayText(annuitiesPanel.getStocksDayText());
                spouseProfile.setStocksMonthText(annuitiesPanel.getStocksMonthText());
                spouseProfile.setStocksYearText(annuitiesPanel.getStocksYearText());
                spouseProfile.setAnnuitiesFilled(true);

            } else if (spouseProfile.isAnnuitiesFilled()) {
                spouseProfile.setSavingsCurrentBalanceText2(annuitiesPanel.getSavingsCurrentBalanceText());
                spouseProfile.setAssumedIncomeText2(annuitiesPanel.getAssumedIncomeText());
                spouseProfile.setBalancedFundsCostBasisText2(annuitiesPanel.getBalancedFundsCostBasisText());
                spouseProfile.setBalancedFundsCurrentBalanceText2(annuitiesPanel.getBalancedFundsCurrentBalanceText());
                spouseProfile.setBalancedFundsDayText2(annuitiesPanel.getBalancedFundsDayText());
                spouseProfile.setBalancedFundsMonthText2(annuitiesPanel.getBalancedFundsMonthText());
                spouseProfile.setBalancedFundsYearText2(annuitiesPanel.getBalancedFundsYearText());
                spouseProfile.setBondsCostBasisText2(annuitiesPanel.getBondsCostBasisText());
                spouseProfile.setBondsCurrentBalanceText2(annuitiesPanel.getBondsCurrentBalanceText());
                spouseProfile.setBondsDayText2(annuitiesPanel.getBondsDayText());
                spouseProfile.setBondsMonthText2(annuitiesPanel.getBondsMonthText());
                spouseProfile.setBondsYearText2(annuitiesPanel.getBondsYearText());
                spouseProfile.setCheckingBalanceCostBasisText2(annuitiesPanel.getCheckingBalanceCostBasisText());
                spouseProfile.setCheckingCurrentBalanceText2(annuitiesPanel.getCheckingCurrentBalanceText());
                spouseProfile.setCheckingDayText2(annuitiesPanel.getCheckingDayText());
                spouseProfile.setCheckingMonthText2(annuitiesPanel.getCheckingMonthText());
                spouseProfile.setCheckingYearText2(annuitiesPanel.getCheckingYearText());
                spouseProfile.setmBondsCurrentBalanceText2(annuitiesPanel.getmBondsCurrentBalanceText());
                spouseProfile.setmBondsMonthText2(annuitiesPanel.getmBondsMonthText());
                spouseProfile.setmBondsDayText2(annuitiesPanel.getmBondsDayText());
                spouseProfile.setmBondsYearText2(annuitiesPanel.getmBondsYearText());
                spouseProfile.setmBondsCostBasis2(annuitiesPanel.getmBondsCostBasisText());
                spouseProfile.setRateOfReturnText2(annuitiesPanel.getRateOfReturnText());
                spouseProfile.setSavingsCostBasisText2(annuitiesPanel.getSavingsCostBasisText());
                spouseProfile.setSavingsDayText2(annuitiesPanel.getSavingsDayText());
                spouseProfile.setSavingsMonthText2(annuitiesPanel.getSavingsMonthText());
                spouseProfile.setSavingsYearText2(annuitiesPanel.getSavingsYearText());
                spouseProfile.setStocksCostBasisText2(annuitiesPanel.getStocksCostBasisText());
                spouseProfile.setStocksCurrentBalanceText2(annuitiesPanel.getStocksCurrentBalanceText());
                spouseProfile.setStocksDayText2(annuitiesPanel.getStocksDayText());
                spouseProfile.setStocksMonthText2(annuitiesPanel.getStocksMonthText());
                spouseProfile.setStocksYearText2(annuitiesPanel.getStocksYearText());
                spouseProfile.setAnnuitiesFilled2(true);
            } 
            
            
        }
        
        
        
        if (panelStringArray.contains("iraPanel1") && iraPanel.getBelongsTo().equals("Spouse")) {
            if (!spouseProfile.isIraFilled()) {
                spouseProfile.setMonthIra(iraPanel.getMonth());
                spouseProfile.setDayIra(iraPanel.getDay());
                spouseProfile.setYearIra(iraPanel.getYear());
                spouseProfile.setContributionRothIra(iraPanel.getContributionRoth());
                spouseProfile.setContributionTraditionalIra(iraPanel.getContributionTraditional());
                spouseProfile.setBalanceChosen(iraPanel.isBalanceChosen());
                if (spouseProfile.isBalanceChosen()) {
                    spouseProfile.setRothBalance(iraPanel.getRothBalance());
                    spouseProfile.setTraditionalBalance(iraPanel.getTraditionalBalance());
                } else {
                    spouseProfile.setPercentRoth(iraPanel.getPercentRoth());
                    spouseProfile.setPercentTraditional(iraPanel.getPercentTraditional());
                }
                spouseProfile.setIraFilled(true);
            } else if (spouseProfile.isIraFilled()) {
                spouseProfile.setMonthIra2(iraPanel.getMonth());
                spouseProfile.setDayIra2(iraPanel.getDay());
                spouseProfile.setYearIra2(iraPanel.getYear());
                spouseProfile.setContributionRothIra2(iraPanel.getContributionRoth());
                spouseProfile.setContributionTraditionalIra2(iraPanel.getContributionTraditional());
                spouseProfile.setBalanceChosen2(iraPanel.isBalanceChosen());
                if (spouseProfile.isBalanceChosen2()) {
                    spouseProfile.setRothBalance2(iraPanel.getRothBalance());
                    spouseProfile.setTraditionalBalance2(iraPanel.getTraditionalBalance());
                } else {
                    spouseProfile.setPercentRoth2(iraPanel.getPercentRoth());
                    spouseProfile.setPercentTraditional2(iraPanel.getPercentTraditional());
                }
                spouseProfile.setIraFilled2(true);
            } else if (spouseProfile.isIraFilled2()) {
                spouseProfile.setMonthIra3(iraPanel.getMonth());
                spouseProfile.setDayIra3(iraPanel.getDay());
                spouseProfile.setYearIra3(iraPanel.getYear());
                spouseProfile.setContributionRothIra3(iraPanel.getContributionRoth());
                spouseProfile.setContributionTraditionalIra3(iraPanel.getContributionTraditional());
                spouseProfile.setBalanceChosen3(iraPanel.isBalanceChosen());
                if (spouseProfile.isBalanceChosen3()) {
                    spouseProfile.setRothBalance3(iraPanel.getRothBalance());
                    spouseProfile.setTraditionalBalance3(iraPanel.getTraditionalBalance());
                } else {
                    spouseProfile.setPercentRoth3(iraPanel.getPercentRoth());
                    spouseProfile.setPercentTraditional3(iraPanel.getPercentTraditional());
                }
                spouseProfile.setIraFilled3(true);
            }
            
        }
        
        if (panelStringArray.contains("optionsAndGrantsPanel1") && optionsAndGrantsPanel.getBelongsTo().equals("Spouse")) {
            
            if (!spouseProfile.isOptionsGrantsFilled()) {
                spouseProfile.setAwardDay(optionsAndGrantsPanel.getAwardDay());
                spouseProfile.setAwardMonth(optionsAndGrantsPanel.getAwardMonth());
                spouseProfile.setAwardYear(optionsAndGrantsPanel.getAwardYear());
                spouseProfile.setCurrentAmount(optionsAndGrantsPanel.getCurrentAmount());
                spouseProfile.setCurrentValue(optionsAndGrantsPanel.getCurrentValue());
                spouseProfile.setExpirationDay(optionsAndGrantsPanel.getExpirationDay());
                spouseProfile.setExpirationMonth(optionsAndGrantsPanel.getExpirationMonth());
                spouseProfile.setExpirationYear(optionsAndGrantsPanel.getExpirationYear());
                spouseProfile.setRateOfReturn(optionsAndGrantsPanel.getRateOfReturn());
                spouseProfile.setOptionsGrantsFilled(true);
                
            } else if (spouseProfile.isOptionsGrantsFilled()) {
                
                spouseProfile.setAwardDay2(optionsAndGrantsPanel.getAwardDay());
                spouseProfile.setAwardMonth2(optionsAndGrantsPanel.getAwardMonth());
                spouseProfile.setAwardYear2(optionsAndGrantsPanel.getAwardYear());
                spouseProfile.setCurrentAmount2(optionsAndGrantsPanel.getCurrentAmount());
                spouseProfile.setCurrentValue2(optionsAndGrantsPanel.getCurrentValue());
                spouseProfile.setExpirationDay2(optionsAndGrantsPanel.getExpirationDay());
                spouseProfile.setExpirationMonth2(optionsAndGrantsPanel.getExpirationMonth());
                spouseProfile.setExpirationYear2(optionsAndGrantsPanel.getExpirationYear());
                spouseProfile.setRateOfReturn2(optionsAndGrantsPanel.getRateOfReturn());
                spouseProfile.setOptionsGrantsFilled2(true);
                
            } else if (spouseProfile.isOptionsGrantsFilled2()) {
                spouseProfile.setAwardDay3(optionsAndGrantsPanel.getAwardDay());
                spouseProfile.setAwardMonth3(optionsAndGrantsPanel.getAwardMonth());
                spouseProfile.setAwardYear3(optionsAndGrantsPanel.getAwardYear());
                spouseProfile.setCurrentAmount3(optionsAndGrantsPanel.getCurrentAmount());
                spouseProfile.setCurrentValue3(optionsAndGrantsPanel.getCurrentValue());
                spouseProfile.setExpirationDay3(optionsAndGrantsPanel.getExpirationDay());
                spouseProfile.setExpirationMonth3(optionsAndGrantsPanel.getExpirationMonth());
                spouseProfile.setExpirationYear3(optionsAndGrantsPanel.getExpirationYear());
                spouseProfile.setRateOfReturn3(optionsAndGrantsPanel.getRateOfReturn());
                spouseProfile.setOptionsGrantsFilled3(true);
            }
            
        }
        
        
        
        if (panelStringArray.contains("pensionPanel1") && pensionPanel.getBelongsToSpouse()) {
            
            if (!spouseProfile.isPensionFilled()) {
                spouseProfile.setClientRecievesLumpSumBool(pensionPanel.getLumpBool());
                spouseProfile.setClientRecievesMonthlyBool(pensionPanel.getMonthlyBool());
                spouseProfile.setCostOfLivingAdjustment(pensionPanel.getCostOfLivingAdjustment());
                spouseProfile.setAmountPension(pensionPanel.getAmountPension());
                spouseProfile.setPensionDay(pensionPanel.getDay());
                spouseProfile.setPensionMonth(pensionPanel.getMonth());
                spouseProfile.setPensionYear(pensionPanel.getYear());
                spouseProfile.setPensionFilled(true);
            } else if (spouseProfile.isPensionFilled()) {
                
                spouseProfile.setClientRecievesLumpSumBool2(pensionPanel.getLumpBool());
                spouseProfile.setClientRecievesMonthlyBool2(pensionPanel.getMonthlyBool());
                spouseProfile.setCostOfLivingAdjustment2(pensionPanel.getCostOfLivingAdjustment());
                spouseProfile.setAmountPension2(pensionPanel.getAmountPension());
                spouseProfile.setPensionDay2(pensionPanel.getDay());
                spouseProfile.setPensionMonth2(pensionPanel.getMonth());
                spouseProfile.setPensionYear2(pensionPanel.getYear());
                spouseProfile.setPensionFilled2(true);
                
            } else if (spouseProfile.isPensionFilled2()) {
                spouseProfile.setClientRecievesLumpSumBool3(pensionPanel.getLumpBool());
                spouseProfile.setClientRecievesMonthlyBool3(pensionPanel.getMonthlyBool());
                spouseProfile.setCostOfLivingAdjustment3(pensionPanel.getCostOfLivingAdjustment());
                spouseProfile.setAmountPension3(pensionPanel.getAmountPension());
                spouseProfile.setPensionDay3(pensionPanel.getDay());
                spouseProfile.setPensionMonth3(pensionPanel.getMonth());
                spouseProfile.setPensionYear3(pensionPanel.getYear());
                spouseProfile.setPensionFilled3(true);
            }
            
        }
        
        
        
        if (panelStringArray.contains("info403bPanel1") && info403bPanel.getBelongsToSpouse()) {
            
            if (!spouseProfile.isFilled403B()) {
                spouseProfile.setCurrentBalance403B(info403bPanel.getCurrentBalance());
                spouseProfile.setBalanceDay403B(info403bPanel.getBalanceDay());
                spouseProfile.setBalanceMonth403B(info403bPanel.getBalanceMonth());
                spouseProfile.setBalanceYear403B(info403bPanel.getBalanceYear());
                spouseProfile.setContributionType403B(info403bPanel.getContributionType());
                if (spouseProfile.getContributionType403B().equals("Percentage")) {
                    spouseProfile.setContributionPercent403B(info403bPanel.getContributionPercent());
                } else if (spouseProfile.getContributionType403B().equals("Balance")) {
                    spouseProfile.setContributionBalance403B(info403bPanel.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNum403B(info403bPanel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum403B(info403bPanel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum403B(info403bPanel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum403B(info403bPanel.getSecondPercentOf());
                spouseProfile.setRateOfReturn403B(info403bPanel.getRateOfReturn());        
                spouseProfile.setFilled403B(true);
            } else if (spouseProfile.isFilled403B()) {
                spouseProfile.setCurrentBalance403B2(info403bPanel.getCurrentBalance());
                spouseProfile.setBalanceDay403B2(info403bPanel.getBalanceDay());
                spouseProfile.setBalanceMonth403B2(info403bPanel.getBalanceMonth());
                spouseProfile.setBalanceYear403B2(info403bPanel.getBalanceYear());
                spouseProfile.setContributionType403B2(info403bPanel.getContributionType());
                if (spouseProfile.getContributionType403B2().equals("Percentage")) {
                    spouseProfile.setContributionPercent403B2(info403bPanel.getContributionPercent());
                } else if (spouseProfile.getContributionType403B2().equals("Balance")) {
                    spouseProfile.setContributionBalance403B2(info403bPanel.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNum403B2(info403bPanel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum403B2(info403bPanel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum403B2(info403bPanel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum403B2(info403bPanel.getSecondPercentOf());
                spouseProfile.setRateOfReturn403B2(info403bPanel.getRateOfReturn());  
                spouseProfile.setFilled403B2(true);
            } else if (spouseProfile.isFilled403B2()) {
                spouseProfile.setCurrentBalance403B3(info403bPanel.getCurrentBalance());
                spouseProfile.setBalanceDay403B3(info403bPanel.getBalanceDay());
                spouseProfile.setBalanceMonth403B3(info403bPanel.getBalanceMonth());
                spouseProfile.setBalanceYear403B3(info403bPanel.getBalanceYear());
                spouseProfile.setContributionType403B3(info403bPanel.getContributionType());
                if (spouseProfile.getContributionType403B3().equals("Percentage")) {
                    spouseProfile.setContributionPercent403B3(info403bPanel.getContributionPercent());
                } else if (spouseProfile.getContributionType403B3().equals("Balance")) {
                    spouseProfile.setContributionBalance403B3(info403bPanel.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNum403B3(info403bPanel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum403B3(info403bPanel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum403B3(info403bPanel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum403B3(info403bPanel.getSecondPercentOf());
                spouseProfile.setRateOfReturn403B3(info403bPanel.getRateOfReturn());         
                spouseProfile.setFilled403B3(true);
            }
            
        }
        
        
        
        if (panelStringArray.contains("hsaInfoPanel1") && hsaInfoPanel.getBelongsToSpouse()) {
            if (!spouseProfile.isHsaFilled()) {
                spouseProfile.setCurrentBalanceHSA(hsaInfoPanel.getCurrentBalance());
                spouseProfile.setBalanceMonthHSA(hsaInfoPanel.getBalanceMonth());
                spouseProfile.setBalanceDayHSA(hsaInfoPanel.getBalanceDay());
                spouseProfile.setBalanceYearHSA(hsaInfoPanel.getBalanceYear());
                spouseProfile.setContributionTypeHSA(hsaInfoPanel.getContributionType());
                if (spouseProfile.getContributionTypeHSA().equals("Percentage")) {
                    spouseProfile.setContributionPercentHSA(hsaInfoPanel.getContributionPercent());
                } else if (spouseProfile.getContributionTypeHSA().equals("Balance")) {
                    spouseProfile.setContributionBalanceHSA(hsaInfoPanel.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNumHSA(hsaInfoPanel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumHSA(hsaInfoPanel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumHSA(hsaInfoPanel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumHSA(hsaInfoPanel.getSecondPercentOf());
                spouseProfile.setRateOfReturnHSA(hsaInfoPanel.getRateOfReturn());
                spouseProfile.setHsaFilled(true);
            } else if (spouseProfile.isHsaFilled()) {
                spouseProfile.setCurrentBalanceHSA2(hsaInfoPanel.getCurrentBalance());
                spouseProfile.setBalanceMonthHSA2(hsaInfoPanel.getBalanceMonth());
                spouseProfile.setBalanceDayHSA2(hsaInfoPanel.getBalanceDay());
                spouseProfile.setBalanceYearHSA2(hsaInfoPanel.getBalanceYear());
                spouseProfile.setContributionTypeHSA2(hsaInfoPanel.getContributionType());
                if (spouseProfile.getContributionTypeHSA2().equals("Percentage")) {
                    spouseProfile.setContributionPercentHSA2(hsaInfoPanel.getContributionPercent());
                } else if (spouseProfile.getContributionTypeHSA2().equals("Balance")) {
                    spouseProfile.setContributionBalanceHSA2(hsaInfoPanel.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNumHSA2(hsaInfoPanel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumHSA2(hsaInfoPanel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumHSA2(hsaInfoPanel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumHSA2(hsaInfoPanel.getSecondPercentOf());
                spouseProfile.setRateOfReturnHSA2(hsaInfoPanel.getRateOfReturn());
                spouseProfile.setHsaFilled2(true);
            } else if (spouseProfile.isHsaFilled2()) {
                spouseProfile.setCurrentBalanceHSA3(hsaInfoPanel.getCurrentBalance());
                spouseProfile.setBalanceMonthHSA3(hsaInfoPanel.getBalanceMonth());
                spouseProfile.setBalanceDayHSA3(hsaInfoPanel.getBalanceDay());
                spouseProfile.setBalanceYearHSA3(hsaInfoPanel.getBalanceYear());
                spouseProfile.setContributionTypeHSA3(hsaInfoPanel.getContributionType());
                if (spouseProfile.getContributionTypeHSA3().equals("Percentage")) {
                    spouseProfile.setContributionPercentHSA3(hsaInfoPanel.getContributionPercent());
                } else if (spouseProfile.getContributionTypeHSA3().equals("Balance")) {
                    spouseProfile.setContributionBalanceHSA3(hsaInfoPanel.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNumHSA3(hsaInfoPanel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumHSA3(hsaInfoPanel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumHSA3(hsaInfoPanel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumHSA3(hsaInfoPanel.getSecondPercentOf());
                spouseProfile.setRateOfReturnHSA3(hsaInfoPanel.getRateOfReturn());
                spouseProfile.setHsaFilled3(true);
            }
        }
        
        
        
        
        if (panelStringArray.contains("info457Panel1") && info457Panel.getBelongsToSpouse()) {
            if (!spouseProfile.isFilled457()) {
                spouseProfile.setCurrentBalance457(info457Panel.getCurrentBalance());
                spouseProfile.setBalanceMonth457(info457Panel.getBalanceMonth());
                spouseProfile.setBalanceDay457(info457Panel.getBalanceDay());
                spouseProfile.setBalanceYear457(info457Panel.getBalanceYear());
                spouseProfile.setContributionType457(info457Panel.getContributionType());
                if (spouseProfile.getContributionType457().equals("Balance")) {
                    spouseProfile.setContributionBalance457(info457Panel.getContributionBalance());
                } else if (spouseProfile.getContributionType457().equals("Percent")) {
                    spouseProfile.setContributionPercent457(info457Panel.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum457(info457Panel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum457(info457Panel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum457(info457Panel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum457(info457Panel.getSecondPercentOf());
                spouseProfile.setRateOfReturn457(info457Panel.getRateOfReturn());
            } else if (spouseProfile.isFilled457()) {
                spouseProfile.setCurrentBalance4572(info457Panel.getCurrentBalance());
                spouseProfile.setBalanceMonth4572(info457Panel.getBalanceMonth());
                spouseProfile.setBalanceDay4572(info457Panel.getBalanceDay());
                spouseProfile.setBalanceYear4572(info457Panel.getBalanceYear());
                spouseProfile.setContributionType4572(info457Panel.getContributionType());
                if (spouseProfile.getContributionType4572().equals("Balance")) {
                    spouseProfile.setContributionBalance4572(info457Panel.getContributionBalance());
                } else if (spouseProfile.getContributionType4572().equals("Percent")) {
                    spouseProfile.setContributionPercent4572(info457Panel.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum4572(info457Panel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum4572(info457Panel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum4572(info457Panel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum4572(info457Panel.getSecondPercentOf());
                spouseProfile.setRateOfReturn4572(info457Panel.getRateOfReturn());
            } else if (spouseProfile.isFilled4572()) {
                spouseProfile.setCurrentBalance4573(info457Panel.getCurrentBalance());
                spouseProfile.setBalanceMonth4573(info457Panel.getBalanceMonth());
                spouseProfile.setBalanceDay4573(info457Panel.getBalanceDay());
                spouseProfile.setBalanceYear4573(info457Panel.getBalanceYear());
                spouseProfile.setContributionType4573(info457Panel.getContributionType());
                if (spouseProfile.getContributionType4573().equals("Balance")) {
                    spouseProfile.setContributionBalance4573(info457Panel.getContributionBalance());
                } else if (spouseProfile.getContributionType4573().equals("Percent")) {
                    spouseProfile.setContributionPercent4573(info457Panel.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum4573(info457Panel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum4573(info457Panel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum4573(info457Panel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum4573(info457Panel.getSecondPercentOf());
                spouseProfile.setRateOfReturn4573(info457Panel.getRateOfReturn());
            }
        }
        
        
        
        if (panelStringArray.contains("flexSpendInfoPanel1") && flexSpendInfoPanel.getBelongsToSpouse()) {
            if (!spouseProfile.isFlexSpendFilled()) {
                spouseProfile.setCurrentBalanceFlex(flexSpendInfoPanel.getCurrentBalance());
                spouseProfile.setBalanceMonthFlex(flexSpendInfoPanel.getBalanceMonth());
                spouseProfile.setBalanceDayFlex(flexSpendInfoPanel.getBalanceDay());
                spouseProfile.setBalanceYearFlex(flexSpendInfoPanel.getBalanceYear());
                spouseProfile.setContributionTypeFlex(flexSpendInfoPanel.getContributionType());
                if (spouseProfile.getContributionTypeFlex().equals("Balance")) {
                    spouseProfile.setContributionBalanceFlex(flexSpendInfoPanel.getContributionBalance());
                } else if (spouseProfile.getContributionTypeFlex().equals("Percentage")) {
                    spouseProfile.setContributionPercentFlex(flexSpendInfoPanel.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNumFlex(flexSpendInfoPanel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumFlex(flexSpendInfoPanel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumFlex(flexSpendInfoPanel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumFlex(flexSpendInfoPanel.getSecondPercentOf());
                spouseProfile.setRateOfReturnFlex(flexSpendInfoPanel.getRateOfReturn());
            } else if (spouseProfile.isFlexSpendFilled()) {
                spouseProfile.setCurrentBalanceFlex2(flexSpendInfoPanel.getCurrentBalance());
                spouseProfile.setBalanceMonthFlex2(flexSpendInfoPanel.getBalanceMonth());
                spouseProfile.setBalanceDayFlex2(flexSpendInfoPanel.getBalanceDay());
                spouseProfile.setBalanceYearFlex2(flexSpendInfoPanel.getBalanceYear());
                spouseProfile.setContributionTypeFlex2(flexSpendInfoPanel.getContributionType());
                if (spouseProfile.getContributionTypeFlex2().equals("Balance")) {
                    spouseProfile.setContributionBalanceFlex2(flexSpendInfoPanel.getContributionBalance());
                } else if (spouseProfile.getContributionTypeFlex2().equals("Percentage")) {
                    spouseProfile.setContributionPercentFlex2(flexSpendInfoPanel.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNumFlex2(flexSpendInfoPanel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumFlex2(flexSpendInfoPanel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumFlex2(flexSpendInfoPanel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumFlex2(flexSpendInfoPanel.getSecondPercentOf());
                spouseProfile.setRateOfReturnFlex2(flexSpendInfoPanel.getRateOfReturn());
            } else if (spouseProfile.isFlexSpendFilled2()) {
                spouseProfile.setCurrentBalanceFlex3(flexSpendInfoPanel.getCurrentBalance());
                spouseProfile.setBalanceMonthFlex3(flexSpendInfoPanel.getBalanceMonth());
                spouseProfile.setBalanceDayFlex3(flexSpendInfoPanel.getBalanceDay());
                spouseProfile.setBalanceYearFlex3(flexSpendInfoPanel.getBalanceYear());
                spouseProfile.setContributionTypeFlex3(flexSpendInfoPanel.getContributionType());
                if (spouseProfile.getContributionTypeFlex3().equals("Balance")) {
                    spouseProfile.setContributionBalanceFlex3(flexSpendInfoPanel.getContributionBalance());
                } else if (spouseProfile.getContributionTypeFlex3().equals("Percentage")) {
                    spouseProfile.setContributionPercentFlex3(flexSpendInfoPanel.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNumFlex3(flexSpendInfoPanel.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumFlex3(flexSpendInfoPanel.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumFlex3(flexSpendInfoPanel.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumFlex3(flexSpendInfoPanel.getSecondPercentOf());
                spouseProfile.setRateOfReturnFlex3(flexSpendInfoPanel.getRateOfReturn());
            }
        }
        
        
        
        if (panelStringArray.contains("socialSecurityPanel1") && socialSecurityPanel.getBelongsToSpouse()) {
            
            spouseProfile.setStatePercentWithheldValue(socialSecurityPanel.getStatePercentWithheldValue());
            spouseProfile.setAgeRecievingBenefits(socialSecurityPanel.getAgeRecievingBenefits());
            spouseProfile.setExpectedMonthlyAmountValue(socialSecurityPanel.getExpectedMonthlyAmountValue());
            spouseProfile.setFederalPercentWithheldValue(socialSecurityPanel.getFederalPercentWithheldValue());
            spouseProfile.setSsAmountValue(socialSecurityPanel.getSsAmountValue());
            spouseProfile.setCurrentlyReceivingSS(socialSecurityPanel.getCurrentlyReceivingSS());
            spouseProfile.setSsAmountIsKnown(socialSecurityPanel.getssAmountIsKnown());
            spouseProfile.setAreFedTaxesWithheld(socialSecurityPanel.getAreFedTaxesWithheld());
            spouseProfile.setAreStateTaxesWithheld(socialSecurityPanel.getAreStateTaxesWithheld());
            spouseProfile.setBelongsToClient(socialSecurityPanel.getBelongsToClient());
            spouseProfile.setBelongsToSpouse(socialSecurityPanel.getBelongsToSpouse());
            
            
        }
        
        
        if (panelStringArray.contains("info401KPanel1") && info401KPanel.getWhoIsIt().equals("Spouse")) {
            if (!spouseProfile.isFilled401K()) {
                spouseProfile.setRothBalance401K(info401KPanel.getRothBalance());
                spouseProfile.setTraditionalBalance401K(info401KPanel.getTraditionalBalance());
                spouseProfile.setBalanceMonth401K(info401KPanel.getBalanceMonth());
                spouseProfile.setBalanceDay401K(info401KPanel.getBalanceDay());
                spouseProfile.setBalanceYear401K(info401KPanel.getBalanceYear());
                spouseProfile.setContributionType401K(info401KPanel.getContributionType());
                spouseProfile.setPercentOrBalance(info401KPanel.getPercentOrBalance());
                if (spouseProfile.getContributionType401K().equals("Balance")) {
                    spouseProfile.setRothContributionBalance401K(info401KPanel.getRothContributionBalance());
                    spouseProfile.setTraditionalContributionBalance401K(info401KPanel.getTraditionalContributionBalance());
                } else if (spouseProfile.getContributionType401K().equals("Percentage")) {
                    spouseProfile.setRothContributionPercent401K(info401KPanel.getRothContributionPercent());
                    spouseProfile.setTraditionalContributionPercent401K(info401KPanel.getTraditionalContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum401K(info401KPanel.getFirstPercentMatchNum());
                spouseProfile.setFirstPercentOfNum401K(info401KPanel.getFirstPercentOfNum());
                spouseProfile.setSecondPercentMatchNum401K(info401KPanel.getSecondPercentMatchNum());
                spouseProfile.setSecondPercentOfNum401K(info401KPanel.getSecondPercentOfNum());
                spouseProfile.setRateOfReturn401K(info401KPanel.getRateOfReturn());
            } else if (spouseProfile.isFilled401K()) {
                spouseProfile.setRothBalance401K2(info401KPanel.getRothBalance());
                spouseProfile.setTraditionalBalance401K2(info401KPanel.getTraditionalBalance());
                spouseProfile.setBalanceMonth401K2(info401KPanel.getBalanceMonth());
                spouseProfile.setBalanceDay401K2(info401KPanel.getBalanceDay());
                spouseProfile.setBalanceYear401K2(info401KPanel.getBalanceYear());
                spouseProfile.setContributionType401K2(info401KPanel.getContributionType());
                spouseProfile.setPercentOrBalance2(info401KPanel.getPercentOrBalance());
                if (spouseProfile.getContributionType401K2().equals("Balance")) {
                    spouseProfile.setRothContributionBalance401K2(info401KPanel.getRothContributionBalance());
                    spouseProfile.setTraditionalContributionBalance401K2(info401KPanel.getTraditionalContributionBalance());
                } else if (spouseProfile.getContributionType401K2().equals("Percentage")) {
                    spouseProfile.setRothContributionPercent401K2(info401KPanel.getRothContributionPercent());
                    spouseProfile.setTraditionalContributionPercent401K2(info401KPanel.getTraditionalContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum401K2(info401KPanel.getFirstPercentMatchNum());
                spouseProfile.setFirstPercentOfNum401K2(info401KPanel.getFirstPercentOfNum());
                spouseProfile.setSecondPercentMatchNum401K2(info401KPanel.getSecondPercentMatchNum());
                spouseProfile.setSecondPercentOfNum401K2(info401KPanel.getSecondPercentOfNum());
                spouseProfile.setRateOfReturn401K2(info401KPanel.getRateOfReturn());
            } else if (spouseProfile.isFilled401K2()) {
                spouseProfile.setRothBalance401K3(info401KPanel.getRothBalance());
                spouseProfile.setTraditionalBalance401K3(info401KPanel.getTraditionalBalance());
                spouseProfile.setBalanceMonth401K3(info401KPanel.getBalanceMonth());
                spouseProfile.setBalanceDay401K3(info401KPanel.getBalanceDay());
                spouseProfile.setBalanceYear401K3(info401KPanel.getBalanceYear());
                spouseProfile.setContributionType401K3(info401KPanel.getContributionType());
                spouseProfile.setPercentOrBalance3(info401KPanel.getPercentOrBalance());
                if (spouseProfile.getContributionType401K3().equals("Balance")) {
                    spouseProfile.setRothContributionBalance401K3(info401KPanel.getRothContributionBalance());
                    spouseProfile.setTraditionalContributionBalance401K3(info401KPanel.getTraditionalContributionBalance());
                } else if (spouseProfile.getContributionType401K3().equals("Percentage")) {
                    spouseProfile.setRothContributionPercent401K3(info401KPanel.getRothContributionPercent());
                    spouseProfile.setTraditionalContributionPercent401K3(info401KPanel.getTraditionalContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum401K3(info401KPanel.getFirstPercentMatchNum());
                spouseProfile.setFirstPercentOfNum401K3(info401KPanel.getFirstPercentOfNum());
                spouseProfile.setSecondPercentMatchNum401K3(info401KPanel.getSecondPercentMatchNum());
                spouseProfile.setSecondPercentOfNum401K3(info401KPanel.getSecondPercentOfNum());
                spouseProfile.setRateOfReturn401K3(info401KPanel.getRateOfReturn());
            }
            
        }
        
       
        
        // ROUND 2
        
        
        if (panelStringArray.contains("iraPanel2") && iraPanel2.getBelongsTo().equals("Spouse")) {
            if (!spouseProfile.isIraFilled()) {
                spouseProfile.setMonthIra(iraPanel2.getMonth());
                spouseProfile.setDayIra(iraPanel2.getDay());
                spouseProfile.setYearIra(iraPanel2.getYear());
                spouseProfile.setContributionRothIra(iraPanel2.getContributionRoth());
                spouseProfile.setContributionTraditionalIra(iraPanel2.getContributionTraditional());
                spouseProfile.setBalanceChosen(iraPanel2.isBalanceChosen());
                if (spouseProfile.isBalanceChosen()) {
                    spouseProfile.setRothBalance(iraPanel2.getRothBalance());
                    spouseProfile.setTraditionalBalance(iraPanel2.getTraditionalBalance());
                } else {
                    spouseProfile.setPercentRoth(iraPanel2.getPercentRoth());
                    spouseProfile.setPercentTraditional(iraPanel2.getPercentTraditional());
                }
            } else if (spouseProfile.isIraFilled()) {
                spouseProfile.setMonthIra2(iraPanel2.getMonth());
                spouseProfile.setDayIra2(iraPanel2.getDay());
                spouseProfile.setYearIra2(iraPanel2.getYear());
                spouseProfile.setContributionRothIra2(iraPanel2.getContributionRoth());
                spouseProfile.setContributionTraditionalIra2(iraPanel2.getContributionTraditional());
                spouseProfile.setBalanceChosen2(iraPanel2.isBalanceChosen());
                if (spouseProfile.isBalanceChosen2()) {
                    spouseProfile.setRothBalance2(iraPanel2.getRothBalance());
                    spouseProfile.setTraditionalBalance2(iraPanel2.getTraditionalBalance());
                } else {
                    spouseProfile.setPercentRoth2(iraPanel2.getPercentRoth());
                    spouseProfile.setPercentTraditional2(iraPanel2.getPercentTraditional());
                }
            } else if (spouseProfile.isIraFilled2()) {
                spouseProfile.setMonthIra3(iraPanel2.getMonth());
                spouseProfile.setDayIra3(iraPanel2.getDay());
                spouseProfile.setYearIra3(iraPanel2.getYear());
                spouseProfile.setContributionRothIra3(iraPanel2.getContributionRoth());
                spouseProfile.setContributionTraditionalIra3(iraPanel2.getContributionTraditional());
                spouseProfile.setBalanceChosen3(iraPanel2.isBalanceChosen());
                if (spouseProfile.isBalanceChosen3()) {
                    spouseProfile.setRothBalance3(iraPanel2.getRothBalance());
                    spouseProfile.setTraditionalBalance3(iraPanel2.getTraditionalBalance());
                } else {
                    spouseProfile.setPercentRoth3(iraPanel2.getPercentRoth());
                    spouseProfile.setPercentTraditional3(iraPanel2.getPercentTraditional());
                }
            }
        }
        
        if (panelStringArray.contains("optionsAndGrantsPanel2")) {
            if (optionsAndGrantsPanel2.getBelongsTo().equals("Spouse") && optionsAndGrantsPanel.getBelongsTo().equals("Spouse")) {
                if (!spouseProfile.isOptionsGrantsFilled()) {
                    spouseProfile.setAwardDay(optionsAndGrantsPanel2.getAwardDay());
                    spouseProfile.setAwardMonth(optionsAndGrantsPanel2.getAwardMonth());
                    spouseProfile.setAwardYear(optionsAndGrantsPanel2.getAwardYear());
                    spouseProfile.setCurrentAmount(optionsAndGrantsPanel2.getCurrentAmount());
                    spouseProfile.setCurrentValue(optionsAndGrantsPanel2.getCurrentValue());
                    spouseProfile.setExpirationDay(optionsAndGrantsPanel2.getExpirationDay());
                    spouseProfile.setExpirationMonth(optionsAndGrantsPanel2.getExpirationMonth());
                    spouseProfile.setExpirationYear(optionsAndGrantsPanel2.getExpirationYear());
                    spouseProfile.setRateOfReturn(optionsAndGrantsPanel2.getRateOfReturn());
                } else if (spouseProfile.isOptionsGrantsFilled()) {
                    spouseProfile.setAwardDay2(optionsAndGrantsPanel2.getAwardDay());
                    spouseProfile.setAwardMonth2(optionsAndGrantsPanel2.getAwardMonth());
                    spouseProfile.setAwardYear2(optionsAndGrantsPanel2.getAwardYear());
                    spouseProfile.setCurrentAmount2(optionsAndGrantsPanel2.getCurrentAmount());
                    spouseProfile.setCurrentValue2(optionsAndGrantsPanel2.getCurrentValue());
                    spouseProfile.setExpirationDay2(optionsAndGrantsPanel2.getExpirationDay());
                    spouseProfile.setExpirationMonth2(optionsAndGrantsPanel2.getExpirationMonth());
                    spouseProfile.setExpirationYear2(optionsAndGrantsPanel2.getExpirationYear());
                    spouseProfile.setRateOfReturn2(optionsAndGrantsPanel2.getRateOfReturn());
                } else if (spouseProfile.isOptionsGrantsFilled2()) {
                    spouseProfile.setAwardDay3(optionsAndGrantsPanel2.getAwardDay());
                    spouseProfile.setAwardMonth3(optionsAndGrantsPanel2.getAwardMonth());
                    spouseProfile.setAwardYear3(optionsAndGrantsPanel2.getAwardYear());
                    spouseProfile.setCurrentAmount3(optionsAndGrantsPanel2.getCurrentAmount());
                    spouseProfile.setCurrentValue3(optionsAndGrantsPanel2.getCurrentValue());
                    spouseProfile.setExpirationDay3(optionsAndGrantsPanel2.getExpirationDay());
                    spouseProfile.setExpirationMonth3(optionsAndGrantsPanel2.getExpirationMonth());
                    spouseProfile.setExpirationYear3(optionsAndGrantsPanel2.getExpirationYear());
                    spouseProfile.setRateOfReturn3(optionsAndGrantsPanel2.getRateOfReturn());
                }
            }
        }
        
        if (panelStringArray.contains("pensionPanel2") && pensionPanel2.getBelongsToSpouse()) {
            if (!spouseProfile.isPensionFilled()) {
                spouseProfile.setClientRecievesLumpSumBool(pensionPanel2.getLumpBool());
                spouseProfile.setClientRecievesMonthlyBool(pensionPanel2.getMonthlyBool());
                spouseProfile.setCostOfLivingAdjustment(pensionPanel2.getCostOfLivingAdjustment());
                spouseProfile.setAmountPension(pensionPanel2.getAmountPension());
                spouseProfile.setPensionDay(pensionPanel2.getDay());
                spouseProfile.setPensionMonth(pensionPanel2.getMonth());
                spouseProfile.setPensionYear(pensionPanel2.getYear());
            } else if (spouseProfile.isPensionFilled()) {
                spouseProfile.setClientRecievesLumpSumBool2(pensionPanel2.getLumpBool());
                spouseProfile.setClientRecievesMonthlyBool2(pensionPanel2.getMonthlyBool());
                spouseProfile.setCostOfLivingAdjustment2(pensionPanel2.getCostOfLivingAdjustment());
                spouseProfile.setAmountPension2(pensionPanel2.getAmountPension());
                spouseProfile.setPensionDay2(pensionPanel2.getDay());
                spouseProfile.setPensionMonth2(pensionPanel2.getMonth());
                spouseProfile.setPensionYear2(pensionPanel2.getYear());
            } else if (spouseProfile.isPensionFilled2()) {
                spouseProfile.setClientRecievesLumpSumBool3(pensionPanel2.getLumpBool());
                spouseProfile.setClientRecievesMonthlyBool3(pensionPanel2.getMonthlyBool());
                spouseProfile.setCostOfLivingAdjustment3(pensionPanel2.getCostOfLivingAdjustment());
                spouseProfile.setAmountPension3(pensionPanel2.getAmountPension());
                spouseProfile.setPensionDay3(pensionPanel2.getDay());
                spouseProfile.setPensionMonth3(pensionPanel2.getMonth());
                spouseProfile.setPensionYear3(pensionPanel2.getYear());
            }
        }
        
        
        if (panelStringArray.contains("info403bPanel2") && info403bPanel2.getBelongsToSpouse()) {
            if (!spouseProfile.isFilled403B()) {
                spouseProfile.setCurrentBalance403B(info403bPanel2.getCurrentBalance());
                spouseProfile.setBalanceDay403B(info403bPanel2.getBalanceDay());
                spouseProfile.setBalanceMonth403B(info403bPanel2.getBalanceMonth());
                spouseProfile.setBalanceYear403B(info403bPanel2.getBalanceYear());
                spouseProfile.setContributionType403B(info403bPanel2.getContributionType());
                if (spouseProfile.getContributionType403B().equals("Percentage")) {
                    spouseProfile.setContributionPercent403B(info403bPanel2.getContributionPercent());
                } else if (spouseProfile.getContributionType403B().equals("Balance")) {
                    spouseProfile.setContributionBalance403B(info403bPanel2.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNum403B(info403bPanel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum403B(info403bPanel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum403B(info403bPanel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum403B(info403bPanel2.getSecondPercentOf());
                spouseProfile.setRateOfReturn403B(info403bPanel2.getRateOfReturn());
            }
            else if (spouseProfile.isFilled403B()) {
                spouseProfile.setCurrentBalance403B2(info403bPanel2.getCurrentBalance());
                spouseProfile.setBalanceDay403B2(info403bPanel2.getBalanceDay());
                spouseProfile.setBalanceMonth403B2(info403bPanel2.getBalanceMonth());
                spouseProfile.setBalanceYear403B2(info403bPanel2.getBalanceYear());
                spouseProfile.setContributionType403B2(info403bPanel2.getContributionType());
                if (spouseProfile.getContributionType403B2().equals("Percentage")) {
                    spouseProfile.setContributionPercent403B2(info403bPanel2.getContributionPercent());
                } else if (spouseProfile.getContributionType403B2().equals("Balance")) {
                    spouseProfile.setContributionBalance403B2(info403bPanel2.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNum403B2(info403bPanel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum403B2(info403bPanel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum403B2(info403bPanel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum403B2(info403bPanel2.getSecondPercentOf());
                spouseProfile.setRateOfReturn403B2(info403bPanel2.getRateOfReturn());            
            } else if (spouseProfile.isFilled403B2()) {
                spouseProfile.setCurrentBalance403B3(info403bPanel2.getCurrentBalance());
                spouseProfile.setBalanceDay403B3(info403bPanel2.getBalanceDay());
                spouseProfile.setBalanceMonth403B3(info403bPanel2.getBalanceMonth());
                spouseProfile.setBalanceYear403B3(info403bPanel2.getBalanceYear());
                spouseProfile.setContributionType403B3(info403bPanel2.getContributionType());
                if (spouseProfile.getContributionType403B3().equals("Percentage")) {
                    spouseProfile.setContributionPercent403B3(info403bPanel2.getContributionPercent());
                } else if (spouseProfile.getContributionType403B3().equals("Balance")) {
                    spouseProfile.setContributionBalance403B3(info403bPanel2.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNum403B3(info403bPanel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum403B3(info403bPanel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum403B3(info403bPanel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum403B3(info403bPanel2.getSecondPercentOf());
                spouseProfile.setRateOfReturn403B3(info403bPanel2.getRateOfReturn());
            }
        } 
        
        if (panelStringArray.contains("hsaInfoPanel2") && hsaInfoPanel2.getBelongsToSpouse()) {
            if (!spouseProfile.isHsaFilled()) {
                spouseProfile.setCurrentBalanceHSA(hsaInfoPanel2.getCurrentBalance());
                spouseProfile.setBalanceMonthHSA(hsaInfoPanel2.getBalanceMonth());
                spouseProfile.setBalanceDayHSA(hsaInfoPanel2.getBalanceDay());
                spouseProfile.setBalanceYearHSA(hsaInfoPanel2.getBalanceYear());
                spouseProfile.setContributionTypeHSA(hsaInfoPanel2.getContributionType());
                if (spouseProfile.getContributionTypeHSA().equals("Percentage")) {
                    spouseProfile.setContributionPercentHSA(hsaInfoPanel2.getContributionPercent());
                } else if (spouseProfile.getContributionTypeHSA().equals("Balance")) {
                    spouseProfile.setContributionBalanceHSA(hsaInfoPanel2.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNumHSA(hsaInfoPanel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumHSA(hsaInfoPanel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumHSA(hsaInfoPanel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumHSA(hsaInfoPanel2.getSecondPercentOf());
                spouseProfile.setRateOfReturnHSA(hsaInfoPanel2.getRateOfReturn());
            }
            else if (spouseProfile.isHsaFilled()) {
                spouseProfile.setCurrentBalanceHSA2(hsaInfoPanel2.getCurrentBalance());
                spouseProfile.setBalanceMonthHSA2(hsaInfoPanel2.getBalanceMonth());
                spouseProfile.setBalanceDayHSA2(hsaInfoPanel2.getBalanceDay());
                spouseProfile.setBalanceYearHSA2(hsaInfoPanel2.getBalanceYear());
                spouseProfile.setContributionTypeHSA2(hsaInfoPanel2.getContributionType());
                if (spouseProfile.getContributionTypeHSA2().equals("Percentage")) {
                    spouseProfile.setContributionPercentHSA2(hsaInfoPanel2.getContributionPercent());
                } else if (spouseProfile.getContributionTypeHSA2().equals("Balance")) {
                    spouseProfile.setContributionBalanceHSA2(hsaInfoPanel2.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNumHSA2(hsaInfoPanel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumHSA2(hsaInfoPanel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumHSA2(hsaInfoPanel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumHSA2(hsaInfoPanel2.getSecondPercentOf());
                spouseProfile.setRateOfReturnHSA2(hsaInfoPanel2.getRateOfReturn());
            } else if (spouseProfile.isHsaFilled2()) {
                spouseProfile.setCurrentBalanceHSA3(hsaInfoPanel2.getCurrentBalance());
                spouseProfile.setBalanceMonthHSA3(hsaInfoPanel2.getBalanceMonth());
                spouseProfile.setBalanceDayHSA3(hsaInfoPanel2.getBalanceDay());
                spouseProfile.setBalanceYearHSA3(hsaInfoPanel2.getBalanceYear());
                spouseProfile.setContributionTypeHSA3(hsaInfoPanel2.getContributionType());
                if (spouseProfile.getContributionTypeHSA3().equals("Percentage")) {
                    spouseProfile.setContributionPercentHSA3(hsaInfoPanel2.getContributionPercent());
                } else if (spouseProfile.getContributionTypeHSA3().equals("Balance")) {
                    spouseProfile.setContributionBalanceHSA3(hsaInfoPanel2.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNumHSA3(hsaInfoPanel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumHSA3(hsaInfoPanel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumHSA3(hsaInfoPanel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumHSA3(hsaInfoPanel2.getSecondPercentOf());
                spouseProfile.setRateOfReturnHSA3(hsaInfoPanel2.getRateOfReturn());
            }
            
        }
        
        if (panelStringArray.contains("info457Panel2") && info457Panel2.getBelongsToSpouse()) {
            if (!spouseProfile.isFilled457()) {
                spouseProfile.setCurrentBalance457(info457Panel2.getCurrentBalance());
                spouseProfile.setBalanceMonth457(info457Panel2.getBalanceMonth());
                spouseProfile.setBalanceDay457(info457Panel2.getBalanceDay());
                spouseProfile.setBalanceYear457(info457Panel2.getBalanceYear());
                spouseProfile.setContributionType457(info457Panel2.getContributionType());
                if (spouseProfile.getContributionType457().equals("Balance")) {
                    spouseProfile.setContributionBalance457(info457Panel2.getContributionBalance());
                } else if (spouseProfile.getContributionType457().equals("Percentage")) {
                    spouseProfile.setContributionPercent457(info457Panel2.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum457(info457Panel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum457(info457Panel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum457(info457Panel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum457(info457Panel2.getSecondPercentOf());
                spouseProfile.setRateOfReturn457(info457Panel2.getRateOfReturn());
            }
            else if (spouseProfile.isFilled457()) {
                spouseProfile.setCurrentBalance4572(info457Panel2.getCurrentBalance());
                spouseProfile.setBalanceMonth4572(info457Panel2.getBalanceMonth());
                spouseProfile.setBalanceDay4572(info457Panel2.getBalanceDay());
                spouseProfile.setBalanceYear4572(info457Panel2.getBalanceYear());
                spouseProfile.setContributionType4572(info457Panel2.getContributionType());
                if (spouseProfile.getContributionType4572().equals("Balance")) {
                    spouseProfile.setContributionBalance4572(info457Panel2.getContributionBalance());
                } else if (spouseProfile.getContributionType4572().equals("Percentage")) {
                    spouseProfile.setContributionPercent4572(info457Panel2.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum4572(info457Panel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum4572(info457Panel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum4572(info457Panel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum4572(info457Panel2.getSecondPercentOf());
                spouseProfile.setRateOfReturn4572(info457Panel2.getRateOfReturn());
            } else if (spouseProfile.isFilled4572()) {
                spouseProfile.setCurrentBalance4573(info457Panel2.getCurrentBalance());
                spouseProfile.setBalanceMonth4573(info457Panel2.getBalanceMonth());
                spouseProfile.setBalanceDay4573(info457Panel2.getBalanceDay());
                spouseProfile.setBalanceYear4573(info457Panel2.getBalanceYear());
                spouseProfile.setContributionType4573(info457Panel2.getContributionType());
                if (spouseProfile.getContributionType4573().equals("Balance")) {
                    spouseProfile.setContributionBalance4573(info457Panel2.getContributionBalance());
                } else if (spouseProfile.getContributionType4573().equals("Percentage")) {
                    spouseProfile.setContributionPercent4573(info457Panel2.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum4573(info457Panel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum4573(info457Panel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum4573(info457Panel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum4573(info457Panel2.getSecondPercentOf());
                spouseProfile.setRateOfReturn4573(info457Panel2.getRateOfReturn());
            }
        }
        
        if (panelStringArray.contains("flexSpendInfoPanel2") && flexSpendInfoPanel2.getBelongsToSpouse()) {
            if (!spouseProfile.isFlexSpendFilled()) {
                spouseProfile.setCurrentBalanceFlex(flexSpendInfoPanel2.getCurrentBalance());
                spouseProfile.setBalanceMonthFlex(flexSpendInfoPanel2.getBalanceMonth());
                spouseProfile.setBalanceDayFlex(flexSpendInfoPanel2.getBalanceDay());
                spouseProfile.setBalanceYearFlex(flexSpendInfoPanel2.getBalanceYear());
                spouseProfile.setContributionTypeFlex(flexSpendInfoPanel2.getContributionType());
                if (spouseProfile.getContributionTypeFlex().equals("Balance")) {
                    spouseProfile.setContributionBalanceFlex(flexSpendInfoPanel2.getContributionBalance());
                } else if (spouseProfile.getContributionTypeFlex().equals("Percentage")) {
                    spouseProfile.setContributionPercentFlex(flexSpendInfoPanel2.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNumFlex(flexSpendInfoPanel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumFlex(flexSpendInfoPanel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumFlex(flexSpendInfoPanel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumFlex(flexSpendInfoPanel2.getSecondPercentOf());
                spouseProfile.setRateOfReturnFlex(flexSpendInfoPanel2.getRateOfReturn());
            } else if (spouseProfile.isFlexSpendFilled()) {
                spouseProfile.setCurrentBalanceFlex2(flexSpendInfoPanel2.getCurrentBalance());
                spouseProfile.setBalanceMonthFlex2(flexSpendInfoPanel2.getBalanceMonth());
                spouseProfile.setBalanceDayFlex2(flexSpendInfoPanel2.getBalanceDay());
                spouseProfile.setBalanceYearFlex2(flexSpendInfoPanel2.getBalanceYear());
                spouseProfile.setContributionTypeFlex2(flexSpendInfoPanel2.getContributionType());
                if (spouseProfile.getContributionTypeFlex2().equals("Balance")) {
                    spouseProfile.setContributionBalanceFlex2(flexSpendInfoPanel2.getContributionBalance());
                } else if (spouseProfile.getContributionTypeFlex2().equals("Percentage")) {
                    spouseProfile.setContributionPercentFlex2(flexSpendInfoPanel2.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNumFlex2(flexSpendInfoPanel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumFlex2(flexSpendInfoPanel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumFlex2(flexSpendInfoPanel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumFlex2(flexSpendInfoPanel2.getSecondPercentOf());
                spouseProfile.setRateOfReturnFlex2(flexSpendInfoPanel2.getRateOfReturn());
            } else if (spouseProfile.isFlexSpendFilled2()) {
                spouseProfile.setCurrentBalanceFlex3(flexSpendInfoPanel2.getCurrentBalance());
                spouseProfile.setBalanceMonthFlex3(flexSpendInfoPanel2.getBalanceMonth());
                spouseProfile.setBalanceDayFlex3(flexSpendInfoPanel2.getBalanceDay());
                spouseProfile.setBalanceYearFlex3(flexSpendInfoPanel2.getBalanceYear());
                spouseProfile.setContributionTypeFlex3(flexSpendInfoPanel2.getContributionType());
                if (spouseProfile.getContributionTypeFlex3().equals("Balance")) {
                    spouseProfile.setContributionBalanceFlex3(flexSpendInfoPanel2.getContributionBalance());
                } else if (spouseProfile.getContributionTypeFlex3().equals("Percentage")) {
                    spouseProfile.setContributionPercentFlex3(flexSpendInfoPanel2.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNumFlex3(flexSpendInfoPanel2.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumFlex3(flexSpendInfoPanel2.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumFlex3(flexSpendInfoPanel2.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumFlex3(flexSpendInfoPanel2.getSecondPercentOf());
                spouseProfile.setRateOfReturnFlex3(flexSpendInfoPanel2.getRateOfReturn());
            }
        }
        
        
        if (panelStringArray.contains("socialSecurityPanel2") && socialSecurityPanel2.getBelongsToSpouse()) {
            if (!spouseProfile.isFilledSS()) {
                spouseProfile.setStatePercentWithheldValue(socialSecurityPanel2.getStatePercentWithheldValue());
                spouseProfile.setAgeRecievingBenefits(socialSecurityPanel2.getAgeRecievingBenefits());
                spouseProfile.setExpectedMonthlyAmountValue(socialSecurityPanel2.getExpectedMonthlyAmountValue());
                spouseProfile.setFederalPercentWithheldValue(socialSecurityPanel2.getFederalPercentWithheldValue());
                spouseProfile.setSsAmountValue(socialSecurityPanel2.getSsAmountValue());
                spouseProfile.setCurrentlyReceivingSS(socialSecurityPanel2.getCurrentlyReceivingSS());
                spouseProfile.setSsAmountIsKnown(socialSecurityPanel2.getssAmountIsKnown());
                spouseProfile.setAreFedTaxesWithheld(socialSecurityPanel2.getAreFedTaxesWithheld());
                spouseProfile.setAreStateTaxesWithheld(socialSecurityPanel2.getAreStateTaxesWithheld());
                spouseProfile.setBelongsToClient(socialSecurityPanel2.getBelongsToClient());
                spouseProfile.setBelongsToSpouse(socialSecurityPanel2.getBelongsToSpouse());
            } else if (spouseProfile.isFilledSS()) {
                spouseProfile.setStatePercentWithheldValue2(socialSecurityPanel2.getStatePercentWithheldValue());
                spouseProfile.setAgeRecievingBenefits2(socialSecurityPanel2.getAgeRecievingBenefits());
                spouseProfile.setExpectedMonthlyAmountValue2(socialSecurityPanel2.getExpectedMonthlyAmountValue());
                spouseProfile.setFederalPercentWithheldValue2(socialSecurityPanel2.getFederalPercentWithheldValue());
                spouseProfile.setSsAmountValue2(socialSecurityPanel2.getSsAmountValue());
                spouseProfile.setCurrentlyReceivingSS2(socialSecurityPanel2.getCurrentlyReceivingSS());
                spouseProfile.setSsAmountIsKnown2(socialSecurityPanel2.getssAmountIsKnown());
                spouseProfile.setAreFedTaxesWithheld2(socialSecurityPanel2.getAreFedTaxesWithheld());
                spouseProfile.setAreStateTaxesWithheld2(socialSecurityPanel2.getAreStateTaxesWithheld());
                spouseProfile.setBelongsToClient2(socialSecurityPanel2.getBelongsToClient());
                spouseProfile.setBelongsToSpouse2(socialSecurityPanel2.getBelongsToSpouse());
            } else if (spouseProfile.isFilledSS2()) {
                spouseProfile.setStatePercentWithheldValue3(socialSecurityPanel2.getStatePercentWithheldValue());
                spouseProfile.setAgeRecievingBenefits3(socialSecurityPanel2.getAgeRecievingBenefits());
                spouseProfile.setExpectedMonthlyAmountValue3(socialSecurityPanel2.getExpectedMonthlyAmountValue());
                spouseProfile.setFederalPercentWithheldValue3(socialSecurityPanel2.getFederalPercentWithheldValue());
                spouseProfile.setSsAmountValue3(socialSecurityPanel2.getSsAmountValue());
                spouseProfile.setCurrentlyReceivingSS3(socialSecurityPanel2.getCurrentlyReceivingSS());
                spouseProfile.setSsAmountIsKnown3(socialSecurityPanel2.getssAmountIsKnown());
                spouseProfile.setAreFedTaxesWithheld3(socialSecurityPanel2.getAreFedTaxesWithheld());
                spouseProfile.setAreStateTaxesWithheld3(socialSecurityPanel2.getAreStateTaxesWithheld());
                spouseProfile.setBelongsToClient3(socialSecurityPanel2.getBelongsToClient());
                spouseProfile.setBelongsToSpouse3(socialSecurityPanel2.getBelongsToSpouse());
            }
            
        }
        
        
        if (panelStringArray.contains("info401KPanel2") && info401KPanel2.getWhoIsIt().equals("Spouse")) {
            if (!spouseProfile.isFilled401K()) {
                spouseProfile.setRothBalance401K(info401KPanel2.getRothBalance());
                spouseProfile.setTraditionalBalance401K(info401KPanel2.getTraditionalBalance());
                spouseProfile.setBalanceMonth401K(info401KPanel2.getBalanceMonth());
                spouseProfile.setBalanceDay401K(info401KPanel2.getBalanceDay());
                spouseProfile.setBalanceYear401K(info401KPanel2.getBalanceYear());
                spouseProfile.setContributionType401K(info401KPanel2.getContributionType());
                spouseProfile.setPercentOrBalance(info401KPanel2.getPercentOrBalance());

                if (spouseProfile.getContributionType401K().equals("Balance")) {
                    spouseProfile.setRothContributionBalance401K(info401KPanel2.getRothContributionBalance());
                    spouseProfile.setTraditionalContributionBalance401K(info401KPanel2.getTraditionalContributionBalance());
                } else if (spouseProfile.getContributionType401K().equals("Percentage")) {
                    spouseProfile.setRothContributionPercent401K(info401KPanel2.getRothContributionPercent());
                    spouseProfile.setTraditionalContributionPercent401K(info401KPanel2.getTraditionalContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum401K(info401KPanel2.getFirstPercentMatchNum());
                spouseProfile.setFirstPercentOfNum401K(info401KPanel2.getFirstPercentOfNum());
                spouseProfile.setSecondPercentMatchNum401K(info401KPanel2.getSecondPercentMatchNum());
                spouseProfile.setSecondPercentOfNum401K(info401KPanel2.getSecondPercentOfNum());
                spouseProfile.setRateOfReturn401K(info401KPanel2.getRateOfReturn());
            }
            else if (spouseProfile.isFilled401K()) {
                spouseProfile.setRothBalance401K2(info401KPanel2.getRothBalance());
                spouseProfile.setTraditionalBalance401K2(info401KPanel2.getTraditionalBalance());
                spouseProfile.setBalanceMonth401K2(info401KPanel2.getBalanceMonth());
                spouseProfile.setBalanceDay401K2(info401KPanel2.getBalanceDay());
                spouseProfile.setBalanceYear401K2(info401KPanel2.getBalanceYear());
                spouseProfile.setContributionType401K2(info401KPanel2.getContributionType());
                spouseProfile.setPercentOrBalance2(info401KPanel2.getPercentOrBalance());

                if (spouseProfile.getContributionType401K2().equals("Balance")) {
                    spouseProfile.setRothContributionBalance401K2(info401KPanel2.getRothContributionBalance());
                    spouseProfile.setTraditionalContributionBalance401K2(info401KPanel2.getTraditionalContributionBalance());
                } else if (spouseProfile.getContributionType401K2().equals("Percentage")) {
                    spouseProfile.setRothContributionPercent401K2(info401KPanel2.getRothContributionPercent());
                    spouseProfile.setTraditionalContributionPercent401K2(info401KPanel2.getTraditionalContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum401K2(info401KPanel2.getFirstPercentMatchNum());
                spouseProfile.setFirstPercentOfNum401K2(info401KPanel2.getFirstPercentOfNum());
                spouseProfile.setSecondPercentMatchNum401K2(info401KPanel2.getSecondPercentMatchNum());
                spouseProfile.setSecondPercentOfNum401K2(info401KPanel2.getSecondPercentOfNum());
                spouseProfile.setRateOfReturn401K2(info401KPanel2.getRateOfReturn());
            } else if (spouseProfile.isFilled401K2()) {
                spouseProfile.setRothBalance401K3(info401KPanel2.getRothBalance());
                spouseProfile.setTraditionalBalance401K3(info401KPanel2.getTraditionalBalance());
                spouseProfile.setBalanceMonth401K3(info401KPanel2.getBalanceMonth());
                spouseProfile.setBalanceDay401K3(info401KPanel2.getBalanceDay());
                spouseProfile.setBalanceYear401K3(info401KPanel2.getBalanceYear());
                spouseProfile.setContributionType401K3(info401KPanel2.getContributionType());
                spouseProfile.setPercentOrBalance3(info401KPanel2.getPercentOrBalance());

                if (spouseProfile.getContributionType401K3().equals("Balance")) {
                    spouseProfile.setRothContributionBalance401K3(info401KPanel2.getRothContributionBalance());
                    spouseProfile.setTraditionalContributionBalance401K3(info401KPanel2.getTraditionalContributionBalance());
                } else if (spouseProfile.getContributionType401K3().equals("Percentage")) {
                    spouseProfile.setRothContributionPercent401K3(info401KPanel2.getRothContributionPercent());
                    spouseProfile.setTraditionalContributionPercent401K3(info401KPanel2.getTraditionalContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum401K3(info401KPanel2.getFirstPercentMatchNum());
                spouseProfile.setFirstPercentOfNum401K3(info401KPanel2.getFirstPercentOfNum());
                spouseProfile.setSecondPercentMatchNum401K3(info401KPanel2.getSecondPercentMatchNum());
                spouseProfile.setSecondPercentOfNum401K3(info401KPanel2.getSecondPercentOfNum());
                spouseProfile.setRateOfReturn401K3(info401KPanel2.getRateOfReturn());
            }
                    
        }
    
      //Panel declaration round 3
      
      if (panelStringArray.contains("iraPanel3") && iraPanel3.getBelongsTo().equals("Spouse")) {
            if (!spouseProfile.isIraFilled()) {
                spouseProfile.setMonthIra(iraPanel3.getMonth());
                spouseProfile.setDayIra(iraPanel3.getDay());
                spouseProfile.setYearIra(iraPanel3.getYear());
                spouseProfile.setContributionRothIra(iraPanel3.getContributionRoth());
                spouseProfile.setContributionTraditionalIra(iraPanel3.getContributionTraditional());
                spouseProfile.setBalanceChosen(iraPanel3.isBalanceChosen());
                if (spouseProfile.isBalanceChosen()) {
                    spouseProfile.setRothBalance(iraPanel3.getRothBalance());
                    spouseProfile.setTraditionalBalance(iraPanel3.getTraditionalBalance());
                } else {
                    spouseProfile.setPercentRoth(iraPanel3.getPercentRoth());
                    spouseProfile.setPercentTraditional(iraPanel3.getPercentTraditional());
                }
                spouseProfile.setIraFilled(true);
            } else if (spouseProfile.isIraFilled()) {
                spouseProfile.setMonthIra2(iraPanel3.getMonth());
                spouseProfile.setDayIra2(iraPanel3.getDay());
                spouseProfile.setYearIra2(iraPanel3.getYear());
                spouseProfile.setContributionRothIra2(iraPanel3.getContributionRoth());
                spouseProfile.setContributionTraditionalIra2(iraPanel3.getContributionTraditional());
                spouseProfile.setBalanceChosen2(iraPanel3.isBalanceChosen());
                if (spouseProfile.isBalanceChosen2()) {
                    spouseProfile.setRothBalance2(iraPanel3.getRothBalance());
                    spouseProfile.setTraditionalBalance2(iraPanel3.getTraditionalBalance());
                } else {
                    spouseProfile.setPercentRoth2(iraPanel3.getPercentRoth());
                    spouseProfile.setPercentTraditional2(iraPanel3.getPercentTraditional());
                }
                spouseProfile.setIraFilled2(true);
            } else if (spouseProfile.isIraFilled2()) {
                spouseProfile.setMonthIra3(iraPanel3.getMonth());
                spouseProfile.setDayIra3(iraPanel3.getDay());
                spouseProfile.setYearIra3(iraPanel3.getYear());
                spouseProfile.setContributionRothIra3(iraPanel3.getContributionRoth());
                spouseProfile.setContributionTraditionalIra3(iraPanel3.getContributionTraditional());
                spouseProfile.setBalanceChosen3(iraPanel3.isBalanceChosen());
                if (spouseProfile.isBalanceChosen3()) {
                    spouseProfile.setRothBalance3(iraPanel3.getRothBalance());
                    spouseProfile.setTraditionalBalance3(iraPanel3.getTraditionalBalance());
                } else {
                    spouseProfile.setPercentRoth3(iraPanel3.getPercentRoth());
                    spouseProfile.setPercentTraditional3(iraPanel3.getPercentTraditional());
                }
                spouseProfile.setIraFilled3(true);
            }
            
        }
        
        if (panelStringArray.contains("optionsAndGrantsPanel3") && optionsAndGrantsPanel3.getBelongsTo().equals("Spouse")) {
            
            if (!spouseProfile.isOptionsGrantsFilled()) {
                spouseProfile.setAwardDay(optionsAndGrantsPanel3.getAwardDay());
                spouseProfile.setAwardMonth(optionsAndGrantsPanel3.getAwardMonth());
                spouseProfile.setAwardYear(optionsAndGrantsPanel3.getAwardYear());
                spouseProfile.setCurrentAmount(optionsAndGrantsPanel3.getCurrentAmount());
                spouseProfile.setCurrentValue(optionsAndGrantsPanel3.getCurrentValue());
                spouseProfile.setExpirationDay(optionsAndGrantsPanel3.getExpirationDay());
                spouseProfile.setExpirationMonth(optionsAndGrantsPanel3.getExpirationMonth());
                spouseProfile.setExpirationYear(optionsAndGrantsPanel3.getExpirationYear());
                spouseProfile.setRateOfReturn(optionsAndGrantsPanel3.getRateOfReturn());
                spouseProfile.setOptionsGrantsFilled(true);
                
            } else if (spouseProfile.isOptionsGrantsFilled()) {
                
                spouseProfile.setAwardDay2(optionsAndGrantsPanel3.getAwardDay());
                spouseProfile.setAwardMonth2(optionsAndGrantsPanel3.getAwardMonth());
                spouseProfile.setAwardYear2(optionsAndGrantsPanel3.getAwardYear());
                spouseProfile.setCurrentAmount2(optionsAndGrantsPanel3.getCurrentAmount());
                spouseProfile.setCurrentValue2(optionsAndGrantsPanel3.getCurrentValue());
                spouseProfile.setExpirationDay2(optionsAndGrantsPanel3.getExpirationDay());
                spouseProfile.setExpirationMonth2(optionsAndGrantsPanel3.getExpirationMonth());
                spouseProfile.setExpirationYear2(optionsAndGrantsPanel3.getExpirationYear());
                spouseProfile.setRateOfReturn2(optionsAndGrantsPanel3.getRateOfReturn());
                spouseProfile.setOptionsGrantsFilled2(true);
                
            } else if (spouseProfile.isOptionsGrantsFilled2()) {
                spouseProfile.setAwardDay3(optionsAndGrantsPanel3.getAwardDay());
                spouseProfile.setAwardMonth3(optionsAndGrantsPanel3.getAwardMonth());
                spouseProfile.setAwardYear3(optionsAndGrantsPanel3.getAwardYear());
                spouseProfile.setCurrentAmount3(optionsAndGrantsPanel3.getCurrentAmount());
                spouseProfile.setCurrentValue3(optionsAndGrantsPanel3.getCurrentValue());
                spouseProfile.setExpirationDay3(optionsAndGrantsPanel3.getExpirationDay());
                spouseProfile.setExpirationMonth3(optionsAndGrantsPanel3.getExpirationMonth());
                spouseProfile.setExpirationYear3(optionsAndGrantsPanel3.getExpirationYear());
                spouseProfile.setRateOfReturn3(optionsAndGrantsPanel3.getRateOfReturn());
                spouseProfile.setOptionsGrantsFilled3(true);
            }
            
            
        }
        
        
        
        if (panelStringArray.contains("pensionPanel3") && pensionPanel3.getBelongsToSpouse()) {
            
            if (!spouseProfile.isPensionFilled()) {
                spouseProfile.setClientRecievesLumpSumBool(pensionPanel3.getLumpBool());
                spouseProfile.setClientRecievesMonthlyBool(pensionPanel3.getMonthlyBool());
                spouseProfile.setCostOfLivingAdjustment(pensionPanel3.getCostOfLivingAdjustment());
                spouseProfile.setAmountPension(pensionPanel3.getAmountPension());
                spouseProfile.setPensionDay(pensionPanel3.getDay());
                spouseProfile.setPensionMonth(pensionPanel3.getMonth());
                spouseProfile.setPensionYear(pensionPanel3.getYear());
                spouseProfile.setPensionFilled(true);
            } else if (spouseProfile.isPensionFilled()) {
                
                spouseProfile.setClientRecievesLumpSumBool2(pensionPanel3.getLumpBool());
                spouseProfile.setClientRecievesMonthlyBool2(pensionPanel3.getMonthlyBool());
                spouseProfile.setCostOfLivingAdjustment2(pensionPanel3.getCostOfLivingAdjustment());
                spouseProfile.setAmountPension2(pensionPanel3.getAmountPension());
                spouseProfile.setPensionDay2(pensionPanel3.getDay());
                spouseProfile.setPensionMonth2(pensionPanel3.getMonth());
                spouseProfile.setPensionYear2(pensionPanel3.getYear());
                spouseProfile.setPensionFilled2(true);
                
            } else if (clientProfile.isPensionFilled2()) {
                spouseProfile.setClientRecievesLumpSumBool3(pensionPanel3.getLumpBool());
                spouseProfile.setClientRecievesMonthlyBool3(pensionPanel3.getMonthlyBool());
                spouseProfile.setCostOfLivingAdjustment3(pensionPanel3.getCostOfLivingAdjustment());
                spouseProfile.setAmountPension3(pensionPanel3.getAmountPension());
                spouseProfile.setPensionDay3(pensionPanel3.getDay());
                spouseProfile.setPensionMonth3(pensionPanel3.getMonth());
                spouseProfile.setPensionYear3(pensionPanel3.getYear());
                spouseProfile.setPensionFilled3(true);
            }
            
        }
        
        
        
        if (panelStringArray.contains("info403bPanel3") && info403bPanel3.getBelongsToSpouse()) {
            
            if (!spouseProfile.isFilled403B()) {
                spouseProfile.setCurrentBalance403B(info403bPanel3.getCurrentBalance());
                spouseProfile.setBalanceDay403B(info403bPanel3.getBalanceDay());
                spouseProfile.setBalanceMonth403B(info403bPanel3.getBalanceMonth());
                spouseProfile.setBalanceYear403B(info403bPanel3.getBalanceYear());
                spouseProfile.setContributionType403B(info403bPanel3.getContributionType());
                if (spouseProfile.getContributionType403B().equals("Percentage")) {
                    spouseProfile.setContributionPercent403B(info403bPanel3.getContributionPercent());
                } else if (spouseProfile.getContributionType403B().equals("Balance")) {
                    spouseProfile.setContributionBalance403B(info403bPanel3.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNum403B(info403bPanel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum403B(info403bPanel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum403B(info403bPanel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum403B(info403bPanel3.getSecondPercentOf());
                spouseProfile.setRateOfReturn403B(info403bPanel3.getRateOfReturn());        
                spouseProfile.setFilled403B(true);
            } else if (spouseProfile.isFilled403B()) {
                spouseProfile.setCurrentBalance403B2(info403bPanel3.getCurrentBalance());
                spouseProfile.setBalanceDay403B2(info403bPanel3.getBalanceDay());
                spouseProfile.setBalanceMonth403B2(info403bPanel3.getBalanceMonth());
                spouseProfile.setBalanceYear403B2(info403bPanel3.getBalanceYear());
                spouseProfile.setContributionType403B2(info403bPanel3.getContributionType());
                if (spouseProfile.getContributionType403B2().equals("Percentage")) {
                    spouseProfile.setContributionPercent403B2(info403bPanel3.getContributionPercent());
                } else if (spouseProfile.getContributionType403B2().equals("Balance")) {
                    spouseProfile.setContributionBalance403B2(info403bPanel3.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNum403B2(info403bPanel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum403B2(info403bPanel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum403B2(info403bPanel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum403B2(info403bPanel3.getSecondPercentOf());
                spouseProfile.setRateOfReturn403B2(info403bPanel3.getRateOfReturn());  
                spouseProfile.setFilled403B2(true);
            } else if (spouseProfile.isFilled403B2()) {
                spouseProfile.setCurrentBalance403B3(info403bPanel3.getCurrentBalance());
                spouseProfile.setBalanceDay403B3(info403bPanel3.getBalanceDay());
                spouseProfile.setBalanceMonth403B3(info403bPanel3.getBalanceMonth());
                spouseProfile.setBalanceYear403B3(info403bPanel3.getBalanceYear());
                spouseProfile.setContributionType403B3(info403bPanel3.getContributionType());
                if (spouseProfile.getContributionType403B3().equals("Percentage")) {
                    spouseProfile.setContributionPercent403B3(info403bPanel3.getContributionPercent());
                } else if (spouseProfile.getContributionType403B3().equals("Balance")) {
                    spouseProfile.setContributionBalance403B3(info403bPanel3.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNum403B3(info403bPanel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum403B3(info403bPanel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum403B3(info403bPanel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum403B3(info403bPanel3.getSecondPercentOf());
                spouseProfile.setRateOfReturn403B3(info403bPanel3.getRateOfReturn());         
                spouseProfile.setFilled403B3(true);
            }
            
            
            
        }
        
        
        
        if (panelStringArray.contains("hsaInfoPanel3") && hsaInfoPanel3.getBelongsToSpouse()) {
            if (!spouseProfile.isHsaFilled()) {
                spouseProfile.setCurrentBalanceHSA(hsaInfoPanel3.getCurrentBalance());
                spouseProfile.setBalanceMonthHSA(hsaInfoPanel3.getBalanceMonth());
                spouseProfile.setBalanceDayHSA(hsaInfoPanel3.getBalanceDay());
                spouseProfile.setBalanceYearHSA(hsaInfoPanel3.getBalanceYear());
                spouseProfile.setContributionTypeHSA(hsaInfoPanel3.getContributionType());
                if (spouseProfile.getContributionTypeHSA().equals("Percentage")) {
                    spouseProfile.setContributionPercentHSA(hsaInfoPanel3.getContributionPercent());
                } else if (spouseProfile.getContributionTypeHSA().equals("Balance")) {
                    spouseProfile.setContributionBalanceHSA(hsaInfoPanel3.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNumHSA(hsaInfoPanel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumHSA(hsaInfoPanel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumHSA(hsaInfoPanel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumHSA(hsaInfoPanel3.getSecondPercentOf());
                spouseProfile.setRateOfReturnHSA(hsaInfoPanel3.getRateOfReturn());
                spouseProfile.setHsaFilled(true);
            } else if (spouseProfile.isHsaFilled()) {
                spouseProfile.setCurrentBalanceHSA2(hsaInfoPanel3.getCurrentBalance());
                spouseProfile.setBalanceMonthHSA2(hsaInfoPanel3.getBalanceMonth());
                spouseProfile.setBalanceDayHSA2(hsaInfoPanel3.getBalanceDay());
                spouseProfile.setBalanceYearHSA2(hsaInfoPanel3.getBalanceYear());
                spouseProfile.setContributionTypeHSA2(hsaInfoPanel3.getContributionType());
                if (spouseProfile.getContributionTypeHSA2().equals("Percentage")) {
                    spouseProfile.setContributionPercentHSA2(hsaInfoPanel3.getContributionPercent());
                } else if (spouseProfile.getContributionTypeHSA2().equals("Balance")) {
                    spouseProfile.setContributionBalanceHSA2(hsaInfoPanel3.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNumHSA2(hsaInfoPanel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumHSA2(hsaInfoPanel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumHSA2(hsaInfoPanel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumHSA2(hsaInfoPanel3.getSecondPercentOf());
                spouseProfile.setRateOfReturnHSA2(hsaInfoPanel3.getRateOfReturn());
                spouseProfile.setHsaFilled2(true);
            } else if (spouseProfile.isHsaFilled2()) {
                spouseProfile.setCurrentBalanceHSA3(hsaInfoPanel3.getCurrentBalance());
                spouseProfile.setBalanceMonthHSA3(hsaInfoPanel3.getBalanceMonth());
                spouseProfile.setBalanceDayHSA3(hsaInfoPanel3.getBalanceDay());
                spouseProfile.setBalanceYearHSA3(hsaInfoPanel3.getBalanceYear());
                spouseProfile.setContributionTypeHSA3(hsaInfoPanel3.getContributionType());
                if (spouseProfile.getContributionTypeHSA3().equals("Percentage")) {
                    spouseProfile.setContributionPercentHSA3(hsaInfoPanel3.getContributionPercent());
                } else if (spouseProfile.getContributionTypeHSA3().equals("Balance")) {
                    spouseProfile.setContributionBalanceHSA3(hsaInfoPanel3.getContributionBalance());
                }
                spouseProfile.setFirstPercentMatchNumHSA3(hsaInfoPanel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumHSA3(hsaInfoPanel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumHSA3(hsaInfoPanel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumHSA3(hsaInfoPanel3.getSecondPercentOf());
                spouseProfile.setRateOfReturnHSA3(hsaInfoPanel3.getRateOfReturn());
                spouseProfile.setHsaFilled3(true);
            }
        }
        
        
        
        
        if (panelStringArray.contains("info457Panel3") && info457Panel3.getBelongsToSpouse()) {
            if (!spouseProfile.isFilled457()) {
                spouseProfile.setCurrentBalance457(info457Panel3.getCurrentBalance());
                spouseProfile.setBalanceMonth457(info457Panel3.getBalanceMonth());
                spouseProfile.setBalanceDay457(info457Panel3.getBalanceDay());
                spouseProfile.setBalanceYear457(info457Panel3.getBalanceYear());
                spouseProfile.setContributionType457(info457Panel3.getContributionType());
                if (spouseProfile.getContributionType457().equals("Balance")) {
                    spouseProfile.setContributionBalance457(info457Panel3.getContributionBalance());
                } else if (spouseProfile.getContributionType457().equals("Percent")) {
                    spouseProfile.setContributionPercent457(info457Panel3.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum457(info457Panel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum457(info457Panel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum457(info457Panel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum457(info457Panel3.getSecondPercentOf());
                spouseProfile.setRateOfReturn457(info457Panel3.getRateOfReturn());
            } else if (spouseProfile.isFilled457()) {
                spouseProfile.setCurrentBalance4572(info457Panel3.getCurrentBalance());
                spouseProfile.setBalanceMonth4572(info457Panel3.getBalanceMonth());
                spouseProfile.setBalanceDay4572(info457Panel3.getBalanceDay());
                spouseProfile.setBalanceYear4572(info457Panel3.getBalanceYear());
                spouseProfile.setContributionType4572(info457Panel3.getContributionType());
                if (spouseProfile.getContributionType4572().equals("Balance")) {
                    spouseProfile.setContributionBalance4572(info457Panel3.getContributionBalance());
                } else if (spouseProfile.getContributionType4572().equals("Percent")) {
                    spouseProfile.setContributionPercent4572(info457Panel3.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum4572(info457Panel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum4572(info457Panel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum4572(info457Panel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum4572(info457Panel3.getSecondPercentOf());
                spouseProfile.setRateOfReturn4572(info457Panel3.getRateOfReturn());
            } else if (spouseProfile.isFilled4572()) {
                spouseProfile.setCurrentBalance4573(info457Panel3.getCurrentBalance());
                spouseProfile.setBalanceMonth4573(info457Panel3.getBalanceMonth());
                spouseProfile.setBalanceDay4573(info457Panel3.getBalanceDay());
                spouseProfile.setBalanceYear4573(info457Panel3.getBalanceYear());
                spouseProfile.setContributionType4573(info457Panel3.getContributionType());
                if (spouseProfile.getContributionType4573().equals("Balance")) {
                    spouseProfile.setContributionBalance4573(info457Panel3.getContributionBalance());
                } else if (clientProfile.getContributionType4573().equals("Percent")) {
                    spouseProfile.setContributionPercent4573(info457Panel3.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum4573(info457Panel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNum4573(info457Panel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNum4573(info457Panel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNum4573(info457Panel3.getSecondPercentOf());
                spouseProfile.setRateOfReturn4573(info457Panel3.getRateOfReturn());
            }
        }
        
        
        
        if (panelStringArray.contains("flexSpendInfoPanel3") && flexSpendInfoPanel3.getBelongsToSpouse()) {
            if (!spouseProfile.isFlexSpendFilled()) {
                spouseProfile.setCurrentBalanceFlex(flexSpendInfoPanel3.getCurrentBalance());
                spouseProfile.setBalanceMonthFlex(flexSpendInfoPanel3.getBalanceMonth());
                spouseProfile.setBalanceDayFlex(flexSpendInfoPanel3.getBalanceDay());
                spouseProfile.setBalanceYearFlex(flexSpendInfoPanel3.getBalanceYear());
                spouseProfile.setContributionTypeFlex(flexSpendInfoPanel3.getContributionType());
                if (spouseProfile.getContributionTypeFlex().equals("Balance")) {
                    spouseProfile.setContributionBalanceFlex(flexSpendInfoPanel3.getContributionBalance());
                } else if (spouseProfile.getContributionTypeFlex().equals("Percentage")) {
                    spouseProfile.setContributionPercentFlex(flexSpendInfoPanel3.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNumFlex(flexSpendInfoPanel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumFlex(flexSpendInfoPanel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumFlex(flexSpendInfoPanel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumFlex(flexSpendInfoPanel3.getSecondPercentOf());
                spouseProfile.setRateOfReturnFlex(flexSpendInfoPanel3.getRateOfReturn());
            } else if (spouseProfile.isFlexSpendFilled()) {
                spouseProfile.setCurrentBalanceFlex2(flexSpendInfoPanel3.getCurrentBalance());
                spouseProfile.setBalanceMonthFlex2(flexSpendInfoPanel3.getBalanceMonth());
                spouseProfile.setBalanceDayFlex2(flexSpendInfoPanel3.getBalanceDay());
                spouseProfile.setBalanceYearFlex2(flexSpendInfoPanel3.getBalanceYear());
                spouseProfile.setContributionTypeFlex2(flexSpendInfoPanel3.getContributionType());
                if (spouseProfile.getContributionTypeFlex2().equals("Balance")) {
                    spouseProfile.setContributionBalanceFlex2(flexSpendInfoPanel3.getContributionBalance());
                } else if (spouseProfile.getContributionTypeFlex2().equals("Percentage")) {
                    spouseProfile.setContributionPercentFlex2(flexSpendInfoPanel3.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNumFlex2(flexSpendInfoPanel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumFlex2(flexSpendInfoPanel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumFlex2(flexSpendInfoPanel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumFlex2(flexSpendInfoPanel3.getSecondPercentOf());
                spouseProfile.setRateOfReturnFlex2(flexSpendInfoPanel3.getRateOfReturn());
            } else if (spouseProfile.isFlexSpendFilled2()) {
                spouseProfile.setCurrentBalanceFlex3(flexSpendInfoPanel3.getCurrentBalance());
                spouseProfile.setBalanceMonthFlex3(flexSpendInfoPanel3.getBalanceMonth());
                spouseProfile.setBalanceDayFlex3(flexSpendInfoPanel3.getBalanceDay());
                spouseProfile.setBalanceYearFlex3(flexSpendInfoPanel3.getBalanceYear());
                spouseProfile.setContributionTypeFlex3(flexSpendInfoPanel3.getContributionType());
                if (spouseProfile.getContributionTypeFlex3().equals("Balance")) {
                    spouseProfile.setContributionBalanceFlex3(flexSpendInfoPanel3.getContributionBalance());
                } else if (spouseProfile.getContributionTypeFlex3().equals("Percentage")) {
                    spouseProfile.setContributionPercentFlex3(flexSpendInfoPanel3.getContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNumFlex3(flexSpendInfoPanel3.getFirstPercentMatch());
                spouseProfile.setFirstPercentOfNumFlex3(flexSpendInfoPanel3.getFirstPercentOf());
                spouseProfile.setSecondPercentMatchNumFlex3(flexSpendInfoPanel3.getSecondPercentMatch());
                spouseProfile.setSecondPercentOfNumFlex3(flexSpendInfoPanel3.getSecondPercentOf());
                spouseProfile.setRateOfReturnFlex3(flexSpendInfoPanel3.getRateOfReturn());
            }
        }
        
        
        if (panelStringArray.contains("info401KPanel3") && info401KPanel3.getWhoIsIt().equals("Spouse")) {
            if (!spouseProfile.isFilled401K()) {
                spouseProfile.setRothBalance401K(info401KPanel3.getRothBalance());
                spouseProfile.setTraditionalBalance401K(info401KPanel3.getTraditionalBalance());
                spouseProfile.setBalanceMonth401K(info401KPanel3.getBalanceMonth());
                spouseProfile.setBalanceDay401K(info401KPanel3.getBalanceDay());
                spouseProfile.setBalanceYear401K(info401KPanel3.getBalanceYear());
                spouseProfile.setContributionType401K(info401KPanel3.getContributionType());
                spouseProfile.setPercentOrBalance(info401KPanel3.getPercentOrBalance());
                if (spouseProfile.getContributionType401K().equals("Balance")) {
                    spouseProfile.setRothContributionBalance401K(info401KPanel3.getRothContributionBalance());
                    spouseProfile.setTraditionalContributionBalance401K(info401KPanel3.getTraditionalContributionBalance());
                } else if (spouseProfile.getContributionType401K().equals("Percentage")) {
                    spouseProfile.setRothContributionPercent401K(info401KPanel3.getRothContributionPercent());
                    spouseProfile.setTraditionalContributionPercent401K(info401KPanel3.getTraditionalContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum401K(info401KPanel3.getFirstPercentMatchNum());
                spouseProfile.setFirstPercentOfNum401K(info401KPanel3.getFirstPercentOfNum());
                spouseProfile.setSecondPercentMatchNum401K(info401KPanel3.getSecondPercentMatchNum());
                spouseProfile.setSecondPercentOfNum401K(info401KPanel3.getSecondPercentOfNum());
                spouseProfile.setRateOfReturn401K(info401KPanel3.getRateOfReturn());
            } else if (spouseProfile.isFilled401K()) {
                spouseProfile.setRothBalance401K2(info401KPanel3.getRothBalance());
                spouseProfile.setTraditionalBalance401K2(info401KPanel3.getTraditionalBalance());
                spouseProfile.setBalanceMonth401K2(info401KPanel3.getBalanceMonth());
                spouseProfile.setBalanceDay401K2(info401KPanel3.getBalanceDay());
                spouseProfile.setBalanceYear401K2(info401KPanel3.getBalanceYear());
                spouseProfile.setContributionType401K2(info401KPanel3.getContributionType());
                spouseProfile.setPercentOrBalance2(info401KPanel3.getPercentOrBalance());
                if (spouseProfile.getContributionType401K2().equals("Balance")) {
                    spouseProfile.setRothContributionBalance401K2(info401KPanel3.getRothContributionBalance());
                    spouseProfile.setTraditionalContributionBalance401K2(info401KPanel3.getTraditionalContributionBalance());
                } else if (spouseProfile.getContributionType401K2().equals("Percentage")) {
                    spouseProfile.setRothContributionPercent401K2(info401KPanel3.getRothContributionPercent());
                    spouseProfile.setTraditionalContributionPercent401K2(info401KPanel3.getTraditionalContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum401K2(info401KPanel3.getFirstPercentMatchNum());
                spouseProfile.setFirstPercentOfNum401K2(info401KPanel3.getFirstPercentOfNum());
                spouseProfile.setSecondPercentMatchNum401K2(info401KPanel3.getSecondPercentMatchNum());
                spouseProfile.setSecondPercentOfNum401K2(info401KPanel3.getSecondPercentOfNum());
                spouseProfile.setRateOfReturn401K2(info401KPanel3.getRateOfReturn());
            } else if (spouseProfile.isFilled401K2()) {
                spouseProfile.setRothBalance401K3(info401KPanel3.getRothBalance());
                spouseProfile.setTraditionalBalance401K3(info401KPanel3.getTraditionalBalance());
                spouseProfile.setBalanceMonth401K3(info401KPanel3.getBalanceMonth());
                spouseProfile.setBalanceDay401K3(info401KPanel3.getBalanceDay());
                spouseProfile.setBalanceYear401K3(info401KPanel3.getBalanceYear());
                spouseProfile.setContributionType401K3(info401KPanel3.getContributionType());
                spouseProfile.setPercentOrBalance3(info401KPanel3.getPercentOrBalance());
                if (spouseProfile.getContributionType401K3().equals("Balance")) {
                    spouseProfile.setRothContributionBalance401K3(info401KPanel3.getRothContributionBalance());
                    spouseProfile.setTraditionalContributionBalance401K3(info401KPanel3.getTraditionalContributionBalance());
                } else if (spouseProfile.getContributionType401K3().equals("Percentage")) {
                    spouseProfile.setRothContributionPercent401K3(info401KPanel3.getRothContributionPercent());
                    spouseProfile.setTraditionalContributionPercent401K3(info401KPanel3.getTraditionalContributionPercent());
                }
                spouseProfile.setFirstPercentMatchNum401K3(info401KPanel3.getFirstPercentMatchNum());
                spouseProfile.setFirstPercentOfNum401K3(info401KPanel3.getFirstPercentOfNum());
                spouseProfile.setSecondPercentMatchNum401K3(info401KPanel3.getSecondPercentMatchNum());
                spouseProfile.setSecondPercentOfNum401K3(info401KPanel3.getSecondPercentOfNum());
                spouseProfile.setRateOfReturn401K3(info401KPanel3.getRateOfReturn());
            }
            
        }
     
    }
   
    public ClientProfile getClientProfile() {
        return clientProfile;
    }

    public ClientProfile getSpouseProfile() {
        return spouseProfile;
    }
    
    public AnnuitiesPanel getAnnuitiesPanel() {
        return annuitiesPanel;
    }
    
    public AnnuitiesPanel getAnnuitiesPanel2() {
        return annuitiesPanel2;
    }
    
    public AnnuitiesPanel getAnnuitiesPanel3() {
        return annuitiesPanel3;
    }
    
    public TraditionalVsRothPanels getInfo401kPanel() {
        return info401KPanel;
    }
    
    public TraditionalVsRothPanels getInfo401kPanel2() {
        return info401KPanel2;
    }
    
    public TraditionalVsRothPanels getInfo401kPanel3() {
        return info401KPanel3;
    }
    
    public RegularInfoPanels getHsaInfoPanel() {
        return hsaInfoPanel;
    }
    
    public RegularInfoPanels getHsaInfoPanel2() {
        return hsaInfoPanel2;
    }
    
    public RegularInfoPanels getHsaInfoPanel3() {
        return hsaInfoPanel3;
    }
    
    public RegularInfoPanels getInfo403bPanel() {
        return info403bPanel;
    }
    
    public RegularInfoPanels getInfo403bPanel2() {
        return info403bPanel2;
    }
    
    public RegularInfoPanels getInfo403bPanel3() {
        return info403bPanel3;
    }
    
    public RegularInfoPanels getInfo457Panel() {
        return info457Panel;
    }
    
    public RegularInfoPanels getInfo457Panel2() {
        return info457Panel2;
    }
    
    public RegularInfoPanels getInfo457Panel3() {
        return info457Panel3;
    }
    
    
    public RegularInfoPanels getFlexSpendInfoPanel() {
        return flexSpendInfoPanel;
    }
    
    public RegularInfoPanels getFlexSpendInfoPanel2() {
        return flexSpendInfoPanel2;
    }
    
    public RegularInfoPanels getFlexSpendInfoPanel3() {
        return flexSpendInfoPanel3;
    }
    
    public IraInfoPanel getIraInfoPanel() {
        return iraPanel;
    }
    
    public IraInfoPanel getIraInfoPanel2() {
        return iraPanel2;
    }
    
    
    public IraInfoPanel getIraInfoPanel3() {
        return iraPanel3;
    }
    
    public PensionInfoPanel getPensionInfoPanel() {
        return pensionPanel;
    }
    
    public PensionInfoPanel getPensionInfoPanel2() {
        return pensionPanel2;
    }
    
    public PensionInfoPanel getPensionInfoPanel3() {
        return pensionPanel3;
    }
    
    public PanelArray getDataPanels() {
        return panels;
    }
    
    public static UserInterface getUI() {
        return ui;
    }
           
    
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        dbConnection = new DBConnection();
        dbConnection.createBasicInfoTable();
        
        
        
        
          
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //new UserInterface().setVisible(true);
                ui.setVisible(true);
                
                
                
                
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel sideButtonPanel;
    private javax.swing.JPanel voyagePanel;
    private javax.swing.JPanel workSpacePanel;
    // End of variables declaration//GEN-END:variables
}
