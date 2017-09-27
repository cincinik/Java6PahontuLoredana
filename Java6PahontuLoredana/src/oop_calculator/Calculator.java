/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_calculator;

/**
 *
 * @author VORTEX
 */
public class Calculator {
    
    private Screen ecran;
    
    public Calculator (){
    ecran = new Screen();
    }
    
    /**
     * Methods adds 2 numbers introduced by the user from keyboard
     */
    public void add(){
    
}
    /**
     * Methods substracts 2 numbers introduced by the user from keyboard
     */
    public void decrease(){
        
    }
    /**
     * Methods multiply 2 numbers introduced by the user from keyboard
     */
    public void multiply(){
    }
    /**
     * Methods divide 2 numbers introduced by the user from keyboard
     */
    public void divide (){
    }
    /**
     * Starts the Calculator. Display 0 on the screen.
     */
    public void start(){
        ecran.display("0");
    }
}