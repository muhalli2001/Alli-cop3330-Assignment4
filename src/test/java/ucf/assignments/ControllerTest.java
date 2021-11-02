package ucf.assignments;

import javafx.event.ActionEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Since I cannot test action events directly, i will test the function it does with a static set of todo lists.
 */



class ControllerTest {

    @Test
    void add_ToDoList() {
        /*
        begin with empty arraylist and call method to add 1 todo list.
        This should create an empty arraylist and ask for a title. I will check
        to see if the title is generated.
        assertEquals(todo-arraylist index(0).title, todo-arraylist index(0).title);
         */
    }

    @Test
    void changeCompletion() {
        /*
        will change index of an item arraylist's item to true and verify it does so.
        The arraylist will be manually generated
        It will loop through the arraylist to the index
        then change the value to true
        assertTrue(index(x).complete);
         */
    }

    @Test
    void remove_ToDoList() {
        /*
        will use manually created arraylist.
        Will receive the index to be removed.
        Will use arraylist.remove(index) to remove the item.
        To verify if correct, I will use arraylist.size() and check if the size of the arraylist = original arraylist-1.
        assertEquals(arraylist.size()-1, arraylist.size());
         */
    }

    @Test
    void change_ToDoList_Name() {
        /*
        will use manually created arraylist of items.
        will access the itemlist name at given index (from class)
        will change the itemlist name to new name that will be provided
        To ensure it works, I will use:
        assertEquals(String "", String"" itemlist.title);
         */
    }

    @Test
    void addTaskToList() {
        /*
        will use manually created arraylist of items.
        To add task to arraylist, I will use arraylist.add(index)
        The index will be provided
        To ensure it adds to the arraylist, I will use
        assertEquals(arraylist.size()+1, arraylist.size());
         */
    }

    @Test
    void deleteTaskFromList() {
        /*
        will use manually created arraylist of items.
        To remove task from arraylist, I will use arraylist.remove(index)
        index will be provided
        to ensure it removes from arraylist, i will use:
        assertEquals(arraylist.size()-1, arraylist.size);
         */
    }

    @Test
    void displayToDoList() {
        /*
        To display into a vbox, I will iterate through the arraylist and print the title and index of the list.
        For that reason, this test will iterate through the arraylist and return the name of the final index
        to iterate:
        assert: assertEquals(String, String: arraylist.title);
         */
    }

    @Test
    void displayCompleteTasks() {
        /*
        iterate through a given arraylist of class tasklists.
        check if the boolean is true or false for the given index
        add to a counter to ensure the true values are being processed.
        assertEquals(counter, counter from test);
         */
    }

    @Test
    void displayAllTasks() {
        /*
        will take an arraylist of class tasklists
        print the final index to ensure it iterates correctly.
        assertEquals(int last index, int last index from test);
         */
    }

    @Test
    void displayIncompleteTasks() {
        /*
        same as display complete tasks except it will check if the bool is false and add to counter
        assertEquals(counter, counter from test);
         */
    }

    @Test
    void editDescription() {
        /*
        will take index of task in tasklist.
        will access the task's description and change the string using arraylist.get(index).description = "string";
        assertEquals(String, arraylist.get(index).description);
         */
    }

    @Test
    void editDate() {
        /*
        take index of task in tasklist.
        access date using arraylist.get(index).date
        change it to string with proper format YYYY-MM-DD
        assertEquals(String, String from test);
         */
    }

    @Test
    void saveAll_ToExternal() {
        /*

         */
    }

    @Test
    void saveList_ToExternal() {
    }

    @Test
    void open_All_FromExternal() {
    }
    @Test
    void Open_List_FromExternal() {


        }

}