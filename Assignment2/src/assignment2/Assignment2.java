/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

class tringle {

    void area(float base, float high) {
        System.out.println("area = " + (0.5 * base * high));
    }

    void circumference(float base, float side1, float side2) {
        System.out.println("circumference= " + (base + side1 + side2));
    }
}

class circle {

    void area(float rad) {
        System.out.println("area = " + (Math.PI * rad * rad));
    }

    void circumference(float rad) {
        System.out.println("circumference= " + (2 * Math.PI * rad));
    }
}

public class Assignment2 {

    public static void main(String[] args) {
        tringle T1 = new tringle();
        T1.area(6, 3);
        T1.circumference(3, 3, 3);

        circle C1 = new circle();
        C1.area(6);
        C1.circumference(6);
    }

}
