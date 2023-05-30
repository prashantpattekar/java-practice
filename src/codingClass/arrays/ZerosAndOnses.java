package codingClass.arrays;

public class ZerosAndOnses {
	public static void main(String[] args) {
//		System.out.println();
		int[] arr = {0,0,0,1,1,1,1,1,0};
		move(arr);

	
	}

	private static void move(int[] arr) {

		int i=0,j=arr.length-1;
		while(i<j) {
			while(arr[i]==1) {
				i++;
			}
			while(arr[j]==0) {
				j--;
			}
			arr[i++]=1;
			arr[j--]=0;
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}
	
	static void movezeros(int[] arr) {
		int i=0, j=arr.length-1;
		
		while(i<=j) {
			if(arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
			}else {
				i++;
			}
		}
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
