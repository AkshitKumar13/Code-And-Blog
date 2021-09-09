package com.knoldus.open_closed;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    static class Main {
       public static void main(String[] args) {
           Rectangle r = new Rectangle(5,10);
           int area = r.getArea();
           System.out.println("The area is " + area);

           Circle c = new Circle(15);
        int circle_area=c.getArea();
           System.out.println("The area of Circle is " + circle_area);

       }
   }
}
