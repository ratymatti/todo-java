import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks;
    
    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + ":\n" + tasks.get(i));
        }
    }
}
