/*
Jemma Tiongson
Section #16031
App: Driver.java (Polymorphism App)
Purpose: Demonstrate polymorphism
-------------------------------------------------------------------------

Terminal:
   Compile: javac Driver.java Shape.java Triangle.java Rectangle.java
   Run: java Driver
_________________________________________________________________________
*/
class Rectangle extends Shape{
   public double getArea() {
      return width*height;
   }
}