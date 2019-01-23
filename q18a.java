public class q18a{
	public static void main(String[] args) {
		q18a test = new q18a();
		test.evensOnly(" ");
	}
	public String evensOnly(String original) {
		if(original == null) {
			System.out.println("null");
			return null;
		}
		String evens = "";
		for(int i = 0; i < original.length(); i += 2) {
			evens = evens + original.charAt(i);
		}
		if(evens.length() == 0) {
			System.out.println("null");
			return null;
		}
		System.out.println(evens);
		return evens;
	}
}