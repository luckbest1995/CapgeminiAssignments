package com.capgemini.springproject.spring;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = null;

		System.out.println("Enter the sentence");
		sentence = scanner.nextLine();

		reverseSentace(sentence);

		scanner.close();

	}

	private static void reverseSentace(String sentence) {

		sentence = sentence + " ";

		ArrayList<String> wordsList = new ArrayList<String>();
		char alphabet[] = sentence.toCharArray();
		String word = "";
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] != ' ') {
				word = word + alphabet[i];
			} else {
				wordsList.add(word);
				word = "";
			}
		}
		int num = 0;
		char revWord[];
		for (String sabd : wordsList) {
			if (num % 2 == 0) {
				String rWord = "";
				revWord = sabd.toCharArray();
				for (int i = revWord.length - 1; i >= 0; i--) {
					rWord = rWord + revWord[i];
				}
				sabd = rWord;
			}
			System.out.print(sabd + " ");
			num++;
		}
	}
}
