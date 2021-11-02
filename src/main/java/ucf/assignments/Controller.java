package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class Controller {
    /*
    to access fxid's, I will use:
    @FXML
    type(button, label, etc) fxid;
     */

    public void Add_ToDoList(ActionEvent e){

        /*
        Action Event: Button Press. Uses Text Field as input for title of list
        Use class ToDoList first, add a todo list as an array list.
        First, create tasklist,
        then add given tasklist to todolist.
        This way, a title can be given in tasklist and all tasklists can be stored in class todolist


         */
    }
    public void ChangeCompletion(ActionEvent e){

        /*
           Find task in list at index
        *  check value for the Checkbox in fxml using fxid
        *  If task is found in list, update complete boolean variable in task class
        * task.complete = true/false
        * */

    }
    public void Remove_ToDoList(ActionEvent e){
        /*
            Action Event: Button Press
            Get Index of Todo List from class Todo Lists
            Remove item from Todo Lists, the list of todo lists
         */

    }
    public void Change_ToDoList_Name(ActionEvent e){
        /*
        Action Event: Button Press
        Needs: Arraylist of Item lists and text field for new title.
        Get index of todolist which would contain the wanted arraylist of items. it would also contain the title of the arraylist.
        Receive input from text field in the string form.
        Access the item list at wanted index. Change the string present to the one from the text field
         */

    }
    public void AddTaskToList(ActionEvent e)
    {

        /*System.out.println(taskListName.getText());
        LocalDate mydate = TaskDate.getValue();
        Task addTask = new Task(mydate.toString(), Description.getText());

        _taskList.AddToTaskList(addTask);

        System.out.println(_taskList.toString()); */
    }

    public void DeleteTaskFromList(ActionEvent e)
    {
        /*
            Action Event: Button Press "RemoveTask"
            Get Index of Item in Given ToDo List.
            Use arraylist method list.remove(index) to remove item
        */
    }
    public void DisplayToDoList(){
        /*
        Use class TodoList which contains an arraylist of all lists of tasks
        use arraylist method arraylistname.get(index)
        access the tasklist name and store it into a string
        Add the string to the vbox using: vBox1.getChildren().add(string title of list);
         */

    }
    public void DisplayCompleteTasks(ActionEvent e){

        /*
        Action Event: Button Press: Display All Tasks
        Press Button, loop through the entire arraylist: given todo list tasks list.
        IF task.boolean completion == true, add index to vbox to be displayed.
        need to access arraylist item . completion variable
        code to add vbox:

         */

    }
    public void DisplayAllTasks(ActionEvent e){

        /*
        No need to check completion boolean.
        therefore, loop through arraylist
        send and display index value in vbox

         */

    }
    public void DisplayIncompleteTasks(ActionEvent e){

        /*
        Action Event: Button Press: Display Incomplete Tasks
        Loop through entire arraylist of the specific todolist
        check if statement: if task.boolean == false send the id to the vbox
        display id in vbox. Code to do this is in Display All Tasks

         */

    }

    public void EditDescription(ActionEvent e){

        /*
        ActionEvent: Button Press.
        Will Use: Text Box input, change the description present in item to what the text field displays
        To do: get index of item from another text field.
        Access item information i.e description string.
        Set item description string to new description string ( one inside text field)
         */
    }

    public void EditDate(ActionEvent e){

        /*
        Action Event: Button Press.
        WIll Use: Date box input, index text box input
        To do: get date box input from date box in gui. get index of item from text box
        Convert date box into string form using method: LocalDate datename = myDatePicker.getValue(); String str = datename.toString;
        access item at index value (id) and change String date to new date box input

         */
    }

    public void SaveAll_ToExternal(ActionEvent e){

        /*
        ActionEvent: Button
        GENERATE .txt file called External. Separate values by comma
        File External = new File("///external.txt");
        External.createnewFile();
        if file already exists, use filepath and write to the file already made
        clear file before writing?
        will use csv as the storage method.
        Will iterate through ToDo list indexes. At each index, print Todo list value to file, then title of tasklist,
        then iterate tasklist and store the due date, description, boolean completion. Do this for each item in Todo list.

         */

    }

    public void SaveList_ToExternal(ActionEvent e){

        /*
        ActionEvent: Button
         ActionEvent: Button
        GENERATE .txt file called External. Separate values by comma
        File External = new File("///external.txt");
        External.createnewFile();
        if file already exists, use filepath and write to the file already made
        clear file before writing?
        To store one list, I will store the index of the list, store the title of the tasklist, iterate the tasklist
        store the due date, description and boolean. Continue this method for each item in Todo list.
         */

    }

    public void Open_List_FromExternal(ActionEvent e){

        /*
        ActionEvent: Button
        parse csv file with filepath with BUFFEREDREADER that follows format:
        todo list index, title of tasklist, due date, description, completion
        if(todo list index == the one wanted), it store those values into the program at index size().
         */
    }
    public void Open_All_FromExternal(ActionEvent e){

        /*
        ActionEvent: Button
        parse csv file with BUFFEREDREADER
        format: todo list index, title of tasklist, task information
        it will store the values in arraylist at size() until end of the file

         */
    }






}