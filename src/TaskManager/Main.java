package TaskManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        // Create users
        addUser("Alice");
        addUser("Bob");
        addUser("Alice"); // This will not be added as a duplicate

        // Add tasks to users
        users.get(0).addTask("Buy groceries");
        users.get(0).addTask("Read a book");
        users.get(1).addTask("Write code");
        users.get(1).addTask("Go for a walk");

        // Showing tasks per user before marking completion
        System.out.println();
        System.out.println("Tasks list for each user before marking completion:");
        System.out.println("---------------------------------------------------");
        for (User user : users) {
            user.printTasks();
        }

        // Mark a task as completed
        users.get(0).markTaskAsCompleted("Buy groceries");
        System.out.println(users.get(0).getName() + " has completed the task 'Buy groceries'");
        users.get(1).markTaskAsCompleted("Go for a walk");
        System.out.println(users.get(1).getName() + " has completed the task 'Go for a walk'");

        // Print all tasks for each user
        System.out.println();
        System.out.println("Tasks list for each user after marking completion:");
        System.out.println("--------------------------------------------------");
        for (User user : users) {
            user.printTasks();
        }
    }

    private static void addUser(String name) {
        if (!userExists(name)) {
            users.add(new User(name));
            System.out.println("User " + name + " added.");
        } else {
            System.out.println("\nUser " + name + " already exists, duplicate entries not accepted.");
        }
    }

    private static boolean userExists(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}
