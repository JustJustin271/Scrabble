import java.util.Scanner;
import java.util.ArrayList;

public class ScrabblePoints {
    public static void main(String[] args) {

        String onePoint = "aeilnorstu";
        String twoPoint = "dg";
        String threePoint = "bcmp";
        String fourPoint = "fhvwy";
        String fivePoint = "k";
        String eightPoint = "jx";
        String tenPoint = "qz";
        
        ArrayList<Character> lettersUsed = new ArrayList<>();
        ArrayList<Integer> pointValues = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word played in Scabble: ");

        String scrabbleWord = scan.nextLine().toLowerCase();

        int total = 0;

        for(int charIndex = 0; charIndex < scrabbleWord.length(); charIndex++) {
            char eachChar = scrabbleWord.charAt(charIndex);
            
            lettersUsed.add(eachChar);

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

			/*
            
            total += switch (eachChar) {
	            case 'a', 'e', 'i', 'l', 'n', 'o', 'r', 's', 't', 'u' -> 1;
	            case 'd', 'g' -> 2;
	            case 'b', 'c', 'm', 'p' -> 3;
	            case 'f', 'h', 'v', 'w', 'y' -> 4;
	            case 'k' -> 5;
	            case 'j', 'x' -> 8;
	            case 'q', 'z' -> 10;
	            default -> 0;
            };
            
            */
	        
	    }
        
        System.out.println("================");
        System.out.println("Total point value: " + total);
        System.out.println("");
        System.out.println("Letters Used:");
        
        for (int wordIndex = 0; wordIndex < lettersUsed.size(); wordIndex++) {
        	
        	System.out.print(lettersUsed.get(wordIndex) + ": ");
        	System.out.println(pointValues.get(wordIndex));
        }
        
        System.out.println("================");
        scan.close();
	}
}