package com.capgemini.springproject.spring;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = null;
		System.out.println("Enter a Sentence");
		sentence = scanner.nextLine();

		findEachWordLength(sentence);

		scanner.close();

	}

	private static void findEachWordLength(String sentence) {
		sentence = sentence + " ";
		char character[] = sentence.toCharArray();
		int count = 0;
		String word = "";
		for (int i = 0; i < character.length; i++) {
			if (character[i] != ' ') {
				count++;
				word = word + character[i];
			} else {
				System.out.print(word + "" + count + " ");
				word = "";
				count = 0;
			}
		}

	}
}
