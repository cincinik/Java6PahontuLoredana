/* package for CNP validation
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package cnp_validator;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**Class PatternsForCNP - class that defines the patterns for valid CNP and stores them to a collection
 * @author Lori
 * @version 1.0 November 2017
 */
public class PatternsForCNP {
    // REGEX_MONTHS_31_DAYS holds the pattern String for 31 days months(January, March, May, July, August, October, December)
    private static final String REGEX_MONTHS_31_DAYS = "^(1|2)\\d\\d(0[13578]|1[02])(0[1-9]|[12][0-9]|3[01])(0[1-9]|1[0-9]|2[0-9]|3[0-9]|4[0-6]|5[12])\\d{4}$";
    
    // REGEX_MONTHS_30_DAYS holds the pattern String for 30 days months(April, June, September, November)
    private static final String REGEX_MONTHS_30_DAYS = "^(1|2)\\d\\d(0[469]|11)(0[1-9]|[12][0-9]|30)(0[1-9]|1[0-9]|2[0-9]|3[0-9]|4[0-6]|5[12])\\d{4}$";
    
    // REGEX_FEBRUARY_28_DAYS holds the pattern String for normal years of 28 days in February
    private static final String REGEX_FEBRUARY_28_DAYS = "^(1|2)\\d\\d(02)(0[1-9]|1[0-9]|2[0-8])(0[1-9]|1[0-9]|2[0-9]|3[0-9]|4[0-6]|5[12])\\d{4}$";
    
    // REGEX_FEBRUARY_29_DAYS holds the pattern String for leap years of 28 days in February        
    private static final String REGEX_FEBRUARY_29_DAYS = "^(1|2)(0[48]|1[26]|2[048]|3[26]|4[048]|5[26]|6[048]|7[26]|8[048]|9[26])(02)(29)(0[1-9]|1[0-9]|2[0-9]|3[0-9]|4[0-6]|5[12])\\d{4}$";
    
    // REGEX_29_FEBRUARY_2000 holds the pattern String for people born on 29 February 2000. 
    // The next similar pattern would be in 2400, but I don't think this prgram will be used so far in the future.
    private static final String REGEX_29_FEBRUARY_2000 =  "^(1|2)(000229)(0[1-9]|1[0-9]|2[0-9]|3[0-9]|4[0-6]|5[12])\\d{4}$";
    
    // Collection to hold the validation patterns. 
    ArrayList <Pattern> regexList = new ArrayList<>();

    /** Method makePatternList() converts the declared constants into Patterns for searching valid CNP and then stores them in regexList*/
     public void makePatternList(){
        Pattern pattern1 = Pattern.compile(REGEX_MONTHS_31_DAYS);
        Pattern pattern2 = Pattern.compile(REGEX_MONTHS_30_DAYS);
        Pattern pattern3 = Pattern.compile(REGEX_FEBRUARY_28_DAYS);
        Pattern pattern4 = Pattern.compile(REGEX_FEBRUARY_29_DAYS);
        Pattern pattern5 = Pattern.compile(REGEX_29_FEBRUARY_2000);
        regexList.add(pattern1);
        regexList.add(pattern2);
        regexList.add(pattern3);
        regexList.add(pattern4);
        regexList.add(pattern5);
    }  
}
