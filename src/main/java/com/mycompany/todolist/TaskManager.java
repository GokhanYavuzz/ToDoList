package com.mycompany.todolist;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Gökhan
 */
public class TaskManager {

private ArrayList<String> tasks = new ArrayList<>();
    private final String FILE_NAME = "tasks.txt";

    public TaskManager() {
        loadTasksFromFile(); 
    }

 public void addTask(String task) {
        tasks.add(task);
        saveTasksToFile(); 
        System.out.println("Saved task: " + task); 
 }
 
 public void listTasks(){
     if(tasks.isEmpty()){
         System.out.println("To do list is empty!");
     }
     else{
         System.out.println("To do list:");
         for(int i=0; i<tasks.size();i++){
             System.out.println((i+1) + ". "+ tasks.get(i) );
         }
     }
 }
 public void removeTask(int index){
     if(index>=0 && index < tasks.size()){
         System.out.println("Deleted task is " + tasks.remove(index));
         saveTasksToFile();
     }
     else{
         System.out.println("Invalid number!");
     }
 }
 
 private void saveTasksToFile(){
     try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
         for(String task : tasks){
             writer.write(task);
             writer.newLine();
         }
     }catch(IOException e){
         System.out.println("Error occupied: "+ e.getMessage());
     }
 }
 
 private void loadTasksFromFile(){
     tasks.clear();
     try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
         String line;
         while((line= reader.readLine()) != null){
             tasks.add(line);
        }
    }
      catch (FileNotFoundException e) {
            System.out.println("Henüz görev dosyası oluşturulmamış.");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu: " + e.getMessage());
        }
    }
 }
 
 