/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author mohamed
 */
import java.util.Scanner;

public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("please enter your string value!");
        String word = text.nextLine();
        String Res;
        Res = word.replace(",", " "); //replace statment to swap every comma to space
        System.out.println(Res);

    }
}
