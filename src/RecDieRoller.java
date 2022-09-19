/** A class that represents a pair of dice, in which both dive can be rolled
 * for a value from 1 to 6. Random values are generated until the value is 2.
 * @author Aaron McCarley
 * CS215
 * Assignment 3.1
 * Version 1.0
 *
 */
public class RecDieRoller {

   private int dieOne, dieTwo;   // The number for the first and second die.

   // Create a pair of dice and roll them for a random value.
   public RecDieRoller() {
       rolls(); // Call the method.
   }//end empty constructor
   
   //Set each random number between 1 and 6.
   public void rolls() {
       dieOne = (int)(Math.random()*6) + 1;
       dieTwo = (int)(Math.random()*6) + 1;
   }// end rolls
           
   // Return the sum of the first die.
   public int getDieOne() {
      return dieOne;
   }//end getDieOne
   
   //Set the value of the first die.
   public void setDieOne( int dieSum ) {
      if ( dieSum < 1 && dieSum > 6 )
         throw new IllegalArgumentException("Not Valid" + dieSum);
      dieOne = dieSum;
   }//end setDieOne
   
   // Return the sum of the second die. 
   public int getDieTwo() {
      return dieTwo;
   }//end getDieTwo
   
   //Set the value of the second die.
   public void setDieTwo( int dieSum ) {
	   if ( dieSum < 1 && dieSum > 6 )
         throw new IllegalArgumentException("Not Valid" + dieSum);
      dieTwo = dieSum;
   }//end setDieTwo
   
   //Return the total sum of the two dice. 
   public int getTotal() {
      return dieOne + dieTwo;
   }//end getTotal
   
   /**
    * Return a String representation of a pair of dice, where die1
    * and die2 are instance variables containing the numbers that are
    * showing on the two dice.
    */
   public String toString() {
	   
      if (dieOne == dieTwo)
         return  " SnakeEyes " + dieOne;
      else
         return dieOne + " and " + dieTwo;
   }// end class
}
