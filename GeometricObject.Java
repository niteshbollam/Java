class GeometricObject {
    private String color = "green";
    private boolean filled =true;
    public GeometricObject() {
    }
    
     public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;   
    }
    public String getColor() {
    return color;
    }
    public void setColor(String color) {
      this.color = color;
    }

    public boolean isFilled() {
      return filled;
    }

    public void setFilled(boolean filled) {
      this.filled = filled;
    }

    public String toString() {
        return "\n color: " + color + " and filled ";                 
    }   
 }


traingle.class

class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double setSide1() {
        return side1;
    }

    public double setSide2() {
        return side2;
    }

    public double setSide3() {
        return side3;
    }

    public void getSide1(double side1) {
        this.side1 = side1;
    }

    public void getSide2(double side2) {
        this.side2 = side2;
    }

    public void getSide3(double side3) {
        this.side3 = side2;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }
   
    public String toString() {
    return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
           + " Side 3 = " + side3;
    }
}
testtraingle.class

import java.util.Scanner;

public class TestTriangle {
	    private double side1 = 1.0;
	    private double side2 = 1.0;
	    private double side3 = 1.0;
	    
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);
	    	System.out.println("Enter three sides of the Triangle");
	        double side1 = in.nextDouble();
	        double side2 = in.nextDouble();
	        double side3 = in.nextDouble();
 
	        System.out.println("Enter the color of the Triangle");
	        String color = in.next();
	        
	        Triangle tri = new Triangle(side1, side2, side3);
	        tri.setColor(color);
	        
	        System.out.println("The Triangle's Area is " + tri.getArea());
	        System.out.println("The Triangle's Perimeter is " + tri.getPerimeter());
	        System.out.println("The Triangle Sides are "  + tri.toString());
	        System.out.println("The Triangle's Color is "+ tri.getColor());
	        System.out.println("Is the Triangle filled? "+ tri.isFilled() );

	    }
	}
