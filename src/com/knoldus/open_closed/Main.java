package com.knoldus.open_closed;

  class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        int Rect_area = r.getArea();
        System.out.println("The area is " + Rect_area);

        Circle c = new Circle(50);
        int circulArea = c.getArea();
        System.out.println("The area of Circle is " + circulArea );

    }
}

