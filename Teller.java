/**
 * Deskripsi kelas Teller:
 * 1. Kelas Teller merupakan titik awal dari semua class yang ada pada program JBank
 * 2. Semua kelas yang ada pada program JBank berawal dari kelas Teller
 * 3. Kelas Teller memiliki method main, sebagai prgram utama.
 * 
 * @author Suci Salimah Giani
 * @NPM 1306368444
 * @version 27 Februari 2016
 * UPDATED 5th of March 2016
 */

import java.util.Scanner;

public class Teller
{
    private Customer c1 = new Customer(); //membuat object customer c1
    private Account a1 = new Account(); //membuat objek akun a1
    private Account acc;
    private int balance;
    private String fullname;
    
    /**
     * method main
     * membuat object tipe akun tertentu
     * membuat object customer beserta data diri
     */
    public void main(String args[]) //saya mengatur class main tidak dalam static karena variabel c1 merupakan variabel non-sttatic
    {/*
        c1.setName("Sutandi", "Sanadhi"); //mengatur nama c1 dengan nilai "Sanadhi" dan "Sutandi"
        System.out.println(c1.getName()); //mencetak nama customer
        
        a1.setBalance (30000); //mengatur jumlah saldo yang ada pada akun a1
        c1.setAccount(a1); //memberikan akun a1 ke customer c1
        
        acc = c1.getAccount(); //mengakses akun a1 milik c1, diakses melalui c1
        balance = acc.getBalance(); //mengetahui jumlah saldo akun
        
        System.out.println(balance); //mencetak saldo a1 milik c1, dengan akses melalui c1
    */
       
       Scanner input = new Scanner(System.in);//untuk scan input user
       String fname, lname, dob, no_tlp, answer;
       
        //mulai pendataan new customer
        System.out.println("Welcome to JBank! Wanna join our team? ('yes'/'no') ");
        answer = input.nextLine();//scan input
        if (!answer.equals("yes"))//apabila jawaban yes
        {
            System.exit(0);;
        }
        
         //selama jawaban yes melakukan hal berikut   
        do {
            System.out.print("First Name: ");
            fname = input.nextLine();
            System.out.print("Last Name: ");
            lname = input.nextLine();
            System.out.print("Date of Birth: ");
            dob = input.nextLine();
            System.out.print("Contact Number: ");
            no_tlp = input.nextLine();
            
            c1.setName(fname,lname);//set customer name
            c1.setPhoneNumber(no_tlp);//set nomor telepon cutomer
            c1.setDateOfBirth(dob);//set tanggal lahir customer
            int custId = new Bank().getNextID(); //set ID
            c1.setCustID(custId);
            String ID = Integer.toString(custId);
            System.out.println("Which type of account you'd love to apply for? (S,O,I,C)");
            Scanner reader = new Scanner(System.in);
            char acct_Type = reader.next().trim().charAt(0); //baca input tipe char user
            System.out.print("Input your balance: ");
             if (acct_Type == 'S')
             {//apabila tipe akun savings
                balance = input.nextInt();
                a1 = new Account('S', balance);
                while (balance < 50)
                {
                    System.out.println("Sorry, the minimum balance is 50$");
                    balance = input.nextInt();
                    a1 = new Account('S', balance);
                }
             }
            
            else if (acct_Type == 'O') 
            {//apabila tipe akun Overdraft
                balance = input.nextInt();
                a1 = new Account('O', balance);
                while (balance <= 0)
                {
                     System.out.println("Sorry, please try again");
                     balance = input.nextInt();
                     a1 = new Account('O', balance);
                }
            }
            
            else if (acct_Type == 'C')
            {//apabila tipe akun credit
                balance = input.nextInt();
                a1 = new Account('C', balance);
                while (balance <= 0)
                {
                     System.out.println("Sorry, please try again");
                     balance = input.nextInt();
                     a1 = new Account('C', balance);
                }
            }
            
            else if (acct_Type == 'I') 
                {//apabila tipe akun Investment
                balance = input.nextInt();
                a1 = new Account('C', balance);
                while (balance < 100) 
                {
                    System.out.println("Sorry, the minimum balance is 100$");
                    balance = input.nextInt();
                    a1 = new Account('I', balance);
                }
            }
           //print semua informasi yang sudah di input user
            System.out.println("Nama = \t\t:"+c1.getName());
            System.out.println("Customer ID = \t:"+c1.getCustId());
            System.out.println("No telepon = \t:"+c1.getPhoneNumber());
            System.out.println("Saldo = \t:"+a1.getBalance());
            System.out.println("Tipe Akun \t:"+a1.getAcctType());
              
        } while (!answer.equals("no"));
    }

    public Teller ()
    {
        //memasukkan fungsi teller
    }
}