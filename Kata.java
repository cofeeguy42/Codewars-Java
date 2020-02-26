public class Kata {
	
	//Find the nth power of the element n of the array.
	public static int nthPower(int[] array, int n) {
		int aux = 0, returnValue = -1;
		
		if(n <= (array.length - 1))
		{
			returnValue = (int) Math.pow(array[n],n);
		}
		
		return returnValue;
	}
	
	//Can we divide a group of watermelons in two even groups (one can be bigger than the other)?
	public static boolean divide(int weight) {
		boolean returnValue = false;
		
		if(weight%2 == 0 && weight >= 4)
		{
			returnValue = true;
		}
		
		return returnValue;
	}
	
	//Check if you are better than the average of your clasroom.
	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
		boolean returnValue;
		int average = 0;
		
		//Compute the average:
		for(int score : classPoints)
		{
			average += score;
		}
		average /= classPoints.length;
		
		//Compare:
		returnValue = (yourPoints > average) ? true : false;
		
		return returnValue;
	}
}
