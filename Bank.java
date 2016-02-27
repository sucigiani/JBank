
/**
 * Deskripsi kelas Bank:
 * 1. Kelas Bank berkaitan dengan pengaturan customer
 * 
 * @author Suci Salimah Giani
 * @NPM 1306368444
 * @version 27 Februari 2016
 */
public class Bank
{
    // instance variables - replace the example below with your own
    private static double creditInterestRate ;
    private static String closeTime;
    private static double investmentInterestRate;
    private static int lastCustID;
    private static int nextCustID;
    private static String phone;
    public static String website;
    public static String bankAddress = "1234 JavaStreet, AnyCity, ThisState,34567";
    public static int maxNumOfCustomers = 20;
    public static String bankName = "JBANK";
    
    public Bank()
    {
       
    }
    
    public static String getAddress() //method accessor untuk alamat
    {
        return ""; //return untuk string
    }
    
    public static double getCreditRate () //method accessor untuk mendapatkan credit rate
    {
        return 0;
    }
    
    public static double getInvestmentRate()//method accessor untuk investment rate
    {
        return 0;
    }
    
    public static String getHoursOfOperation() //method accessor Hours of Operation
    {
        return null;
    }
    
    public static int getLastID() //method accessor untuk last ID
    {
        return 0;
    }
    
    public static int getMaxCustomers() //method accessor untuk customer maksimal
    {
        return 0;
    }
    
    public static String getName() //method accessor untuk nama
    {
        return "";
    }
    
    public static int getNextID () //method accessor untuk nest ID
    {
        return 0;
    }
    
    public static String getWebsite() //method accessor untuk website
    {
        return "";
    }
    
    public static double getPremiumRate() //method accessor untuk premium rate
    {
        return 0;
    }
    
    public static String getPhone() //method accessor untuk phone
    {
        return "";
    }
    
    public static void setCreditRate (double rate) //method mutator untuk credit rate
    {
        
    }
    
    public static void setInvestmentRate (double rate) //method mutator untuk investment rate
    {
        
    }
    
    public static void setPremium (double rate) //method mutator untuk premium
    {
        
    }
    
}