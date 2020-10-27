package array;

public class ReverseArray {

	public static void main(String[] args) {

		int array[]= {1,2,3,4,5,6};

		for(int i=0;i<array.length/2;i++) {
			
			int temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}

}
