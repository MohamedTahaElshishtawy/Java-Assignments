/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author mohamed
 */
import java.util.Scanner;

class matrix {

    public static int[][] matrix_input() {
        System.out.print("Enter the rows of matrix : "); 
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.print("Enter the colmuns of matrix  : ");
        int columns = sc.nextInt();

        System.out.println("Enter matrix elements : ");

        int twoD[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }
        return twoD;
    }

    public static void matrix_transpose() {

        int[][] a = matrix_input();
        int transpose[][] = new int[a.length][a.length];  //3 rows and 3 columns  

//Code to transpose a matrix  
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = a[j][i];
            }
        }

        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
        }

    }
}

public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrix cs = new matrix();
        cs.matrix_transpose();
    }

}
