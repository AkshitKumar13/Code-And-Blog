# [**CodeAndBlogAssignment**]()

Akshit Kumar

# [Liskov Substitution Principal]()
If S is a subtype of T, then objects of type T in a program may be replaced with objects of type S without altering any of the desirable properties of that program.

* When a child Class cannot perform the same actions as its parent Class, this can cause bugs.    
* If you have a Class and create another Class from it, it becomes a parent and the new Class becomes a child.               
* The child Class should be able to do everything the parent Class can do. This process is called Inheritance.
* The child Class should be able to process the same requests and deliver the same result as the parent Class or it could deliver a result that is of the same type.
## [Let's take A Look n Code]()

#### [**Shape.java** ]()   
`package com.knoldus.open_closed;   
public abstract class Shape {   
public abstract int getArea();  
}
`
#### [**Rectangle.java**]()

``package  com.knoldus.LSP;     
class Rectangle extends Shape{     
private int width;
private int height;

    public Rectangle(int width, int height) {``
        this.width = width;
        this.height = height;


    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

}`

##### **[Square.java]()**
`` package com.knoldus.LSP;    
class Square extends Shape{
int length;

public Square(int length){
this.length=length;  
}  
@Override  
int getArea() {  
return length*length;  
    } }  ``

###### [**Main.java**]()

```package com.knoldus.open_closed;

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
``` 

### [Goal   ]()
This principle aims to enforce consistency so that the parent Class or its child Class can be used in the same way without any errors.
