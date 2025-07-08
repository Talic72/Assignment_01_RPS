import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String player1 = "";
        String player2 = "";

        // first input
        do {
            System.out.println("Player 1, Please enter R, P, S for rock paper or scissors respectively: ");
            player1 = in.nextLine();
            //Validation check
            if (!player1.equalsIgnoreCase("R") && !player1.equalsIgnoreCase("P") && !player1.equalsIgnoreCase("S")) {
                System.out.println("That input is not valid, please enter a correct value: ");
            }
        } while (!player1.equalsIgnoreCase("R") && !player1.equalsIgnoreCase("P") && !player1.equalsIgnoreCase("S"));

        //second input

        do {
            System.out.println("Player 2, Please enter R, P, S for rock paper or scissors respectively: ");
            player2 = in.nextLine();
            //Validation check
            if (!player2.equalsIgnoreCase("R") && !player2.equalsIgnoreCase("P") && !player2.equalsIgnoreCase("S")) {
                System.out.println("That input is not valid, please enter a correct value: ");
            }
            } while (!player2.equalsIgnoreCase("R") && !player2.equalsIgnoreCase("P") && !player2.equalsIgnoreCase("S"));


        //tie check
        if (player1.equalsIgnoreCase(player2)) {
            System.out.println(player1 + " Vs. " + player2 + ": Its a tie!");
        }
        //player 1 scissors check
        else if (player1.equalsIgnoreCase("S")) {
            if (player2.equalsIgnoreCase("R")) {
                System.out.println(player1 + " Vs. " + player2 + ": Rock crushes Scissors, player 2 wins!");
            } else {
                System.out.println(player1 + " Vs. " + player2 + ": Scissors cut Paper, player 1 wins!");
            }
        }
        //player 1 Rock check
        else if (player1.equalsIgnoreCase("R")) {
            if (player2.equalsIgnoreCase("S")) {
                System.out.println(player1 + " Vs. " + player2 + ": Rock crushes Scissors, player 1 wins!");
            } else {
                System.out.println(player1 + " Vs. " + player2 + ": Paper covers Rock, player 2 wins!");
            }
        //player 1 paper check
        } else if (player1.equalsIgnoreCase("P")) {
            if (player2.equalsIgnoreCase("S")) {
                System.out.println(player1 + " Vs. " + player2 + ": Scissors cuts Paper, player 2 wins!");
            } else {
                System.out.println(player1 + " Vs. " + player2 + ": Paper covers Rock, player 1 wins!");
                    }
                }
            }
    }

