package class16_lab2;

import java.util.ArrayList;
import java.util.List;
import root.Employee;

/**
 *
 * @author Jwilliams96
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>(3);
        employees.add(new Employee("Doe", "John", "654-65-6151"));
        employees.add(new Employee("Doe", "Jane", "751-27-7337"));
        employees.add(new Employee("Brimley", "Wilford", "847-18-1512"));
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
