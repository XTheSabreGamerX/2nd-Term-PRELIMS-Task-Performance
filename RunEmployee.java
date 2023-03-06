package src;

public class RunEmployee {

    public static String response, name;
    public static double wageMain, salaryMain;
    public static void main(String[] args) {
        Employee employeeObj = new Employee();
        PartTimeEmployee parttimeObj = new PartTimeEmployee();
        FullTimeEmployee fulltimeObj = new FullTimeEmployee();

        employeeObj.setName();
        employeeObj.getName();
        name = employeeObj.name;

        if (employeeObj.response.equalsIgnoreCase("F")) {
           
            fulltimeObj.setMonthlySalary();
            fulltimeObj.getMonthlySalary();

            System.out.println("Name: " + name);
            System.out.println("Salary: " + fulltimeObj.monthlySalary2);

        }

        else if (employeeObj.response.equalsIgnoreCase("P")) {
            
            parttimeObj.setWage();
            parttimeObj.getWage();
            wageMain = parttimeObj.wage2;
        
            System.out.println("Name: " + name);
            System.out.printf("Wage: %.2f", wageMain);
            System.out.println("");

        }

        else {
            System.out.println("There was an error with your choice. . .");
        }

    }
    
}
