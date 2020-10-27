package array;

public class ArrayRoatation {

	public static void main(String[] args) {

		int array[]= {1,2,3,4,5,6};
		
		for(int i=0;i<2;i++) {
			System.out.println("Left rotation");
			leftRotateArray(array);
			System.out.println();
		}
		for(int i=0;i<2;i++) {
			System.out.println("right rotation");
			rightRotateArray(array);
			System.out.println();
		}
		
	}

	private static void leftRotateArray(int[] array) {
		int firstElement=array[0];
		for(int i=0;i<array.length;i++) {
			if(array.length-1==i) {
				array[i]=firstElement;
			}else {
			array[i]=array[i+1];
			}
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}

	private static void rightRotateArray(int[] array) {
		int firstElement=array[array.length-1];
		for(int i=array.length-1;i>=0;i--) {
			if(i==0) {
				array[i]=firstElement;
			}else {
			array[i]=array[i-1];
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}

	
}
