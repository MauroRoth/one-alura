
public class Factorial {
	public static void main(String[] args) {
		int factorial = 1, numero = 4;
		for (int i = 0; i < numero; i++) {factorial*=(numero-i);}
		System.out.println(factorial);
	}
}
