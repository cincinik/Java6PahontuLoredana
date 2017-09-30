/* OOP calculator
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */ 
package oop_calculator;

import java.util.Scanner;

/**Class Calculator - the actual calculator with screen and buttons. Can read user input and display messages on screen.
 * @author Lori
 * @version 1.0 September 2017
 */
public class Calculator {
    
    private Screen myScreen;
    private Button[] myButtons;
    private Character[] buttonLabels = {'0','1','2','3','4','5','6','7','8','9','+','-','*','/','='};
    private Processor procesor;
    
   
    public Calculator() {
        myScreen = new Screen();
        procesor = new Processor();
        myButtons =  new Button[15];
        
         // Assign each button with the lablels from the array of characters.
        int i = 0;
        for(Character currentLabel:buttonLabels){
            Button newButton = new Button();
            newButton.assignButtons(currentLabel);
            myButtons[i] = newButton;
            i++;
        }
    }
    
     public Screen getScreen() {
        return myScreen;
    }

    public void setScreen(Screen myScreen) {
        this.myScreen = myScreen;
    }

    public Button[] getButoane() {
        return myButtons;
    }

    public void setButoane(Button[] butoane) {
        this.myButtons = butoane;
    }
    
    // Starts calculator. Displays 0 on screen.
    public void start(){
        myScreen.clear();
    }
    
    // Reads and stores the numbers input. 
    public void insertNumbers(){
        
        Scanner newScanner = new Scanner(System.in);
               
        myScreen.displayMessage("Please introduce number and press enter: ");
        String readNumber = newScanner.nextLine();
        Double newNumber = Double.valueOf(readNumber);
        myScreen.displayMessage("Display: " + newNumber);
        if(procesor.getFirstNumber() == null)
            procesor.setFirstNumber(newNumber);
        else
            procesor.setSecondNumber(newNumber); 
    }

    // Reads and stores operator input. 
    public void insertOperator(){
        Scanner newScanner = new Scanner(System.in);
        myScreen.displayMessage("Please introduce operator and press enter: ");
        String readOperator = newScanner.nextLine();
        Character newOperator = readOperator.charAt(0);
        myScreen.displayMessage("Display: " + readOperator);
        procesor.setOperator(newOperator);
    }
    
    public Processor getProcesor() {
        return procesor;
    }

    public void setProcesor(Processor procesor) {
        this.procesor = procesor;
    }
    
    // Reads equal input to calculate result.
    public void insertEqual(){
        Scanner newScanner = new Scanner(System.in);
        myScreen.displayMessage("Please introduce '=' and press enter: ");
         if ("=".equals(newScanner.next())){
         Double result = procesor.compute();
         myScreen.displayMessage("Display: " + result.toString());
         }
            
    }
    
}