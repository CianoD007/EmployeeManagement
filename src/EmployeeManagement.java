import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeManagement {

    public static void main(String[] args) {
        // : Reading the file and saving each employee in a collection
        ArrayList<String> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("studentsEN.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // : Printing the size of the collection
        System.out.println("Size of the collection: " + employees.size());

        // : Printing the contents of the collection

        // 1. Using a standard for loop
        System.out.println("\nUsing a standard for loop:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        // 2. Using afor-each loop
        System.out.println("\nUsing a for-each loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }

        // 3. Using an Iterator
        System.out.println("\nUsing an Iterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}