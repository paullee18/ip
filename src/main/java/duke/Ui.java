package duke;

import java.util.Scanner;
public class Ui {

    public void printStart() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println("How can I help?");
    }

    public void printTasks(TaskList taskList) {
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(String.format("%d. %s", i+1, taskList.getTask(i).toString()));
        }
    }

    public void printMarked(Task task) {
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(String.format("%s", task.toString()));
    }

    public void printUnmarked(Task task) {
        System.out.println("OK, I've marked this task as not done yet:");
        System.out.println(String.format("%s", task.toString()));
    }

    public void printBye() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    public void printTaskAdded(Task task, TaskList taskList) {
        System.out.println("added: " + task.toString());
        System.out.println(String.format("Now you have %d tasks in the list", taskList.size()));
    }

    public void printDelete(Task task, TaskList taskList) {
        System.out.println("Noted. I've removed this task:");
        System.out.println(task.toString());
        System.out.println(String.format("Now you have %d tasks in the list", taskList.size()));
    }

    public void printDukeException(DukeException e) {
        System.out.println(e.toString());
    }

    public String getCommand(Scanner sc) {
        return sc.nextLine();
    }
}