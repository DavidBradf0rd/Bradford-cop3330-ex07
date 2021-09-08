package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
public class AreaofaRectangularRoom
{
    public static void main( String[] args )
    {
        System.out.print( "What is the length of the room in feet? " );
        Scanner input = new Scanner(System.in);
        String length = input.nextLine();
        int ilength = Integer.parseInt(length);

        System.out.print( "What is the width of the room in feet? " );
        String width = input.nextLine();
        int iwidth = Integer.parseInt(width);

        System.out.println("You entered dimensions of "+ilength+" feet by "+iwidth+" feet.");

        int sqrft = ilength*iwidth;
        double sqrm = sqrft*0.09290304;
        String num = String.format("%.3f", sqrm);

        System.out.print("The area is"+"\n"+sqrft+" square feet"+"\n"+ num+" square meters");

    }
}
