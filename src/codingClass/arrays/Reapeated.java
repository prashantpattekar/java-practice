package codingClass.arrays;

public class Reapeated {
	
	public static void main(String[] args) {
	
		int[] ar1 = {3,5,6,8,9};
		int[] ar2 = {2,3,4,6,7,8,8};
		
		printReapeated(ar1, ar2);
	}

	private static void printReapeated(int[] ar1, int[] ar2) {
		  int i=0, j=0;
		  
		  while(i<ar1.length && j<ar2.length) {
			  if(ar1[i] == ar2[j]) {
				  System.out.print(ar1[i] + " ");
				  i++;
				  j++;
			  }
			  else if(ar1[i]<ar2[j]) i++;
			  else j++;
		  }
	}
}
