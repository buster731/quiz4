public class q17a{
	
	public static void main(String[] args) {
		q17a test = new q17a();
		test.money(0067.2);
	}
	public String money(double pennies) {
		int coins = 0;
		while(pennies >= 100) {
			pennies -= 100;
			
		}
		while(pennies >= 25) {
			pennies -= 25;
			coins++;
		}
		while(pennies >= 10) {
			pennies -= 10;
			coins++;
		}
		while(pennies >= 5) {
			pennies -= 5;
			coins++;
		}
		pennies = Math.floor(pennies);
		coins += pennies;
		String total = ("This value can be reached in " + coins + " coins.");
		System.out.println(total);
		return(total);
	}
	
	
}