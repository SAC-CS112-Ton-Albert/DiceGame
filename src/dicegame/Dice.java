/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import javax.swing.JOptionPane;

public class Dice {
	private int value;
	private int predictionNumber;
        private int win;
        private int round;
	
	public Dice() {}
	
	public void setRolls(int times)
	{
		this.value = value;
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

}
	

	


    