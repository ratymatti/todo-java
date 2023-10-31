import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. Mark task completed");
            System.out.println("3. Remove a task");
            System.out.println("4. Display tasks");
            System.out.println("5. Quit");
            System.out.println();
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
                    System.out.print("Enter the index of the task you want to mark completed: ");
                    int completedIndex = scanner.nextInt();
                    todoList.markTaskCompleted(completedIndex - 1);
                    System.out.println("Marked task number " + completedIndex + " completed");
                    break;    
                case 3:
                    todoList.displayTasks();
                    System.out.print("Enter the index of the task to remove: ");
                    int index = scanner.nextInt();
                    todoList.removeTask(index - 1);
                    System.out.println("Removed task number " + index);
                    break;
                case 4:
                    todoList.displayTasks();
                    break;
                case 5:
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
