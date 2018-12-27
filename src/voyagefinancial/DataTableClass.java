/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyagefinancial;


import java.awt.Color;
import java.awt.Component;
import java.awt.List;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
/**
 *
 * @author TannerLuke
 */
public class DataTableClass extends javax.swing.JPanel implements TableModelListener {

    
    PanelArray dataPanels;
    UserInterface ui;
    ArrayList<JPanel> panels = new ArrayList<JPanel>();
    ArrayList<String> panelStrings = new ArrayList<String>();
    
    
    ClientProfile clientInfo;
    ClientProfile spouseInfo;
    private boolean hasSpouseInfo = false;
    
    ArrayList<Integer> editableRows = new ArrayList<Integer>();
    ArrayList <String> coloredCells = new ArrayList<String>();
    
    
    
    
    
    
    /**
     * Creates new form DataTableClass
     */
    public DataTableClass() {
        initComponents();
        
        ui = UserInterface.getUI();
        clientInfo = ui.getClientProfile();
        tryToGetSpouse();
        jScrollPane1.getHorizontalScrollBar().setUnitIncrement(5);
        coloredCells.add("Bonus");  
        coloredCells.add("Wage");
        coloredCells.add("Max allowable 401K Cont.");
        coloredCells.add("As % of Wage");
        coloredCells.add("As $ Amount");
        editableRows.add(1);
        editableRows.add(5);
        
        jTabbedPane1.setTitleAt(0, clientInfo.getFirstName());
        if (hasSpouseInfo) {
            jTabbedPane1.setTitleAt(1, spouseInfo.getFirstName());
        }
        
        System.out.println(clientInfo.getAge());
        //System.out.println(spouseInfo.getAge());
        createClientTable();
        if (hasSpouseInfo) {
            createSpouseTable();
            spouseDataTable.getModel().addTableModelListener(this);
        }
        clientDataTable.getModel().addTableModelListener(this);
        //dataPanels = ui.getDataPanels();
        //panelStrings = dataPanels.getPanelStrings();
        //panels = dataPanels.getPanels();
        
        
        
    }
    
    private void tryToGetSpouse() {
        if (ui.getSpouseProfile() != null) {
            spouseInfo = ui.getSpouseProfile();
            hasSpouseInfo = true;
            
        } else {
            jTabbedPane1.removeTabAt(1);
        }
    }
    
    public final void createClientTable() {
        
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Object yearArray[] = new Object[20];
        yearArray[0] = "";
        for (int i = 1; i < 20; i++) {
            yearArray[i] = currentYear + i - 1;
            
        }
        Object[][] nameArray = {
            {"Age"},
            {"Wage"},
            {"Bonus"},
            {"Wages"},
            {"Max allowable 401K Cont."},
            {"As % of Wage"},
            {"As $ Amount"},
            {"Qualified Contributions"},
            {"Roth Contributions"},
            
            
        };
        
        clientDataTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus, int row, int col) {

                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

                //String status = (String)table.getModel().getValueAt(row, STATUS_COL);
                String val = (String) table.getModel().getValueAt(row, 0);
                
                
                if (coloredCells.contains(val)) {
                    setBackground(Color.LIGHT_GRAY);
                    setForeground(Color.WHITE);
                
                } else {
                    setBackground(table.getBackground());
                    setForeground(table.getForeground());
                }       
                return this;
            }
        });
        
        DefaultTableModel model = new DefaultTableModel(nameArray, yearArray) {
       // MyTableModel model = new MyTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return editableRows.contains(row);
            }
        };
        clientDataTable.setModel(model);
        
        clientDataTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        for (int i = 1; i < 20; i++) {
            int age = clientInfo.getAge() + i - 1;
            clientDataTable.setValueAt(age, 0, i);
        }
        
        clientDataTable.setRowHeight(1, 1);
        int wages =  clientInfo.getBaseSalary();
        for (int i = 1; i < 20; i++) {
            float growthRate = (float) 1.025;
            
            clientDataTable.setValueAt(wages, 1, i);
            wages = Math.round(wages * growthRate);
        }
        
        
        for (int i = 1; i < 20; i++) {
            
            if (i == 1) {
                clientDataTable.setValueAt(clientInfo.getBonus(), 2, i);
                
            } else {
                clientDataTable.setValueAt(0, 2, i);
            }
            //wages = wages * growthRate;
        }
        clientDataTable.setRowHeight(2,1);
        
        for (int i = 1; i < 20; i++) {
            clientDataTable.setValueAt((int)clientDataTable.getValueAt(1, i) + (int) clientDataTable.getValueAt(2, i), 3, i);
        }
        
        clientDataTable.setRowHeight(4, 1);
        for (int i = 1; i < 20; i++) {
            clientDataTable.setValueAt(Equations.getMaxAllowable401K((int) clientDataTable.getValueAt(0, i)), 4, i);
        }
        
        clientDataTable.setRowHeight(5, 1);
        for (int i = 1; i < 20; i++) {
            clientDataTable.setValueAt("", 5, i);
        }
        
        clientDataTable.setRowHeight(6, 1);
        for (int i = 1; i < 20; i++) {
            clientDataTable.setValueAt(" ", 6, i);
        }
        
        for (int i = 1; i < 20; i++) {
            int currentVal = (int) clientDataTable.getValueAt(3, i);
            if (currentVal != 0.0) {
                
                if (i > 1) {
                    if (Tables.maxAllowed401kContAmount == null) {
                        if (Tables.maxAllowed401kContPercent == null) {
                            
                            int currentCont = (int) clientDataTable.getValueAt(7, i-1);
                            
                            float flCurrentCont = ((Number) currentCont).floatValue();
                            
                            float setVal = flCurrentCont / ((Number) (clientDataTable.getValueAt(1, i-1))).floatValue();
                            float currentWage = ((Number) clientDataTable.getValueAt(3, i)).floatValue();
                            
                            
                            
                            clientDataTable.setValueAt(Math.round(setVal * ((Number) clientDataTable.getValueAt(3, i)).floatValue()),7,i);
                            
                        } else {
                            
                        }
                    }
                } else {
                    clientDataTable.setValueAt(Equations.getMaxAllowable401K(clientInfo.getAge()), 7, i); 
                }
            } else {
                clientDataTable.setValueAt(0, 7, i);
            }
        }
        
        
        for (int i = 1; i < 20; i++) {
            int total;
            int year = Calendar.getInstance().get(Calendar.YEAR) + (i - 1);
            
            int currentVal = (int) clientDataTable.getValueAt(3, i);
            if (currentVal > 0) {
                int iraAmount = Tables.IRA_CONT_LIMIT;
                int catchUp;
                if (clientInfo.getAge() >= Tables.MIN_AGE_CATCH_UP_IRA) {
                    catchUp = Tables.IRA_AMOUNT;
                } else {
                    catchUp = 0;
                }
    
                total = iraAmount + catchUp;
                
                total = Math.round(total * (1 - Calculations.iraCalculationsPercent.get(year)));
                
            } else {
                total = 0;
            }
            clientDataTable.setValueAt(total, 8, i);
        }
        
        //clientDataTable.setRowHeight(5, 1);
        
    }
    
    public final void createSpouseTable() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Object yearArray[] = new Object[20];
        yearArray[0] = "";
        for (int i = 1; i < 20; i++) {
            yearArray[i] = currentYear + i - 1;
        }
        Object[][] nameArray = {
            {"Tanner"},
            {"Jen"}
        };
        
        DefaultTableModel model = new DefaultTableModel(nameArray, yearArray);
        spouseDataTable.setModel(model);
        
        spouseDataTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       
    }
    
    private void updateTable(TableModel model, int row, int column) {
        int endIterator = 20 - column;
        if (model == clientDataTable.getModel()) {
            if (row == 5) {
                lookForPercent();
            } else {
                for (int i = 0; i < endIterator; i++) {
                    clientDataTable.setValueAt(0, row, column + i);
                    //model.setValueAt(0, row, column + i);
                }
            }
            model.addTableModelListener(this);
        } else if (model == spouseDataTable.getModel()) {
            for (int i = 0; i < endIterator; i++) {
                spouseDataTable.setValueAt(0, row, column + i);
                //model.setValueAt(0, row, column + i);
            }
            model.addTableModelListener(this);
        }
    }
    
    private void lookForPercent() {
        for (int i = 19; i > 1; i--) {
            System.out.println("ehe");
            try {
                String val = (String) clientDataTable.getValueAt(5, i);
                float percent = Float.parseFloat(val);
                
                System.out.println("RUNNNNNING");
                for (int x = i; x < 20; x++) {
                    if (x == i) {
                        System.out.println(percent);
                        float wage = ((Number) clientDataTable.getValueAt(1, x)).floatValue();
                        System.out.println(wage);
                        clientDataTable.setValueAt(Math.round(percent * (wage)), 7, x);
                    } else {
                        float wages = ((Number) clientDataTable.getValueAt(1, x)).floatValue();
                       
                        float previous = ((Number) clientDataTable.getValueAt(7, x - 1)).floatValue();
                        float previousWage = ((Number) clientDataTable.getValueAt(1, x - 1)).floatValue();
                        float total = (previous/previousWage) * wages;
                        System.out.println(x + ". Wages: " + wages + "   Previous: " + previous + "   Total: " + total);
                        clientDataTable.setValueAt(Math.round(total), 7, x);
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(i + " " + e);
            }
        }
    }
    
    
    @Override
    public void tableChanged(TableModelEvent e) {
        if (e.getType() == TableModelEvent.UPDATE) {
            TableModel model = (TableModel) e.getSource();
            model.removeTableModelListener(this);
            int row = e.getFirstRow();
            int column = e.getColumn();
        
            updateTable(model, row, column);
        }
    }
    /*
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        MyTableModel model = (MyTableModel) table.getModel();
        //Component c =  //super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        //c.setBackground(model.getRowColour(row));
        ..return c;
    }
    */
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientDataTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        spouseDataTable = new javax.swing.JTable();
        tesst = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane1MouseWheelMoved(evt);
            }
        });

        clientDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(clientDataTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, 960, 470));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 50, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 40, -1));

        jTabbedPane1.addTab("tab3", jPanel1);

        spouseDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(spouseDataTable);

        jTabbedPane1.addTab("tab2", jScrollPane2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1028, 520));
        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        tesst.setBackground(new java.awt.Color(255, 153, 153));
        add(tesst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 50, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (clientDataTable.getRowHeight(2) == 1) {
            int height = clientDataTable.getRowHeight(0);
            clientDataTable.setRowHeight(2, height);
            clientDataTable.setRowHeight(1, height);
        } else {
            clientDataTable.setRowHeight(1, 1);
            clientDataTable.setRowHeight(2,1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        int offset = jScrollPane1.getViewport().getViewPosition().x;
        Rectangle r = clientDataTable.getCellRect(0, 5, false);
        
        tesst.setBounds(r.x - offset, tesst.getY(), 50, 50);
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (clientDataTable.getRowHeight(4) == 1) {
            int height = clientDataTable.getRowHeight(0);
            clientDataTable.setRowHeight(4, height);
            clientDataTable.setRowHeight(5, height);
            clientDataTable.setRowHeight(6, height);
        } else {
            clientDataTable.setRowHeight(4, 1);
            clientDataTable.setRowHeight(5, 1);
            clientDataTable.setRowHeight(6, 1);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clientDataTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable spouseDataTable;
    private javax.swing.JPanel tesst;
    // End of variables declaration//GEN-END:variables

    static class MyTableModel extends DefaultTableModel {
    static ArrayList<Color> rowColours = new ArrayList<Color>();
    static {
        rowColours.add(Color.RED);
        rowColours.add(Color.GREEN);
        rowColours.add(Color.CYAN);
    }

    public void setRowColour(int row, Color c) {
        rowColours.set(row, c);
        fireTableRowsUpdated(row, row);
    }

    public Color getRowColour(int row) {
        return rowColours.get(row);
    }

    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return String.format("%d %d", row, column);
    }
    }

    
}
