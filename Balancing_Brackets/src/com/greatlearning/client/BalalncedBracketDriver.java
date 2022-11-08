package com.greatlearning.client;

import com.greatlearning.service.BalalncedBrackets;

public class BalalncedBracketDriver {

	public static void main(String[] args) {
		String str1 = "([[{}]])";
		String str2 = "([[{}]]))";
		BalalncedBrackets b = new BalalncedBrackets();
		boolean result = b.isbalanced(str1);
		System.out.println("INPUT\n" + str1 + "\n" + "OUTPUT");
		if (result == true) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		System.out.println();
		boolean status = b.isbalanced(str2);
		System.out.println("INPUT\n" + str2 + "\n" + "OUTPUT");
		if (status == true) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

}
