# [**CodeAndBlogAssignment**]()

Akshit Kumar

# [Open-Closed Principle (OCP)  ]()

The Open-Closed Principle requires that classes should be open for extension and closed to modification. Without the Open/Closed Principle
As a result, when the business requirements change then the entity can be extended, but not modified.

## [Let's take A Look n Code]()
```Shape.java

package com.knoldus.open_closed; 

public abstract class Shape {

public abstract int getArea();
}```

```Rectangle.java
class Rectangle extends Shape{
private int width;
private int height;

    public Rectangle(int width, int height) {
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
}
```


```circle.java

public class Circle extends Shape{

private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }


       public static void main(String[] args) {
           Rectangle r = new Rectangle(5,10);
           int area = r.getArea();
           System.out.println("The area is " + area);

           Circle c = new Circle(15);
        int circle_area=c.getArea();
           System.out.println("The area of Circle is " + circle_area);

       }
}
```


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


# [3. Interface Segregation principle]()
Clients should not be forced to depend upon interfaces that they do not use. 

Notes:-
When a Class is required to perform actions that are not useful, it is wasteful and may produce unexpected bugs if the Class does not have the ability to perform those actions.   
A Class should perform only actions that are needed to fulfil its role. Any other action should be removed completely or moved somewhere else if it might be used by another Class in the future.

# [Code implementation of ISP]()

```package com.knoldus.ISP;
interface Athlete {
void compete();
}
interface SwimmingAthlete extends Athlete {
void swim();

}
interface JumpingAthlete extends Athlete {
void highJump();
void longJump();
}
```

```participant.java

class  participant implements SwimmingAthlete {

    @Override
    public void compete() {
        System.out.println("participant started competing");
    }

    @Override
    public void swim() {
        System.out.println("participant started swimming");
    }

}
/// participant will not have to implement actions that he is not capable of performing:

class main {
    public static void main(String...arg){
        participant obj=new participant();
        obj.compete();
        obj.swim();
    }

}
```
## [Goal:]()   
This principle aims at splitting a set of actions into smaller sets so that a Class executes ONLY the set of actions it requires.







