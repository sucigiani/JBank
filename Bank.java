/**
 * Deskripsi kelas Bank:
 * 1. Kelas Bank berkaitan dengan pengaturan customer
 * 
 * @author Suci Salimah Giani
 * @NPM 1306368444
 * @version 27 Februari 2016
 * UPDATEd 5th of March 2016
 * UPDATED 19th of March 2016
 */

import java.util.Date;
import java.util.*;
import java.text.*;
import java.io.*;


public class Bank
{
    // instance variables - replace the example below with your own
    private static double creditInterestRate ;
    private static Date startTime;
    private static Date closeTime;
    private static double investmentInterestRate;
    private static int lastCustID = 1000;
    private static int nextCustID = 1000;
    private static String phone;
    public static String website, Address = "1234 JavaStreet, AnyCity, ThisState,34567", Name = "JBANK";
    public static int MAX_NUM_OF_CUSTOMERS, maxNumOfAccForCustomer = 4;
    public static int maxNumOfCurrentCustomers;
    private static int numOfCurrentCustomers;
    
    static {
        Scanner s = new Scanner(System.in);
        System.out.print("\nMaximum number of Customers' Account: ");
        int z = s.nextInt();
        for (int i=0;i<z;i++)
        {
            System.out.println("Customer" +i);
            Customer[] cArray = new Customer[i];
        }
        MAX_NUM_OF_CUSTOMERS = z;
        System.out.println ("Maximum value: " +MAX_NUM_OF_CUSTOMERS); 
    }
    
    private static Customer[] Customers = new Customer[MAX_NUM_OF_CUSTOMERS];
    
    /**
     * Constructor method untuk Bank
     */
    public Bank()
    {
       
    }
    
    public static boolean addCustomer (Customer customer) {
        for (int i = 0; i < Customers.length; i++) {
            if (Customers[i] == null) {
                Customers[i] = customer;
                return true;
            }
        }
        return false;
    }
    
    public static Customer getCustomer (int custId) {
        for (int i = 0; i < Customers.length; i++) {
            if (Customers[i].getCustId() == custId) {
                return Customers[i];
            }
        }
        return null;
    }
    
    public static int getMaxNumOfCustomers() {
        return MAX_NUM_OF_CUSTOMERS;
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
        int NextCustIDs;
        NextCustIDs = nextCustID;
        if (nextCustID == 0)  //mengecek apa nilai nextCustID sama dengan 0
        {   
            lastCustID = 1000; //menghitunglastCustID
            numOfCurrentCustomers = numOfCurrentCustomers;
            
            return NextCustIDs;
        }
        
        else if ( numOfCurrentCustomers == MAX_NUM_OF_CUSTOMERS )
        {//mengecek apakah customer sudah memiliki max account
            return 0;
        }
        
        else if (nextCustID != 0)
        {//apabila customer masih bisa memiliki akun
            lastCustID = nextCustID; //nextCustID dimasukkan nilainya ke lastCustID
            nextCustID += 1;//menghitung nextCustID
           
            numOfCurrentCustomers += 1;
        }
        return NextCustIDs;
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
    
    public Date getStartTime()
    {
        return startTime;
    }
    
    public void setStartTime()
    {
        
    }
    
    public Date getCloseTime()
    {
        return closeTime;
    }
    
    public void setCloseTime()
    {
        
    }
}