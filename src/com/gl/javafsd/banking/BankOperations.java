package com.gl.javafsd.banking;

import java.util.Scanner;

public class BankOperations {

	Scanner userInput = new Scanner(System.in);
	int balanceAmount = 1000;
	
	public void deposit(){
			
		System.out.println("Enter the amount you want to deposit: ");
		
		int depositAmount = userInput.nextInt();
		
		if (depositAmount > 0) {
			
			int newBalanceAmount = balanceAmount + depositAmount;
			balanceAmount = newBalanceAmount;
			
			System.out.println("Deposit operation is successful");
			System.out.println("Current balance amount is :" + balanceAmount);
			
		}else {
			System.out.println("Deposit amount must be greater than 0");
		}
	}
	
	public void withdraw() {
	
		System.out.println("Enter the amount to be withdrawn: ");
		int withdrawalAmount = userInput.nextInt();
		
		if (withdrawalAmount > 0) {
			
			// Balance amount - 1000
			// Withdrawal amount - 1200 [NOT allowed]
			// Withdrawal amount - 1000 / 900 / 800 [Allowed]
			
			int currentAmount = balanceAmount - withdrawalAmount;
			if (currentAmount >= 0) {
				
				balanceAmount = currentAmount;
				System.out.println("Withdrawal operation is successful.");
				System.out.println("Current balance is :" + balanceAmount);
				
			}else {
				System.out.println("Insufficient funds in your account.");
			}			
		}else {
			System.out.println("Withdrawal amount must be greater than 0");
		}
	}
	
	public void transfer() {
		
		System.out.println("OTP Generation Process");
		
		OTPGenerator generator = new OTPGenerator();
		int otp = generator.generate();
		System.out.println("OTP is: " + otp);
		
		System.out.println("Enter the OTP: ");
		int userEnteredOTP = userInput.nextInt();
		
		if (otp == userEnteredOTP) {
			
			// To which account no
			// How many amount
			
			System.out.println("Enter the target account no: ");
			int targetAccountNo = userInput.nextInt();
			
			System.out.println("Enter the amount to be transferred: ");
			int amountToBeTransferred = userInput.nextInt();
			
			if (amountToBeTransferred > 0) {
				
				int currentAmount = balanceAmount - amountToBeTransferred;
				
				if (currentAmount >=0) {
					
					balanceAmount = currentAmount;
					System.out.println("Amount is transferred to the target account no");
					System.out.println("Current balance amount:" + balanceAmount);
					
				}else {				
					System.out.println("Insufficient funds for transfer operation");
				}				
			}else {
			
				System.out.println("Entered amount must be greater than 0");
			}			
			
		}else {
			
			System.out.println("OTP mismatch. Please enter the correct OTP and try again.");
		}
		
	}
	
	public void logout() {
		
		System.out.println("Thanks for using our banking services.");
		System.out.println("Good Bye");
	}
	
	public static void main(String[] args) {
		
		BankOperations bankOperations = new BankOperations();
		
//		bankOperations.deposit();
//		bankOperations.withdraw();
		
		bankOperations.transfer();
		
	}
	
}
