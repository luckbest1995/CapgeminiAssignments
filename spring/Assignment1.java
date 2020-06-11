package com.capgemini.springproject.spring;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;

		System.out.println("Enter the sentence");
		str = sc.nextLine();

		reverseSen(str);

		sc.close();

	}

	private static void reverseSen(String str) {

		str = str + " ";

		ArrayList<String> wordl= new ArrayList<String>();
		char alphabet[] = str.toCharArray();
		String word = "";
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] != ' ') {
				word = word + alphabet[i];
			} else {
				wordl.add(word);
				word = "";
			}
		}
		int num = 0;
		char revWord[];
		for (String str1 : wordl) {
			if (num % 2 == 1) {
				String rWord = "";
				revWord = str1.toCharArray();
				for (int i = revWord.length - 1; i >= 0; i--) {
					rWord = rWord + revWord[i];
				}
				str1 = rWord;
			}
			System.out.print(str1 + " ");
			num++;
		}
	}
}
