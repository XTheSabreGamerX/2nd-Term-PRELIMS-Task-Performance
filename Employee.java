package src;
import java.util.*;
public class Employee {
       
    public static String name, name2, response, response2;

    public void setName() {

    Scanner s = new Scanner(System.in);

    System.out.println("Enter name: ");
    name = s.nextLine();

    System.out.println("Press F for full time or P for Part Time");
    response = s.nextLine();

    }

    public String getName () {
        
        name2 = name;       
        return name2;  

    }

}
