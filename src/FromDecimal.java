/**
 * Converts Decimals to Binary Strings
 * @author obedtandadjaja
 */
public class FromDecimal {

	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		System.out.println(n+" = "+convert(n));
	}

	public static String convert(int n)
	{
		int b = 2;
		String binary_string = "";
		if(n == 0) {
			binary_string = "0";
		} else {
			while(n > 0) {
				binary_string = n%b+binary_string;
				n /= b;
			}
		}
		return binary_string;
	}

}