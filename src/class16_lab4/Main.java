/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16_lab4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import root.Employee;

/**
 *
 * @author Jwilliams96
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>(3);
        employees.add(new Employee("Doe", "John", "654-65-6151"));
        employees.add(new Employee("Doe", "Jane", "654-65-6151"));
        employees.add(new Employee("Brimley", "Wilford", "847-18-1512"));
        
        Set<Employee> employeesSet = new HashSet<Employee>(employees);
        
        System.out.println(employeesSet.size());
        
        employees = new ArrayList<Employee>(employeesSet);
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
