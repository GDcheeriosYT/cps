
public class PA13Messerschmidt {

	public static void main(String[] args) {
		
		int time = 10;
		
		final double gravity = 9.8;
		
		double height = 0.5 * gravity * time * time;
		
		double velocity = gravity * time;
		
		System.out.println("your looking at about a height of " + height + "m and are traveling at " + velocity + "mps");

	}

}
