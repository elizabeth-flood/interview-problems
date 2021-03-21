import java.util.*;

/**
 * 
 * Problem: Given two strings, write a method to decide if one is a permutation
 * of other.
 *
 * Solution: clarify case sensitive and whitespace
 *
 */
public class CheckPermutation {
	
	public boolean checkPermuationMap(String a, String b) {
		if (a.length() != b.length()) {
       			return false;
      		}
		// asci , sums? no these could differ
		// hash map, store the count of the values O
		// sort each of them, and walk through = O(nlogn) + O(nlogn) + O(n) = O(n), O(a) aSortedArray + O(b) bSortedArray
		// some weird ass bitmanipulation.... really need to study
		Map<Character, Integer> aMap = new HashMap<>();
		for (int i = 0; i<a.length(); i++) {
			Character currentChar = new Character(a.charAt(i));
			Integer currentCount = aMap.getOrDefault(currentChar, 0);
			aMap.put(currentChar, currentCount++);
		}
		
		for (int i = 0; i< b.length(); i++) {
			Character currentChar = new Character(b.charAt(i));
			Integer currentCount = aMap.get(currentChar);
			if (currentCount == null) {
				return false;
			} if (currentCount > 1) {
				aMap.put(currentChar, currentCount--);
			} else {
				aMap.remove(currentChar);
			}
		}
		
		return aMap.size() == 0;
	}
	
	public String convertSort(String value) {
		char[] valueArray = value.toCharArray();
		Arrays.sort(valueArray); // has a return of void
		return new String(valueArray);
	}
	
	public boolean checkPermuationSort(String a, String b) {
		return convertSort(a).equals(convertSort(b));
	}

	public static void main (String[] args) {
		CheckPermutation cp = new CheckPermutation();
		String[] passingPair = {"abc", "cab"};
		String[] failingPair = {"hsc", "cab"};	
		System.out.println(cp.checkPermuationSort(passingPair[0], passingPair[1]));
		System.out.println(cp.checkPermuationSort(failingPair[0], failingPair[1]));
	}
}

// Google
// how to initialize String[]? => {"",""}
// how to add to map
// how to remove from map
// equals in a string
// Arrays.sort
// char[] toCharArray()
// sort does not return


// overall succedded but overlooked corner cases
// build count... MANY
