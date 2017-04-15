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

public abstract class Shape{
   double width;
   double height;
   
  public void setSize(double width, double height){
      this.width=width;
      this.height=height;
   }
   public abstract double getArea();
}
