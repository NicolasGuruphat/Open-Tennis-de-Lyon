/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author elartic
 */
public class NoScheduleException extends Exception {
    public NoScheduleException(String errorMessage) {
        super("Schedule missing: " + errorMessage);
    }
}
