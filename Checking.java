/**
 * 
 * Class Checking
 * Extend dari class Account
 * Tujuan:
 * 1. Untuk Memeriksa saldo customer, ketika customer hendak menarik uang dari akun Savings
 *
 * @author Suci Salimah Giani
 * @version 227th of March 2016
 * 
 */

import java.lang.Math;

public abstract class Checking extends Account {
    protected double monthlyFee;
    
    /**
     * Metode abstrak feeAssessment yang digunakan untuk mengecek biaya Checking Account
     */
    protected abstract void feeAssessment();
    
    /**
     * Metode abstrak reseMonthlyFee yang digunakan untuk mengatur ulang biaya bulanan
     */
    public void resetMonthlyFee() {
        monthlyFee = 0;
    }
    
    /**
     * Metode yang digunakan untuk mendapatkan biaya Checking bulanan
     * @return monthlyfee sebagai biaya bulanan
     */
    public double getMonthlyFee() {
        return monthlyFee;
    }
}