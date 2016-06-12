/**
 * Deskripsi kelas Customer:
 * 1. Kelas Customer berisi data diri customer
 * 
 * @author Suci Salimah Giani 
 * @NPM 1306368444
 * @version 27 Februari 2016
 * UPDATED 3rd of March 2016
 * UPDATED 19th of March 2016
 * UPDATED 27th of March 2016
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import java.text.*;

public class Customer 
    /**
     * Kerangka Awal Class Customer Menggunakan Pemrograman Modular
     */
{   public Account[] accounts = new Account [4];
    private Account a;
    private int numOfAcc;
    private int custId,numberOfCurrentAccounts;
    private String cityAddress,email,firstName,lastName,streetAddress,phoneNumber,zipOrPostalCode,cityName;
    private Date dateOfBirth = new Date();
    private int indexArrayAcc= 0;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
    
    private Bank bank;
    private Pattern pattern;
    private Matcher matcher;    
        /** 
         * Constructor (pembangun kelas Customer)
         */
    public Customer(){}
    
        /**
         * Metode Constructor bagi Customer
         * @param fname sebagai first name customer
         * @param lname sebagai last name customer
         * @param dob sebagai waktu kelahiran (date of birth) customer
         */
    public Customer(String fname,String lname){
         this(fname,lname,null);
    }
    
        /**
         * Metode Constructor bagi Customer
         * @param fname sebagai first name customer
         * @param lname sebagai last name customer
         * @param dob sebagai waktu kelahiran (date of birth) customer
         * @param custId sebagai id customer
         */
    public Customer(String firstName,String lastName, Date dob){
        this.firstName = firstName ;
        this.lastName = lastName;
        this.dateOfBirth = dob;
        this.custId = Bank.nextCustID;
    }
    
    /*return value untuk setiap variable*/
    /**
     * Metode untuk string
     */
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");
        System.out.println("Customer ID   :   " + custId);
        System.out.println("First Name    :   " + firstName);
        System.out.println("Last Name     :   " + lastName);
        System.out.println("City Address  :   " + cityAddress);
        System.out.println("Stret Address :   " + streetAddress);
        System.out.println("Email         :   " + email);
        System.out.println("Phone Number  :   " + phoneNumber);
        System.out.println("Zip / Postal  :   " + zipOrPostalCode);
        System.out.println("DOB           :   " + ft.format(dateOfBirth));
        System.out.println("Account       :");
        /*
         for (Account a : accounts) {
            if ( a!= null) {
                switch (a.getAcctType()) {
                    case 'S': System.out.println("SAVINGS, " + a.getBalance());
                              break;
                    case 'O': System.out.println("OVERDRAFT, " + a.getBalance());
                              break;
                    case 'I': System.out.println("INVESTMENT, " + a.getBalance());
                              break;
                    case 'L': System.out.println("LINEOFCREDIT, " + a.getBalance());
                              break;
                    default : System.out.println("You Don't Have Any Account Type");
                }
            }
        }*/
        return "";
        //return firstName +", " + lastName + ", " + DOB;
    }
    
    /**
     * Mendapatkan alamat customer
     * @return alamat jalan, nama kota dan postal code customer
     */
    public String getAddress(){
    return streetAddress+","+cityName+","+zipOrPostalCode; }
    
    /**
     * Mendapatkan akun customer
     * @return semua akun customer
     */
    public Account getAccount(char type){
     Account acct = null;
        for (Account a: accounts ) {
            switch (type) {
                case 'S' : if( (a instanceof Savings) && !(a instanceof Investment) ) {
                    acct = a;
                }
                break;
                case 'L' : if(a instanceof LineOfCredit) {
                    acct = a;
                }
                break;
                case 'O' : if(a instanceof OverDraftProtection) {
                    acct = a;
                }
                break;
                case 'I' : if(a instanceof Investment) {
                    acct = a;
                }
                break;
            }   
        }
        return acct;
    }
    
    /**
     * Mendapatkan firstname dan lastname dari customer 
     * @return nama lengkap customer
     */
    public String getName () {
    return lastName + "," + firstName;}
    
    /**
     * Mendapatkan id customer
     * @return custID sebagai nilai id
     */
    public int getCustomer(){
    return custId; }
    
    /**
     * Mendapatkan email customer
     * @return email customer
     */
    public String getEmail(){
    return email; }
    
    /**
     * Mendapatkan waktu lahir customer
     * @return date of birth costumer
     */
    public Date getdateOfBirth() {
    return dateOfBirth; }    
    
    /**
     * Mendapatkan banyaknya akun seorang customer
     * @return jumlah banyaknya akun 
     */
    public int getNumOfAccounts(){
    return numberOfCurrentAccounts; }
    
    /**
     * Mendapatkan nomor telepon customer
     * @return nomor telepon dalam bentuk string
     */
    public String getPhoneNumber(){
    return phoneNumber;}
    
    /**
     * Mengatur lokasi alamat customer
     * @param street sebagai nama jalan
     * @param city sebagai nama kota
     * @param code sebagai postal code
     */
    public void setAddress(String street, String city, String code) {
        this.streetAddress = street; 
        this.cityName = city; 
        this.zipOrPostalCode = code; }
    
    /**
     * Mengatur email customer
     * @return matcher untuk mencocokan email customer
     */
    public boolean setEmail(String emailAddress)
    {
         pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(emailAddress);
        if (matcher.matches()) {
            email = emailAddress;
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Mendapatkan nomor pelanggan
     * @return nomor identitas pelanggan
     */
    public int getCustID() {
        return custId;
    }
    
    /**
     * Mengatur nama lengkap customer
     * @return lname sebagai nama belakang customer
     * @return fname sebagai nama depan customer
     */
    public void setName(String lname, String fname) {
        this.lastName = lname;
        this.firstName = fname; }
        
        
    /**
     * Mengatur jumlah akun customer
     * @param akun milik customer
     */    
    /*public void setAccount(Account akun){
        accounts = akun ;}*/
   
    /**
     * Mengatur nomor telepon customer
     * @return phoneNum sebagai nomor telepon customer
     */  
    public void setPhoneNumber(String phoneNum) {
        this.phoneNumber = phoneNum; }
    
     /**
      * Metode untuk menambahkan objek akun pada customer
      * @param benar atau salah
      */
      public boolean addAccount(Account account) {
        boolean accountAdded = false, sameType = false;
        int index = -1;
        if ( numOfAcc < 5 ) {
            for (int i = indexArrayAcc; i < 4; i++) {
                if (accounts [i] == null && index == -1) {
                    index = i;
                } else if (accounts[i] != null ) {
                     if (accounts[i].getClass().equals( account.getClass() )){
                        sameType = true;
                        break;
                    }
                }
            }
            if (!sameType && index != -1){
                accounts[index] = account;
                accountAdded = true;
                numOfAcc++;
                indexArrayAcc++;
            }
        }
        return accountAdded;
    }
         
      /**
       * Metode untuk menghapus objek akun pada customer
       * @param benar atau salah
       */
    public boolean removeAccount(char type) {
       Account a = null;
        boolean accountRemoved = false;
        for (int i = 0; i<=3; i++) {
            switch (type) {
                case 'S' : if ( accounts[i] instanceof Savings && !(accounts[i] instanceof Investment)) {
                    accounts[i] = null;
                    indexArrayAcc--;
                    numOfAcc--;
                    accountRemoved = true;
                }
                break;
                case 'L' : if ( accounts[i] instanceof LineOfCredit) {
                    accounts[i] = null;
                    indexArrayAcc--;
                    numOfAcc--;
                    accountRemoved = true;
                }
                break;
                case 'O' : if ( accounts[i] instanceof OverDraftProtection) {
                    accounts[i] = null;
                    indexArrayAcc--;
                    numOfAcc--;
                    accountRemoved = true;
                }
                break;
                case 'I' : if ( accounts[i] instanceof Investment) {
                    accounts[i] = null;
                    indexArrayAcc--;
                    numOfAcc--;
                    accountRemoved = true;
                }
                break;
            }
            
            if (accounts[i] == null && accountRemoved) {
                if ( i != 3) {
                    a = accounts[i];
                    accounts[i] = accounts [i+1];
                    accounts [i+1] = a;
                }
            }
        }
        return accountRemoved;
    }
    
     public void printAllAccounts() {
        for (Account a : accounts) {
            if (a!=null)
                System.out.println(a);
        }
    }
}