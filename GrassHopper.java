public class GrassHopper {
	
	//Return the final grade with character format using three exam scores with numerical format (100 points).
	public static char getGrade(int s1, int s2, int s3) {
		char returnValue = ' ';
		int finalGrade = 0;
		int selectionFactor;
		
		finalGrade = (s1 + s2 + s3) / 3;
		selectionFactor = finalGrade / 10;
		switch(selectionFactor)
		{
			case 10: ;
			case 9: returnValue = 'A'; break;
			case 8: returnValue = 'B'; break;
			case 7: returnValue = 'C'; break;
			case 6: returnValue = 'D'; break;
			default: returnValue = 'F';
		}
		
		return returnValue;
	}
	
	//Return the sum from 1 to n given a positive natural number n.
	public static int summation(int n) {
		return (n*(n+1))/2;
	}
}
