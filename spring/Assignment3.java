package com.capgemini.springproject.spring;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = null;

		System.out.println("Enter the Sentence");
		sentence = scanner.nextLine();

		swapOddPlaceWord(sentence);

		scanner.close();

	}

	private static void swapOddPlaceWord(String sentence) {
		sentence = sentence + " ";
		char character[] = sentence.toCharArray(); 
		int space = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if(character[i] == ' ') {
				space++;
			}
		}

		String word[] = new String[space];
		space = 0;
		String temp = "";
		for (int i = 0; i < character.length; i++) {
			if (character[i] != ' ') {
				temp = temp + character[i];
			} else {
				 word[space++] = temp;
				 temp = "";
			}
		}

		for (int i = 0; i < word.length; i++) {
			if(i%2 == 0) {

			}
		}

	}
}
