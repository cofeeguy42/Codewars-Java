public class Sum {
	public static int arrayPlusArray(int[] arr1, int[] arr2) {
		int retValue = 0;
		
		if(arr1.length < arr2.length)
		{
			//Add common length of the arrays:
			for(int i = 0; i < arr1.length; i++)
			{
				retValue += (arr1[i] + arr2[i]);
			}
			//Add extra elements of arr2:
			for(int j = arr1.length; j < arr2.length; j++)
			{
				retValue += arr2[j];
			}
		}
		if(arr1.length < arr2.length)
		{
			//Add common length of the arrays:
			for(int i = 0; i < arr2.length; i++)
			{
				retValue += (arr1[i] + arr2[i]);
			}
			//Add extra elements of arr1:
			for(int j = arr2.length; j < arr1.length; j++)
			{
				retValue += arr1[j];
			}
		}
		else
		{
			for(int i = 0; i < arr1.length; i++)
			{
				retValue += (arr1[i] + arr2[i]);
			}
		}
		
		return retValue;
	}
}
