package com.gl.javafsd.banking;

//import java.lang.Math;

public class OTPGenerator {
	
	public int generate(){
				
		double random = Math.random();
		
		// Random values - 0.5489584958494
		// 				 - 0.8495485495849594
		
		// (0.5489584958494 * 1000) = 5489.584958494
		// Double value
		// Convert integer
		// (int) 5489.584958494 -> 5489
		int otp = (int)(random * 10000);
		
//		System.out.println("Random value is :" + random);
//		System.out.println("OTP is " + otp);
		
		return otp;
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {

			OTPGenerator generator = new OTPGenerator();
			generator.generate();
			
		}
		
	}
}
