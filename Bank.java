
/**
 * Deskripsi kelas Bank:
 * 1. Kelas Bank berkaitan dengan pengaturan customer
 * 
 * @author Suci Salimah Giani
 * @NPM 1306368444
 * @version 27 Februari 2016
 * UPDATEd 5th of March 2016
 */
public class Bank
{
    // instance variables - replace the example below with your own
    private static double creditInterestRate ;
    private static String closeTime;
    private static double investmentInterestRate;
    private static int lastCustID;
    private static int nextCustID = 1000;
    private static String phone;
    public static String website, Address = "1234 JavaStreet, AnyCity, ThisState,34567", Name = "JBANK";
    public static int maxNumOfCustomers = 20;
    public static int maxNumOfCurrentCustomers;
    public static int numOfCurrentCustomers;
    
    /**
     * Constructor method untuk Bank
     */
    public Bank()
    {
       
    }
    
    /*public static String getAddress() //method accessor untuk alamat
    {
        return ""; //return untuk string
    }*/
    
    /**
     * method accessor untuk mendapatkan credit rate
     */
    public static double getCreditRate ()
    {
        return 0;
    }
    /**
     * method accessor untuk investment rate
     */
    public static double getInvestmentRate()
    {
        return 0;
    }
    /**
     * method accessor Hours of Operation
     */
    public static String getHoursOfOperation() 
    {
        return null;
    }
    /**
     * method accessor untuk last ID
     */
    public static int getLastID() 
    {
        return 0;
    }
    
    /*public static int getMaxCustomers() //method accessor untuk customer maksimal
    {
        return 0;
    }*/
    
    /*public static String getName() //method accessor untuk nama
    {
        return "";
    }*/
    /**
     * method accessor untuk next ID
     */
    public static int getNextID () 
    {
        int nextID;
        if (numOfCurrentCustomers == maxNumOfCurrentCustomers) {
            nextID = 1000;
            return nextID;
        }
        else {
            nextCustID = nextCustID + 1;
            numOfCurrentCustomers = numOfCurrentCustomers +1;
            lastCustID = nextCustID;
            return nextCustID;
        }
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
    
    public static int getnumOfCurrentCustomers ()
    {
        return numOfCurrentCustomers;
    }    
}