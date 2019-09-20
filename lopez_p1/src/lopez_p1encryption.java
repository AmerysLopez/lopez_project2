import java.util.Scanner;

public class lopez_p1encryption {
	public static void main(String [] args) {
		
		 Scanner scnr = new Scanner(System.in);
		int digit = 0;
		int digitOne = 0;
		int digitTwo = 0;
		int digitThree = 0;
		int digitFour = 0;

		String fourDigitInteger;

		while (true) {
		 	
			System.out.print ("Please enter a four digit integer: ");
			fourDigitInteger = scnr.next();
			int length = fourDigitInteger.length();
			if (length == 4) {
				for (int i = 0; i<4; i++) {
				digit = Character.digit(fourDigitInteger.charAt(i), 10); 
				if      (i == 0){digitOne = (digit + 7) % 10;}
				else if (i == 1) {digitTwo = (digit + 7) % 10;}
				else if (i == 2) {digitThree = (digit + 7) % 10;}
				else if (i == 3) {digitFour = (digit + 7) % 10;}
				}
			System.out.println( digitThree + "" + digitFour + "" + digitOne + "" + digitTwo + "\n");
			}
			else {System.out.println ("Integer must be four digits long. Please try again\n ");};
}
}
}
