/**
 * Deskripsi kelas Account:
 * 1. Kelas Account merupakan kelas yang berisi informasi AKUN milik customer
 * 
 * @author Suci Salimah Giani
 * @NPM 1306368444
 * @version 24 Februari 2016
 * updated 27 Februari 2016
 * updated 3 Maret 2016
 */

public class Account
{ //mendeklarasikan variabel yang ada pada kelas Account
    private char acctType;
    public double balance;
    private String id;
   
    public Account() //kerangka Account
    {
       acctType = 'S';
       balance = 10.00;
    }

    public Account (char type, double amount)
    {
    
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