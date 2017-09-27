/*
 * Screen of computer
 */
package oop_calculator;

/**
 * Class Screen implements behavior of screen
 *
 * @author VORTEX
 */
public class Screen {

    String screenMemory = "Display: ";

    public void display(String deAfisat){
        screenMemory += deAfisat;
        System.out.println(screenMemory);
    }
}
