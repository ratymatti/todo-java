public class Task {
    private String title;
    private String description;
    private boolean isCompleted;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getIsCompleted() {
        return this.isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nStatus: " + (isCompleted ? "Completed" : "Incomplete");
    }
}