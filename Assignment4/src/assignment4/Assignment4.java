/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
class Findmax {

    static void get_max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}

public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Findmax max = new Findmax();
        Scanner arr = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arraySize = arr.nextInt();
        int[] numbers = new int[arraySize];
        System.out.println("Enter the numbers of the array: ");
        for (int i = 0; i < arraySize; i++) {
            {
                numbers[i] = arr.nextInt();
            }

        }
        System.out.println("The maximum number is: ");
        max.get_max(numbers);
    }
}
