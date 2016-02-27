/**
 * Deskripsi kelas Customer:
 * 1. Kelas Customer berisi data diri customer
 * 
 * @author Suci Salimah Giani 
 * @NPM 1306368444
 * @version v27 Februari 2016
 */

public class Customer
{
    private Account accounts = new Account(); //Membuat variabel bertipe account
    private String name,address,cityAddress,cityName,dateOfBirth,email,firstName,lastName,streetAddress,phoneNumber,zipOrPostalCode; //membuat variabel bertipe string
    private int custId,numberOfCurrentAccounts; //membuat variabel bertipe integer
    
    public Customer(){}
    public Customer(String fname,String lname, String dob){}
    public Customer(String firstName,String lastName, String dateOfBirth, int custId){}
    
    //Saya mengatur semua fungsi dengan memberikan nama dan return ke variabel bersangkutan untuk method accessor
    public String getAddress()
    {
        return streetAddress + cityName + zipOrPostalCode;
    }
    public Account getAccount() //return ke variabel bersangkutan
    {
        return accounts;
    }
    public int getCustomerId() //return ke variabel bersangkutan, method accessor untuk customer ID
    {
        return custId;
    }
    public String getEmail()
    {
        return email;
    }
    public int getNumOfAccounts()
    {
        return numberOfCurrentAccounts;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getName()
    {
        return firstName + ","+lastName;
    }
    //Saya mengatur variabel pada masing-masing fungsi atau assign argumen untuk semua method mutator
    public void setAddress(String street, String city, String zipOrPostalCode) //membuat fungsi Address, dengan variabel string pada keterangan yang sudah saya declare di awal program
    {
       address = street + city + zipOrPostalCode;
    }
    public void setEmail(String emailAddress)
    {
        email = emailAddress;
    }
    public void setName(String firstName, String lastName) 
    {
        name = firstName+lastName;
    }
    public void setPhoneNumber(String phoneNum) 
    {
        phoneNumber = phoneNum;
    }
    public void setAccount(Account accounts )
    {
    this.accounts = accounts;
    }
}