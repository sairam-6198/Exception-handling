package com.techouts.exceptionhandling;
import java.util.Scanner;
class RamAccount{	
		private int rampin=1234;
	
	void atmPin(int pin){
		
		if(pin==rampin){
			System.out.println("check balance      withdrawal");
		} else
			try {
				throw new Exception("unauthorized user");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
	}
	
}
public class Throw {
	public static void main(String args[]){
		RamAccount b=new RamAccount();
		System.out.println("Enter your pin");
		Scanner s=new Scanner(System.in);
		int pin=s.nextInt();
		b.atmPin(pin);
		
	
	}

}
