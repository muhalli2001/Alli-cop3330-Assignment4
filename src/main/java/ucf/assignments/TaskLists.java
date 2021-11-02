package ucf.assignments;

import java.util.ArrayList;

public class TaskLists {
    public String Title;
    public ArrayList<Task> taskList;
    private int tasklist_index;//stores the index of the list

    public TaskLists(String title, int id) {
        taskList = new ArrayList<>();
        tasklist_index = id;
        Title = title;

    }

    public void setTitle(String title) {
        Title = title;
    }

    public boolean AddToTaskList(Task newTask) {
        try {
            taskList.add(newTask);
        } catch (Exception e) {
            System.out.println("Error Adding " + newTask.toString() + " to the list.");
            return false;
        }

        return true;
    }

    public boolean RemoveFromTaskList(Task newTask) {

        try {
            taskList.remove(newTask);
        } catch (Exception e) {
            System.out.println("Error Removing " + newTask.toString() + " to the list.");
            return false;
        }
        return true;
    }

    public int getTasklist_index() {
        return tasklist_index;
    }

    @Override
    public String toString() {
        return taskList.toString();
    }
}
