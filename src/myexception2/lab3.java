/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myexception2;

/**
 *
 * @author dol
 */
public class lab3 {

    public static void main(String[] args) {
        try {
            System.out.println("statement1");
            System.out.println(1/0);
            System.out.println("statement3");
        } catch (Exception e) {
        } finally {
            System.out.println("statement4"); //ไม่ว่าจะเกิด exception หรือไม่ finally ก็ยัง execute อยู่ดี
        }
        System.out.println("statement5");
    }
}
