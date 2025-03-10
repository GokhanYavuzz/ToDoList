package com.mycompany.todolist;

/**
 *
 * @author Gökhan
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
            
        
        while(true){
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add task");
            System.out.println("2. List of tasks");
            System.out.println("3. Delete task");
            System.out.println("4. Exit");
            System.out.print("Make your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch(choice){
                case 1:
                    System.out.print("Write task which you want to add: ");
                    String task = scanner.nextLine();
                    taskManager.addTask(task);
                    break;
                case 2: 
                    taskManager.listTasks();
                    break;
                case 3:
                    System.out.print("Write number of task which you want to delete: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    taskManager.removeTask(index-1);
                    break;
                case 4:
                    System.out.println("System is shutting down.");
                    return;
                default:
                    System.out.println("Invalid number, please try again:");
            }
        }
    }
}
