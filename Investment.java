import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * Class Investment (Extend dari class Savings)
 * Tujuan:
 * 1. Untuk membuat akun yang mempu melakukan penyimpanan jangka panjang
 * 
 * @author Suci Salimah Giani
 * @version 27th of March 2016
 */
public final class Investment extends Savings
{
    // instance variables - replace the example below with your own
    private Date endDate;
    private double interestRate;
    private Date startDate;
    private int term;

    /**
     * Constructor for objects of class Investment
     */
    public Investment(Customer cust, double amount, int term)
    {
        super(cust, amount);
        this.term = term;
        int localTerm;
        Calendar cal = new GregorianCalendar();
        startDate = cal.getTime();
        if (term < 6) {
            localTerm = 6;
        } else {
            localTerm = term;
        }
        cal.add(Calendar.MONTH, localTerm);
        endDate = cal.getTime();

        if (term <= 6) {
            interestRate = 0.05;
        } else if (term > 6 && term <=12) {
            interestRate = 0.06;
        } else {
            interestRate = 0.07;
        }
    }

    /**
     * Metode addDailyInterest berfungsi untuk menghitung bunga total 
     * yang didapat sesuai dengan banyaknya hari
     * @param  days sebagai banyaknya hari
     */
    public void addDailyInterest(int days)
    {
        double A, period;
        period = (double)days / 365;
        A = futureValue(balance, interestRate, 360, period);
        interestEarned = A - balance;
        balance = A;
    }
    
    /**
     * Method withdraw digunakan untuk mengambil sejumlah uang dari suatu akun 
     * @param amount sebagai jumlah nilai uang yang diambil
     */
    public boolean withdraw(double amount) {
        
        if (balance - amount >= 100) {
            if (Calendar.getInstance().before(endDate)) {
                if ( (balance * 0.8) - amount >= 100 ) {
                    balance *= 0.8;
                    balance -= amount;
                    return true;
                } else {
                    return false;
                }
                
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
}