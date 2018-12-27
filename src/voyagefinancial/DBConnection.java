package voyagefinancial;


import voyagefinancial.UserInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TannerLuke
 */
public class DBConnection extends UserInterface {
    
    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String JDBC_URL = "jdbc:derby:voyagefinancial;create=true";
    
    Connection conn;
    static PreparedStatement pst;
    
    public DBConnection() {
        
        try {
            this.conn = DriverManager.getConnection(JDBC_URL);
            if (this.conn != null) {
                System.out.println("connected to database");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createBasicInfoTable() {
        
        try {
            System.out.println("creating table");
            //conn.createStatement().execute("CREATE TABLE TheTable (FirstName varchar(50), LastName varchar(50))");
            conn.createStatement().execute("CREATE TABLE ClientInfoTable1 (ClientFirstName varchar(50), ClientLastName varchar(50), ClientBirthMonth varchar(2), ClientBirthDay varchar(2),"
                    + " ClientBirthYear varchar(4), ClientAge varchar(3), ClientRetirementMonth varchar(2), ClientRetirementDay varchar(2), ClientRetirementYear varchar(4), ClientCompany varchar(50), ClientServiceMonth varchar(2),"
                    + " ClientServiceDay varchar(2), ClientServiceYear varchar(4), ClientPercentMatch DOUBLE, ClientMaxPercentMatch DOUBLE, ClientMaxMatch INT,"
                    + " SpouseFirstName varchar(50), SpouseLastName varchar(50), SpouseBirthMonth varchar(2), SpouseBirthDay varchar(2),"
                    + " SpouseBirthYear varchar(4), SpouseAge INT, SpouseRetirementMonth varchar(2), SpouseRetirementDay varchar(2), SpouseRetirementYear varchar(4), SpouseCompany varchar(50), SpouseServiceMonth varchar(2),"
                    + " SpouseServiceDay varchar(2), SpouseServiceYear varchar(4), SpousePercentMatch DOUBLE, SpouseMaxPercentMatch DOUBLE, SpouseMaxMatch INT)");
        } catch (SQLException ex) {
            //Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Database already exists");
        }
        
        
    }
    
    public void insertIntoTable(String firstNameInput,
       String lastNameInput,
       String clientBirthMonthInput,
       String clientBirthDayInput,
       String clientBirthYearInput,
       int clientAgeInput,
       String clientRetirementMonthInput,
       String clientRetirementDayInput,
       String clientRetirementYearInput,
       String clientCompanyInput,
       String clientServiceMonthInput,
       String clientServiceDayInput,
       String clientServiceYearInput,
       double clientPercentPerDollarInput,
       double clientMaxPercentOfWage,
       String clientMaxAmount,
       String spouseFirstNameInput,
       String spouseLastNameInput,
       String spouseBirthMonthInput,
       String spouseBirthDayInput,
       String spouseBirthYearInput,
       int spouseAgeInput,
       String spouseRetirementMonthInput,
       String spouseRetirementDayInput,
       String spouseRetirementYearInput,
       String spouseCompanyInput,
       String spouseServiceMonthInput,
       String spouseServiceDayInput,
       String spouseServiceYearInput,
       double spousePercentPerDollarInput,
       double spouseMaxPercentOfWageInput,
       String spouseMaxAmountInput) {
       
        
        
        try{ 
            String query = "insert into ClientInfoTable1(ClientFirstName, ClientLastName, ClientBirthMonth, ClientBirthDay, ClientBirthYear, ClientAge, ClientRetirementMonth, ClientRetirementDay, ClientRetirementYear"
                    + ", ClientCompany, ClientServiceMonth, ClientServiceDay, ClientServiceYear, ClientPercentMatch, ClientMaxPercentMatch, ClientMaxMatch"
                    + ", SpouseFirstName, SpouseLastName, SpouseBirthMonth, SpouseBirthDay,"
                    + " SpouseBirthYear, SpouseAge, SpouseRetirementMonth, SpouseRetirementDay, SpouseRetirementYear, SpouseCompany, SpouseServiceMonth,"
                    + " SpouseServiceDay, SpouseServiceYear, SpousePercentMatch, SpouseMaxPercentMatch, SpouseMaxMatch)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(query);
            
            
            
            
            
            pst.setString(1, firstNameInput);
            pst.setString(2, lastNameInput);
            
            pst.setString(3, clientBirthMonthInput);
            pst.setString(4, clientBirthDayInput);
            pst.setString(5, clientBirthYearInput);
            pst.setInt(6, clientAgeInput);
            pst.setString(7, clientRetirementMonthInput);
            pst.setString(8, clientRetirementDayInput);
            pst.setString(9, clientRetirementYearInput);
            pst.setString(10, clientCompanyInput);
            pst.setString(11, clientServiceMonthInput);
            pst.setString(12, clientServiceDayInput);
            pst.setString(13, clientServiceYearInput);
            pst.setDouble(14, clientPercentPerDollarInput);
            pst.setDouble(15, clientMaxPercentOfWage);
            pst.setInt(16, Integer.parseInt(clientMaxAmount));
            
            
            pst.setString(17, spouseFirstNameInput);
            pst.setString(18, spouseLastNameInput);
            pst.setString(19, spouseBirthMonthInput);
            pst.setString(20, spouseBirthDayInput);
            pst.setString(21, spouseBirthYearInput);
            pst.setInt(22, spouseAgeInput);
            pst.setString(23, clientRetirementMonthInput);
            pst.setString(24, clientRetirementDayInput);
            pst.setString(25, clientRetirementYearInput);
            pst.setString(26, clientCompanyInput);
            pst.setString(27, clientServiceMonthInput);
            pst.setString(28, clientServiceDayInput);
            pst.setString(29, clientServiceYearInput);
            pst.setDouble(30, clientPercentPerDollarInput);
            pst.setDouble(31, clientMaxPercentOfWage);
            pst.setInt(32,Integer.parseInt(clientMaxAmount));
           
            pst.executeUpdate();
           
        
       } catch (Exception e) {
           
           System.out.println(e);
           
       }
        
    }
    
    public void printEverything(){
        try {
            System.out.println("in the function");
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery("select * from ClientInfoTable1");
            //System.out.println(res.getString("FirstName")+" "+res.getString("LastName"));
            while (res.next()){
                System.out.println(res.getString("ClientFirstName")+" "+res.getString("ClientLastName")+" "+res.getString("ClientBirthMonth")+" "+res.getString("ClientBirthDay")
                +" "+res.getString("ClientBirthYear")+" "+res.getString("ClientAge")+" "+res.getString("ClientRetirementMonth")+" "+res.getString("ClientRetirementDay")
                +" "+res.getString("ClientRetirementYear")+" "+res.getString("ClientCompany")+" "+res.getString("ClientServiceMonth")+" "+res.getString("ClientServiceDay")+" "+res.getString("ClientServiceYear")
                +" "+res.getBigDecimal("ClientPercentMatch").toString()+" "+res.getBigDecimal("ClientPercentMatch")+" "+res.getInt("ClientMaxMatch"));
                //System.out.println(res.getString(0));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

/*
                    + " SpouseFirstName varchar(50), SpouseLastName varchar(50), SpouseBirthMonth varchar(2), SpouseBirthDay varchar(2),"
                    + " SpouseBirthYear varchar(4), SpouseAge INT, SpouseRetirementMonth varchar(2), SpouseRetirementDay varchar(2), SpouseRetirementYear varchar(4), SpouseCompany varchar(50), SpouseServiceMonth varchar(2),"
                    + " SpouseServiceDay varchar(2), SpouseServiceYear varchar(4), SpousePercentMatch DECIMAL, SpouseMaxPercentMatch DECIMAL, SpouseMaxMatch INT)"
*/