/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = x.nextInt();
        char ch = (char) num; // casting integer to character
        System.out.println(ch);
    }
}
