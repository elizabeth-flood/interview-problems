
/**
 * 
 * Problem: One Away: There are three types of edits that can be performed on
 * strings: insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero
 * edits) away.
 *
 */
public class OneAway {
	
	public boolean oneAway(String a, String b) {
		// if the size difference is greater than two
		
		// prev value
		// two pointers at start of each string (array).
		// if they are the same, move beyond one, storing in prev value
		// if they are different
		//// if all the different use cases.., this seems liek we will have to hold a lot of variables, lets try something else
		
		// ascii sum -> not going to work
		
		return true;
	}
  
      public static void main (String[] args) {
	      OneAway oa = new OneAway();
	      String[] validInsert = {"abc", "abfc"};
	      String[] validRemove = {"abc", "ac"};
	      String[] validReplace = {"abc", "apc"};
	      String[] corner = {"", ""};
	      String[] invalid = {"asdhfasjfhaksf", "s"};
	      System.out.println(oa.oneAway(validInsert[0], validInsert[1]));
	      System.out.println(oa.oneAway(validRemove[0], validRemove[1]));
	      System.out.println(oa.oneAway(validReplace[0], validReplace[1]));
	      System.out.println(oa.oneAway(corner[0], corner[1]));
	      System.out.println(oa.oneAway(invalid[0], invalid[1]));
    }
}
