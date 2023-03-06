package src;
import java.util.*;
public class FullTimeEmployee {
    
    public static double monthlySalary;
    public double monthlySalary2;

    public void setMonthlySalary() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your monthly salary: ");
        monthlySalary = s.nextDouble();

    }

    public double getMonthlySalary() {

        monthlySalary2 = monthlySalary;
        return monthlySalary2;

    }

}
