/*
ASSESSMENT TASK

NAME: KIERAN TODD

DATE: 28/09/17

I certify that this is my own work and I have not used code from any other source.
 */
package gameof21;

/*This will allow the user to input values and have randomly genrated numbers*/
import java.util.Scanner;
import java.util.Random;

public class GameOf21 {

    public static void main(String[] args) {
        /*This is the area in the program where all of the varibales are being declared*/
        int UserEntry;
        int Game = 21;
        int Quit = 2;
        int turns = 0;
        boolean CPUturn = false;
        Scanner input = new Scanner(System.in);
        String Name;
        /*This will display the rules of the game as well as ask the player for his or her name*/
        System.out.println("This is a game of 21, the player will choose to take between 1 - 3 sticks");
        System.out.println("The computer will choose do the same");
        System.out.println("Thw winner will be the player to reach 0 first\n");
        System.out.println("What is your name?: ");
        Name = input.nextLine();

        while (Quit == 2) {
            /*This will continue to loop the game so long as the variable quit is equal to the value 2*/
            Game = 21;
            turns = 0;
            /*This will reset the game counter to 21*/
            while (Game >= 1) {
                System.out.println("\nHow many sticks will you take: ");
                UserEntry = input.nextInt();
                while (UserEntry < 1 || UserEntry > 3) {
                    /*This will make sure that the user enters a valid number between 1 and 3, if not they will be asked again and again*/
                    System.out.println("That is an Invalid number, Please re-enter");
                    UserEntry = input.nextInt();
                }
                while (UserEntry > Game) {
                    /*This makes sure that the player cannot take more sticks than the sticks that are left*/
                    System.out.println("There is not that many tokens left");
                    System.out.println("Please re-enter");
                    System.out.println("\nSticks Remaining " + Game);
                    UserEntry = input.nextInt();
                }
                Game -= UserEntry;
                turns += 1;
                System.out.println("\nSticks Remaining " + Game);
                if (Game < 1) {
                    System.out.println("Congratulations " + Name + " you won!!!");
                    System.out.println("The game took " + turns + " turns to finish");
                } else 
                {   CPUturn = true;
                    if (Game > 3) 
                    {
                        /*This will check if the sticks remaining are over three if so it will generate a random number to take away*/
                        if (CPUturn = true) 
                        {
                            Random rand = new Random();
                            int Tokens = rand.nextInt(3) + 1;
                            Game -= Tokens;
                            turns += 1;
                            /*This will take away the randomly generated number form the computer away from the availible stciks*/
                            System.out.println("\n-Your oppenent took " + Tokens + " sticks-");
                            System.out.println("Sticks Remaining " + Game);
                            
                        }
                    }
                    else
                    {
                        /*This will take the remaining sticks away and diplay a losing message to the player*/
                        if (Game == 1) {
                            System.out.println("\nYour oppenent took 1 stick");
                            System.out.println("Sorry " + Name + " you have lost, Try again");
                            System.out.println("The game took " + turns + " turns to finish");
                            Game = 0;
                        } else if (Game == 2) {
                            System.out.println("\nYour oppenent took 2 sticks");
                            System.out.println("Sorry " + Name + " you have lost, Try again");
                            System.out.println("The game took " + turns + " turns to finish");
                            Game = 0;
                        } else if (Game == 3) {
                            System.out.println("\nYour oppenent took 3 sticks");
                            System.out.println("Sorry " + Name + " you have lost, Try again");
                            System.out.println("The game took " + turns + " turns to finish");
                            Game = 0;
                        }
                    }
                }
                
            }
                System.out.println("\n\nWould you like to Restart or Quit");
                System.out.println("Press '1'to quit the game or '2' to restart\n");
                Quit = input.nextInt();
                if (Quit == 1) {
                    System.exit(0);
                }
                /*This will ask the user if they wish to quit the game or restart the game, if they type 1 the game will end, if they type 2 it will take the user back line 31*/
        }
    }
}

