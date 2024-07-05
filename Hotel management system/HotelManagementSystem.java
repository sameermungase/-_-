import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Boolean> rooms = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            rooms.put(i, true); // All rooms are initially available
        }

        while (true) {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. Check Availability");
            System.out.println("2. Reserve Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.println("Total number of rooms: " + rooms.size());
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    if (rooms.get(roomNumber)) {
                        System.out.println("Room " + roomNumber + " is available.");
                    } else {
                        System.out.println("Room " + roomNumber + " is not available.");
                    }
                    break;
                case 2:
                    System.out.print("Enter room number: ");
                    roomNumber = scanner.nextInt();
                    if (rooms.get(roomNumber)) {
                        rooms.put(roomNumber, false);
                        System.out.println("Room " + roomNumber + " reserved successfully.");
                    } else {
                        System.out.println("Room " + roomNumber + " is already reserved.");
                    }
                    break;
                case 3:
                    System.out.print("Enter room number: ");
                    roomNumber = scanner.nextInt();
                    if (!rooms.get(roomNumber)) {
                        rooms.put(roomNumber, true);
                        System.out.println("Reservation for room " + roomNumber + " cancelled.");
                    } else {
                        System.out.println("Room " + roomNumber + " is not currently reserved.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}