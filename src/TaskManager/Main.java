package TaskManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Add users to the list
        System.out.println("Users:");

        System.out.println(user1.getName());
        System.out.println(user2.getName());

        users.add(user1);
        users.add(user2);

        // Add tasks to users
        user1.addTask("Buy groceries");
        user1.addTask("Read a book");
        user2.addTask("Write code");
        user2.addTask("Go for a walk");

        // Showing tasks per user before marking completion
        System.out.println();
        System.out.println("Tasks list for each user before marking completion:");
        System.out.println("---------------------------------------------------");
        for (User user : users) {
            user.printTasks();
        }

        // Mark a task as completed
        user1.markTaskAsCompleted("Buy groceries");
        System.out.println(user1.getName() + " has completed the task 'Buy groceries'");
        user2.markTaskAsCompleted("Go for a walk");
        System.out.println(user2.getName() + " has completed the task 'Go for a walk'");

        // Print all tasks for each user
        System.out.println();
        System.out.println("Tasks list for each user after marking completion:");
        System.out.println("--------------------------------------------------");
        for (User user : users) {
            user.printTasks();
        }
    }
}
