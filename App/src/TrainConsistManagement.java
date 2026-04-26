
import java.util.LinkedList;

/**
 * ========================================================
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 * ========================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 *
 * This maps positional operations using LinkedList.
 *
 * @author Developer
 * @version 4.0
=======
import java.util.HashMap;
import java.util.Map;

/**
 * ========================================================
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 * ========================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 *
 * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 *
 * This maps lookup-based access using HashMap.
 *
 * @author Developer
 * @version 6.0
 */
public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("========================================\n");

        // Create a LinkedList
        // LinkedList maintains insertion order and allows fast inserts
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in sequence
        trainConsist.addLast("Engine");
        trainConsist.addLast("Sleeper");
        trainConsist.addLast("AC");
        trainConsist.addLast("Cargo");
        trainConsist.addLast("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
=======
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("========================================\n");

        // HashMap stores data in key -> value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- Insert bogie capacities ----
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        // Iterate and display bogie capacity details
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...")
    }
}