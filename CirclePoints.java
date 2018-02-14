/**
 * 
 * Purpose: The purpose of the program is to find the varying values of y from intervals of x determined by the user's preference on radius and x intervals.
 *
 * @author Briana Berger
 * @version 12/25/2017
 */
import java.util.Scanner;
public class CirclePoints
{
    public static void main(String[ ] args)
    {
        Scanner in = new Scanner(System.in);
        double x1 = 1.0;
        double y1 = 0.0;
        double x2 = 1.0;
        double y2 = 0.0;
        
        System.out.print("Radius of Circle: ");
        double radius = in.nextDouble();
        System.out.print("What shall be the interval of x? (ex: .10): ");
        double interval = in.nextDouble();
        System.out.println();
        
        System.out.println("***************************************");
        System.out.println("Points on a Circle with a Radius of " + radius);
        System.out.printf("%5s %9s %8s %10s %n", "x1", "y1", "x1", "y2");
        System.out.println("***************************************");
        
        while (x1 > -1.0)
        {
            //We have to have both positive and negative because Math.sqrt only produces a positive, meanwhile sqrts in practice produce both pos. and neg.
            y1 = Math.round(((double)(Math.sqrt(Math.pow(radius, 2) - Math.pow(x1, 2)))) * 100.0) / 100.0;
            
            if(x1 == 1)
            {
                y2 = y1;
            }
            else if(x1 != 1)
            {
                y2 = -y1;
            }
            System.out.printf("%5s %9s %8s %10s %n", x1, y1, x1, y2);
            
            x1 = Math.round(((double)(x1 - interval)) * 100.0) / 100.0;
        }
        
    }//end of main method
}//end of class