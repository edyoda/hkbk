package ds.algo;

public class Partition {
	
	static int findMinRec(int[] arr, int n, int S1, int S2)
	{
	    
	    if (n<0)
	        return Math.abs(S1-S2);
	
	    int min1 = findMinRec(arr, n-1, S1 + arr[n], S2);
	    int min2 = findMinRec(arr, n-1, S1, S2 + arr[n]);
	    //System.out.println("First Set - " + min1);
	    //System.out.println("Second Set - " + min2);
	    return Math.min(min1,min2);
	    
	}
	 
	 // Returns minimum possible difference between sums
	// of two subsets
	static int findMin(int arr[], int n)
	{
	    // Compute total sum of elements
	    int sumTotal = 0;
	    for (int i=0; i<n; i++)
	        sumTotal += arr[i];
	 
	    // Compute result using recursive function
	    return findMinRec(arr, n, 0, sumTotal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {3, 1, 4, 2, 2, 1};
		    int n = arr.length;
		    System.out.println("The minimum difference between two sets is ");
		    System.out.println(findMinRec(arr, n-1 , 0 , 0));
		    }

}
