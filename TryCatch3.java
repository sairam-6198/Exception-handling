package com.techouts.exceptionhandling;

public class TryCatch3 {

	public static void main(String[] args) {
		int i=50;
		int j=0;
		int data;
		try
		{
		data=i/j; //may throw exception 
		}
            // handling the exception
		catch(Exception e)
		{
             // resolving the exception in catch block
int z=i/(5);
			System.out.println(z);
		}
	}
}