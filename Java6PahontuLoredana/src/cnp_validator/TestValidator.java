/* package for CNP validation
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package cnp_validator;

/**Class TestValidator - the class running the validation process.
 * @author Lori
 * @version 1.0 November 2017
 */
public class TestValidator {
    
    static MatcherForCNP myMatcher = new MatcherForCNP();
    /**
     * main method running the validation
     * @param args
     */
    public static void main(String[] args) {
       myMatcher.match();
    }
    
}
