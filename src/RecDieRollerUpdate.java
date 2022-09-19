/**
 * Updated for 1000 rolls to determine Snake Eyes
 * @author Aaron McCarley
 *  CS215
 * Assignment 3.1
 * Version 1.0
 */
public class RecDieRollerUpdate {

		public static void main(String[] args) {
			   
			RecDieRoller dice1;          
			// A changeable element
			int rollSum;
			// Sum of rolls 

			dice1 = new RecDieRoller(); //Create an Object for the Dice
			rollSum = 100;
	   
			do {
				dice1.rolls();
				System.out.println("The dice say " + dice1.getDieOne() 
	                                        + " and " + dice1.getDieTwo());
				rollSum++;
			} while (dice1.getTotal() != 2);
	   
			/** Sum of the number of rolls. */
			System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
			
			
			dice1 = new RecDieRoller(); //Create an Object for the Dice
			rollSum = 200;
	   
			do {
				dice1.rolls();
				System.out.println("The dice say " + dice1.getDieOne() 
	                                        + " and " + dice1.getDieTwo());
				rollSum++;
			} while (dice1.getTotal() != 2);
	   
			/** Sum of the number of rolls. */
			System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
	   
			
			dice1 = new RecDieRoller(); //Create an Object for the Dice
			rollSum = 300;
	   
			do {
				dice1.rolls();
				System.out.println("The dice say " + dice1.getDieOne() 
	                                        + " and " + dice1.getDieTwo());
				rollSum++;
			} while (dice1.getTotal() != 2);
	   
			/** Sum of the number of rolls. */
			System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
	   
			
			dice1 = new RecDieRoller(); //Create an Object for the Dice
			rollSum = 400;
	   
			do {
				dice1.rolls();
				System.out.println("The dice say " + dice1.getDieOne() 
	                                        + " and " + dice1.getDieTwo());
				rollSum++;
			} while (dice1.getTotal() != 2);
	   
			/** Sum of the number of rolls. */
			System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
	   
			dice1 = new RecDieRoller(); //Create an Object for the Dice
			rollSum = 500;
	   
			do {
				dice1.rolls();
				System.out.println("The dice say " + dice1.getDieOne() 
	                                        + " and " + dice1.getDieTwo());
				rollSum++;
			} while (dice1.getTotal() != 2);
	   
			/** Sum of the number of rolls. */
			System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
	   
			dice1 = new RecDieRoller(); //Create an Object for the Dice
			rollSum = 600;
	   
			do {
				dice1.rolls();
				System.out.println("The dice say " + dice1.getDieOne() 
	                                        + " and " + dice1.getDieTwo());
				rollSum++;
			} while (dice1.getTotal() != 2);
	   
			/** Sum of the number of rolls. */
			System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
	   
			dice1 = new RecDieRoller(); //Create an Object for the Dice
			rollSum = 700;
	   
			do {
				dice1.rolls();
				System.out.println("The dice say " + dice1.getDieOne() 
	                                        + " and " + dice1.getDieTwo());
				rollSum++;
			} while (dice1.getTotal() != 2);
	   
			/** Sum of the number of rolls. */
			System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
	   
			dice1 = new RecDieRoller(); //Create an Object for the Dice
			rollSum = 800;
	   
			do {
				dice1.rolls();
				System.out.println("The dice say " + dice1.getDieOne() 
	                                        + " and " + dice1.getDieTwo());
				rollSum++;
			} while (dice1.getTotal() != 2);
	   
			/** Sum of the number of rolls. */
			System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
	   
			dice1 = new RecDieRoller(); //Create an Object for the Dice
			rollSum = 900;
	   
			do {
				dice1.rolls();
				System.out.println("The dice say " + dice1.getDieOne() 
	                                        + " and " + dice1.getDieTwo());
				rollSum++;
			} while (dice1.getTotal() != 2);
	   
			/** Sum of the number of rolls. */
			System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
	   
			dice1 = new RecDieRoller(); //Create an Object for the Dice
			rollSum = 1000;
	   
			do {
				dice1.rolls();
				System.out.println("The dice say " + dice1.getDieOne() 
	                                        + " and " + dice1.getDieTwo());
				rollSum++;
			} while (dice1.getTotal() != 2);
	   
			/** Sum of the number of rolls. */
			System.out.println("\nIt takes " + rollSum + " rolls to get SnakeEyes(2).");
	   
			}//end main
	}// end class
