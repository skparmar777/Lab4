/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 *
 */
/**
 * @author Sejal
 *
 */
public class ReclamationProject {
    /**
     *
     * @param a is a string
     * @param b is a string
     * @return r does something
     */
    public static String doit(final String a, final String b) {
        String r, tempA = "", tempB = "";
        if (a.length() > b.length()) { //if a is longer than b
            String c = a; // set c to a
            tempA = b;
            tempB = c; //switches values of a and b
            } //end if
        if (tempA.equals(tempB)) { //if the strings are the same
            r = "";
        } else {
            r = "";
        }

        /*
         * For loop with i
         */

        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    } //end if
                } //end for
            } // end for
        } // end for
        return r;
        }
}
