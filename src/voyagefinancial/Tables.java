/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyagefinancial;
import java.util.HashMap;

/**
 *
 * @author TannerLuke
 */
public class Tables {
    
    final static public int MIN_AGE_CATCH_UP = 50;
    final static public int CATCH_UP_401K_AND_403B = 6000;
    final static public int CONTRIBUTION_LIMITS_401K_AND_403B = 18000;
    static public Object maxAllowed401kContPercent = null;
    static public Object maxAllowed401kContAmount = null;
    
    final static public int MIN_AGE_CATCH_UP_IRA = 50;
    final static public int IRA_AMOUNT = 1000;
    final static public int IRA_CONT_LIMIT = 5500;
    
    
    //Inflation Adjustments
    final static public float PENSION_INFLATION_PERCENT = (float) 0.0;
    
    public Tables() {
        
    }
    
    public static HashMap<Integer, Float> requiredMinimumDistributions() {
        HashMap<Integer, Float> rmd = new HashMap<>();
        
        rmd.put(70, (float) 27.4);
        rmd.put(71, (float) 26.5);
        rmd.put(72, (float) 25.6);
        rmd.put(73, (float) 24.7);
        rmd.put(74, (float) 23.8);
        rmd.put(75, (float) 22.9);
        rmd.put(76, (float) 22.0);
        rmd.put(77, (float) 21.2);
        rmd.put(78, (float) 20.3);
        rmd.put(79, (float) 19.5);
        rmd.put(80, (float) 18.7);
        rmd.put(81, (float) 17.9);
        rmd.put(82, (float) 17.1);
        rmd.put(83, (float) 16.3);
        rmd.put(84, (float) 15.5);
        rmd.put(85, (float) 14.8);
        rmd.put(86, (float) 14.1);
        rmd.put(87, (float) 13.4);
        rmd.put(88, (float) 12.7);
        rmd.put(89, (float) 12.0);
        rmd.put(90, (float) 11.4);
        rmd.put(91, (float) 10.8);
        rmd.put(92, (float) 10.2);
        rmd.put(93, (float) 9.6);
        rmd.put(94, (float) 9.1);
        rmd.put(95, (float) 8.6);
        rmd.put(96, (float) 8.1);
        rmd.put(97, (float) 7.6);
        rmd.put(98, (float) 7.1);
        rmd.put(99, (float) 6.7);
        rmd.put(100, (float) 6.3);
        rmd.put(101, (float) 5.9);
        rmd.put(102, (float) 5.5);
        rmd.put(103, (float) 5.2);
        rmd.put(104, (float) 4.9);
        rmd.put(105, (float) 4.5);
        rmd.put(106, (float) 4.2);
        rmd.put(107, (float) 3.9);
        rmd.put(108, (float) 3.7);
        rmd.put(109, (float) 3.4);
        rmd.put(110, (float) 3.1);
        rmd.put(111, (float) 2.9);
        rmd.put(112, (float) 2.6);
        rmd.put(113, (float) 2.4);
        rmd.put(114, (float) 2.1);
        rmd.put(115, (float) 1.9);
        
        
        return rmd;
    }
    
    
    
    
}
