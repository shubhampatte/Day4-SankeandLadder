public class snakeandLadder
{
	public static void main(String args[])
	{

		int startPosition = 0;
		System.out.println("Starting position of player : " +startPosition);
			
		int diceRollValue = (int) (Math.random()*6)+1;
		System.out.println("Dice value :" +diceRollValue);
		
		startPosition += diceRollValue;
		System.out.println("Current position after dice roll :" +startPosition);

		
	}
}