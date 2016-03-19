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
 */

public class Account
{ //mendeklarasikan variabel yang ada pada kelas Account
    private char acctType;
    public double balance;
    private String id;
   
    public Account(Customer customer,double amount,char tipe) //kerangka Account
    {
       acctType = tipe;
       balance = amount;
       id = customer.getCustId()+" "+ tipe;
    }

    public Account (char type, double amount)
    {
      acctType = type;
      balance = amount;
    }
    
    public String toString()
    {
      System.out.println("Account type = "+acctType);
      System.out.println("ID = "+id);
      System.out.println("Balance = "+balance);
      return "";  
    }
   
    public boolean deposit(double amount) //saya mengatur deposit menjadi public
    {
        if (amount < 0) { /*jika deposit customer kurang dari 0 atau bernilai negatif*/
            return false;
    }
        else {
            balance = balance+amount; /*menambah uang pada deposit customer*/
            return true;
        }  
    }
    //Untuk semua method accessor, saya mengatur agar return ke variabel yang bersangkutan
       /**
       * Method accessor untuk mendapatkan tipe akun customer
       * @return tipe dari akun
       */
    
    public char getAcctType()
    {
        return acctType;
    }
    
    /**
       * Method accessor untuk mendapatkan nilai balance
       * @return nilai balance
       */
    public double getBalance()
    {
        return balance;
    }
    
    /**
       * Method accessor untuk mendapatkan id customer
       * @return id customer
       */
    public String getId()
    {
        return id; //return ke variabel yang bersangkutan, yakni ID
    }
    
    //Untuk semua method mutator, saya meng-assign semua argumen
    
    /**
       * Method mutator untuk memasukkan saldo customer
       * @param amount nilai deposit customer
       */
    public void setBalance (double amount)
    {
        this.balance = amount; //memasukkan saldo
    }
    
    /**
     * method mutator untuk memasukkan ID customer
     * @param acctId ID dari akun 
     */
    /*public void setID (String acctId)
    {
        id = acctId; //mengatur ID akun
    }*/
    
    /**
     * method mutator untuk memasukkan tipe akun customer
     * @param type tipe akun
     */
    public void setAcctType(char type)
    {
        this.acctType = type;//memasukkan tipe akun yang diinginkan
    }
    
    public boolean withdraw (double amount) //untuk melakukan penarikan saldo
    {
        if (balance - amount < 0) { //Jika jumlahnya negatif
            return false;} //sistem akan kembali ke nilai FALSE
            
        else { //Jika jumlahnya positif
            balance = balance - amount; //mengurangi balance dengan jumlah amount, san memasukkannya ke balance
            return true;
    }
}
}