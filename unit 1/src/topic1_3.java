import java.util.*;
public class topic1_3 {

	public static void main(String[] args) {
		//final will not let the variable be changed internally
		final double taxRate = 0.07;
		int x = 12, y = 9;
		double z = 2.7;
		String s = " yeah";
		boolean question = true;
		System.out.println(x + z);
		System.out.println(x + s);
		System.out.println(x / y);
		System.out.println(y / x);
		System.out.println(x / z);
		System.out.println(Math.pow(y, 3));
		double realAnswer = (x / y);
		System.out.println(realAnswer);
		double x1 = 9 / 4;
		System.out.println(x1);
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in);
System.out.println("enter an int");
		int first = s1.nextInt();
		int second = s1.nextInt();
		//output the result of dividing __ and __ is __
		System.out.println("output: the result of dividing " + first + " and " + second + " is " + first / second);

		System.out.println("lets find the base of your triangle");
		double base = s1.nextDouble();
		double height = s1.nextDouble();
		//make an area variable and print the results
		
		System.out.println("the area of your triangle is " + base * height / 2);
		
	}

}
