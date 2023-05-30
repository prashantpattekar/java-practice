package codingClass.day3;
import java.util.Scanner;
public class Add {
    public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter third number");
		int c=sc.nextInt();
		int sum=a+b;
		int sum2=a+c;
		int sum3=b+c;
		System.out.println("sum = "+sum);
		System.out.println("sum = "+sum2);
		System.out.println("sum = "+sum3);
	}
}
