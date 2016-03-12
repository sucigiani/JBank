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
 * UPDATED 12th of March 2016
 */

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;
import java.io.*;
import java.lang.Math;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
import java.util.*;


public class Teller
{
    /**
     * Main Method di kelas Teller, program main berjalan disini
     * @param args tidak digunakan
     */
    private static MathContext mc = new MathContext(3);
    
    private Customer c1 = new Customer(); //membuat object customer c1
    private Account a1 = new Account(); //membuat objek akun a1
    private Account acc;
    private int balance;
    private String fullname;
    private String firstName, lastName;
    public Date date;
    private Date startTime, closeTime;
    public static Date stm, ctm;
    
    int year;
    int month;
    int day;
    String namadepan;
    String namabelakang;
    GregorianCalendar gcalendar = new GregorianCalendar();
    
    /**
     * method main
     * membuat object tipe akun tertentu
     * membuat object customer beserta data diri
     */
  
    public void main(String args[]) throws ParseException//saya mengatur class main tidak dalam static karena variabel c1 merupakan variabel non-sttatic
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
      
       Date d1, d2;
       d1 = new GregorianCalendar (2016, 3, 10, 8, 0).getTime();
       d2 = new GregorianCalendar (2016, 3, 10, 15, 30).getTime();
       System.out.println(d1 + "to" + d2);
       int year = GregorianCalendar.YEAR;
       int month = GregorianCalendar.MONTH;
       int day = GregorianCalendar.DAY_OF_MONTH;
       Customer c1 = new Customer (firstName, lastName, (new GregorianCalendar (year, month, day).getTime()));
       
       /**Menghitung interest rate*/
       Account saving = new Account ('S', 1000);
       Account invest = new Account ('I', 1000);
       Account creditline = new Account ('C', 500);
       BigDecimal saldoS = new BigDecimal (saving.getBalance());
       BigDecimal saldoI = new BigDecimal (invest.getBalance());
       BigDecimal saldoL = new BigDecimal (creditline.getBalance());
       BigDecimal rS = new BigDecimal (.03); //menghitung bunga 3% per hari
       BigDecimal rI = new BigDecimal (.07);
       BigDecimal rL = new BigDecimal (.18);
       BigDecimal n = new BigDecimal (360); 
       BigDecimal t = new BigDecimal (1.0); //menghitung rate tahunan
        
       BigDecimal f1Saving = rS.divide(n, mc).add(new BigDecimal(1.0));
       BigDecimal f1Investement = rI.divide(n, mc).add(new BigDecimal(1.0));
       BigDecimal f1Credit = rL.divide(n, mc).add(new BigDecimal(1.0));
       BigDecimal f2 = n.multiply(t, mc);
        
       BigDecimal f3Saving = new BigDecimal (Math.pow(f1Saving.doubleValue(), f2.doubleValue()),mc);
       BigDecimal f3Investement = new BigDecimal (Math.pow(f1Investement.doubleValue(), f2.doubleValue()),mc);
       BigDecimal f3Credit = new BigDecimal (Math.pow(f1Credit.doubleValue(), f2.doubleValue()),mc);
        
       BigDecimal f4Saving = f3Saving.multiply(saldoS, mc);
       BigDecimal f4Investement = f3Investement.multiply(saldoI, mc);
       BigDecimal f4Credit = f3Credit.multiply(saldoI, mc);
     
       System.out.println("Saldo Saving : " +saving.getBalance());
       System.out.println("Saldo Investment : "+invest.getBalance());        
       System.out.println("Saldo Saving : " +f4Saving.doubleValue());
       System.out.println("Saldo Investment : " +f4Investement.doubleValue());
       System.out.println("Saldo Credit : " +f4Credit.doubleValue());
       
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
            System.out.println("Date of Birth: ");
            dob = input.nextLine();
            String expectedPattern = ("yyyy-MM-dd");
            String tgl = input.nextLine();
            SimpleDateFormat dateOfBirth = new SimpleDateFormat ("yyyy-MM-dd");
            Date date = dateOfBirth.parse (tgl);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            c1.setDateOfBirth(date);
            System.out.print("Contact Number: ");
            no_tlp = input.nextLine();
            
            
            c1.setName(fname,lname);//set customer name
            c1.setPhoneNumber(no_tlp);//set nomor telepon cutomer
            
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
       
    public static Date getCloseTime() 
      {
        return ctm;
      }
    
    public static Date getStartTime() 
      {
        return stm;
      }
    
    public static void setCloseTime(int year,int month,int day,int hour, int min) 
      {
        stm = new GregorianCalendar(year, month, day, hour, min).getTime();
      }
    
    public static void setStartTime(int year,int month,int day,int hour, int min) 
      {
        stm = new GregorianCalendar(year, month, day, hour, min).getTime();
      }
    
    public static void printTime() 
      {
        System.out.println(Bank.getHoursOfOperation());
      }
    

    public Teller ()
      {
        //memasukkan fungsi teller
      }
}