/**
 * Deskripsi kelas Teller:
 * 1. Kelas Teller merupakan titik awal dari semua class yang ada pada program JBank
 * 2. Semua kelas yang ada pada program JBank berawal dari kelas Teller
 * 3. Kelas Teller memiliki method main, sebagai prgram utama.
 * 
 * @author Suci Salimah Giani
 * @NPM 1306368444
 * @version 27 Februari 2016
 */
public class Teller
{
    private Customer c1 = new Customer(); //membuat object customer c1
    private Account a1 = new Account(); //membuat objek akun a1
    private Account acc;
    private double balance;
    
    public void main(String args[]) //saya mengatur class main tidak dalam static karena variabel c1 merupakan variabel non-sttatic
    {
        c1.setName("Sutandi", "Sanadhi"); //mengatur nama c1 dengan nilai "Sanadhi" dan "Sutandi"
        System.out.println(c1.getName()); //mencetak nama customer
        
        a1.setBalance (30000); //mengatur jumlah saldo yang ada pada akun a1
        c1.setAccount(a1); //memberikan akun a1 ke customer c1
        
        acc = c1.getAccount(); //mengakses akun a1 milik c1, diakses melalui c1
        balance = acc.getBalance(); //mengetahui jumlah saldo akun
        
        System.out.println(balance); //mencetak saldo a1 milik c1, dengan akses melalui c1
    }

    public Teller ()
    {
        //memasukkan fungsi teller
    }
}