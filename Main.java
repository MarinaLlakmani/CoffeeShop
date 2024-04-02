import java.util.Scanner;

public class Main {
    static int small_count = 0;
    static int medium_count = 0;
    static int large_count = 0;
    static double grandtotal = 0;
    static double small_grand = 0;
    static double medium_grand = 0;
    static double large_grand = 0;
    static int small_oz = 9;
    static int medium_oz = 12;
    static int large_oz = 15;
    static int total_oz = 0;
    static int choice;
    static int value;
    public static void main(String[] args) {

        menu();
    }


    public static void menu() {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1: Enter 1 to order coffee.");
            System.out.println("2: Enter 2 to check the total amount of coffee sold up to this time.");
            System.out.println("3: Enter 3 to check the total amount of coffee sold up to this time.");
            System.out.println("4: Enter 4 to check the number of cups of coffee of each size sold.");
            System.out.println("5: Enter 5 to print the data.");
            System.out.println("9: Enter 9 to exit the program.");
            value = input.nextInt();
            if (value == 1) {
                order();
                break;
            }
            else if(value == 2){
                grandtotal();
                break;
            }
            else if(value == 3){
                oz();
                break;
            }
            else if(value == 4){
                sold();
                break;
            }
            else if(value == 5){
                overall();
                break;
            }
            else if (value == 9) {
                System.exit(0);
                break;
            }
        }while(true);
    }

    public static void order() {
        Scanner input = new Scanner(System.in);
        double total_small = 0;
        double total_medium = 0;
        double total_large = 0;

        do{
            System.out.println("1: Enter 1 to buy coffee in a small cup size(9oz)");
            System.out.println("2: Enter 2 to buy coffee in a medium cup size(12oz)");
            System.out.println("3: Enter 3 to buy coffee in  a large cup size(15oz)");
            System.out.println(("9: Enter 9 to exit"));
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter the number of cups: ");
                int num_cups = input.nextInt();
                small_count = small_count + num_cups;
                total_small = num_cups * 1.75;
                small_grand =small_grand+(num_cups * 1.75);
                total_oz = total_oz+(small_oz * num_cups);
            } else if (choice == 2) {
                System.out.println("Enter the number of cups: ");
                int num_cups = input.nextInt();
                medium_count = medium_count + num_cups;
                total_medium = num_cups * 1.90;
                medium_grand = medium_grand+(num_cups * 1.90);
                total_oz= total_oz +(medium_oz * num_cups);

            } else if (choice == 3) {
                System.out.println("Enter the number of cups: ");
                int num_cups = input.nextInt();
                large_count = large_count + num_cups;
                total_large = num_cups * 2.00;
                large_grand = large_grand + (num_cups * 2.00);
                total_oz = total_oz + (large_oz * num_cups);
            } else if (choice == 9) {
                double total= total_small + total_medium + total_large;
                System.out.printf("Please pay $" + "%.2f" ,total);
                System.out.println();

            }
            grandtotal = small_grand + medium_grand + large_grand;
        } while(choice != 9);
        menu();
    }
    public static void grandtotal(){
        System.out.println("Total money made: $" + grandtotal);
        System.out.println();
        menu();
    }

    public static void oz(){
        System.out.println("Total amount of coffee sold: " + total_oz + "oz");
        System.out.println();
        menu();
    }

    public static void sold(){
        System.out.println("Small cup count: " + small_count);
        System.out.println("Medium cup count: " + medium_count);
        System.out.println("Large cup count: " + large_count);
        System.out.println();
        menu();
    }
    public static void overall(){
        System.out.println("Small cup count: " + small_count);
        System.out.println("Medium cup count: " + medium_count);
        System.out.println("Large cup count: " + large_count);
        System.out.println("Total amount of coffee sold: " + total_oz + "oz");
        System.out.println("Total money made: $" + grandtotal);
        System.out.println();
        menu();
    }
}


