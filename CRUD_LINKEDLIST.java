package input_LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class CRUD_LINKEDLIST {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<String> Data = new LinkedList<>();
        
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Create");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Display LinkedList");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
          
                    System.out.print("Enter the data to create: ");
                    String newData = s.next();
            
                    int index = Data.size();

                    Data.add(index, newData);
                    System.out.println("Data created successfully at index " + index);
                    break;
                case 2:
                    System.out.print("Enter the index to update: ");
                    int updateIndex = s.nextInt();

                    if (updateIndex >= 0 && updateIndex < Data.size()) {
                        System.out.print("Enter the new data: ");
                        String updatedData = s.next();
                        Data.set(updateIndex, updatedData);
                        System.out.println("Data updated successfully.");
                    } else {
                        System.out.println("Invalid index. Update failed.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the index to delete: ");
                    int deleteIndex = s.nextInt();

                    if (deleteIndex >= 0 && deleteIndex < Data.size()) {
                        Data.remove(deleteIndex);
                        System.out.println("Data deleted successfully.");
                    } else {
                        System.out.println("Invalid index. Deletion failed.");
                    }
                    break;
                case 4:
                    System.out.println("LinkedList: " + Data);
                    break;
                case 5:
                    System.out.println("Terminated na ni");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
