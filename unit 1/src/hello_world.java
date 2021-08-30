/**
 * 
 */

/**
 * @author bm38573
 *
 */
public class hello_world {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//main method is the green flag for java
		String name = "brayden";
		int age = 17;
		double cashPerHour = 12.00;
		boolean isOlderThan16 = age > 16;

		if(isOlderThan16 == true) {
			System.out.println("poop");
		}
		else {
			System.out.println("double poop");
		}

		System.out.println(name + " is " + age + " and makes $" + cashPerHour + " and it is a " + isOlderThan16 + " statement that he is older than 16");

	}

}
