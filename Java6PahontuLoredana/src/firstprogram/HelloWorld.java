/*
 * My first program written in Java
 */
package firstprogram;

import java.util.Scanner;

/**
 * This is my first class
 * @author VORTEX
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("what is your name?");
       Scanner in = new Scanner(System.in);
       String name = in.next();
        // say Hellow World
        System.out.println("Hello, " + name + "!");
    }
    
}
