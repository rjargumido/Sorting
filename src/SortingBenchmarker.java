import java.util.*;
import java.io.File;

public class SortingBenchmarker {
	static final String DELIMITER = "\t";
	static final int NUM_EXPERIMENTS = 20;
	static final int RUNS = 2;
	
	public static void main ( String[] args ) throws Exception
	{
		//3913539
		System.out.println("\tBucketSort\tInsertionSort\tQuickSort");
		for(int i = 0; i < RUNS; i++) {
			
			Scanner sc = new Scanner(new File("SortingInput.txt"));

			int numCases = sc.nextInt();
			
			System.out.print(i + 1 + "\t");
			for (int ix = 0; ix < numCases; ++ix)
				benchmark(sc);
			
			sc.close();
		}
		System.out.println("DONE");
	}
	
	
	public static void benchmark (Scanner sc)
	{
		int numItems = sc.nextInt();
		int[] arrOrig = new int[numItems];
		
		// store contents to an array
		for (int i = 0; i < numItems; ++i)
			arrOrig[i] = sc.nextInt();

		SortingAlgorithm bucket = new BucketSort( arrOrig, numItems );
		SortingAlgorithm insert = new InsertionSort( arrOrig, numItems );
		
		//arrOrig.System.out.println(numItems);
		System.out.printf("%.2e%s", bucket.getAverageRunTime(NUM_EXPERIMENTS), DELIMITER);
		System.out.printf("%.2e\n", insert.getAverageRunTime(NUM_EXPERIMENTS));
	}
}

