package com.knoldus.LSP;

public class Main {
    public static void main(String... Args) {

        /////creating object of rectangle class

        Rectangle obj = new Rectangle(10, 5);

        System.out.println("Area of Rectangle:---- " +obj.getArea());

        Shape obj2 = new Square(4);

        System.out.println("Area of  Square:---- " +obj2.getArea());



    }

}
