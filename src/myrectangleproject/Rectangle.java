/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myrectangleproject;

/**
 *
 * @author kiara
 */
public class Rectangle
{
   
    private double length;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle(double length, double width, double area, double perimeter)
    {
        this.length = length;
        this.width = width;
        this.area = area;
        this.perimeter = perimeter;
    }
    
     public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }//Getters
     public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getArea()
    {
        area=length*width;
        return area;
    }

    public double getPerimeter()
    {
        perimeter=2*(length +width);
        return perimeter;
    }
    //Setters
 public void setLength(double length)
        {
            this.length = length;
        }

        public void setWidth(double width)
        {
            this.width = width;
        }

        public void setArea(double area)
        {
            this.area = area;
        }

        public void setPerimeter(double perimeter)
        {
            this.perimeter = perimeter;
        }
        
        
    
}

 

