package codingClass.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import oops.Demo;
public class Occurence {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		frequency(s);
		
//		int[] arr = {2,5,1,4,1,4,1,5,1,3};
////		countPairs(arr);
//		
////		wordCount(s);
//		System.out.println(maxOccurrence(arr));
		
	}

	// frequency of characters in a string
//	static void frequency(String s) {
//
//		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (map.containsKey(ch)) {
//				int c = map.get(ch);
//				map.put(ch, c + 1);
//			} else {
//				map.put(ch, 1);
//			}
//		}
//		Set<Entry<Character, Integer>> entrySet = map.entrySet();
//		Set<Character> keys = map.keySet();
//		for(char key : keys) {
//			System.out.println(key+" - "+ map.get(key));
//		}
//	}
	
	static void frequency(String s){
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
//		Collection<Integer> values = map.pse ide for values();
//		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		Set<Character> keys = map.keySet();
		for(char key:keys) {
			System.out.println(key +"  " + map.get(key));
		}
		
	}
	
	
	// number of pairs in array
	static void countPairs(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int c = map.get(arr[i]);
				map.put(arr[i], c+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		Collection<Integer> values = map.values();
		int count = 0;
		for(int value : values) {
			if(value>1) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	// which word is occurred more than twice
	static void wordCount(String s) {
		String[] arr = s.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String word : arr) {
			if(map.containsKey(word)) {
				int c = map.get(word);
				map.put(word, c+1);
			}else {
				map.put(word, 1);
			}
		}
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			if(map.get(key)>2) {
				System.out.println(key);
			}
		}
	}
	
	
	
	// max occurrence of element in an array
	static int maxOccurrence(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer , Integer>();
		for(int a : arr) {
			if(map.containsKey(a)) {
				int c = map.get(a);
				map.put(a, c+1);
			}else {
				map.put(a, 1);
			}
		}
		
		int max=0, maxkey=0;
		Set<Integer> keySet = map.keySet();
		for(int key : keySet) {
			int value = map.get(key);
			if(value>max) {
				max=value;
				maxkey=key;
			}
		}
		return maxkey;
	}
}

























