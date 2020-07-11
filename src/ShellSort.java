/*
 * Name: ShellSort in Java
 * Author: Roy Joseph B. Argumido BSCS 2
 * Instructor: Dr. Riz Rupert L. Ortiz CS 202
 * Date: September 24, 2019
 */
public class ShellSort extends SortingAlgorithm
{
	public ShellSort(int[] arr, int n)
	{
		super(arr, n);
	}
	
	public void sort()
	{
		int n = arr.length; 
		 
		// Divides the array into 2 then reducing the size of the gap
        for (int dimension = n / 2; dimension > 0; dimension /= 2) 
        {
            for (int i = dimension; i < n; ++i) 
            {
                int j;
                
                for (j = i; j >= dimension && arr[j - dimension] > arr[i]; j -= dimension) 
                    arr[j] = arr[j - dimension]; 

                arr[j] = arr[i];
            }
        }
	}
}
