/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author albertton
 */
public class DiceGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
  
   
    int win = 0; //calculates wins, starts at zero
    int round = 0; //number of rounds played, starts at zero
    String prediction; //String for the JOptionPane
    int predictionNumber; //accepts the number
    String replay; //String for the JOptionPane to replay the game
    int retry = 0; //Entered at the end of the game
    String DiceNum;//Asks user for the number of dice
    int value; //total number on the dice
    int times;
               
    
do {
    DiceNum = (JOptionPane.showInputDialog(null, " Choose how many dice you want to roll. 1, 2, or 3. "));
    times = Integer.parseInt(DiceNum);

    Dice number = new Dice();
    number.setRolls(times);
    
    
    prediction = (JOptionPane.showInputDialog("Guess the total value on the dice.)"));
    predictionNumber  = Integer.parseInt(prediction); // scanner for the guess
    
number.Correct(predictionNumber);
number.Stats(predictionNumber);

}
while (retry == 0);

    }
    
}