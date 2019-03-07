/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyagefinancial;


import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.List;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;
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
    
    
    ArrayList<Cells> editedPercentOfWages401k = new ArrayList<Cells>();
    ArrayList<Cells> editedAmount401k = new ArrayList<Cells>();
    
    int initial401kCont;
    int listenerColumn = -1;
    int listenerRow = -1;
    
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
        coloredCells.add("Max Roth Contributions");
        editableRows.add(1);
        editableRows.add(2);
        editableRows.add(5);
        editableRows.add(6);
        editableRows.add(9);
        editableRows.add(10);
        editableRows.add(12);
        
        
        jTabbedPane1.setTitleAt(0, clientInfo.getFirstName());
        if (hasSpouseInfo) {
            jTabbedPane1.setTitleAt(1, spouseInfo.getFirstName());
        }
        
        
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
            {"Max Roth Contributions"},
            {"Roth IRA Contributions"}, 
            {"Other Contributions"},
            {"Roth/Other Contributions"},
            {"Pension"}
            
            
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
                clientDataTable.setValueAt(Integer.toString(clientInfo.getBonus()), 2, i);
                
            } else {
                clientDataTable.setValueAt("0", 2, i);
            }
            //wages = wages * growthRate;
        }
        clientDataTable.setRowHeight(2,1);
        
        for (int i = 1; i < 20; i++) {
            int wage = Integer.parseInt(clientDataTable.getValueAt(1, i).toString());
            int bonus = Integer.parseInt(clientDataTable.getValueAt(2, i).toString());
            int total = wage + bonus;
            clientDataTable.setValueAt(total, 3, i);
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
            clientDataTable.setValueAt("", 6, i);
        }
        
        buildRow7();
        
        
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
            if (total != 0) {
                clientDataTable.setValueAt(Integer.toString(total), 8, i);
            } else {
                clientDataTable.setValueAt("", 8, i);
            }
        }
        clientDataTable.setRowHeight(8, 1);
        String contribution = (String) clientDataTable.getValueAt(8, 1);
        int cont = Integer.parseInt(contribution);
        clientDataTable.setValueAt(Integer.toString(cont), 9, 1);
        for (int i = 2; i < 20; i++) {
            clientDataTable.setValueAt("-", 9, i);
        }
        
        for (int i = 1; i < 20; i++) {
            clientDataTable.setValueAt("-", 10, i);
        }
        
        buildRow11();
        
        for (int i = 1; i < 20; i++) {
            clientDataTable.setValueAt("", 12, i);
        }
        
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
            } else if (row == 6) {
                lookForAmount(column);
            } else if (row == 9 || row == 10) {
                buildRow11();
            } else if (row == 12) {
                updateRow12(column);
            } else if (row == 2) {
                updateRow4();
            } else if (row == 1) {
                updatedRow2(row, column);
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
    
    private void updatedRow2(int row, int col) {
        boolean setToZero = false;
        int val = Integer.parseInt(clientDataTable.getValueAt(row, col).toString());
        if (val == 0) {
            for (int i = 1; i < 20; i++) {
                int wage = Integer.parseInt(clientDataTable.getValueAt(1, i).toString());
                if (wage == 0) {
                    setToZero = true;
                }

                if (setToZero == true) {
                    clientDataTable.setValueAt("0", 1, i);
                    clientDataTable.setValueAt("0", 2, i);

                }
            }
        } else {
            
            for (int i = col; i < 20; i++) {
                float growthRate = (float) 1.025;
            
                clientDataTable.setValueAt(val, 1, i);
                val = Math.round(val * growthRate);
            }
        }
        
        
        updateRow4();
    }
    
    private void updateRow4() {
        for (int i = 1; i < 20; i++) {
            int wage = Integer.parseInt(clientDataTable.getValueAt(1, i).toString());
            int bonus = Integer.parseInt(clientDataTable.getValueAt(2, i).toString());
            int total = wage + bonus;
            clientDataTable.setValueAt(total, 3, i);
        }
    }
    
    private void updateRow12(int column) {
        
        for (int i = column; i < 20; i++) {
            System.out.println((i) + "    " + column);
            if (i != column) {
                
                String val = clientDataTable.getValueAt(12, i - 1).toString();
                if (!val.isEmpty()) {
                    try {
                        float initialVal = Float.parseFloat(val);
                        float value = initialVal * (1 + Tables.PENSION_INFLATION_PERCENT);
                        int v = Math.round(value);
                        clientDataTable.setValueAt(Integer.toString(v), 12, i);
                    } catch (NumberFormatException e) {
                        clientDataTable.setValueAt("", 12, i);
                    }
                }
            }
        }
        
    }
    
    private void lookForPercent() {
        System.out.println("this is at least running");
        for (int i = 19; i > 0; i--) {
            boolean amountPresent;
            try {
                int amount = Integer.parseInt(clientDataTable.getValueAt(6, i).toString());
                amountPresent = true;
            } catch (NumberFormatException e2) {
                amountPresent = false;
            }
            if (!amountPresent) {
                try {
                    String val = (String) clientDataTable.getValueAt(5, i);
                    System.out.println("Current Testing val is " + val);
                    float percent = Float.parseFloat(val);

                    if (editedPercentOfWages401k.isEmpty()) {
                        for (int x = i; x < 20; x++) {
                            if (x == i) {
                                //System.out.println(percent);
                                float wage = ((Number) clientDataTable.getValueAt(1, x)).floatValue();
                                //System.out.println(wage);
                                int totInt = Math.round(percent * (wage));
                                String totString = Integer.toString(totInt);
                                clientDataTable.setValueAt(totInt, 7, x);
                            } else {

                                float wages = ((Number) clientDataTable.getValueAt(1, x)).floatValue();
                                float previous = Float.parseFloat(clientDataTable.getValueAt(7, x - 1).toString()); //((Number) clientDataTable.getValueAt(7, x - 1)).floatValue();
                                float previousWage = ((Number) clientDataTable.getValueAt(1, x - 1)).floatValue();
                                float total = (previous/previousWage) * wages;
                                //System.out.println(x + ". Wages: " + wages + "   Previous: " + previous + "   Total: " + total);
                                String totString = Integer.toString(Math.round(total));
                                clientDataTable.setValueAt(totString, 7, x);
                            }


                        }
                        editedPercentOfWages401k.add(new Cells(Float.toString(percent), 5, i));
                        break;
                    } else {
                        boolean cellChanged = false;
                        boolean cellIsInArray = false;
                        for (Cells c : editedPercentOfWages401k) {
                            cellChanged = false;
                            if (c.col == i) {

                                if (!c.data.equals(Float.toString(percent))) {
                                    for (int x = i; x < 20; x++) {
                                            if (x == i) {
                                                //System.out.println(percent);
                                                float wage = ((Number) clientDataTable.getValueAt(1, x)).floatValue();
                                                System.out.println(wage);
                                                clientDataTable.setValueAt(Math.round(percent * (wage)), 7, x);
                                            } else {
                                                float wages = ((Number) clientDataTable.getValueAt(1, x)).floatValue();

                                                float previous = Float.parseFloat(clientDataTable.getValueAt(7, x-1).toString());//((Number) clientDataTable.getValueAt(7, x - 1)).floatValue();
                                                float previousWage = ((Number) clientDataTable.getValueAt(1, x - 1)).floatValue();
                                                float total = (previous/previousWage) * wages;
                                                //System.out.println(x + ". Wages: " + wages + "   Previous: " + previous + "   Total: " + total);
                                                int totInt = Math.round(total);
                                                String totString = Integer.toString(totInt);
                                                clientDataTable.setValueAt(totString, 7, x);
                                            }
                                        }

                                       c.data =  Float.toString(percent);
                                       cellChanged = true;
                                       break;
                                }

                        }
                        if (cellChanged == false && !cellIsInArray) {

                            for (int x = i; x < 20; x++) {
                                if (x == i) {
                                    System.out.println(x+ " None has been changed " + i);
                                    //System.out.println(percent);
                                    float wage = ((Number) clientDataTable.getValueAt(1, x)).floatValue();
                                    System.out.println("This is the wage! " + percent);
                                    int va123 = Math.round(percent * (wage));
                                    System.out.println("this is the valkyle " + va123);
                                    clientDataTable.setValueAt(Integer.toString(Math.round(percent * (wage))), 7, x);

                                } else {
                                    try {
                                        if (((String)clientDataTable.getValueAt(5, x)).equals("")) {
                                            System.out.println(x + " No Cell has been changed "+ i);
                                            float wages = ((Number) clientDataTable.getValueAt(1, x)).floatValue();

                                            float previous = Float.parseFloat(clientDataTable.getValueAt(7, x-1).toString()); //((Number) clientDataTable.getValueAt(7, x - 1)).floatValue();
                                            float previousWage = ((Number) clientDataTable.getValueAt(1, x - 1)).floatValue();
                                            float total = (previous/previousWage) * wages;
                                            //System.out.println(x + ". Wages: " + wages + "   Previous: " + previous + "   Total: " + total);
                                            clientDataTable.setValueAt(Integer.toString(Math.round(total)), 7, x);
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        System.out.println(e);
                                    }
                                }
                            }
                            editedPercentOfWages401k.add(new Cells(Float.toString(percent), 5, i));
                            break;
                        }
                    }
                    }
                } catch (NumberFormatException e) {
                    //System.out.println(editedPercentOfWages401k);
                    System.out.println(e);
                    for (Cells cel : editedPercentOfWages401k) {
                        if (cel.col == i) {

                            if (clientDataTable.getValueAt(5, i).toString().equals("")) {
                                clientDataTable.setValueAt("", 5, i);
                                System.out.println(cel.col + " Has changed " + clientDataTable.getValueAt(5, i));
                                System.out.println("Still running");
                                for (int y = i; y > 0; y--) {
                                    try {
                                        float val = Float.parseFloat(clientDataTable.getValueAt(5, y).toString());
                                        System.out.println(val);
                                    } catch (NumberFormatException except) {

                                    }
                                    if (y == 1) {

                                        for (int w = 1; w < 20; w++) {
                                            System.out.println("hello world");
                                            try {
                                                String v = clientDataTable.getValueAt(5, w).toString();
                                                if (v.equals("")) {
                                                    float wages = ((Number) clientDataTable.getValueAt(1, w)).floatValue();

                                                    float previous = Float.parseFloat(clientDataTable.getValueAt(7, w-1).toString()); //((Number) clientDataTable.getValueAt(7, x - 1)).floatValue();
                                                    float previousWage = ((Number) clientDataTable.getValueAt(1, w - 1)).floatValue();
                                                    float total = (previous/previousWage) * wages;
                                                    clientDataTable.setValueAt(Integer.toString(Math.round(total)), 7, w);
                                                }
                                            } catch (NumberFormatException ex1) {

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void lookForAmount(int column) {
        for (int i = 19; i > 0; i--) {
            try {
                String val = clientDataTable.getValueAt(6, i).toString();
                if (!val.isEmpty()) {
                    if (editedAmount401k.isEmpty()) {
                        for (int j = i; j < 20; j++) {
                            if (i == j) {
                                clientDataTable.setValueAt(clientDataTable.getValueAt(6, j).toString(), 7, j);
                                editedAmount401k.add(new Cells(clientDataTable.getValueAt(6, j).toString(), 6, j));
                            } else {
                                String stopVal = clientDataTable.getValueAt(6, j).toString();
                                if (stopVal.isEmpty()) {
                                    if (j > 1) {
                                        float previousCont = Float.parseFloat(clientDataTable.getValueAt(7, j - 1).toString());
                                        float previousWage = Float.parseFloat(clientDataTable.getValueAt(1, j - 1).toString());
                                        float multFactor = previousCont / previousWage;
                                        float finalVal = Float.parseFloat(clientDataTable.getValueAt(1, j).toString()) * multFactor;
                                        String finalString = Float.toString(Math.round(finalVal));
                                        clientDataTable.setValueAt(finalString, 7, j);
                                        
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    } else {
                        for (int j = column; j < 20; j++) {
                            if (j == 1) {
                                clientDataTable.setValueAt(clientDataTable.getValueAt(6, j), 7, column);
                            }
                            else if (i == j) {
                                clientDataTable.setValueAt(clientDataTable.getValueAt(6, j).toString(), 7, j);
                                editedAmount401k.add(new Cells(clientDataTable.getValueAt(6, j).toString(), 6, j));
                            } else {
                                String stopVal = clientDataTable.getValueAt(6, j).toString();
                                if (stopVal.isEmpty()) {
                                    if (j > 1) {
                                        float previousCont = Float.parseFloat(clientDataTable.getValueAt(7, j - 1).toString());
                                        float previousWage = Float.parseFloat(clientDataTable.getValueAt(1, j - 1).toString());
                                        float multFactor = previousCont / previousWage;
                                        float finalVal = Float.parseFloat(clientDataTable.getValueAt(1, j).toString()) * multFactor;
                                        String finalString = Integer.toString(Math.round(finalVal));
                                        clientDataTable.setValueAt(finalString, 7, j);
                                        
                                    }
                                }
                            }
                            
                        }
                        
                        
                        
                        
                        
                    }
                }
            } catch (ClassCastException e) {
                
            }
            
        }
        if (clientDataTable.getValueAt(6, 1).toString().equals("")) {
            System.out.println("Running");
            for (int k = 1; k < 20; k++) {
                if (k == 1) {
                    clientDataTable.setValueAt(initial401kCont, 7, 1);
                } else {
                    String stopVal = clientDataTable.getValueAt(6, k).toString();
                    if (stopVal.isEmpty()) {
                        if (k > 1) {
                        float previousCont = Float.parseFloat(clientDataTable.getValueAt(7, k - 1).toString());
                        float previousWage = Float.parseFloat(clientDataTable.getValueAt(1, k - 1).toString());
                        float multFactor = previousCont / previousWage;

                        float finalVal = Float.parseFloat(clientDataTable.getValueAt(1, k).toString()) * multFactor;
                        String finalString = Integer.toString(Math.round(finalVal));
                        clientDataTable.setValueAt(finalString, 7, k);

                        }
                    }
                }
            }
        }
    }
    
    
    public void buildRow7() {
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
        initial401kCont = Integer.parseInt(clientDataTable.getValueAt(7, 1).toString());
    }
    
    public void buildRow11() {
        for (int i = 1; i < 20; i++) {
            String rothVal = (String) clientDataTable.getValueAt(9, i);
            String otherVal = (String) clientDataTable.getValueAt(10, i);
            System.out.println(otherVal);
            int rothValue;
            int otherValue;
            
            if (!rothVal.isEmpty()) {
                try {
                    rothValue = Integer.parseInt(rothVal);
                } catch (NumberFormatException e) {
                    rothValue = 0;
                }
            } else {
               rothValue = 0;
            }
            
            if (!otherVal.isEmpty()) {
                try {
                    otherValue = Integer.parseInt(otherVal);
                } catch (NumberFormatException e) {
                    otherValue = 0;
                }
            } else {
                otherValue = 0;
            }
            int totalVal = rothValue + otherValue;
            clientDataTable.setValueAt(Integer.toString(totalVal), 11, i);
            
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
        wageInfoButton = new javax.swing.JButton();
        contributionInfoButton = new javax.swing.JButton();
        rothInfoButton = new javax.swing.JButton();
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
        clientDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientDataTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, 960, 470));

        wageInfoButton.setText("jButton1");
        wageInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wageInfoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(wageInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 50, -1));

        contributionInfoButton.setText("jButton2");
        contributionInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contributionInfoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(contributionInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 40, -1));

        rothInfoButton.setText("jButton2");
        rothInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rothInfoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(rothInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 40, -1));

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

    private void wageInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wageInfoButtonActionPerformed
        if (clientDataTable.getRowHeight(2) == 1) {
            int height = clientDataTable.getRowHeight(0);
            clientDataTable.setRowHeight(2, height);
            clientDataTable.setRowHeight(1, height);
        } else {
            clientDataTable.setRowHeight(1, 1);
            clientDataTable.setRowHeight(2,1);
        }
    }//GEN-LAST:event_wageInfoButtonActionPerformed

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        int offset = jScrollPane1.getViewport().getViewPosition().x;
        Rectangle r = clientDataTable.getCellRect(0, 5, false);
        
        tesst.setBounds(r.x - offset, tesst.getY(), 50, 50);
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

    private void contributionInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contributionInfoButtonActionPerformed
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
    }//GEN-LAST:event_contributionInfoButtonActionPerformed

    private void rothInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rothInfoButtonActionPerformed
        if (clientDataTable.getRowHeight(8) == 1) {
            int height = clientDataTable.getRowHeight(0);
            clientDataTable.setRowHeight(8, height);
        } else {
            clientDataTable.setRowHeight(8, 1);
        }
    }//GEN-LAST:event_rothInfoButtonActionPerformed

    private void clientDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientDataTableMouseClicked
        /*
        if (listenerRow == -1) {
            listenerColumn = clientDataTable.columnAtPoint(evt.getPoint());
            listenerRow = clientDataTable.rowAtPoint(evt.getPoint());
        } else {
            String val = ((String) clientDataTable.getValueAt(listenerRow, listenerColumn));
            if (val.isEmpty()) {
                clientDataTable.setValueAt("-", listenerRow, listenerColumn);
                
            }
            listenerColumn = clientDataTable.columnAtPoint(evt.getPoint());
            listenerRow = clientDataTable.rowAtPoint(evt.getPoint());
        }
        System.out.println(listenerRow);
        System.out.println(listenerColumn);
        try {
            if (((String) clientDataTable.getValueAt(listenerRow, listenerColumn)).equals("-")) {
                clientDataTable.setValueAt("", listenerRow, listenerColumn);
            }
        } catch (ClassCastException e) {
            
        }
        */
    }//GEN-LAST:event_clientDataTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clientDataTable;
    private javax.swing.JButton contributionInfoButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton rothInfoButton;
    private javax.swing.JTable spouseDataTable;
    private javax.swing.JPanel tesst;
    private javax.swing.JButton wageInfoButton;
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


class Cells {
    
    public int row;
    public int col;
    public String data;
    
    public Cells(String data, int row, int col) {
        this.row = row;
        this.col = col;
        this.data = data;
    }
    
    
}
