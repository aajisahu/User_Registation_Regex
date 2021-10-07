package com.regex;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void welcome() {
		System.out.println("Welcome to user registation");
	}

	public static void main(String[] args) {
		welcome();
		UserRegistration user=new UserRegistration();
		while(true) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 0 : Exit");
			System.out.println("Enter 1 : to validate First Name ");
			System.out.println("Enter 2 : to validate Last Name ");
			
			switch (scanner.nextInt()){
			case 0:			
				System.exit(0);
			
			case 1:
				UserRegistration.validFirstName();
				break;


			case 2:
				UserRegistration.validLastName();
				break;
			
					
			
			
			
			
			}

		}
	}
}