To-Do List Application

This project is a simple console-based "To-Do List" application. It provides users with a task manager where they can add, list, and delete tasks.

Features:

1.Add tasks
2.List tasks
3.Delete tasks

Save tasks to a file and load them on restart

Installation

Clone the project or download the files.

Ensure you have a Java development environment (JDK 8 or later) installed.

Navigate to the project directory in the terminal or command prompt.

Usage

Compilation

Compile the Java files using the following command:

javac -d . TaskManager.java Main.java

Execution

Run the program using the following command:

java com.mycompany.todolist.Main

User Menu

When the program runs, the following menu will be displayed:

--- To-Do List ---
1. Add task
2. List of tasks
3. Delete task
4. Exit
Make your choice: 

Users can manage their tasks by selecting the appropriate option.

Configuration

Tasks are saved in a file named tasks.txt and automatically loaded when the application starts.

If the file does not exist, the system creates a new one and continues operation.

Error Handling

The user is notified in case of invalid inputs.

If an invalid task number is entered for deletion, an error message is displayed.

File read/write errors are printed to the console.v

License

This project is open-source and can be used freely as needed.
