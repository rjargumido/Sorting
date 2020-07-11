/*
 * Name: BinarySort in Java
 * Author: Roy Joseph B. Argumido BSCS 2
 * Instructor: Dr. Riz Rupert L. Ortiz CS 202
 * Date: October 25, 2019
 */
public class BinarySort extends SortingAlgorithm
{
	public BinarySort(int[] arr, int n)
	{
		super(arr, n);
	}
	
	public void sort()
	{
		int i, n = arr.length;
	    for (i = 1; i < n; ++i)
	    {
	        int lowIndex = 0;
	        int highIndex = i;
	        int b = arr[i];

	        //while loop for binary search
	        while(lowIndex < highIndex)
	        {
	            int middle = lowIndex + (highIndex - lowIndex) / 2; //avoid int overflow
	            
	            if (b >= arr[middle])
	                lowIndex = middle + 1;
	            else
	                highIndex = middle;
	        }
	        //replace elements of array
	        System.arraycopy(arr, lowIndex, arr, lowIndex + 1, i - lowIndex);
	        arr[lowIndex] = b;
		}
	}
}
