package com.gl.javafsd.banking;

import java.util.Scanner;

public class BankingUI {

	public void build() {
	
		Customer david = new Customer();
		david.setBankAccountNo(121212);
		david.setPassword("dave");
		
		System.out.println("Welcome to Indian Bank");
		System.out.println("******************************");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter your bank account no:");
		int bankAccountNo = Integer.parseInt(userInput.nextLine());
				
		System.out.println("Enter the password: ");
		String password = userInput.nextLine();
		
		if (bankAccountNo == david.getBankAccountNo() &&
			password.equals(david.getPassword())) {

			BankOperations bankOperations = new BankOperations();

			int userSelectedOption = -1;

				//do
			
				do {
					System.out.println("1. Deposit");
					System.out.println("2. Withdraw");
					System.out.println("3. Transfer");
					System.out.println("4. Logout");
					
					System.out.println("Enter option (1/2/3/4): ");				
					userSelectedOption = userInput.nextInt();
	
					
					if (userSelectedOption == 1) {
						
						bankOperations.deposit();
						
					}else if (userSelectedOption == 2) {
						
						bankOperations.withdraw();
						
					}else if (userSelectedOption == 3) {
						
						bankOperations.transfer();
										
					}else if (userSelectedOption == 4) {
						
						bankOperations.logout();
						
						userInput.close();
						System.exit(0);
					}else {
						
						System.out.println("Incorrect Option.");
					}
				} while (userSelectedOption != 4);
								
			}else {
				
				System.out.println("Invalid credentials. Please try again.");
			}	
		
	}
	
	public static void main(String[] args) {
		
		BankingUI bankingUI = new BankingUI();		
		bankingUI.build();
	}
}
