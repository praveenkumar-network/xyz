package array;

public class KthElementRoatation {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9,10,11};

		int firstElement=1;
		int firstElementIndex=0;
		int kthElement=4;
		for(int i=0;i<array.length;i++) {
			
			if(i==kthElement-1) {
				int temp=array[i];
				array[i]=firstElement;
				array[firstElementIndex]=temp;
				if(array.length !=i+1) {
					firstElement=array[i+1];
					firstElementIndex=i+1;
					kthElement=kthElement*2;
				}
				
			}
			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}

}
