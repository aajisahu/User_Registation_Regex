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
			System.out.println("Enter 3 : to validate E-mail ");
			System.out.println("Enter 4 : to validate Moblie Number ");
			System.out.println("Enter 5 : to validate Password Rule 1 ");
			System.out.println("Enter 6 : to validate Password Rule 2 (Upper Case)");
			System.out.println("Enter 7 : to validate Password Rule 3 (Upper Case & one numeric number)");
			System.out.println("Enter 8 : to validate Password Rule 3 (Upper Case , one numeric number & one special character)");
			System.out.println("Enter 9 : to validate a Simple Gmail Address");
			switch (scanner.nextInt()){
			case 0:			
				System.exit(0);

			case 1:
				UserRegistration.validFirstName();
				break;


			case 2:
				UserRegistration.validLastName();
				break;
			case 3:
				UserRegistration.valideMail();
				break;

			case 4:
				UserRegistration.validMobileNumber();
				break;

			case 5:
				UserRegistration.validPassRule1();
				break;
			case 6:
				UserRegistration.validPassRule2();
				break;
			case 7:
				UserRegistration.validPassRule3();
				break;

			case 8:
				UserRegistration.validPassRule4();
				break;
			case 9:
				UserRegistration.emailSamples();
				break;
				
				

			default:
				System.out.println("Select a valid number");

			}

		}
	}
}