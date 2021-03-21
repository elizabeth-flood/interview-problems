/**
 * 
 * Problem: Implement an algorithm to determine if a string has all unique
 * characters. No extra data structure.
 *
 */
public class IsUnique {
	
	public boolean isUnique(String input) {
		return true;
	}
	
    	public static void main (String[] args) {
		IsUnique iu = new IsUnique();
		String passInput = "alunique";
		String failInput = "allunique";
	    
		System.out.println(iu.isUnique(passInput));
		System.out.println(iu.isUnique(failInput));
	}

}
