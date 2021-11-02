package ucf.assignments;

public class Task {
    protected String DueDate;
    protected String Description;
    protected boolean complete;

    public Task(String Description, String DueDate)
    {
        this.DueDate = DueDate;
        this.Description = Description;
    }

    public String getTitle() {
        return Description;
    }
    public String getDueDate() {
        return DueDate;
    }

    @Override
    public String toString()
    {
        return Description;
    }
}
