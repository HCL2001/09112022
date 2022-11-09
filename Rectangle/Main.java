package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai: ");
        int width = sc.nextInt();
        System.out.print("Nhap vao chieu rong: ");
        int height = sc.nextInt();
        Rectangle rect = new Rectangle(width, height);
        System.out.print("Your Rectangle: " + rect.display() + "\n");
        System.out.print("Your area: " + rect.getArea() + "\n");
        System.out.print("Your perimeter: " + rect.getPerimeter() + "\n");

    }
}
