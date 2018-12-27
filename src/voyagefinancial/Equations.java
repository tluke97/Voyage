/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyagefinancial;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author TannerLuke
 */
public class Equations {
    
    public double federalTaxableIncome(double wages, double retirementIncome, double investmentIncome, double shortTermGains, double deductions) {
        double total;
        
        total = (wages + retirementIncome + investmentIncome + shortTermGains) - deductions;
        
        return total;
    }
    
    public double stateTaxableIncome(double wages, double investmentIncome, double deductions) {
        double total;
        
        total = (wages + investmentIncome) - deductions;
        
        return total;
    }
    
    
    public static int mergeAndConvertDates(String month, String day, String year) {
        
        String date = month + "/" + day + "/" + year;
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy", Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(date, formatter);
        
        //String string2 = jTextField2.getText().toString();
        LocalDate localDate2 = LocalDate.now();
        
        java.util.Date finalDate1 = java.sql.Date.valueOf(localDate);
        java.util.Date finalDate2 = java.sql.Date.valueOf(localDate2);
                
        long diff = getDateDifference(finalDate1, finalDate2, TimeUnit.DAYS);
        
        int yearsOld = Period.between(localDate, localDate2).getYears();
        
        
        
        return yearsOld;
    }
    
    public static long getDateDifference(Date date1, Date date2, TimeUnit timeUnit) {
        long differenceInDays = date2.getTime() - date1.getTime();
        
        return timeUnit.convert(differenceInDays, TimeUnit.MILLISECONDS);
    }
    
    public static int getMaxAllowable401K(int clientAge) {
        
        if (clientAge >= Tables.MIN_AGE_CATCH_UP) {
            return Tables.CATCH_UP_401K_AND_403B + Tables.CONTRIBUTION_LIMITS_401K_AND_403B;
        } else {
            return Tables.CATCH_UP_401K_AND_403B;
        }
        
    }
    
    
    
}
