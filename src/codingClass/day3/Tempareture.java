package codingClass.day3;
import java.util.Scanner;
public class Tempareture {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("entee tempareture in celcius");
//		float celcius=sc.nextFloat();
//		float faranheat=(((float)celcius*9)/5)+32;
//		System.out.println(faranheat);
		
		System.out.println("enter tempareture in faranheat");
		float faranheat = sc.nextFloat();
        float celcius = (((faranheat-32)*5)/9);
        System.out.println("tempareture in celcius = "+ String.format("%.4f", celcius));
		
	}
}
