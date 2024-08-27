package edu.iuh.fit.exe1;

public class TestRectangle {
    public static void main(String[] args) {
        try {
            Rectangle rect1 = new Rectangle(5, 10);
            System.out.println("Area of rect1: " + rect1.getArea()); // Output: Area of rect1: 50.0

            rect1.setLength(-3); // Throws IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Rectangle rect2 = new Rectangle(-2, 7);
            // This will never execute because the constructor will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Output: Length and width must be greater than 0
        }
    }
}