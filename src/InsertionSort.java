/*
 * Name: InsertionSort in Java
 * Author: Roy Joseph B. Argumido BSCS 2
 * Instructor: Dr. Riz Rupert L. Ortiz CS 202
 * Date: September 24, 2019
 */

public class InsertionSort extends SortingAlgorithm{

	public InsertionSort(int[] arr, int n)
	{
		super(arr, n);
	}
	
	public void sort()
	{
		int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            } 
            arr[j + 1] = key;
        }
	}
	
	/*
	public void sort()
	{
		int n = arr.length;
		
        for (int i = 1; i < n; ++i)
        {
            int j;
            for(j = i - 1; j >= 0 && arr[j] > arr[i]; --j)
            	arr[j + 1] = arr[j];
            
            arr[j + 1] = arr[i];
        }
	}
	*/
}