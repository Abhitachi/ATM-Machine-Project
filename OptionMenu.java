package oopproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'  ###,##0.00");
	int selection;
	
	HashMap<Integer,Integer>data = new HashMap<Integer,Integer>();
	
	public void getLogin() {
		int x = 1;
		
		do {
			try {
				data.put(9876543, 1889);
				data.put(3456789, 9881);
				System.out.println("Welcome to ATM Project ");
				System.out.println("Enter your Customer Number ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your Pin Number");
				setPinNumber(menuInput.nextInt());
			}catch(Exception e) {
				System.out.println("\n"+"Invalid Character(s).  Only Numbers."+"\n" );
				x=2;
			}for(Map.Entry<Integer,Integer>entry : data.entrySet()) {
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println(" Wrong CustomerNumber and PinNumber");
		}while(x==1);
	}
	

	private void getAccountType() {
		// TODO Auto-generated method stub
		System.out.println("Select Acccount you want To Acess : ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice: ");
		
		
		 selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
		
		case 2:
			getSaving();
			
		case 3:
			System.out.println("Thank You For Using ATM...");
			break;
		default:
			System.out.println("Invalid choice. try again ");
			getAccountType();
			selection = menuInput.nextInt();
		}
	}


	private void getSaving() {
		// TODO Auto-generated method stub
		System.out.println("Select Acccount you want To Acess : ");
	  	System.out.println("Type 1 - View Balance");
	    System.out.println("Type 2 - Withdraw fund");
	  	System.out.println("Type 3 - Deposit fund");
	    System.out.println("Type 4 - Exit");
	  	System.out.println("Choice: ");
	  	   
	    selection = menuInput.nextInt();
	    
	    switch(selection) {
	    case 1:
	    	System.out.println("checking your Account balance "+moneyFormat.format(getSavingBalance()));
	    	getAccountType();
	    	break;
	    	
	    case 2:
	    	getSavingwithdrawInput();
	    	getAccountType();
	    	
	    case 3:
	    	getSavingDepositInput();
	    	getAccountType();
	    	break;
	    	
	    case 4:
	    	System.out.println("Thank you for using ATM");
	    	break;
	    	
	    default:
	    	System.out.println("Invalid choice");
	    	getSaving();
	    	
	    }
	}


	private void getChecking() {
		// TODO Auto-generated method stub
	   System.out.println("Select Acccount you want To Acess : ");
  	   System.out.println("Type 1 - View Balance");
  	   System.out.println("Type 2 - Withdraw fund");
  	   System.out.println("Type 3 - Deposit fund");
  	   System.out.println("Type 4 - Exit");
  	   System.out.println("Choice: ");
  	   
  	   selection = menuInput.nextInt();
  	   
  	   switch(selection) {
  	   case 1:
  		   System.out.println("Checking your Account Balance"+moneyFormat.format(getcheckingBalance()));
  		   getAccountType();
  		   break;
  		   
  	   case 2:
  		   getCheckingWithdrawInput();
  		   getAccountType();
  		   break;
  		   
  	   case 3:
  		   getCheckingDepositInput();
  		   getAccountType();
  		   break;
  		   
  	   case 4:
  		   System.out.println("thank you for using ATM.");
  		   break;
  		   
  	   default:
  		   System.out.println("Invalid Choice");
  		   getChecking();
  	   }
	}


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

