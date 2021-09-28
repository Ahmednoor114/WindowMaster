/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdisg.windowmaster;

import java.util.Scanner;

/**
 *
 * @author ahmednoorabdi
 */
public class WindowMaster {
    public static void main(String[] args) {
        //First Step Declare the Variables
        
        //declair variables for heigh and width
        float height;
        float width;
        float numOfWindows;
        // declare Strings variables to hold the user's height and width input.
        String stringHeight;
        String stringWidth;
        String stringnumOfWindows;
        
        //declare other variables.
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        // Second Step Getting Input
        
        //Declair and Intialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //get input from the user.
        System.out.println("Please enter window height: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width: ");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter number of windows : ");
        stringnumOfWindows = myScanner.nextLine();
        
        /** Step Three Convert the Strings.
         The next step is to convert the strings to numbers, using parse.
        */
        
        // Convert String values of height and width to float values.
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        numOfWindows =Float.parseFloat(stringnumOfWindows);
        /** Step Fourth Calculate the Area and Perimeter 
        * Add expressions to calculate the window area and trim to your code:
         */
        
        // calculate the area of the window
        areaOfWindow = height * width;
        
        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
        
        /** Step Fifth Calculate the Cost
         * We now need to calculate the cost of the window, adding together the glass (area * $3.50) and trim (perimeter * $2.25).
         */
        
        // calculate the total cost - use a hard-coded value
    // for material cost
        cost = 6* ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
      
        /** Step Sixth Display the Results
         * Finally, we use System.out.println() to display the results to the user: 
         */
        
        // display the results to the user
        System.out.println("Window Height = " + stringHeight);
        System.out.println("Window Width = " + stringWidth);
        System.out.println("Number of Windows = " + stringnumOfWindows);
        System.out.println("Windows Area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total const = " +cost);
        
       /** Step Seventh Run When you run the program, you should see something like the following, using 10 and 15 as the input values.
        
        */
    }   
    
    
}
