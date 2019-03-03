package aa224fn_assign3;

public class Fraction {

	int n;
	int d;

	public Fraction() {
		n = 0;
		d = 0;
	}

	public Fraction(int a, int b) {
		n = a;
		d = b;
	}

	public int getNumerator(int a) {
		n = a;
		return n;
	}

	public int getDenominator(int b) {
		if (b == 0) {
			throw new ArithmeticException ("Error! Denominator is 0");
		}
		d = b;
		return d;
	}

	public boolean isNegative() {
		if (d > 0 || n > 0) {
			return false;
		}
		return true;
	}

	public boolean isEqualTo(Fraction y) {
		if (n == y.n && d == y.d) {
			return true;
		}
		return false;
	}

	public String toString() {
		String str = "";
		str = str + n + "/" + d;
		return str;
	}

	public Fraction add(Fraction y) {

		if (d == y.d) {
			Fraction sum = new Fraction(n + y.n , d = y.d);
			sum.gcd();
			return sum;
		} else {
			Fraction sum = new Fraction(((n * y.d) + (y.n * d)) , d * y.d);
			sum.gcd();
			return sum;
		}

	}

	public Fraction subtract(Fraction y) {

		if (d == y.d) {
			Fraction sub = new Fraction((n - y.n), d = y.d);
			sub.gcd();
			return sub;
		} else {
			Fraction sub = new Fraction((((n * y.d) - (y.n * d))), d * y.d);
			sub.gcd();
			return sub;
		}

	}

	public Fraction multiply(Fraction y) {
		Fraction result = new Fraction(n * y.n, d * y.d);
		result.gcd();
		return result;
	}

	public Fraction divide(Fraction y) {
		Fraction div = new Fraction(n * y.d, d * y.n);
		div.gcd();
		return div;

	}


	private void gcd() {
		int i = Math.min(Math.abs(n), Math.abs(d));
		if (i == 0)
			return;
		while((n % i !=0) || (d % i != 0 ))
		i--;
		n = n/ i;
		d= d/ i;
	}
}

