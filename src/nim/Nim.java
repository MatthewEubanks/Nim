/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

import java.util.Scanner;

/**
 *
 * @author Neil Eubanks
 */
public class Nim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String player1;
        String player2;
        String pileA = "A";
        String pileB = "B";
        String pileC = "C";
        int a = 3;
        int aRemove;
        int b = 3;
        int bRemove;
        int c = 3;
        int cRemove;

        System.out.print("Player 1, enter your name: ");
        player1 = input.next();
        System.out.print("Player 2, enter your name: ");
        player2 = input.next();

        System.out.println("A: " + a + "    B: " + b + "    C: " + c);

        while (a != 0 || b != 0 || c != 0) {
            System.out.println(player1 + ", choose a pile: ");
            String choice = input.next();

            while (choice.equalsIgnoreCase("A")) {
                if (a == 0) {
                    System.out.println("There are no counters in this pile. Try Again!");
                } else {
                    System.out.print("How many to remove from  " + pileA + ": ");
                    aRemove = input.nextInt();
                    if (aRemove <= 0) {
                        System.out.println("You must choose a positive number! Try Again...Cheater.");
                    } else if (aRemove > a) {
                        System.out.println("There are not that many counters in the pile. Try again!");
                    } else if (aRemove <= a) {
                        a = a - aRemove;
                        System.out.println(pileA + " : " + a + "\t" + b + " : " + pileB + "\t" + c + " : " + pileC);
                    }
                }//if else
            }//while choice equals A
            while (choice.equalsIgnoreCase("B")){
                if (b == 0){
                    System.out.println("There are no counters in this pile. Try again!");
                } else {
                    
                }
            }
        }//while a,b,c are not 0

    }//Main

}//Public Class
