/* OOP calculator
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */ 
package oop_calculator;

/**Class Button - buttons of calculator.
 * @author Lori
 * @version 1.0 September 2017
 */
public class Button {
    // The label of the buttons
    private Character label;
    // Put labels on buttons
    public void assignButtons(Character label) {
        this.label = label;
    }
    // Return pushed button
    public Character pushedButton() {
        return label;
    } 
    
}