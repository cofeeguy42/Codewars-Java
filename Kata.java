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
	
	//Compute volume of a cuboid.
	public static double getVolumeOfCuboid(final double length, final double width, final double height) {
		return length*width*height;
	}
	
	//Convert number to negative.
	public static int makeNegative(final int x) {
		return (x > 0) ? -x : x;
	}
	
	//Reverse the given String.
	public static String solution(String str) {
		StringBuffer rawRetValue = new StringBuffer();
		for(int i = str.length()-1; i >= 0; i--)
		{
			rawRetValue.append(str.charAt(i));
		}
		return new String(rawRetValue);
	}
	
	//Convert a long into a int array that contains the same numbers that the given long but in reverse order.
	public static int[] digitize(long n) {
		String parsedN = new String(Long.toString(n));
		int[] retValue = new int[parsedN.length()];
		int aux = 0;
		for(int i = parsedN.length()-1; i >= 0; i--)
		{
			retValue[aux] = Character.getNumericValue(parsedN.charAt(i));
			aux++;
		}
		return retValue;
	}
}
