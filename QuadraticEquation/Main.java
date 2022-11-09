package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuadraticEquation quad = new QuadraticEquation();
        System.out.print("Nhap vao so a: ");
        float a = sc.nextFloat();
        System.out.print("Nhap vao so b: ");
        float b = sc.nextFloat();
        System.out.print("Nhap vao so c: ");
        float c = sc.nextFloat();
        quad.getA(a);
        quad.getB(b);
        quad.getC(c);
        if (quad.getDiscriminant() >= 0){
            System.out.print("The equation has two roots " + quad.getRoot1() +" and " + quad.getRoot2());
        }else if (quad.getDiscriminant() == 0){
            System.out.print("The equation has one roots " + quad.getRoot1());
        }else
            System.out.print("The equation has no real roots");
    }
}
