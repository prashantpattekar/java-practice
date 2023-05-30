package search;

public class SelectionSort {

	
	static void selectionSort(int[] a) {
		for(int i = 0; i<a.length-1; i++) {
			int min_i = i;
			for(int j = i+1; j<a.length; j++) {
				if(a[j] < a[min_i]) {
					min_i = j;
				}
			}
			int temp = a[i];
			a[i] = a[min_i];
			a[min_i] = temp;
			
		}
	}
	
	public static void main(String[] args) {
		int [] a = {3,2,7,5,9};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	    selectionSort(a);
	    
	    for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
