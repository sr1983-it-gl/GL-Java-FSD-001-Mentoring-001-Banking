package com.gl.javafsd.banking;

public class Customer {

	private int bankAccountNo;
	private String password;
	
	public int getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(int bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void main(String[] args) {
		
		Customer sachin = new Customer();
		
		// Wrong access
		//sachin.bankAccountNo = 12;
		
		sachin.setBankAccountNo(123456);
		sachin.setPassword("my-secret-password");
		
		System.out.println(sachin.getBankAccountNo());
		System.out.println(sachin.getPassword());
		
	}
}
