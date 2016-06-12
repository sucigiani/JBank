
import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.*;
import java.lang.Math;

/**
 * Deskripsi kelas Account:
 * 1. Kelas Account merupakan kelas yang berisi informasi AKUN milik customer
 * 
 * @author Suci Salimah Giani
 * @NPM 1306368444
 * @version 24 Februari 2016
 * updated 27 Februari 2016
 * updated 3 Maret 2016
 * updated 19 Maret 2016
 * updated 27 Maret 2016
 */

public abstract class Account   
    /**
     * Kerangka Awal Class Account Menggunakan Pemrograman Modular
     */
    
{   //private char acctType;
    protected double balance;
    protected String id;
    protected static MathContext mc = new MathContext(3);
    
    /**
     * Constructor (pembangun kelas Account)
     */
   /*public Account(String ID, double amount) {
        balance = amount;
        id = ID;
    }*/
    
    /**
     * Metode pada constructor kelas Account
     * @param type sebagai tipe akun customer
     * @param amount sebagai nilai saldo customer
     */
    /*public Account(char type, double amount) {
          //acctType = type; 
          balance = amount;}*/
    
     public String toString() {
        //System.out.println("Account Type  :   " + acctType);
        //if (this.getClass().equals())
        if ( this instanceof Savings && !(this instanceof Investment)) {
            System.out.println("SAVING");
        } else if ( this instanceof LineOfCredit) {
            LineOfCredit l = (LineOfCredit)this;
            System.out.println("Line Of Credit");
            System.out.println("Credit Balance:   "+ l.getCreditBalance());
            System.out.println("Monthly Fee   :   "+ l.getMonthlyFee());
        } else if ( this instanceof OverDraftProtection) {
            OverDraftProtection o = (OverDraftProtection)this;
            System.out.println("Overdraft Protection");
            System.out.println("Monthly Fee   :   "+ o.getMonthlyFee());
        } else if ( this instanceof Investment) {
            System.out.println("Investment");
        }
        System.out.println("Balance       :   " + balance);
        return "";
    }
    
     /**
     * metode untuk deposit customer
     * @param amount nilai saldo akun customer 
     */
    public boolean deposite(double amount)
    {
        if (amount < 0)
        { //mengecek deposit customer apakah kurang dari 0
            return false; //apabila kurang dari 0 maka berada pada kondisi false
        }
        else
        { //Apabila deposit customer lebih dari 0
            balance += amount;// menambahkan uang deposit customer
            return true; // berada pada kondisi true
        }
    }
    
     public static double futureValue(double balance, double rate, double compound, double period) 
    {
        BigDecimal bal = new BigDecimal (balance);
        BigDecimal r = new BigDecimal (rate);
        BigDecimal n = new BigDecimal (compound);
        BigDecimal t = new BigDecimal (period);
        BigDecimal f1 = r.divide(n, mc.DECIMAL32).add(new BigDecimal(1));
        BigDecimal f2 = n.multiply(t, mc.DECIMAL32);
        BigDecimal f3 = new BigDecimal (Math.pow(f1.doubleValue(), f2.doubleValue()),mc.DECIMAL32);
        BigDecimal f4 = f3.multiply(bal, mc.DECIMAL32);
        return f4.doubleValue();
    }
    
    /**
     * Metode untuk mendapatkan tipe akun customer
     * @return acctType sebagai tipe akun customer
     */
    //public String getAcctType() {
       //return acctType;}
    
    
     /** 
     * Metode untuk mendapatkan nilai balance (saldo) customer
     * @return balance sebagai nilai balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Metode untuk mendapatkan Id Customer
     * @return nomor id customer
     */
    public String getId() {
        return id;}
    
    /**
     * Metode untuk mengatur balance customer
     * @param amount nilai balance customer
     */
    public void setBalance(double amount) {
        balance = amount; }
        
    /**
     * Metode untuk mengatur id customer
     * @param acctId sebagai id dari akun customer
     */    
    //public void setID(String acctId) {
        //this.id = acctId; }
        
    /**
     * Metode untuk mengatur tipe akun customer
     * @param type sebagai tipe akun customer
     */    
    //public void setAcctType(char type) {
        //this.acctType = type; }
        
    /**
     * method untuk customer mengambil uang
     */
    public abstract boolean withdraw (double amount);
   
}