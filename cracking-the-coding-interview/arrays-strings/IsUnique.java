import java.util.*;

/**
 * 
 * Problem: Implement an algorithm to determine if a string has all unique
 * characters. No extra data structure.
 *
 */
public class IsUnique {

	/*
	Brainstorming:
	- [fail] Asci won't work as the added up value of the string will not actually tell if all are unique
	- we can keep a set to see if the letter has been seen
	- hashtable similar to a set
	- we can keep a boolean array of 250 length and toggle true/false if it has been seen before
	- [fail] bitwise manipulation, oh wait but the clue say bit vector
	- clue also recommend nlog(n). Random thought, 1 < log(n) < nlog(n) < n < n^2

	-- Approach Set. This will be O(n) which is larger than O(128) assuming asci characters
	*/
	public boolean isUniqueSet(String input) {
		// corner cases - empty string array
		Set<Character> seenItems  = new HashSet<>();
		// O(n)
		// GOOGLE: How to convert string to char array java			
        char[] ch = input.toCharArray();
		for (char letter : ch) {
			//O(1)
			if (seenItems.contains(letter)) {
				return false;
			}
			// O(1)
			seenItems.add(letter);
		}
		return true;
	}

	/*
	Looked at Solution trying with boolean Array:
	- we can keep a boolean array of 128 length and toggle true/false if it has been seen before
	- pro this is a concrete size of data

	-- CORRECTION after looking at solution. It it wasting space and time to do toCharArray. You can just do an inplace charAt()
	*/
	public boolean isUniqueBooleanArray(String input) {
		boolean[] seenItems  = new boolean[128];
		// O(n)
		for (char letter : input.toCharArray()) {
			// GOOGLE: How to get an asci value from a char java -> You just cast it  int ascii = (int) character		
			if (seenItems[letter]) {
				return false;
			}
			// O(1)
			seenItems[letter] = true;
		}
		return true;
	}

	/*
	Looked at Solution trying with boolean Array:
	- [fail] bitwise manipulation, oh wait but the clue say bit vector
	@todo after doing bitwise manipulation, go back to this one
	*/
	public boolean isUniqueBitwise(String input) {
		return true;
	}

	/*
	Looked at Solution trying with sorting
	- I feel dumb for not getting this, but this is a good example of thinking out of the box, doesn't have to be 100% optimal
	- O(n^2)
	*/
	public boolean isUniqueNoDataStructure(String input) {
		char[] inputArray = input.toCharArray();
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j] && i != j) {
					return false;
				}
			}
		}
		return true;
	}

	/*
	Looked at Solution trying with sorting
	- clue also recommend nlog(n). Random thought, 1 < log(n) < nlog(n) < n < n^2
	*/
	public boolean isUniquenlogn(String input) {
		// GOOGLE: string size method DIFFERENT THAN ARRAY WUT
		if (input.length() < 1) return true;
        char[] ch = input.toCharArray();
		// GOOGLE: java array sort
        Arrays.sort(ch);
		char previousValue = ch[0];
		for (int i  = 1 ; i < input.length(); i++) {
			if (previousValue == ch[i]) {
				return false;
			}
			previousValue = ch[i];
		}
		return true;
	}
	
	public static void main (String[] args) {
		IsUnique iu = new IsUnique();
		String passInput = "aluniqe";
		String failInput = "allunique";
	    
		System.out.println(iu.isUniquenlogn(passInput));
		System.out.println(iu.isUniquenlogn(failInput));
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
