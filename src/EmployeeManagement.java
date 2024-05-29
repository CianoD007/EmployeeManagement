import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeManagement {

    public static void main(String[] args) {
        // Reading the file and saving each employee in a collection (HashSet to avoid repetitions)
        HashSet<String> employees = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Printing the size of the collection
        System.out.println("Size of the collection: " + employees.size());

        // Printing the contents of the collection

        // 1. Using a standard for loop
        System.out.println("\nUsing a standard for loop:");
        String[] employeeArray = employees.toArray(new String[0]);
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println(employeeArray[i]);
        }

        // 2. Using a for-each loop
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

        // Check if a specific employee exists in the set
        String sampleEmployee = "Dube\tGraciano\t4"; // Example employee name to check
        if (employees.contains(sampleEmployee)) {
            System.out.println("\nEmployee " + sampleEmployee + " is in the set.");
        } else {
            System.out.println("\nEmployee " + sampleEmployee + " is not in the set.");
        }
    }
}
