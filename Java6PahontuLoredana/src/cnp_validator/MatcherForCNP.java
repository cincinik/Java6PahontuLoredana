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
    boolean lastDigit = false;
    
    /** Method match() checks if there's a match between user's input and the patterns from regexList defined in PatternsForCNP class. 
     *  It also contains a local class for checking if the last digit of the CNP follows the calculation algorithm
     */
    public void match(){
        System.out.println("Please insert CNP to validate: ");
        source = scanner.nextLine();
        
        // Local class that checks if the last digit of the CNP is valid
        class ValidateLastDigit {
            
            // array holding the legal int values that are used to calculate the last digit
            int [] calcLastDigit = {2,7,9,1,4,6,3,5,8,2,7,9};
            
            // array that will hold the split int values of each digit in the input CNP
            int [] inputArray = new int [source.length()];
            int sum = 0;
            int ld;
            
            /** Method that calculates and validate the last digit after the following algorithm:
             * Each digit in the CNP is multiplied by the figure in the same position from 279146358279; 
             * The results are summed, and the final result is divided by the remainder to 11. 
             * If the rest is 10, then the control number is 1, otherwise the control number is equal to the rest.
             */
            public boolean validateLastDigit(){
                // Transforming the string CNP into an array of separate int values
                 for (int i=0; i< source.length(); i++){
                    inputArray[i] = Character.getNumericValue(source.charAt(i));
                 }
                 // Calculate the sum explained above
                 for (int j = 0; j< calcLastDigit.length; j++){
                    sum = sum + calcLastDigit[j]*inputArray[j];
                 }
                 // Calculate the rest explained above
                int rest = sum%11;   
                if (rest == 10) {
                    ld = 1;}
                 else { 
                    ld = rest;}
                if (ld ==inputArray[12]){
                    lastDigit = true;}
                return lastDigit;
            }
        }
        
        ValidateLastDigit checkLD = new ValidateLastDigit();
        
        // Load the patterns
        reg.makePatternList();
        
        //Compare each element of regexList with user's input
        reg.regexList.forEach((Pattern patt) -> {
            Matcher matcher = patt.matcher(source);
            //if the regular expression or pattern was found, print a valid CNP message
            if (matcher.find()&& checkLD.validateLastDigit()) {
            String result = "Valid CNP";
            System.out.println(result);
            found = true;
             }
         });
        // if the regular expression was not found, print a no match message
        if (!found) {
        System.out.println("No match found :(");
         }     
     }
}
