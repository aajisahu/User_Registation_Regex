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



			}

		}
	}
}