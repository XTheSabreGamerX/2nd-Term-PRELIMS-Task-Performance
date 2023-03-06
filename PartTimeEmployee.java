package src;
import java.util.*;
public class PartTimeEmployee {
    
    public static double ratePerHour, wage;
    public double wage2;
    public static int hoursWorked;

    public void setWage() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter rate per hour and no. of hours worked separated by space:");
        ratePerHour = s.nextDouble();
        hoursWorked = s.nextInt();

        wage = ratePerHour * hoursWorked;

    }

    public double getWage() {
        
        wage2 = wage;
        return wage2;

    }


}
