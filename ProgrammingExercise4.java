/** Program: Programming Exercise 4

* File: ProgrammingExercise4.java 
* Summary: This program translates words into PigLatin words.

* Author: Lyric Payton

* Date: September 19, 2018

**/


import java.util.Scanner;

public class ProgrammingExercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three words separated by spaces: ");
		String message = input.nextLine ();
		String[] words = message.split(" ");
		String[] pigWords = new String[words.length];
		
		
		for(int i = 0; i < words.length; i++) {
			String s = words[i].toUpperCase();
			if (s.length() <= 3) {
				s += "WAY";
			}
			else
			{
				char temp = s.charAt(0);
				s = s.substring(1, s.length());
				s += temp;
				if (temp == 'A'|| temp == 'E'|| temp == 'I'|| temp == 'O'|| temp == 'U') {
					s += "WAY";
				} else {
					s += "AY";
				}
			}
			pigWords[i] = s;
		}
		
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i] + "\t\t" + pigWords[i]);
		}
	}

}
