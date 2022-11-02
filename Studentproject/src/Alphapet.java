import java.util.Scanner;////4.	program to check whether a character is an alphabet, digit or special character.#
public class Alphapet {
	

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter any caracter : ");
	        char ch = scanner.next().charAt(0);

	        // Using character class
	        if (Character.isAlphabetic(ch)) {

	            System.out.println(ch + " is a ALPHABET.");

	        } else if (Character.isDigit(ch)) {

	            System.out.println(ch + " is a DIGIT.");

	        } else {

	            System.out.println(ch + " is a SPECIAL CHARACTER.");

	        }
	
	
	}

}
