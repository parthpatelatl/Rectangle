/*
* Course: CS 1302
* Name: Parth Patel
*/

package testrectangle;

import java.text.DecimalFormat;


public class TestRectangle {

    public static void main(String[] args) {
        
        //Creates a rectangle object
        Rectangle[] rectangles = new Rectangle[2];
        
        //Creates 2 triangles with values given with the format (width, height)
        rectangles[0] = new Rectangle(4,40);
        rectangles[1] = new Rectangle(3.5, 35.9);
        
        //Creating a formatting object to show only two places after the decimal
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        
        //For loop goes through and prints out all details of each triangle
        for (int i = 0; i < 2; i++){
            System.out.println("Rectangle " + (i+1) + ":" );
            System.out.println("This rectangle has a width of " + numberFormat.format(rectangles[i].getWidth()) + ", and a height of " + numberFormat.format(rectangles[i].getHeight()) + ".");
            System.out.println("The area of this rectangle is " + numberFormat.format(rectangles[i].getArea()) + ", and the perimeter of the triangle is " + numberFormat.format(rectangles[i].getPerimeter()) + ".");
            System.out.println();
            
            
            
        }
        
    }
    
}
