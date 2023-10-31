import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Display tasks");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task newTask = new Task(title, description);
                    todoList.addTask(newTask);    
                    break;
                case 2:
                    todoList.displayTasks();
                    System.out.print("Enter the index of the task to remove: ");
                    int index = scanner.nextInt();
                    todoList.removeTask(index - 1);
                    break;
                case 3:
                    todoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;        
                default:
                    System.out.println("Invalid choice. Please try again");
                    break;
            }
        }
    }    
}
