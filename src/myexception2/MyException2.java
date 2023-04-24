/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myexception2;

/**
 *
 * @author dol
 */
public class MyException2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int[] list = new int[10];
            System.out.println("list[10] is " + list[10]);
        } 
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        } 
        catch (RuntimeException ex) {
            System.out.println("RuntimeException");
        } 
        catch (Exception ex) {
            System.out.println("Exception");
        }
    }

}
