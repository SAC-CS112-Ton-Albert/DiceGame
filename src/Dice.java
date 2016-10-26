/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albertton
 */
public class Dice {
    
private int d;
private int value;


	public Dice(int number_of_dice) {
		d = number_of_dice;
	}

	int NumDice(int number_of_dice) {
		int highest = 6 * d;
		int lowest = d;
                
		int difference = (highest - lowest);
		value =(int) (Math.random() * difference) + lowest;
                
		return value;
	}

}
    

