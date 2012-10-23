package class16_lab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jwilliams96
 */
public class Main {


    public static void main(String[] args) {
        List hobbies = new ArrayList(3);
        hobbies.add("Programming");
        hobbies.add("Gaming");
        hobbies.add("Orginizinng Multimedia");
        
        for (int i = 0; i < hobbies.size(); i++) {
            System.out.println((String)hobbies.get(i));            
        }
    }
}
