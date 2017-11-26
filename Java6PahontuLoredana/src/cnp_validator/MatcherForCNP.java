/* package for CNP validation
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package cnp_validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Class MatcherForCNP - the class that validates the matches of the patterns with the input CNP.
 * @author Lori
 * @version 1.0 November 2017
 */
public class MatcherForCNP {
    Scanner scanner = new Scanner(System.in);
    PatternsForCNP reg = new PatternsForCNP();    
    //Variable that will store user input
    String source;
    boolean  found = false;
    
    /** Method match() checks if there's a match between user's input and the patterns from regexList defined in PatternsForCNP class. */
    public void match(){
        System.out.println("Please insert CNP to validate: ");
        source = scanner.nextLine();
        reg.makePatternList();
        //compare each element of regexList with user's input
        reg.regexList.forEach((Pattern patt) -> {
            Matcher matcher = patt.matcher(source);
            //if the regular expression or pattern was found, print a valid CNP message
            if (matcher.find()) {
            String result = "Valid CNP";
            System.out.println(result);
            found = true;
             }
         });
        // if the regular expression or pattern was not found, print a no match message
        if (!found) {
        System.out.println("No match found :(");
         }     
     }
}
