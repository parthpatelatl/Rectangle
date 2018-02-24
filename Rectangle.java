/*
* Course: CS 1302
* Name: Parth Patel
*/
package testrectangle;



public class Rectangle {
    
    //Declaring variables
    private double width;
    private double height;
    
    
    //Setting default values for the rectangle
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }
    
    //Constructor creates default rectangle
    public Rectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }
    
    //Method Returns the width of the triangle
    public double getWidth() {
        return this.width;
    }
    
    //Method Returns the height of the triangle
    public double getHeight() {
        return this.height;
    }
    
    //Calculates and returns the Area
    public double getArea() {
        return this.width * this.height;
    }
    
    //Calculates and returns the perimeter
    public double getPerimeter() {
        return this.width*2 + this.height*2;
    }
    
}
