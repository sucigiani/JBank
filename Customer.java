/**
 * Deskripsi kelas Customer:
 * 1. Kelas Customer berisi data diri customer
 * 
 * @author Suci Salimah Giani 
 * @NPM 1306368444
 * @version 27 Februari 2016
 * UPDATED 3rd of March 2016
 * UPDATED 19th of March 2016
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Customer
{
    public Date dateOfBirth;
    private Account[] accounts = new Account[4]; //Membuat variabel bertipe account
    private String name,address,cityAddress,cityName,email,firstName,lastName,streetAddress,phoneNumber,zipOrPostalCode; //membuat variabel bertipe string
    public int custId,numberOfCurrentAccounts; //membuat variabel bertipe integer
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Date date;    
    
        
    /**
     * constructor object class
     */
     public Customer() 
    {
        
    }
    
    /**
     * method constructor untuk customer
     * @param firstName first name customer
     * @param lastName last name customer
     * @param dateOfBirth date of birth customer
     */
    public Customer(String firstName, String lastName)
    {
      this(firstName,lastName,null);
    }
    
    /**
     * method constructor untuk customer
     * @param firstName first name customer
     * @param lastName last name customer
     * @param dateOfBirth date of birth customer
     * @param custId id customer
     */
    public Customer(String firstName, String lastName, Date dateOfBirth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        custId = Bank.getNextID();
    }
    
    /**
     * method accessor untuk mendapatkan alamat customer
     * @return ke streetAddress, cityName, dan Postal Code milik customer
     */
    public String getAddress()
    {
        return streetAddress+cityName+zipOrPostalCode;
    }
    
    /**
     * method accessor untuk mendapatkan alamat customer
     * @return ke accounts customer
     */
    public Account getAccount(char tipe)
    {
        for (Account type : accounts)
        {
            if (type.getAcctType()==tipe){
                return type;
            }
        }   
        return null;
    }
    
    /**
     * method mutator untuk mengubah ID customer
     * @param id milik customer
     */
    public void setCustId(int id)
    {
        custId = id;
    }    
    
    /**
     * method mutator untuk mengubah jumlah akun customer
     * @param akun milik customer
     */
    /*public void setAccount(Account akun)
    {
      accounts = akun;
    }
    */
    /**
     * method accessor untuk mendapatkan ID customer 
     * @return ke custId untuk nilai id 
     */
    public int getCustId()
    {
        return custId;
    }
    
    /**
     * method accessor untuk mendapatkan email customer
     * @return ke email
     */
    private String getEmail()
    {
        return email;
    }
    
    /**
     * method accessor untuk mendapatkan firstName dan lastName dari customer
     * @return ke full name of customer
     */
    public String getName()
    {
        return lastName + "," + firstName + dateOfBirth;
    }
    
    /**
     * method accessor untuk mendapatkan jumlah akun customer
     * @return ke numberOfCurrentAccounts
     */
    public int getNumOfAccount()
    {
        return numberOfCurrentAccounts;
    }
    
     
    /**
     * method accessor untuk mendapatkan nomor telepon customer
     * @return ke string no telepon
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
     
    /**
     * method mutator untuk mengubah nilai streetAddress, cityName, zipOrPostalCode
     * @param street untuk nama jalan
     * @param city untuk nama kota
     * @param code untuk zip code
     */
    public void setAddress(String street, String city, String code)
    {
        this.streetAddress = street;
        this.cityName = city;
        this.zipOrPostalCode = code;
    }
    
     
    /**
     * method mutator untuk mengubah email customer
     * @return matcher.matches
     */
    public boolean setEmail(String emailAddress)
    {
       this.email = emailAddress;
                
       Pattern pattern = Pattern.compile(EMAIL_PATTERN);//pattern email dari java 
       Matcher matcher = pattern.matcher(emailAddress);//assign pattern email ke matcher
       return matcher.matches(); // validasi email customer
    }
    
     
    /**
     * method mutator untuk mengubah nama lengkap customer
     * @param lname nama belakang
     * @param fname nama depan
     */
    public void setName (String lname, String fname)
    {
        this.lastName = lname;
        this.firstName = fname;
    }
    
     
    /**
     * method mutator untuk mengubah nomor telepon customer
     * @param phoneNum telepon customer
     */
    public void setPhoneNumber(String phoneNum)
    {
        this.phoneNumber = phoneNum;
    }
    
    public void setDateOfBirth(Date dob)
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyy");
    }
    
    public Date getDateOfBirth()
    {
       String dateToStr = DateFormat.getInstance().format(date);
       return dateOfBirth;
    }
    
}