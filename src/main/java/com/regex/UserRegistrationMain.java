package com.regex;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void welcome() {
		System.out.println("Welcome to user registation");
	}

	public static void main(String[] args) {
		welcome();
		UserRegistration user=new UserRegistration();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 : to validate First Name ");
		switch (scanner.nextInt()){
		case 1:
			UserRegistration.validFirstName();
			break;
		}
	}
}