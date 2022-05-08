package Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Main{
    boolean exit;
    public static ArrayList <String> options;

    public static void main(String[] args) {
        Main main = new Main();
        main.runMenu();
    }

    public void runMenu(){
        printHeader();
        while(!exit) {
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private void printHeader(){
        System.out.println("\n---------------------------");
        System.out.println("       Welcome to our      ");
        System.out.println("     Automatic Activity    ");
        System.out.println("          Selector         ");
        System.out.println("---------------------------");
    }

    private void printMenu(){
        System.out.println("What do you want to do?");
        System.out.println("[1] Select an activity");
        //System.out.println("[2] Change the list");
        //System.out.println("[3] Add an activity to the list");
        System.out.println("[0] Close the program\n");
    }

    private int getInput() {
        Scanner keyboard = new Scanner(System.in);
        int choice = -1;
        while(choice < 0 || choice > 3) {
            try {
                System.out.println("\nEnter the number of your choice: ");
                choice = Integer.parseInt(keyboard.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("That is not a number. Please try again.");
            }
        }
        return choice;
    }

    private void performAction(int choice) {
        switch (choice) {
            case 0:
                System.out.println("\nHave fun!\n");
                System.exit(0);
                break;
            case 1:
                randomSelection();
                break;
            case 2:
                //changeList();
                break;
            case 3:
                addToCurrentList();
                break;
            default:
                System.out.println("Unknown error has occured.");
        }
    }

    public List<String> randomSelection(){
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        int num = (int)(Math.random() * 3);
        options = new ArrayList<>();

        if (day == 1 ) {
            System.out.println("\n------ Today is Sunday ------");

            List<String> options = Arrays.asList("Visit granpas", "Watch LivingScriptures", "Read a book");
            System.out.println("\n ------ " + options.get(num) + " ------ \n");
            return options;
        }
        if (day == 2 ) {
            System.out.println("\n ------Today is Monday ------");

            List<String> options = Arrays.asList("Go to a park", "Play hide and seek");
            System.out.println("\n ------ " + options.get(num) + " ------ \n");
            return options;
        }
        if (day == 3 ) {
            System.out.println("\n------ Today is Tuesday ------");

            List<String> options = Arrays.asList("Go to a museum", "Play a video game", "Go for and ice cream");
            System.out.println("\n ------ " + options.get(num) + " ------ \n");
            return options;
        }
        if (day == 4 ) {
            System.out.println("\n------ Today is Wednesday ------");

            List<String> options = Arrays.asList("Go to a park", "Swim in the pool", "Read a book");
            System.out.println("\n ------ " + options.get(num) + " ------ \n");
            return options;
        }
        if (day == 5 ) {
            System.out.println("\n------ Today is Thursday ------");
            List<String> options = Arrays.asList("Watch a movie", "Go to a park", "Play hide and seek");
            System.out.println("\n ------ " + options.get(num) + " ------ \n");
            return options;
        }
        if (day == 6 ) {
            System.out.println("\n------ Today is Friday ------");
            List<String> options = Arrays.asList("Go to the movie theater", "Do crafts for an hour ", "Read a book");
            System.out.println("\n ------ " + options.get(num) + " ------ \n");
            return options;
        }

        if (day == 7 ) {
            System.out.println("\n------ Today is Saturday ------");
            List<String> options = Arrays.asList("Go to the beach", "Go to a park", "Go to the zoo");
            System.out.println("\n ------ " + options.get(num) + " ------ \n");
            return options;
        }
        return options;

    }

    private void addToCurrentList(){
        return;
    }

}