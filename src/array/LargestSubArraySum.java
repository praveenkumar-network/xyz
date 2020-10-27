package array;

public class LargestSubArraySum {
	
public static void main(String[] args) {
	  int [] b = {-2, -3, 4, -1, -2, 1, 5, -3}; 
	  int [] a = {2, 0, 2, 1, 4, 3, 1, 0}; 
	  maxSubArraySum(b,b.length);
	
}
static void maxSubArraySum(int a[], int size) 
{ 
    int max_so_far = Integer.MIN_VALUE, 
    max_ending_here = 0,start = 0, 
    end = 0, s = 0; 

    for (int i = 0; i < size; i++)  
    { 
        max_ending_here += a[i]; 

        if (max_so_far < max_ending_here)  
        { 
            max_so_far = max_ending_here; 
            start = s; 
            end = i;
        } 

        if (max_ending_here < 0)  
        { 
            max_ending_here = 0; 
            s = i + 1; 
        } 
    } 
    System.out.println("Maximum contiguous subarray sum is " 
                       + max_so_far); 
    System.out.println("Starting index " + start); 
    System.out.println("Ending index " + end); 
} 

}
