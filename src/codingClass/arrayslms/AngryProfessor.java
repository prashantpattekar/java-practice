package codingClass.arrayslms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AngryProfessor {
	
	static String angryProfessor(int k, int [] a) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] <= 0) {
				count++;
			}
		}
		if(count >= k) {
			return "NO";
		}
		else {
			return "YES";
		}
	}
	
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println(angryProfessor(k,a));
	}
	
	
	public int[] intersect(int[] nums1, int[] nums2) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums1.length; i++) {
			
			if(map.containsKey(nums1[i])) {
				map.put(nums1[i], map.getOrDefault(nums1[i], 0) +1 );
			}
		}
		
		for (int i = 0; i < nums2.length; i++) {
			
			if(map.containsKey(nums2[i]) && map.get(nums2[i])>0) {
				
				al.add(nums2[i]);
				
				map.put(nums2[i], map.get(nums2[i])-1);
			}
		}
		
		int[] ans = new int[al.size()];
		for(int i=0; i<al.size(); i++) {
			ans[i]=al.get(i);
		}
		
		return ans;
	}
	
	
}


























