package codingClass.arrayslms;

public class MigratoryBirds {
	
	public static int migratoryBirds(int[] a) {
		int[] birds = new int[6];
		for(int i=0; i<a.length; i++) {
			birds[a[i]]++;
		}
		
		int maxIndex = 0, max = -1;
		for (int i = 1; i < birds.length; i++) {
			if(birds[i] > max) {
				max = birds[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static void main(String[] args) {
		
		int [] a = {1,1,2,2,3,4};
		System.out.println(migratoryBirds(a));
	}

}
