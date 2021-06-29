package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Get the number of rows
        System.out.println("Enter the number of rows:");
        int numRows = scan.nextInt();

        // Get number of seats in each row (i.e. columns)
        System.out.println("Enter the number of seats in each row:");
        int numColumns = scan.nextInt();

        int totalSeats = numRows * numColumns;

        // Create cinema seating chart
        System.out.println("Cinema:");
        String[][] cinemaHall = new String[numRows+1][numColumns+1];
        for(int i = 0; i < numRows + 1; i++) {
            for (int j = 0; j < numColumns + 1; j++) {
                if (i == 0 && j == 0) {
                    cinemaHall[i][j] = " ";
                } else if (i == 0) {
                    cinemaHall[i][j] = String.valueOf(j);
                } else if (j == 0) {
                    cinemaHall[i][j] = String.valueOf(i);
                } else {
                    cinemaHall[i][j] = "S";
                }
            }
        }

        boolean exit = false;
        int ticketsPurchased = 0;
        int income = 0;
        int totalPossibleIncome;
        // Calculate total possible income
        if (totalSeats < 60) {
            totalPossibleIncome = totalSeats * 10;
        } else {
            totalPossibleIncome = ((numRows / 2) * numColumns * 10) + ((numRows - (numRows / 2)) * numColumns * 8);
        }

        do {

        // Print menu
        System.out.println("1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit");

        int option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Cinema:");
                    for (int i = 0; i < numRows + 1; i++) {
                        for (int j = 0; j < numColumns + 1; j++) {
                            System.out.print(cinemaHall[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Get row number
                    boolean gotATicket = false;

                    do {
                        System.out.println("Enter a row number:");
                        int row = scan.nextInt();

                        // Get column number
                        System.out.println("Enter a seat number in that row:");
                        int col = scan.nextInt();

                        try {
                            if (cinemaHall[row][col].equals("S")) {
                                cinemaHall[row][col] = "B";
                                ticketsPurchased++;
                                gotATicket = true;

                            // Calculate ticket price
                            int price;
                            if (totalSeats < 60) {
                                price = 10;
                            } else {
                                if (row <= numRows / 2) {
                                    price = 10;
                                } else {
                                    price = 8;
                                }
                            }
                            System.out.printf("Ticket price: $%d\n", price);
                            income += price;
                        } else {
                            System.out.println("That ticket has already been purchased!");
                        } } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Wrong input!");
                        }
                    } while (!gotATicket);
                    break;

                case 3:
                    System.out.println("Number of purchased tickets: " + ticketsPurchased);
                    double percentage = 0.00;
                    if (ticketsPurchased != 0) {
                        percentage = (double) ticketsPurchased / (double) totalSeats * 100;
                    }
                    System.out.printf("Percentage: %.2f%%\n", percentage);
                    System.out.printf("Current income: $%d\n", income);
                    System.out.printf("Total income: $%d\n", totalPossibleIncome);
                    break;

                case 0:
                    exit = true;
            }
        } while(!exit);
    }
}