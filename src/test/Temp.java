package test;

public class Temp {

	int Fahrenheit;
	int celsius;
	int kelvin;

	public Temp() {
		Fahrenheit = 0;
		kelvin = 0;
		celsius = 0;

	}

	public Temp(int ce, int fh, int kl) {
		Fahrenheit = fh;
		celsius = ce;
		kelvin = kl;
	}

	
	public void setFahrenheit(int fh) {

		Fahrenheit = fh;

	}

	public void setcelsius(int ce) {

		celsius = ce;

	}

	public void setkelvin(int kl) {

		kelvin = kl;

	}
	
	public String toString() {
		String str = "";
		return str += " "+ Fahrenheit+"" +celsius+""+kelvin;
	}
	
	
	public int getKelvin(int kl) {
		return kl;
	}

	public int getcelsius(int ce) {
		return ce;
	}

	public int getFahrenheit(int fh) {
		return fh;
	}


}
