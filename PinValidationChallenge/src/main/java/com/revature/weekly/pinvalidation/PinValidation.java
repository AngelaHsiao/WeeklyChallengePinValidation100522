package com.revature.weekly.pinvalidation;

import java.util.Scanner;

public class PinValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pin for validation: ");
		String pin = sc.next();
		System.out.println("Validation: "+validate(pin));
	}

	public static boolean validate(String pin) {
		/*A valid PIN has:
	
			-Exactly 4 or 6 characters.
				
			-Only numeric characters (0-9).
				
			-No whitespace.*/
		
		boolean isValid = true;
		int l = pin.length();
		if (l==4||l==6) {
			for (int i = 0;i<l;i++) {
				if (pin.charAt(i)>='0'&& pin.charAt(i)<='9') {
					
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
		
		return isValid;
	}
}
