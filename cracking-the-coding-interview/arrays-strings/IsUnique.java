import java.util.*;

/**
 * 
 * Problem: Implement an algorithm to determine if a string has all unique
 * characters. No extra data structure.
 *
 */
public class IsUnique {
	
	public boolean isUniqueHashSet(String input) {
		// string to string array to walk through each
		// each char has a value 
		// no extra data structure means do this on the fly
		
		// I don't know how to do with without an extra data structure, lets get something working
		// iterate string as array, add char to a set, check if set is same length as array, O(n + n) data storage, O(n) pass through list once and then one lookup
		
		Set<Character> uniqueItems = new HashSet<>();
		// O(n)
		for (int i = 0; i < input.length(); i++) {
			uniqueItems.add(Character.valueOf(input.charAt(i)));
		}
		
		return uniqueItems.size() == input.length(); // O(n)
	}
	
	public boolean isUniqueIntArray(String input) {
		if (input.length() > 128) return false;
		
		boolean[] intArray = new boolean[128]; // default to false
		// O(n)
		for (int i = 0; i < input.length(); i++) {
			if (intArray[input.charAt(i)]) {
				return false;
			}
			intArray[input.charAt(i)] = true;
		}
		
		return true;
	}
	
	public static void main (String[] args) {
		IsUnique iu = new IsUnique();
		String passInput = "aluniqe";
		String failInput = "allunique";
	    
		System.out.println(iu.isUniqueIntArray(passInput));
		System.out.println(iu.isUniqueIntArray(failInput));
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


// After looking at the answer I am FAR from the most optimal
// I could use a boolean array of a set value of 128 assuming ACSI values. this space complexity would decrease from O(n) to O(128 or c)
// I could reduce space by 1/8 by using bit vector (need to look into it more)
// no data scructure just iterate twice, n^2
// do it in nlogn, sort first, but double check what sorting algorithms don't take extra storage. 
