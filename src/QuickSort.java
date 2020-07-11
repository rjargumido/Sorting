/*
 * Name:	QuickSort in Java
 * Author:	Roy Joseph B. Argumido BSCS 2
 */
public class QuickSort extends SortingAlgorithm
{
		public QuickSort(int[] arr, int n)
		{
			super(arr, n); 
		}
		
		int arry[];
		
		public void sort()
		{
		     sort(arr, 0, n - 1);
		}
		
		void sort(int arr[], int start, int end)
		{
			 this.arry = arr;
			 
			 if(start < end)
		     {
				 int p = partition(start, end);
		         sort(arry, start, p-1);
		         sort(arry, p+1, end);
		     }
		}
		
		int partition(int start, int end)
		{
			int pivot = arry[end];
			int pvtNdx = start;
			
			for(int i = start; i <= end - 1; ++i)
			{
				if(arry[i] <= pivot)
				{
					swap(pvtNdx, i);
					pvtNdx += 1;
		        }
		    }
			swap(pvtNdx,end);
		    return pvtNdx;
		 }
		 
		 private void swap(int i, int j)
		 {
			 int temp = arry[i];
		     arry[i] = arry[j];
		     arry[j] = temp;
		 }
}
