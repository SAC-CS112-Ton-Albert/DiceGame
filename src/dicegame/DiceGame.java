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
        
  
    int value = 0; //calculates the value on the dice
    float win = 0; //calculates wins
    float round = 0;
    float loss = 0; 
    String prediction;
    int predictionNumber;
    String replay;
    int retry = 0;
    String DiceNum;
    int NumDice;
               
    
do {
    DiceNum = (JOptionPane.showInputDialog(null, " Choose how many dice you want to roll. 1, 2, or 3. "));
    NumDice = Integer.parseInt(DiceNum);
    prediction = (JOptionPane.showInputDialog("Enter 1 for a low number (2-6) or 2 for a high number (7-12)"));
    predictionNumber  = Integer.parseInt(prediction); // scanner for the guess
    if (predictionNumber != value)
        JOptionPane.showMessageDialog(null, "You are incorrect!");
    if (predictionNumber == value) 
        JOptionPane.showMessageDialog(null, "You are correct!");
    
    if (predictionNumber != value)
        loss++;
    if (predictionNumber == value) 
        win++;

round++;
   
    
    replay = (JOptionPane.showInputDialog("Enter 0 to play again. Enter any key to quit."));
    retry  = Integer.parseInt(replay); 
}
while (retry == 0);

JOptionPane.showMessageDialog(null, "Win percentage: " + (win/round)*100 +"%");
    
        
}
        
    }
    

