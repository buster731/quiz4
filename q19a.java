public class q19a{
	public static void main(String[] args) {
		q19a test = new q19a();
		test.oddsOnly("helloh");
	}
	public String oddsOnly(String original) {
		if(original == null) {
			return null;
		}
		String odds = "";
		for(int i = 1; i < original.length(); i += 2) {
			odds = odds + original.charAt(i);
		}
		if(odds.length() == 0) {
			return null;
		}
		return odds;
	}
}