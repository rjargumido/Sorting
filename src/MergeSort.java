/*
 * Name:	MergeSort in Java
 * Author:	Roy Joseph B. Argumido BSCS 2
 */
public class MergeSort extends SortingAlgorithm
{
	public MergeSort(int[] arr, int n)
	{
		super(arr, n);
	}
	
	public void sort()
	{
		performMergeSort(arr, 0, n-1);
	}
	
	void performMergeSort(int arry[], int left, int right)
	{
		if (left < right)
        {
            int mid = (left + right) / 2;
            performMergeSort(arry, left, mid);
            performMergeSort(arry , mid+1, right);
            merge(arry, left, mid, right);
        }
	}
	
	void merge(int A[], int lft, int mid, int rght)
	{
		int nL = mid - lft + 1;
        int nR = rght - mid;
 
        int left[] = new int [nL];
        int right[] = new int [nR];
 
        for(int i = 0; i < nL; ++i)
            left[i] = A[lft + i];
        
        for(int j = 0; j < nR; ++j)
            right[j] = A[mid + 1 + j];
 
        int i = 0, j = 0;
        int k = lft; 
        
        while(i < nL && j < nR)
        {
            if(left[i] <= right[j])
            {
                A[k] = left[i];
                ++i;
            }
            else
            {
                A[k] = right[j];
                ++j;
            }
            ++k;
        }
        while(i < nL)
        {
            A[k] = left[i];
            ++i;
            ++k;
        }
        
        while(j < nR)
        {
            A[k] = right[j];
            ++j;
            ++k;
        }
	}
}
