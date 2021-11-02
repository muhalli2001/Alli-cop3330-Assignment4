package ucf.assignments;

import java.io.Console;
import java.util.ArrayList;

public class TaskLists {
    public String Title;
    public ArrayList<Task> taskList;
    private int id;//stores the index of the list

    public TaskLists()
    {
        taskList = new ArrayList<>();
        Title = "";
    }
    public String addTitle(String title){
        Title = title;
        return title;
    }
    public boolean AddToTaskList(Task newTask)
    {
        try {
            taskList.add(newTask);
        }
        catch (Exception e)
        {
            System.out.println("Error Adding " + newTask.toString() + " to the list.");
            return false;
        }

        return true;
    }
    public boolean RemoveFromTaskList(Task newTask){

        try {
            taskList.remove(newTask);
        }
        catch (Exception e)
        {
            System.out.println("Error Removing " + newTask.toString() + " to the list.");
            return false;
        }
        return true;
    }
    public int getId(){
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return taskList.toString();
    }


    // AddToList
    // RemoveFromList
    // public boolean UpdateList(Task task, ActionType action)
    // {
    //      find in task in taskList
    //      if task is not found return false;
    //      update task in taskList
    //      return true; //
    // }
}
