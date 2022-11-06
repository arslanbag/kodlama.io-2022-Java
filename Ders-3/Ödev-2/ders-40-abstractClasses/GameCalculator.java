
public abstract class GameCalculator 
{
	public abstract void hesapla();
	
	public final void gameOver() //Not Overriding
	{
		System.out.println("Oyun Bitti");
	}
}
