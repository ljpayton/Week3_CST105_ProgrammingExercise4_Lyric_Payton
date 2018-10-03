/** Program: Programming Exercise 4

* File: ProgrammingExercise4.java 
* Summary: This program translates words into PigLatin words.

* Author: Lyric Payton

* Date: September 19, 2018

**/


import java.util.Scanner;

public class ProgrammingExercise4 {

	public static void main(String[] args) throws FileNotFoundException  {
		char[][] arr = new char[20][45];
		File f = new File("./src/input.txt");
		Scanner file = new Scanner(f);

		for (int r = 0; r < 20; r++) 
		{
			for(int c = 0; c < 45; c++) 
			{
				arr [r][c] = '@';
			}
		}
		
		int r = 0;
		int c = 0;
		while (file.hasNextLine()) 
		{
			String str = file.nextLine();
			for(char letter : str.toCharArray()) 
			{
				arr [r][c] = letter;
				if (c < 44)
				{
					c++;
				}// starts array over 
				else 
				{
					r++;
					c = 0;
				}
				if (r == 20) 
				{
					break;
				}
			}
			if (r == 20) 
			{
				break;
			}
		}
		
		
		String newString = "";
		
		for ( int i = 0; i < 45; i++)
		{
			for (int j = 0; j < 20; j++) 
			{
				newString += arr [j][i];
			}
		}
		System.out.println(newString);
	}

}
