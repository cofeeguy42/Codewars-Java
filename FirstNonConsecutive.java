public class FirstNonConsecutive {
	
	//Return the first non-consecutive number on the array or null if the array is ordered or has less than 2 elements.
	static Integer find(final int[] array)
	{
		Integer returnValue = null;
		
		if(array.length >= 2)
		{
			int i = 0, j = 1;
			while(i < array.length-1)
			{
				if(array[j]-1 > array[i])
				{
					returnValue = new Integer(array[j]);
					break;
				}
				i++;
				j++;
			}
		}
		
		return returnValue;
	}
}
