import java.util.*;
/**
 * 
 * Problem: Implement an algorithm to determine if a string has all unique
 * characters. No extra data structure.
 *
 */
public class IsUnique {
	
	public boolean isUnique(String input) {
		// string to string array to walk through each
		// each char has a value 
		// no extra data structure means do this on the fly
		
		// I don't know how to do with without an extra data structure, lets get something working
		// iterate string as array, add char to a set, check if set is same length as array, O(n + n) data storage, O(n) pass through list once and then one lookup
		
		Set<Character> uniqueItems = new HashSet<>();
		// O(n)
		for (int i = 0; i < input.length(); i++) {
			uniqueItems.add(new Character(input.charAt(i)));
		}
		
		return uniqueItems.size() == input.length(); // O(n)
	}
	
    	public static void main (String[] args) {
		IsUnique iu = new IsUnique();
		String passInput = "aluniqe";
		String failInput = "allunique";
	    
		System.out.println(iu.isUnique(passInput));
		System.out.println(iu.isUnique(failInput));
	}

}

// things I needed to Google:
// string to string array -> split("") 
// how to add to set
// how to format foreach
// how to do equals
// char vs Character
// toCharArray() and its runtime
// charAt
