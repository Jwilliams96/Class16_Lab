/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16_lab3;

import java.util.ArrayList;
import java.util.List;
import root.Dog;
import root.Employee;

/**
 *
 * @author Jwilliams96
 */
public class Main {
    public static void main(String[] args) {
        List randomObjects = new ArrayList(3);
        randomObjects.add(new Employee("Doe", "John", "654-65-6151"));
        randomObjects.add(new Employee("Brimley", "Wilford", "847-18-1512"));
        randomObjects.add(new Dog("Grizzley", 65468));
        
        for (int i = 0; i < randomObjects.size(); i++) {
            System.out.println(randomObjects.get(i).toString());
        }
    }
}
