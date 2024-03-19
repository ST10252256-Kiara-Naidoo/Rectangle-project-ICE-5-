/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myrectangleproject;

import javax.swing.JOptionPane;

/**
 *
 * @author kiara naidoo ST10252256@vcconecct.edu.za ST10252256
 */
public class MyRectangleProject
{

    /**
     * @param args the command line arguments
     */
    public static String lengthString,widthString;
    public static double length,width,areaResult,perResult;
    public static Rectangle rectangle;
    public static void main(String[] args)
    {
        // TODO code application logic here
        do {
        GetUserInput();
        CreateRectangleInstance();
        GetCalculations();
        DisplayMessage();
        } while (Restart());
    }
    public static void GetUserInput()
    {
       lengthString=JOptionPane.showInputDialog(null,"Enter length : ",JOptionPane.QUESTION_MESSAGE);
       widthString=JOptionPane.showInputDialog(null,"Enter width : ",JOptionPane.QUESTION_MESSAGE);
       length=Double.parseDouble(lengthString);
       width=Double.parseDouble(widthString);
    }
    
    public static void CreateRectangleInstance()
    {
    rectangle = new Rectangle(length, width);
    }
    
    public static void GetCalculations()
    {
        areaResult=rectangle.getArea();
        perResult=rectangle.getPerimeter();
    }
    
    public static void DisplayMessage()
    {
        System.out.println("\u001B[34mArea of the rectangle :" + areaResult);
        System.out.println("\u001B[36mPerimeter of the rectangle: " + perResult);
    }
    
    public static boolean Restart()
    {
        String input=JOptionPane.showInputDialog("Do you want to make another calculation? (yes/no)");
        return input.equalsIgnoreCase("yes");
    }
    
    public static void HelloWorld()
            
    {
      System.out.println("\u001B[36m hello : ");  
    }
    
    
}
