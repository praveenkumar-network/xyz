package array;

public class HigestElement {

	public static void main(String[] args) {

		 int array[] = new int[]{3,5,8,7,4,9,1,2};
		int maxElement=0;
		for(int i=0,j=array.length-1;i<array.length/2;i++,j--){

		    if(array[i]>maxElement){
		        maxElement=array[i];
		    }
		    
		    if(array[j]>maxElement){
		        maxElement=array[j];
		    }
		}
		System.out.println(maxElement);

	}

}
