package oopproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private String name;
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}

	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public double setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
		return checkingBalance;
	}
	
	public double getcheckingBalance() {
		return checkingBalance;
	}
	
	public double setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
		return savingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	public double calSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return  savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("checking your account Balance "+moneyFormat.format(checkingBalance));
		System.out.println("amount you want to withdraw from checking Account");
		double amount = input.nextDouble();
		
		
		if((checkingBalance - amount)>0) {
			calCheckingWithdraw(amount);
			System.out.println("new checking account balance "+moneyFormat.format(amount));
		}
		
		else {
			System.out.println("Balance can not be Negative "+"\n");
		}
	}
	
	public void getSavingwithdrawInput() {
		System.out.println("checking your account Balance "+moneyFormat.format(checkingBalance));
		System.out.println("amount you want to withdraw from saving account");
		double amount = input.nextDouble();
		
		if((savingBalance - amount)>0) {
			calSavingWithdraw(amount);
			System.out.println("new checking account balance "+moneyFormat.format(amount));
		}
		else {
			System.out.println("Balance can not be Negative "+"\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Saving account Balance "+moneyFormat.format(checkingBalance));
		System.out.println("Enter the amount you want to deposit ");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount)>=0) {
			calCheckingDeposit(amount);
			System.out.println("your account balance is "+moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("Balance can not be Negative "+"\n");
		}
		
	}
	
	public void getSavingDepositInput() {
		System.out.println("your saving account balance is "+moneyFormat.format(savingBalance));
		System.out.println("Enter amount you want to deposit");
		double amount = input.nextDouble();
		
		if((savingBalance + amount)>0) {
			calSavingDeposit(amount);
			System.out.println("new Saving Account Balance is"+ moneyFormat.format(amount));
		}else {
			System.out.println("Balance can not be Negative "+"\n");
		}
	}
	
	
	

}
