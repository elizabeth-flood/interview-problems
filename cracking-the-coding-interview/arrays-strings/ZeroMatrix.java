/**
 * 
 * Problem: Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to 0.
 *
 * Solution: We can reduce the space to O(1) by using the first row as a
 * replacement for the row array and the first column as a replacement for the
 * column array. This works as follows: 1. Check if the first row and first
 * column have any zeros, and set variables rowHasZero and columnHasZero. (We'll
 * nullify the first row and first column later, if necessary.) 2. Iterate
 * through the rest of the matrix, seeing matrix[i][0) and matrix[0) [j] to zero
 * whenever there's a zero in matrix[i][j]. 3. Iterate through rest of matrix,
 * nullifying row i if there's a zero in matrix[i][0]. 4. Iterate through rest
 * of matrix, nullifying column j if there's a zero in matrix[ 0][ j]. 5.
 * Nullify the first row and first column, if necessary (based on values from
 * Step 1).
 *
 */
public class ZeroMatrix {
  
    public static void main (String[] args) {
	    System.out.println ("Hello World!");
    }
}
