/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import javax.swing.JOptionPane;
import java.util.Random;

public class Dice {
	private int value;
	private int predictionNumber;
        private int win;
        private int round;
	private int times;
        private int high;
        private int HistoryNumThrows;
        
	public Dice() {
            HistoryNumThrows = 0;
            high = 6;
        }
	
	public void setRolls(int number)
	{
		HistoryNumThrows++;
		high = high * number;
		
                Random rand = new Random();
                int randomInt = rand.nextInt(3);
                
               
                int value = ( 1 + (int) (Math.random() * high) );
                
	}
		
public void Correct(int predictionNumber)
	{
		if(this.value == predictionNumber)
			JOptionPane.showMessageDialog(null, "You are correct!");
		else
			JOptionPane.showMessageDialog(null, "You are incorrect!");
		
	}
public void Stats(int predictionNumber )
        {
                round++;
                
                if(this.value == predictionNumber)
                    win++;
                
        }
                                
public void HistoryStats(int win)
	{
		JOptionPane.showMessageDialog (null,"Games won:" + win);
	}
	
public void History()
	{
		JOptionPane.showMessageDialog (null, "Number of throws: " + HistoryNumThrows);
                
              
	}
public void WinPercentage()
        {
		JOptionPane.showMessageDialog (null, "Number of throws: " + win/round);
                
              
	}
	
}

	


    