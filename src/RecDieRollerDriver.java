/** Rolls the dice until the dice come up Snake Eyes(2)
 * @author Aaron McCarley
 * CS215
 * Assignment 3.1
 * Version 1.0
 * @param args
 */
public class RecDieRollerDriver {

	public static void main(String[] args) {
   
		RecDieRoller dice;          
		// A changeable element
		int rollSum;
		// Sum of rolls 

		dice = new RecDieRoller(); //Create an Object for the Dice
		rollSum = 0;
   
		do {
			dice.rolls();
			System.out.println("The dice say " + dice.getDieOne() 
                                        + " and " + dice.getDieTwo());
			rollSum++;
		} while (dice.getTotal() != 2);
   
		/** Sum of the number of rolls. */
		System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
   
		}//end main
}// end class