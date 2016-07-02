/** Program:  6.12 Display Characters
  * File:     displayCharacters.java 
  * Summary:  displays ten characters per line seperated by one space.
  * Author:   Eric Roberts
  * Date:     July 2, 2016
**/
public class displayCharacters {

	public static void main(String[] args) {
		//assign values
		char ch1 = '1';
		char ch2 = 'Z';
		
		//print chars
		System.out.println("Characters per 1 to Z");
		printChars('1', 'Z', 10);
		

	}
     public static void printChars(char ch1, char ch2, int numberPerLine) {
		for (char i = ch1, count = 1; i <= ch2; i++, count++) {
			if (count % numberPerLine == 0)
				System.out.println("");
			else System.out.println(i + " ");
		} 
		
	}

}
