
/*Consider the following incomplete method definition.


pennies is guaranteed to be a double greater than or equal to 0. 
You method should calculate and return the number of dollars, quarters, dimes, nickels, and pennies than can be made from the original number of pennies. 
Fractional pennies should be ignored, but you cannot use typecasting.
Return a String in the following format: 
"V dollars, W quarters, X dimes, Y nickels, and Z pennies." 
V, W, X, Y, and Z should represent the values your method computed. */

public class q16a{
	
	public static void main(String[] args) {
		q16a test = new q16a();
		test.money(0067.2);
	}
	public String money(double pennies) {
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		while(pennies >= 100) {
			pennies -= 100;
			dollars++;
		}
		while(pennies >= 25) {
			pennies -= 25;
			quarters++;
		}
		while(pennies >= 10) {
			pennies -= 10;
			dimes++;
		}
		while(pennies >= 5) {
			pennies -= 5;
			nickels++;
		}
		pennies = Math.floor(pennies);
		String total = (dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
		System.out.println(total);
		return(total);
	}
	
	
}
