package codingClass.arrays;

public class Merge1By1 {
	
	public static void main(String[] args) {
		System.out.println();
		
		int[] ar1 = {2,3,4};
		int[] ar2 = {5,6,7,8};
		int[] ar3 = {9,10,11,12,13};
		
		
		int[] res = merge(ar1,ar2,ar3);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
	
	
	static int[] merge(int[] ar1,int[] ar2, int[] ar3) {
		int i=0, j=0;
		int[] res = new int[ar1.length+ar2.length+ar3.length];
		
		while(j<res.length) {
			if(i<ar1.length) {
				res[j++] = ar1[i];
			}
			
			if(i<ar2.length) {
				res[j++] = ar2[i];
			}
			
			if(i<ar3.length) {
				res[j++] = ar3[i];
			}
			
			i++;
		}
		return res;
	}

}
