package ucf.assignments;

import java.util.Date;

public class Task {
    protected Date DueDate;
    protected String Description;
    protected boolean complete;

    public Task(String Description, Date DueDate)
    {
        this.DueDate = DueDate;
        this.Description = Description;
        this.complete = false;
    }

    public String getTitle() {
        return Description;
    }
    public Date getDueDate() {
        return DueDate;
    }

    @Override
    public String toString()
    {
        return Description;
    }
}
