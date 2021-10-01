public class snakeandLadder
{
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int NO_PLAY = 3;
	
	public static void main(String args[])
	{

		int startPosition = 0;
		System.out.println("Starting position of player : " +startPosition);
		
		int winPosition = 100;
		
		while(startPosition <= winPosition)
		{
		
		int choice = (int) (Math.random()*3)+1;
		System.out.println("Player choice :" +choice);
		
		switch(choice)
		{
			case LADDER:
			
				int diceRollValue = (int) (Math.random()*6)+1;
				System.out.println("Dice value :" +diceRollValue);
				
				startPosition += diceRollValue;
				System.out.println("Current position after dice roll :" +startPosition);
				
			break;
				
			case SNAKE:
			
				
				if (startPosition == 0)
				{
					startPosition = 0;
					System.out.println("player is at starting position : " +startPosition);
				}
				else
				{
					int diceRollValue1 = (int) (Math.random()*6)+1;
					System.out.println("Dice value :" +diceRollValue1);
					
					startPosition -= diceRollValue1;
					System.out.println("Current position after dice roll :" +startPosition);
				}	
				
			break;
				
			case NO_PLAY:
			
				System.out.println("Player is at same position :" +startPosition);
				
			break;
			
			default:
				
				System.out.println("player dont want to play");
			
			break;
			
			
		}	
		
		}
		
		
		
	}
}