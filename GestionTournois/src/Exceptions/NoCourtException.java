/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author elartic
 */
public class NoCourtException extends Exception {
    public NoCourtException(String errorMessage) {
        super("Court missing: " + errorMessage);
    }    
}
