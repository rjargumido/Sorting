/*
 * Name:	HeapSort in Java
 * Author:	Roy Joseph B. Argumido BSCS 2
 */
public class HeapSort extends SortingAlgorithm
{
	public HeapSort( int[] arr, int n)
	{
		super( arr, n ); 
	}
	
	int A[];
	
	public void sort()
	{
    	this.A=arr;
        int n = A.length;
         
        buildMaxHeap(A);
        for (int i = n - 1; i >= 0; i--)
        {
        	swap(0, i);
        	maxHeapify(arr, i, 0);
        }
	}
    
    private void swap(int i, int j)
    {
         int temp = A[i];
         A[i] = A[j];
         A[j] = temp;
     }
    
    void maxHeapify(int A[], int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
          
        if (l < n && A[l] > A[largest])
            largest = l;
 
        if (r < n && A[r] > A[largest])
            largest = r;
        
        if (largest != i)
        {
        	swap(i, largest);
            maxHeapify(A, n, largest);
        }
    }
    
    public void buildMaxHeap(int A[])
    {
        int n = A.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(A, n, i);
    }
}
