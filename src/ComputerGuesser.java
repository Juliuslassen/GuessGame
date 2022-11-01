import java.util.Random;

public class ComputerGuesser implements IGuesser
{
	private int min;
	private int max;
	private int r;


	public void yourTurn() {}

	public String getName()
	{
		return "Computer guesser";
	}

	public void newGame(int min, int max, String opponent, String type)
	{
		this.min = min;
		this.max = max;
	}


	public int makeGuess()
	{
		Random randomNum = new Random();
		r = randomNum.nextInt(min,max);

		return r;
	}

	public void guessFeedback(Answer answer)
	{
		switch(answer)
		{
			case TOO_LOW:
				min = r + 1;
				break;
			case TOO_HIGH:
				max = r;
				break;
			case CORRECT:
				break;
			default:
				throw new RuntimeException("This should never happen!");
		}
	}

	public boolean endOfGame(int numberOfGuesses, String opponent)
	{
		return true;
	}

}
