/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyagefinancial;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author TannerLuke
 */
public class PanelArray {
    
    
    /*
    
    public PanelArray(boolean hasPension, boolean hasSocial, boolean has401k, boolean has403b,
            boolean has457, boolean hasIRA, boolean hasSimpleIra, boolean hasNonRetirement,
            boolean hasAnnuities, boolean hasCDs, boolean hasChecking, boolean hasSavings,
            boolean hasDefferedComp, boolean hasHsa, boolean hasFlexSpend, boolean hasOptions) {
        
        if (hasPension) 
        
        
        
    }
    */
    
    PensionInfoPanel panel = new PensionInfoPanel();
    IraInfoPanel panel1 = new IraInfoPanel();
    
    private ArrayList<JPanel> panels = new ArrayList<JPanel>();
    private ArrayList<String> panelStrings = new ArrayList<String>();
    
    public void addPanel(JPanel addedPanel, String panelString) {
        panels.add(addedPanel);
        panelStrings.add(panelString);
       
    }
    
    
    public void removePanel(JPanel removedPanel, String panelString) {
        panels.remove(removedPanel);
        panelStrings.remove(panelString);
    }
    
    public ArrayList<JPanel> getPanels() {
        return panels;
    }
    
    public void insertPanel(JPanel insertedPanel, JPanel currentPanel, String panelString) {
        int index = panels.indexOf(currentPanel) + 1;
        panels.add(index, insertedPanel);
        panelStrings.add(index, panelString);
    }
    
    public ArrayList<String> getPanelStrings() {
        return panelStrings;
    }
    
    public void clearPanels() {
        panels.removeAll(panels);
        panelStrings.removeAll(panelStrings);
    }
    
    public String getPanelAtLocation(int loc) {
        return panelStrings.get(loc);
    }
    
    
    
    
}
