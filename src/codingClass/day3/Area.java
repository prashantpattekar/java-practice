package codingClass.day3;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius ");
		int radius = sc.nextInt();
		System.out.println("enter the hight of cylinder");
		int hight = sc.nextInt();
		float area = (float) ((2*3.142*radius)*(float)(radius+hight));
		System.out.println(String.format("%.4f", area));
	}

}
