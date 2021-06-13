

/**
 * 
 * Problem: Given two strings, write a method to decide if one is a permutation
 * of other.
 *
 * Solution: clarify case sensitive and whitespace
 *
 */
public class CheckPermutation {
	/* 
	Brainstorming
	- asci adding is inaccurate but can weed out failures but not worth the work
	- make a set of a and walk through b
	- same same with a hash map
	- nested loop will not work
	- do the dumb 128 character thing again

	FAILED
	- white space, capitalization
	-- look up hints and it told me I can also sort, which I didnt' think of before

	*/
	public boolean checkPermuation(String a, String b) {
		// fail fast
		if (a.length() != b.length()) {
			return false;
		}
		int[] seen = new int[128]; //0
		for (int i = 0; i < a.length(); i++ ) {
			seen[a.charAt(i)]++;
		}
		for (int i = 0; i < b.length(); i++ ) {
			if (seen[b.charAt(i)] == 0  ) {
				return false;
			}
			seen[b.charAt(i)]--;
		}


		return true;
	}


	public static void main (String[] args) {
		CheckPermutation cp = new CheckPermutation();
		String[] passingPair = {"abc", "cab"};
		String[] failingPair = {"hsc", "cab"};	
		System.out.println(cp.checkPermuation(passingPair[0], passingPair[1]));
		System.out.println(cp.checkPermuation(failingPair[0], failingPair[1]));
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
