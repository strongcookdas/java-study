package oop.ex;

public class Rectangle {
    int width = 5;
    int height = 0;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
