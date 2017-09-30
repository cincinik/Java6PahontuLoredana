/* OOP calculator
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */ 
package oop_calculator;

/**Class Screen - screen of calculator. Displays messages and values.
 * @author Lori
 * @version 1.0 September 2017
 */
public class Screen {
    
    private int screenMemory = 0;
        
    // Displays 0 on screen
    public void clear(){
        screenMemory = 0;
        System.out.println("Display: " + screenMemory);
    }

    //Displays current values on screen.
    public void display(int valueToDisplay){
        System.out.println(valueToDisplay);
        screenMemory = valueToDisplay;
    }
    
    // Get value of screen memory.
    public int getScreenMemory() {
        return screenMemory;
    }

    // Set value of screen memory.
    public void setScreenMemory(int screenMemory) {
        this.screenMemory = screenMemory;
    }

    // Displays messages on screen.
    public void displayMessage(String message){
        System.out.println(message);
    }
    
}