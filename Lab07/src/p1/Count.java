package p1;

import java.util.Scanner;

public class Count
{
	public static void main (String[] args)
	{
		String phrase; // a string of characters
		int countBlank; // the number of blanks (spaces) in the phrase
		int length; // the length of the phrase
		int countA;
		int countE;
		int countS;
		int countT;
        String another = "y";
		
		Scanner scan = new Scanner(System.in);

		// Print a program header
		System.out.println ();
		System.out.println ("Character Counter");
		System.out.println ();

		// Initialize counts

		while(another.equalsIgnoreCase("y")){
			System.out.print ("Enter a sentence or phrase: ");
			phrase = scan.nextLine();
			length = phrase.length();
			
			countBlank = 0;
			countA = 0;
			countE = 0;
			countS = 0;
			countT = 0;
			
    		for(int counter = 0; counter < length; counter++){
    			switch(phrase.charAt(counter)){
        			case 'a':
        			case 'A':
        				countA++;
        				break;
        			case 'e':
        			case 'E':
        				countE++;
        				break;
        			case 's':
        			case 'S':
        				countS++;
        				break;
        			case 't':
        			case 'T':
        				countT++;
        				break;
        			case ' ':
        				countBlank++;
        				break;
        			default:
        				break;
        			}
    		}
    		System.out.println ();
    		System.out.println ("Number of blank spaces: " + countBlank);
    		System.out.println ("Number of a's: " + countA);
    		System.out.println ("Number of e's: " + countE);
    		System.out.println ("Number of s's: " + countS);
    		System.out.println ("Number of t's: " + countT);
            System.out.print("Restart (y/n)? ");
            another = scan.nextLine();
		}
	}
}
