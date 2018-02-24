package lab1_fixed;

import java.util.LinkedList;

public class Round {

	private static  int ComeOutScore;
	private static  eGameResult eGameResult;
	private static LinkedList<Roll> rolls = new LinkedList<Roll>();
	
	private static int Rollround = 0;
		
		public static void main(String[] args) {
		
		Roll example1 = new Roll();
		ComeOutScore = example1.getScore();
		
		switch (ComeOutScore) {
		case 7:
		case 11:
			eGameResult = lab1_fixed.eGameResult.NATURAL;
			System.out.println("the round is over: NATURAL");
			Rollround ++;
			System.out.printf("the roll round is %d", Rollround);
			break;
		case 2:
		case 3:
		case 12:
			eGameResult = lab1_fixed.eGameResult.CRAPS;
			System.out.println("the round is over: CRAPS");
			Rollround ++;
			System.out.printf("the roll round is %d", Rollround);
			break;
		default:
			eGameResult = lab1_fixed.eGameResult.CONTINUE;
			System.out.printf("Point is %d",ComeOutScore);
			Rollround ++;
			break;
		}
		
		if (eGameResult == lab1_fixed.eGameResult.CONTINUE){
		while(eGameResult == lab1_fixed.eGameResult.CONTINUE)		{
			rolls.add(new Roll());
			if (rolls.getLast().getScore() == 2 || rolls.getLast().getScore() == 3 || rolls.getLast().getScore() == 12)
			{
				eGameResult = lab1_fixed.eGameResult.CONTINUE;
				Rollround ++;
				continue;
			}
			else if (rolls.getLast().getScore() == 7) {
					eGameResult = lab1_fixed.eGameResult.SEVEN_OUT;
					Rollround ++;
					break;
				}
			else {
				eGameResult = lab1_fixed.eGameResult.POINT;
				Rollround ++;
				break;
			}
		}
		}
		if (eGameResult == lab1_fixed.eGameResult.POINT) {
			System.out.println(" Win!!");
			System.out.printf("The roll count is: %d", Rollround);
			
			
		}
		else if (eGameResult == lab1_fixed.eGameResult.SEVEN_OUT){
			System.out.println(" Seven-out");
			System.out.printf("The roll count is: %d", Rollround);
			
		}
		
		System.out.print("\n" + example1.getScore());
		for(int i=0;i<rolls.size();i++){
		    System.out.print( "-" + rolls.get(i).getScore());
		} 
		}
		

	public int RollCount() {
		return Round.Rollround;
	}
}

