package search;

public class InsertionSort {

	
	static void insertionSort(int [] a) {
		int j = 0;
		for(int i = 1; i<a.length; i++) {
			j = i-1;
			int key = a[i];
			while(j >= 0 && a[j] < key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
	}
	
	
		
	public static void main(String[] args) {
		int [] a = {3,2,7,5,9};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	    insertionSort(a);
	    
	    for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
}
