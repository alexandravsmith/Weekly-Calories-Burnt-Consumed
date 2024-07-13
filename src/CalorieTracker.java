// the CalorieTracker calculates user calories habits to weight loss/gain by:
// 1. Receives user daily calorie consumption and expenditure activity.
// 2. Calculates the total consumed & burned, daily average, and net gain or loss of weight.
// 3. Outputs data to user in readable fashion.


import java.util.Scanner;
public class CalorieTracker {
    // global input variables of calories consumed and burned
    static int day1CalConsumed, day1CalBurned;
    static int day2CalConsumed, day2CalBurned;
    static int day3CalConsumed, day3CalBurned;
    static int day4CalConsumed, day4CalBurned;
    static int day5CalConsumed, day5CalBurned;
    static int day6CalConsumed, day6CalBurned;
    static int day7CalConsumed, day7CalBurned;

    // global variables which store user information which is calculated
    static int totalCaloriesConsumed, totalCaloriesBurned;
    static double averageCaloriesConsumed, averageCaloriesBurned;
    static double netWeeklyPounds;

    // calls all three methods in order, to obtain data, calculate  calories, and output data
    public static void main(String[] args) {
        getUserInput();
        calculateCalories();
        displayCalories();
    }

    // intake of users daily habits using the scanner.
    public static void getUserInput() {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter calories consumed for day #1: ");
        day1CalConsumed = scnr.nextInt();
        System.out.println("Enter calories burned for day #1: ");
        day1CalBurned = scnr.nextInt();

        System.out.println("Enter calories consumed for day #2: ");
        day2CalConsumed = scnr.nextInt();
        System.out.println("Enter calories burned for day #2: ");
        day2CalBurned = scnr.nextInt();

        System.out.println("Enter calories consumed for day #3: ");
        day3CalConsumed = scnr.nextInt();
        System.out.println("Enter calories burned for day #3: ");
        day3CalBurned = scnr.nextInt();

        System.out.println("Enter calories consumed for day #4: ");
        day4CalConsumed = scnr.nextInt();
        System.out.println("Enter calories burned for day #4: ");
        day4CalBurned = scnr.nextInt();

        System.out.println("Enter calories consumed for day #5: ");
        day5CalConsumed = scnr.nextInt();
        System.out.println("Enter calories burned for day #5: ");
        day5CalBurned = scnr.nextInt();

        System.out.println("Enter calories consumed for day #6: ");
        day6CalConsumed = scnr.nextInt();
        System.out.println("Enter calories burned for day #6: ");
        day6CalBurned = scnr.nextInt();

        System.out.println("Enter calories consumed for day #7: ");
        day7CalConsumed = scnr.nextInt();
        System.out.println("Enter calories burned for day #7: ");
        day7CalBurned = scnr.nextInt();
    }

        // calculations of the outputs we need. "totalCaloriesConsumed" and "totalCaloriesBurned" are found by
        // adding up all the amounts. In the end we will perform division of seven days and 3000 calories to get
        // averages and net loss/gains.
    public static void calculateCalories() {
        totalCaloriesConsumed = day1CalConsumed + day2CalConsumed + day3CalConsumed + day4CalConsumed + day5CalConsumed + day6CalConsumed + day7CalConsumed;
        totalCaloriesBurned = day1CalBurned + day2CalBurned + day3CalBurned + day4CalBurned + day5CalBurned + day6CalBurned + day7CalBurned;

        averageCaloriesConsumed = totalCaloriesConsumed / 7.0;
        averageCaloriesBurned = totalCaloriesBurned / 7.0;

        netWeeklyPounds = (double) (totalCaloriesConsumed - totalCaloriesBurned) / 3000.0;
    }

    // we output the data in a readable fashion to the user.
    public static void displayCalories() {
        System.out.println("You consumed a total of " + totalCaloriesConsumed + " calories this week.");
        System.out.println("You burned a total of " + totalCaloriesBurned + " calories this week.");
        System.out.printf("You consumed an average of %.2f calories a day.\n", averageCaloriesConsumed);
        System.out.printf("You burned an average of %.2f calories a day.\n", averageCaloriesBurned);
        System.out.printf("Your net weekly gain/loss is %.2f pounds.\n", netWeeklyPounds);
    }
}
