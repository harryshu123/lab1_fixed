package lab1_fixed;

public class Roll {

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		d1 = new Die();
		d2 = new Die();
		Score = d1.getDieValue() + d2.getDieValue();
		
	}
	
	
	
	public int getScore() {
		return Score;
	}
	public boolean isSeven() {
			return (Score == 7? true:false);
		}
	
	
}

