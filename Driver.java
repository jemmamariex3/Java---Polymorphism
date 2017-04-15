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

class Driver{
   public static void main(String [] args){
      Triangle tri = new Triangle();
      Rectangle rect = new Rectangle();
      
      Shape newTri = tri;
      newTri.setSize(3,4);
      
      Shape newRect = rect;
      newRect.setSize(4,5);
      
      System.out.print("Area of a triangle: " +newTri.getArea());
      System.out.print("\nArea of a rectangle: " +newRect.getArea());
   }
}