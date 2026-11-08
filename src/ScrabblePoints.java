import java.util.Scanner;
import java.util.ArrayList; //This is a new class I imported and I am just as scared as you are


/*
Created: November 7th, 2026
Last Edited: November 7th, 2026
Creator: Justin C.

This is a Scrabble Project inspired after playing a game of Scrabble with my friend
And then following, losing on time lol :)

This is also my first public project using git bash to import this project over!
 */


public class ScrabblePoints {
    public static void main(String[] args) {

        String onePoint = "aeilnorstu";
        String twoPoint = "dg";
        String threePoint = "bcmp";
        String fourPoint = "fhvwy";
        String fivePoint = "k";
        String eightPoint = "jx";
        String tenPoint = "qz";
        
        // Creates new dynamic arrays to be able to append to them
        ArrayList<Character> lettersUsed = new ArrayList<>();
        ArrayList<Integer> pointValues = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word played in Scabble: ");

        String scrabbleWord = scan.nextLine().toLowerCase();

        int total = 0;

        for(int charIndex = 0; charIndex < scrabbleWord.length(); charIndex++) { //Goes through each character in the given word
            char eachChar = scrabbleWord.charAt(charIndex);
            
            lettersUsed.add(eachChar);
            
            //Assigns them point values based on the word
            if(onePoint.indexOf(eachChar) != -1) {
                total += 1;
                pointValues.add(1);
            } else if (twoPoint.indexOf(eachChar) != -1) {
                total += 2;
                pointValues.add(2);
            } else if (threePoint.indexOf(eachChar) != -1) {
                total += 3;
                pointValues.add(3);
            } else if (fourPoint.indexOf(eachChar) != -1) {
                total += 4;
                pointValues.add(4);
            } else if (fivePoint.indexOf(eachChar) != -1) {
                total += 5;
                pointValues.add(5);
            } else if (eightPoint.indexOf(eachChar) != -1) {
                total += 8;
                pointValues.add(8);
            } else if (tenPoint.indexOf(eachChar) != -1) {
                total += 10;
                pointValues.add(10);
            } else {
            	lettersUsed.remove(lettersUsed.size() - 1);
                continue;
            }
	        
	    }
        
        System.out.println("================");
        System.out.println("Total point value: " + total);
        System.out.println("");
        System.out.println("Letters Used:");
        
        for (int wordIndex = 0; wordIndex < lettersUsed.size(); wordIndex++) { //Prints them out like a receipt at a checkout
        	
        	System.out.print(lettersUsed.get(wordIndex) + ": ");
        	System.out.println(pointValues.get(wordIndex));
        }
        
        System.out.println("================");
        scan.close();
	}
}