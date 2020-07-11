/*
 * Name:	Bucket sort in Java
 * Author:	Roy Joseph B. Argumido BSCS 2
 */
public class BucketSort extends SortingAlgorithm
{
	
	public BucketSort(int[] arr, int n)
	{
		super(arr, n);
	}
	
	public void sort()
	{
		int i, j = 0;
		int[] bucket = new int[n];
		
		for(i = 0; i < n; ++i)
		{
			bucket[i] = 0;	//Initially setting the values of the buckets to 0
			bucket[i] += 1;	//Adds a value to the current bucket's value
			while(bucket[i] > 0)
			{
				arr[j++] = i;
				bucket[i]--;
			}
		}
	}
}
