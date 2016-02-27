/**
 * Deskripsi kelas Account:
 * 1. Kelas Account merupakan kelas yang berisi informasi AKUN milik customer
 * 
 * @author Suci Salimah Giani
 * @NPM 1306368444
 * @version 24 Februari 2016
 * updated 27 Februari 2016
 */

public class Account
{ //mendeklarasikan variabel yang ada pada kelas Account
    private char acctType;
    public double balance;
    private String id;
   
    public Account() //kerangka Account
    {
        
    }

    public Account (char type, double amount)
    {
      
    }
   
    public double deposit(double amount) //saya mengatur deposit menjadi public
    {
        if (amount >= 0) { // Jika nilai positif
            System.out.println ("true");} //sistem akan memberikan nilai TRUE
        
        else if (amount < 0) { //Jika nilai negatif
            System.out.println ("false");} //sistem akan memberikan nilai FALSE
            balance = balance + amount; //menambahkan ang dari balance
            return balance;
    }
    //Untuk semua method accessor, saya mengatur agar return ke variabel yang bersangkutan
    public char getAcctType()
    {
        return acctType;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public String getId()
    {
        return id; //return ke variabel yang bersangkutan, yakni ID
    }
    //Untuk semua method mutator, saya meng-assign semua argumen
    public void setBalance (double amount)
    {
        balance = amount; //memasukkan saldo
    }
    
    public void setID (String acctId)
    {
        id = acctId; //mengatur ID akun
    }
    
    public void setAcctType(char type)
    {
        acctType = type;//memasukkan tipe akun yang diinginkan
    }
    
    public double withdraw (double amount) //untuk melakukan penarikan saldo
    {
        if (amount >= 0) { //Jika jumlahnya positif
            System.out.println ("true");} //sistem akan memberikan nilai TRUE
            
        else if (amount < 0) { //Jika jumlahnya negatif
            System.out.println ("false");} //sistem akan memberikan nilai FALSE
            balance = balance - amount; //mengurangi balance dengan jumlah amount, san memasukkannya ke balance
            return balance;
    }
}