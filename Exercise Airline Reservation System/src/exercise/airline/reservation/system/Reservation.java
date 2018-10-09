package exercise.airline.reservation.system;

import java.util.Scanner;

public class Reservation {
    //private boolean[] seats = new boolean[10];

    private Scanner scan = new Scanner(System.in);
    private boolean[] seats;

    public Reservation(boolean[] seats) {
        this.seats = seats;
        seatInitialisation(seats);
        intro();
        //display_seat_chart(seats);

    }

    public boolean[] seatInitialisation(boolean[] seats) {
        for (int i = 0; i < 10; i++) {
            seats[i] = false;
        }
        return seats;
    }

    public void intro() {
        System.out.println("Please choose a seat:");
        System.out.println("Type 1 for business class or");
        System.out.println("Type 2 for economy class, 3 for exit");
        int choice = scan.nextInt();
        //while (choice != 3) {
        seatAllocation(choice);
        //intro();
        //if (choice==3) break;

        //}
    }

    public static void display_seat_chart(boolean[] anArray) {
        System.out.println("\t\t  Business   | Economy   ");
        System.out.println("\t\t_________________________");
        for (int i = 0; i < 5; i++) {
            System.out.print("\t\t      ");
            System.out.print(anArray[i]);
            System.out.print("      ");
            System.out.print("|");
            System.out.print("      ");
            System.out.println(anArray[i + 5]);
        }
    }

    public void seatAllocation(int choice) {
        int help = 0, help2 = 0;
        while (choice != 3) {
            if (choice == 1) {
                for (int i = 0; i < 5; i++) {
                    if (this.seats[i] == false && help == 0) {
                        this.seats[i] = true;
                        help++;

                    }
                    if (this.seats[i] == true) {
                        help2++;
                    }

                    if (help2 == 5) {
                        System.out.println("there are no spaces in business, choose economy(2) or exit(3)?");
                        choice = scan.nextInt();

                    }
                    if (choice == 3) {
                        break;
                    }
                }
                display_seat_chart(seats);
                intro();
            } else if (choice == 2) {
                help = 0;
                help2 = 0;
                for (int i = 5; i < 10; i++) {
                    if (this.seats[i] == false && help == 0) {
                        this.seats[i] = true;
                        help++;
                        display_seat_chart(seats);
                    }
                    if (this.seats[i] == true) {
                        help2++;
                    }

                    if (help2 == 5) {
                        System.out.println("there are no spaces in economy, choose bussiness(1) or exit(3)?");
                        choice = scan.nextInt();
                    }
                    if (choice == 3) {
                        break;
                    }
                }
                help = 0;
                intro();
            } else {
                choice = 3;
            }
        }

    }
}
